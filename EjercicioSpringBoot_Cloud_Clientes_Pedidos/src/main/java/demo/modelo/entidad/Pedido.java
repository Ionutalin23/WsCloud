package demo.modelo.entidad;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Pedido {
	private int id,precio;
	
	

	public Pedido(int id, int precio) {
		this.id = 1;
		this.precio = 10;
	}
	
	

	public Pedido() {
		super();
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", precio=" + precio + "]";
	}
	
	
	
	
}
