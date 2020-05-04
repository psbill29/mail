package com.xworkz.mail.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Component;

@Component
public class MailServiceImpl implements MailService {

	private static final Logger logger = Logger.getLogger(MailServiceImpl.class);

	@Autowired
	private MailSender mailSender;

	public MailServiceImpl() {
		logger.info(this.getClass().getSimpleName() + ":created the Service");
	}

	public boolean sendMailByEmailId(String to, String subject, String body) {

		logger.info("inside sendMailByEmailId of MailServiceImpl");

		SimpleMailMessage mailMessage = new SimpleMailMessage();

		
		mailMessage.setTo(to);
		mailMessage.setSubject(subject);
		mailMessage.setText(body);

		try {
			mailSender.send(mailMessage);
		} catch (MailException e) {
			logger.error(e.getMessage(), e);
		}
		return false;

	}

}
