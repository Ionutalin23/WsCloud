package entidad;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Direccion {
	private String tipoVia="Calle";
	private String nombreVia="Cáceres";
	private String cp="28690";

	public Direccion(String tipoVia, String nombreVia, String cp) {
		this.tipoVia = tipoVia;
		this.nombreVia = nombreVia;
		this.cp = cp;
	}
	
	public Direccion() {
		super();
	}



	public String getTipoVia() {
		return tipoVia;
	}

	public void setTipoVia(String tipoVia) {
		this.tipoVia = tipoVia;
	}

	public String getNombreVia() {
		return nombreVia;
	}

	public void setNombreVia(String nombreVia) {
		this.nombreVia = nombreVia;
	}

	public String getCp() {
		return cp;
	}

	public void setCp(String cp) {
		this.cp = cp;
	}

	@Override
	public String toString() {
		return tipoVia + " " + nombreVia + "," + cp;
	}

}
