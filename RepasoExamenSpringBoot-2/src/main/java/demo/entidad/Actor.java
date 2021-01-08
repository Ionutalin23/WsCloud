package demo.entidad;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value="actor1")
@Scope("prototype")
public class Actor {
	private int id=1;
	private String nombre="Didi";
	private int edad=99;
	
	
	
	public Actor(int id, String nombre, int edad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
	}
	
	

	public Actor() {
		super();
	}



	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "Actor [id=" + id + ", nombre=" + nombre + ", edad=" + edad + "]";
	}
	
}
