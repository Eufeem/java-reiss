package com.feem.reiss.service;

import javax.mail.MessagingException;
import java.util.Map;

public interface MailService {

    void sendSimpleMessage(String to, String subject, String text);

    void sendHtmlMessage(String to, String subject, String htmlBody) throws MessagingException;

    void sendMessageUsingThymeleafTemplate(String to, String subject, Map<String, Object> templateModel)
            throws MessagingException;

}
