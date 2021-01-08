package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import demo.modelo.entidad.Email;
import demo.modelo.entidad.Libro;

@SpringBootApplication
@ImportResource("classpath:context.xml") 
public class RepasoExamenSpringBootApplication {
	public static ApplicationContext context=null;
	public static void main(String[] args) {
		context = SpringApplication.run(RepasoExamenSpringBootApplication.class, args);
		Email mailJuan = context.getBean("emailjuan",Email.class);
		System.out.println(mailJuan);
		Libro l = context.getBean("libro",Libro.class);
		System.out.println(l);
		Libro l2= context.getBean("libro2",Libro.class);
		System.out.println(l2);
	}

}
