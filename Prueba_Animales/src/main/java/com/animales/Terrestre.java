package com.animales;

import com.enun.TipoAnimal;

public class Terrestre extends Animal {

	public Terrestre(String nombre, String onomatopeya) {
		super(nombre, onomatopeya);
	}

	@Override
	public TipoAnimal tipoAnimal() {
		return TipoAnimal.TERRESTRE;
	}

}
