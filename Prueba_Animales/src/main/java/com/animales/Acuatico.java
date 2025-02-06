package com.animales;

import com.enun.TipoAnimal;

public class Acuatico extends Animal {

	public Acuatico(String nombre, String onomatopeya) {
		super(nombre, onomatopeya);
	}

	// llamamos al metodo abstracto de la clase padre y llamamos al enun creado segun el tipo a crear
	@Override
	public TipoAnimal tipoAnimal() {
		return TipoAnimal.ACUATICO;
	}

}
