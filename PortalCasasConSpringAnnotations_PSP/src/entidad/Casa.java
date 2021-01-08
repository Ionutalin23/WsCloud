package entidad;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Casa {
	private double m2;
	@Autowired
	@Qualifier("habitaciones")
	private ArrayList<Habitacion> habitaciones;
	@Autowired
	@Qualifier("dueño")
	private Persona dueño;
	@Autowired
	Direccion direccion;
	@Autowired
	@Qualifier("inquilinos")
	ArrayList<Persona> inquilinos;
	
	public Casa(ArrayList<Habitacion> habitaciones, Persona dueño, Direccion direccion,
			ArrayList<Persona> inquilinos) {
		this.habitaciones = habitaciones;
		this.dueño = dueño;
		this.direccion = direccion;
		this.inquilinos = inquilinos;
	}
	public Casa() {};
	public ArrayList<Habitacion> getHabitaciones() {
		return habitaciones;
	}

	public void setHabitaciones(ArrayList<Habitacion> habitaciones) {
		this.habitaciones = habitaciones;
	}

	public Persona getDueño() {
		return dueño;
	}

	public void setDueño(Persona dueño) {
		this.dueño = dueño;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public ArrayList<Persona> getInquilinos() {
		return inquilinos;
	}

	public void setInquilinos(ArrayList<Persona> inquilinos) {
		this.inquilinos = inquilinos;
	}
	
	public double calcularM2() {
		for (int i = 0; i < habitaciones.size(); i++) {
			Habitacion h= habitaciones.get(i);
			m2+=h.getM2()*h.getCantHabitaciones();
		}
		return m2;
		
	}

	@Override
	public String toString() {
		return "Casa m2=" + m2 +"\n"+ "Habitaciones=" + habitaciones +"\n"+ "Dueño=" + dueño +"\n"+ "Direccion=" + direccion
				+"\n"+ "Inquilinos=" + inquilinos + "]";
	}
	
}
