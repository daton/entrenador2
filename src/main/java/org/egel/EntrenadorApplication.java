package org.egel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.util.Date;
import java.util.Properties;

@SpringBootApplication
public class EntrenadorApplication {

	public static void main(String[] args) {
		SpringApplication.run(EntrenadorApplication.class, args);
		// Recipient's email ID needs to be mentioned.

		/*
		final String username = "egel@sierraguadalupe.org";
		final String password = "ExamenEgel2017";

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");

		//props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.host", "mail.sierraguadalupe.org");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props,
				new javax.mail.Authenticator() {
					protected PasswordAuthentication getPasswordAuthentication() {
						return new PasswordAuthentication(username, password);
					}
				});

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("egel@sierraguadalupe.org", "Egel Examen"));

			message.setRecipients(Message.RecipientType.TO,
					InternetAddress.parse("rapidclimate@outlook.com"));
			message.setSubject("Examen Egel");
			message.setText("Dear Mail Crawler,"
					+ "\n\n No spam to my email, please!");

			Transport.send(message);

			System.out.println("Done");

		} catch (Exception e) {
			throw new RuntimeException(e);
		}



		String mensaje="nada";
		String de="rapidclimate@gmail.com.com";
		String para="rapidclimate@outlook.com";
		String asunto="Tienes cara de perro";
		String personal="Juan Carlos Campos";
		try{
			// String de=request.getParameter("de");
			String host="localhost";
			// String para=request.getParameter("para");
			boolean debug=false;
			String msg1="Informacion de mia";

			Properties props = new Properties();

			props.put("mail.smtp.auth", "false");
			props.put("mail.smtp.starttls.enable", "false");
			props.put("mail.smtp.host",host);
			props.put("mail.smtp.port", "25");

			Session session = Session.getInstance(props, null);
			session.setDebug(debug);


			MimeMessage msg = new MimeMessage(session);
			InternetAddress direccion2=new InternetAddress(de);
			direccion2.setPersonal(personal,"text/html");
			msg.setFrom(direccion2);
			InternetAddress direccion1=new InternetAddress(para);

			InternetAddress[] address = {direccion1};
			msg.setRecipients(Message.RecipientType.TO, address);
			msg.setSubject(asunto,"us-ascii");
			msg.setSentDate(new Date());


			MimeBodyPart mbp1 = new MimeBodyPart();
			mbp1.setText(msg1,"us-ascii");

			MimeBodyPart mbp2 = new MimeBodyPart();
// Use setText(text, charset), to show it off !
//mbp2.setText(msg2,"us-ascii" );
//mbp2.setContent("hola", "text/html");

			mbp1.setDescription("Tareas");
// create the Multipart and its parts to it


//Multiparte 3
//MimeBodyPart mbp3 = new MimeBodyPart();

// attach the file to the message
//FileDataSource fds = new FileDataSource(RESULT);
//mbp3.setDataHandler(new DataHandler(fds));
//mbp3.setFileName(fds.getName());
//mbp3.setContent(fds, "Application/pdf");

			Multipart mp = new MimeMultipart();
			mp.addBodyPart(mbp1);
//mp.addBodyPart(mbp2);
//mp.addBodyPart(mbp3);



// add the Multipart to the message
			msg.setContent(mp);

			Transport.send(msg);


			System.out.println("parece que todo bienaaa pero esperare con paciencia...");





			mensaje="    se envio bien!!!";


		} catch(Exception e){
			System.out.println("No se pudo por esto:"+e.getMessage());
			System.out.println(e.getMessage());
			mensaje=e.getMessage();
		}


*/


	}
}
