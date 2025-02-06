package com.animales;

import com.enun.TipoAnimal;

public class Volador extends Animal {

	public Volador(String nombre, String onomatopeya) {
		super(nombre, onomatopeya);
	}

	@Override
	public TipoAnimal tipoAnimal() {
		return TipoAnimal.VOLADOR;
	}

}
