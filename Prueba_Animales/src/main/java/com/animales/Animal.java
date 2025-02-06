package com.animales;

import com.enun.TipoAnimal;

public abstract class Animal {
	private String nombre;
	private String onomatopeya;
	
	public Animal(String nombre, String onomatopeya) {
		super();
		this.nombre = nombre;
		this.onomatopeya = onomatopeya;
	}

	// metodo abstracto para definir el metodo de tipo en las demas clases hijas
	public abstract TipoAnimal tipoAnimal();
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getOnomatopeya() {
		return onomatopeya;
	}

	public void setOnomatopeya(String onomatopeya) {
		this.onomatopeya = onomatopeya;
	}

	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + ", tipo= " + tipoAnimal() + ", onomatopeya=" + onomatopeya + "]";
	}
	
}
