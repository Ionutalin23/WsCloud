package demo.entidad;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value="director1")
@Scope("prototype")
public class Director {
	private int id=1;
	private String nombre="Yoye";
	private int edad=64;
	private String fecha_nacimiento="31/07/76";
	
	
	public Director(int id, String nombre, int edad, String fecha_nacimiento) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
		this.fecha_nacimiento = fecha_nacimiento;
	}
	
	public Director() {
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
	public String getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	public void setFecha_nacimiento(String fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	@Override
	public String toString() {
		return "Director [id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", fecha_nacimiento=" + fecha_nacimiento
				+ "]";
	}
	
	
}
