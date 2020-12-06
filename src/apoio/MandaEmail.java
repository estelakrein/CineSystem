/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apoio;

import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Authenticator;
import javax.mail.BodyPart;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.*;

/**
 *
 * @author estel
 */
public class MandaEmail {
    
    public static void email(String rec) throws MessagingException {
                System.out.println("preparando para enviar email");

		String user = "estelakrein@hotmail.com";
		String password = "e101198";
                String fileName = "C:\\CineSystem\\comprovantes\\comp.pdf";

		Properties properties = new Properties();
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "true");
		properties.put("mail.smtp.host", "smtp.live.com");
		properties.put("mail.smtp.port", "25");  //ou 465

		Session session = Session.getInstance(properties, new Authenticator() {
                        @Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(user,password);
			}
		});
		
                Message message = prepareMessage(session, user, rec, fileName);
                Transport.send(message);
                System.out.println("email enviado com sucesso");

	}
    
    private static Message prepareMessage(Session session, String user, String rec, String fileName){
        try{
            Message m = new MimeMessage(session);
            m.setFrom(new InternetAddress(user));
            m.setRecipient(Message.RecipientType.TO, new InternetAddress(rec));
            m.setSubject("Comprovante cinema");
            m.setText("Seu comprovante de ingressos em anexo");
            BodyPart body = new MimeBodyPart();
            DataSource source = new FileDataSource(fileName);
            body.setDataHandler(new DataHandler(source));
            body.setFileName(fileName);
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(body);
            m.setContent(multipart);
            return m;
        } catch (Exception ex) {
            System.err.println("erro");
        }
        return null;
    }
        
    
}
