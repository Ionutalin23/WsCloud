package entidad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
public class Habitacion {
	private double m2;
	private int cantHabitaciones;
	private Tipohabitacion tipoHabitacion;
	
	
	public Habitacion(double m2, int cantHabitaciones, Tipohabitacion tipoHabitacion) {
		this.m2 = m2;
		this.cantHabitaciones = cantHabitaciones;
		this.tipoHabitacion = tipoHabitacion;
	}
	
	
	public Habitacion() {
		super();
	}


	public double getM2() {
		return m2;
	}
	public void setM2(double m2) {
		this.m2 = m2;
	}
	public int getCantHabitaciones() {
		return cantHabitaciones;
	}
	public void setCantHabitaciones(int cantHabitaciones) {
		this.cantHabitaciones = cantHabitaciones;
	}
	public Tipohabitacion getTipoHabitacion() {
		return tipoHabitacion;
	}
	public void setTipoHabitacion(Tipohabitacion tipoHabitacion) {
		this.tipoHabitacion = tipoHabitacion;
	}
	@Override
	public String toString() {
		return cantHabitaciones+" "+tipoHabitacion+"/s de "+m2+" m2";
	}
	
	
	
}
