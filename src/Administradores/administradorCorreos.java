/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Administradores;

import java.util.Properties;
/*
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
*/

/**
 * Clase Administrador de Correos
 * 	Enviar un correo electrónico con un mensaje de recordatorio 
 * 	para la devolución del artículo
 * 
 * @author Adrian
 */
public class administradorCorreos
{
	
	// Métodos
	// Constructor
	public administradorCorreos(){}
	
	/**
	 * simpleMail
	 * 	Función con la que se envía el correo electrónico a los préstamos vencidos
	 * @param to 		  a quien se envía el correo 
     * @throws java.lang.Exception 
	 */
	public void simpleMail(String to) throws Exception {
		  
		    String host = "smtp.gmail.com";
		    Properties props = System.getProperties();
		    props.put("mail.smtp.starttls.enable",true);
		    /* mail.smtp.ssl.trust is needed in script to avoid error "Could not convert socket to TLS"  */ 
		    props.setProperty("mail.smtp.ssl.trust", host);
		    props.put("mail.smtp.auth", true);      
		    props.put("mail.smtp.host", host);
		    props.put("mail.smtp.user", "controlprestamos896@gmail.com");
		    props.put("mail.smtp.password", "Control1234");
		    props.put("mail.smtp.port", "587");
		  
		    //Session session = Session.getDefaultInstance(props, null);
		    //MimeMessage message = new MimeMessage(session);
		    //message.setFrom(new InternetAddress("controlprestamos896@gmail.com"));
		 
		    //InternetAddress toAddress = new InternetAddress(to);
		    // Correo Electrónico del Destinatario
		    //message.addRecipient(Message.RecipientType.TO, toAddress);
		    // Subject del correo
		   // message.setSubject("Recordatorio Prestamo");
		    // Mensaje de Recordatorio
		    //message.setText("¡Hola!"+
		    //		"Se le recuerda que se le ha prestado un artículo."+
		   // 		"Su plazo está por vencer, comuníquese conmigo"+
		   // 		"                                             "+
		   // 		"                                             "+
		    //		"by MeaProvidere®");
		 
		    //Transport transport = session.getTransport("smtp");
		  
		    //transport.connect(host, "controlprestamos896@gmail.com", "Control1234");
		 
		    //transport.sendMessage(message, message.getAllRecipients());
		    //transport.close();
		}
		 
	
	
}