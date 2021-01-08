package entidad;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component(value = "dueño")
public class Persona {
	private String rol="dueño";
	private String nombre="Fabio";
	@Autowired
	@Qualifier("direccionDueño")
	private Direccion direccion;
	private int edad=30;
	
	
	
	public Persona(String rol,String nombre, Direccion direccion, int edad) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.edad = edad;
		this.rol=rol;
	}
	
	public Persona() {
		super();
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	
	
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
	@Override
	public String toString() {
		return nombre + "," + direccion + "," + edad+" años";
	}
	
	
	
}
