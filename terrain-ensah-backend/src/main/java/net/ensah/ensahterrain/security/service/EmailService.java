package net.ensah.ensahterrain.security.service;


import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Service;

@Service("emailService")
@EnableAsync
public class EmailService {

    private final MailSender mailSender;

    public EmailService(MailSender mailSender) {
        this.mailSender = mailSender;
    }


    @Async
    public void sendEmail(SimpleMailMessage email) {

        mailSender.send(email);
    }
}
