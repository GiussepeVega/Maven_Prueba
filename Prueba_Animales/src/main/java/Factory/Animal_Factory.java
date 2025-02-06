package Factory;

import org.springframework.stereotype.Component;

import com.animales.Acuatico;
import com.animales.Animal;
import com.animales.Terrestre;
import com.animales.Volador;

@Component
public class Animal_Factory {
	public Animal nuevo(String nombre, String tipo, String onomatopeya) {
        switch (tipo.toLowerCase()) {
            case "terrestre":
                return new Terrestre(nombre, onomatopeya);
            case "acuatico":
                return new Acuatico(nombre, onomatopeya);
            case "volador":
                return new Volador(nombre, onomatopeya);
            default:
                throw new IllegalArgumentException("Tipo de animal no válido: " + tipo);
        }
    }
}
