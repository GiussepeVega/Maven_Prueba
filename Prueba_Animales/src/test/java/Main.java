import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.animales.Animal;
import com.config.AppConfig;

import Factory.Animal_Factory;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Animal_Factory factory = context.getBean(Animal_Factory.class);

        
        Scanner scanner = new Scanner(System.in);
        // agregamo listados para que agregue segun el tipo de animal a insertar
        List<Animal> terrestres = new ArrayList<>();
        List<Animal> acuaticos = new ArrayList<>();
        List<Animal> voladores = new ArrayList<>();

        while (true) {
            System.out.print("Ingresa un Animal con el formato: nombre-tipo-onomatopeya: ");
            String animalEntrada = scanner.nextLine();

            if (animalEntrada.trim().isEmpty()) {
                System.out.println("El campo no puede estar vacío.");
                continue;
            }

            String[] partes = animalEntrada.split("-");
            if (partes.length != 3) {
                System.out.println("Formato incorrecto. Debe ser: nombre-tipo-onomatopeya.");
                continue;
            }

            try {
            	// agregamos la nueva clase segun lo insertado si todo esta conforme
                Animal animal = factory.nuevo(partes[0], partes[1], partes[2]);

                // llamamos al metodo tipoAnimal y comprobamos que tipo es para que añada a la lista segun su especie
                switch (animal.tipoAnimal()) {
                    case TERRESTRE:
                        terrestres.add(animal);
                        break;
                    case ACUATICO:
                        acuaticos.add(animal);
                        break;
                    case VOLADOR:
                        voladores.add(animal);
                        break;
                }

                System.out.println("Animal agregado: " + animal);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            // validar confirmacion del usuario si va a seguir agregando animales
            System.out.print("¿Deseas agregar otro animal? (si/no): ");
            if (!scanner.nextLine().equalsIgnoreCase("si")) {
                break;
            }
        }

        scanner.close();
        ((AnnotationConfigApplicationContext) context).close();
        // listamos a los animales segun su especie
        System.out.println("\nAnimales Terrestres:");
        terrestres.forEach(System.out::println);
        System.out.println("\nAnimales Acuáticos:");
        acuaticos.forEach(System.out::println);
        System.out.println("\nAnimales Voladores:");
        voladores.forEach(System.out::println);

        // msg de despedida
        System.out.println("\n¡Programa finalizado!");
        
        
	}
}