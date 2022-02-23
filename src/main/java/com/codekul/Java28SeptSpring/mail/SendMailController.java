package com.codekul.Java28SeptSpring.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SendMailController {

    @Autowired
    private MailSender mailSender;

    @PostMapping("sendMail")
    public String sendEmail(){

        String from  = "codekul.vaibhav@gmail.com";
        String to = "aryanbagane30@gmail.com";

        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setFrom(from);
        mailMessage.setTo(to);
        mailMessage.setSubject("Hii");
        mailMessage.setText("Hii Aryan .......");
        mailMessage.setCc("piyushpawar274@gmail.com");
        mailSender.send(mailMessage);

        return "mail sent";
    }



}

