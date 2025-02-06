package com.animales;


public class Animal {
	private String nombre;
	private String tipo;
	private String onomatopeya;
	
	public Animal(String nombre, String tipo, String onomatopeya) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.onomatopeya = onomatopeya;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getOnomatopeya() {
		return onomatopeya;
	}

	public void setOnomatopeya(String onomatopeya) {
		this.onomatopeya = onomatopeya;
	}

	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + ", tipo=" + tipo + ", onomatopeya=" + onomatopeya + "]";
	}

	
	
}
