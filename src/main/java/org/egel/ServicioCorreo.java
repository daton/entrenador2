package org.egel;

import com.vaadin.server.VaadinSession;
import com.vaadin.spring.annotation.SpringComponent;
import com.vaadin.spring.annotation.UIScope;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.MailException;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.UnsupportedEncodingException;

/**
 * Created by campitos on 1/03/17.
 */

@SpringComponent
@UIScope
public class ServicioCorreo {
    @Autowired
    JavaMailSenderImpl mailSender;

    public String enviar(String alumno, String mensaje) throws MessagingException, UnsupportedEncodingException {


        /*
        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setFrom("rapidclimate@gmail.com");


        msg.setTo("rapidclimate@outlook.com");
        msg.setFrom("raul@gmail.com");
        msg.setSubject("Resultado Egel");

        msg.setText("<h1>Resultados</h1>");

         */

        MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message,true,"UTF-8");

      //  helper.setTo(new String[]{"janunezp@mail.unitec.mx"/*"aalbarra@mail.unitec.mx"*/,"rapidclimate@outlook.com"});

        // message.setTo("rapidclimate@outlook.com");
       // helper.setFrom("rapidclimate@gmail.com", alumno);
     //   helper.setSubject("Resultado Egel");
       // helper.setText("<h1>Hola crayola</h1><p>"+mensaje+"</p><br><img src='cid:miImagen'>", true);
     //   helper.setText("<h2>Resultado del examen de "+ VaadinSession.getCurrent().getAttribute("nombre")+" "+
      //          VaadinSession.getCurrent().getAttribute("paterno")+" cuenta: "+
        //        VaadinSession.getCurrent().getAttribute("cuenta")+"</h2><h3>Tema EGEL:"+ VaadinSession.getCurrent().getAttribute("tema")+"</h3><p>"+mensaje+"</p>", true);
        //
       // getClass().getResource("egel.png");

//El siguiente es para vaadin
        //ThemeResource resource = new ThemeResource("../egel.png");
        // Image imagen = new Image(null, resource);


        //El siguiente busca el id que le asignes a tu imagen como htnml aariba en el src de la imagen
        //   helper.addInline("miImagen", new FileSystemResource("/home/campitos/Pictures/osito.jpg"));
        //la ruta de abajo es la ruta de donde se encuentra build/classess/main pero solos se pone org/egel
       // helper.addInline("miImagen", new ClassPathResource("org/egel/osillo.jpg"));


        //El siguiente es para agregar un attachment pdf, etc lo que quieras
        // helper.addAttachment("imagen",new FileSystemResource("/home/campitos/Pictures/osito.jpg"));


        try{
         //   this.mailSender.send(message);
        }
        catch (MailException ex) {
            // simply log it and go on...
            System.err.println(ex.getMessage());
        }

        return "Mensaje enviado con éxito";
    }


}
