package PruebasUnitarias;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.animales.Acuatico;
import com.animales.Animal;
import com.animales.Terrestre;
import com.animales.Volador;
import com.enun.TipoAnimal;

public class UnitTest {
	// creamos pruebas unitarias e insertamos algunos metodos de ejm
	@Test
    public void testCrearAnimalTerrestre() {
        Animal gato = new Terrestre("Gato", "Miau");
        assertEquals(TipoAnimal.TERRESTRE, gato.tipoAnimal());
    }

    @Test
    public void testCrearAnimalAcuatico() {
        Animal pez = new Acuatico("Pez", "Blu-Blu");
        assertEquals(TipoAnimal.ACUATICO, pez.tipoAnimal());
    }

    @Test
    public void testCrearAnimalVolador() {
        Animal paloma = new Volador("Paloma", "Bru");
        assertEquals(TipoAnimal.VOLADOR, paloma.tipoAnimal());
    }
}
