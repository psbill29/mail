package com.xworkz.mail.service;

public interface MailService {

	public boolean sendMailByEmailId(String to, String subject, String body);
}
