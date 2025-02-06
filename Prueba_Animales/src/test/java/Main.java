import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import com.animales.Animal;

public class Main {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        List<Animal> terrestres = new ArrayList<>();
        List<Animal> acuaticos = new ArrayList<>();
        List<Animal> voladores = new ArrayList<>();
        
        while (true) {
            System.out.print("Ingresa un Animal con el siguiente formato: nombre-tipo-onomatopeya ");
            String animal = scanner.nextLine();
            
            if (animal.length() == 0) {
                System.out.println("El campo no puede estar vacío.");
                continue;
            }
            
            String[] parte = animal.split("-");
            
            if (parte.length != 3) {
                System.out.println("El formato es incorrecto. Debe ser: nombre-tipo-onomatopeya.");
                continue;
            }
            
            if (!parte[1].equalsIgnoreCase("terrestre") && 
                !parte[1].equalsIgnoreCase("acuatico") && 
                !parte[1].equalsIgnoreCase("volador")) {
                System.out.println("El tipo ingresado no es válido.");
                continue;
            }
            
            Animal creado = new Animal(parte[0], parte[1], parte[2]);
            
            switch (creado.getTipo().toLowerCase()) {
                case "terrestre":
                    terrestres.add(creado);
                    break;
                case "acuatico":
                    acuaticos.add(creado);
                    break;
                case "volador":
                    voladores.add(creado);
                    break;
                default:
                    System.out.println("Tipo de animal no válido.");
                    break;
            }
            
            System.out.println("Se creó correctamente: " + creado.toString());
            
            System.out.print("¿Deseas agregar otro animal? (si/no): ");
            String respuesta = scanner.nextLine();
            if (!respuesta.equalsIgnoreCase("si")) {
                break;  
            }
        }
        
        System.out.println("\nAnimales Terrestres:");
        for (Animal animal : terrestres) {
            System.out.println(animal.toString());
        }
        
        System.out.println("\nAnimales Acuáticos:");
        for (Animal animal : acuaticos) {
            System.out.println(animal.toString());
        }
        
        System.out.println("\nAnimales Voladores:");
        for (Animal animal : voladores) {
            System.out.println(animal.toString());
        }
        
        scanner.close();
        System.out.println("\n¡Programa finalizado!");
    }
	

}
