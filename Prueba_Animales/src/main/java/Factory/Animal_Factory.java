package Factory;

import org.springframework.stereotype.Component;

import com.animales.Acuatico;
import com.animales.Animal;
import com.animales.Terrestre;
import com.animales.Volador;

@Component
public class Animal_Factory {
	// creamos un componente fabrica con la funcion de agregar 
	// nuevo animal, agregarlo segun el tipo de especie y llamar esta funcion al componente main
	public Animal nuevo(String nombre, String tipo, String onomatopeya) {
        switch (tipo.toLowerCase()) {
            case "terrestre":
            	// si el tipo es terrestre, entrara aqui para agregar a la clase hija "Terrestre"
                return new Terrestre(nombre, onomatopeya);
            case "acuatico":
            	// si el tipo es acuatico, entrara aqui para agregar a la clase hija "Acuatico"
                return new Acuatico(nombre, onomatopeya);
            case "volador":
            	// si el tipo es volador, entrara aqui para agregar a la clase hija "Volador"
                return new Volador(nombre, onomatopeya);
            default:
                throw new IllegalArgumentException("Tipo de animal no válido: " + tipo);
        }
    }
}
