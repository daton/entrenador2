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

try{
		final String fromEmail = "egel@sierraguadalupe.org";
		final String password = "egel2017";

	final String toEmail = "rapidclimate@gmail.com"; // can be any email id

	System.out.println("TLSEmail Start");
	Properties props = new Properties();
	props.put("mail.smtp.host", "mail.sierraguadalupe.org"); //SMTP Host
	props.put("mail.smtp.port", "587"); //TLS Port
	props.put("mail.smtp.auth", "true"); //enable authentication
	props.put("mail.smtp.starttls.enable", "true"); //enable STARTTLS

	//create Authenticator object to pass in Session.getInstance argument
	Authenticator auth = new Authenticator() {
		//override the getPasswordAuthentication method
		protected PasswordAuthentication getPasswordAuthentication() {
			return new PasswordAuthentication(fromEmail, password);
		}
	};
//	Session session = Session.getInstance(props, auth);

	//EmailUtil.sendEmail(session, toEmail,"Egel Examen", "Examen");

		} catch (Exception e) {
		//	System.out.println("Hubo un error "+e.getMessage());
		//	throw new RuntimeException(e);
		}



		String mensaje="nada";
		String de="rapidclimate@gmail.com.com";
		String para="rapidclimate@outlook.com";
		String asunto="Tienes cara de perro";
		String personal="Juan Carlos Campos";
		try{

			/*
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
*/

		} catch(Exception e){
			System.out.println("No se pudo por esto:"+e.getMessage());
			System.out.println(e.getMessage());
			mensaje=e.getMessage();
		}





	}
}

class EmailUtil {

	/**
	 * Utility method to send simple HTML email
	 * @param session
	 * @param toEmail
	 * @param subject
	 * @param body
	 */
	public static void sendEmail(Session session, String toEmail, String subject, String body){
		try
		{
			MimeMessage msg = new MimeMessage(session);
			//set message headers
			msg.addHeader("Content-type", "text/HTML; charset=UTF-8");
			msg.addHeader("format", "flowed");
			msg.addHeader("Content-Transfer-Encoding", "8bit");

			msg.setFrom(new InternetAddress("egel@sierraguadalupe.org", "Egel Sierra Guadalupe"));

			msg.setReplyTo(InternetAddress.parse("egel@sierraguadalupe.org", false));

			msg.setSubject(subject, "UTF-8");

			msg.setText(body, "UTF-8");

			msg.setSentDate(new Date());

			msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail, false));
			System.out.println("Message is ready");
			Transport.send(msg);

			System.out.println("EMail Sent Successfully!!");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}