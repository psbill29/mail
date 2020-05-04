package com.xworkz.mail.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.mail.service.MailService;

@Component
@RequestMapping("/")
public class MailController {

	private static final Logger logger = Logger.getLogger(MailController.class);

	@Autowired
	private MailService mailService;

	public MailController() {
		logger.info(this.getClass().getSimpleName() + "Created the Object");

	}

	@RequestMapping("/sendMail")
	public String SendMail(String toMailId, String subject, String body, Model model) {
		logger.info("Mail id:" + toMailId);
		logger.info("Subject :" + subject);
		logger.info("Body :" + body);

		mailService.sendMailByEmailId(toMailId, subject, body);
		model.addAttribute("message", "Mail sent successfully");
		return "Success";
	}
}
