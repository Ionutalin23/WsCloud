package negocio;
import entidad.*;
import java.util.ArrayList;
import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClasePrincipal {
	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("recursos/context.xml");
		Casa casa1=context.getBean("casa",Casa.class);
		casa1.calcularM2();
		System.out.println(casa1.toString());
	}

}
