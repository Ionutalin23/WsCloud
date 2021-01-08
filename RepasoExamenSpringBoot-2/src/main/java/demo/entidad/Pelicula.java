package demo.entidad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component()
@Scope("prototype")
public class Pelicula {
	private int id=1;
	@Autowired
	@Qualifier("director1")
	private Director director;
	@Autowired
	@Qualifier("actor1")
	private Actor actor;
	
	
	public Pelicula(int id, Director director, Actor actor) {
		super();
		this.id=id;
		this.director = director;
		this.actor = actor;
	}
	
	public Pelicula() {
		super();
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Director getDirector() {
		return director;
	}
	public void setDirector(Director director) {
		this.director = director;
	}
	public Actor getActor() {
		return actor;
	}
	public void setActor(Actor actor) {
		this.actor = actor;
	}
	@Override
	public String toString() {
		return "Pelicula [id=" + id + ", director=" + director + ", actor=" + actor + "]";
	}
	
	
}
