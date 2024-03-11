package com.email.sendEmail.service;

import com.email.sendEmail.DTO.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
    @Autowired
    private JavaMailSender mailSender;
    public void EmailSend(Email email){

        var message = new SimpleMailMessage(); //criando o email
        message.setFrom("teste@gmail.com"); //quem esta enviando
        message.setTo(email.to()); //para quem é o email
        message.setSubject(email.subject()); //assunto do email
        message.setText(email.body()); //corpo do email

        mailSender.send(message); //enviando a mensagem

    }
}
