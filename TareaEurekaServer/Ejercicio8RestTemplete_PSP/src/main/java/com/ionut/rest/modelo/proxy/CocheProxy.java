package com.ionut.rest.modelo.proxy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ionut.rest.modelo.entidad.Coche;

@Service
public class CocheProxy {
	@Autowired
	private RestTemplate restTemplate;
	
	public static final String URL_COCHES = "http://SpringRestCoche/coches/";
	
	public List<Coche> listar(){
		ResponseEntity<Coche[]> response = restTemplate.getForEntity(URL_COCHES, Coche[].class);
		Coche[] coches = response.getBody();
		List<Coche> lista_coches = Arrays.asList(coches);
		return lista_coches;
	}
	public Coche obtener(int id) {
		ResponseEntity<Coche> response = restTemplate.getForEntity(URL_COCHES+id, Coche.class);
		return response.getBody();
	}
	public Coche alta(Coche coche) {
		HttpEntity<Coche> requestBody = new HttpEntity<>(coche);
		Coche cocheCreado = restTemplate.postForObject(URL_COCHES, requestBody, Coche.class);
		return cocheCreado;
	}
	public Coche modificar(Coche coche) {
		HttpEntity<Coche> requestBody = new HttpEntity<>(coche);
		ResponseEntity<Coche> response = restTemplate.exchange(URL_COCHES+coche.getId(),HttpMethod.PUT,requestBody,Coche.class );
		return response.getBody();
	}
	public void borrar(int id) {
		restTemplate.delete(URL_COCHES+id);
	}
}
