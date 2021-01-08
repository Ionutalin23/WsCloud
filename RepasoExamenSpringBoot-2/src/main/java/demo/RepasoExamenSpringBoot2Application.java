package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import demo.entidad.Pelicula;

@SpringBootApplication
@ImportResource("classpath:context.xml")
public class RepasoExamenSpringBoot2Application {
	private static ApplicationContext context = null;
	public static void main(String[] args) {
		context=SpringApplication.run(RepasoExamenSpringBoot2Application.class, args);
		Pelicula peli = context.getBean("pelicula",Pelicula.class);
		System.out.println(peli);
		Pelicula peli2= context.getBean("pelicula2",Pelicula.class);
		System.out.println(peli2);
		
	}

}
