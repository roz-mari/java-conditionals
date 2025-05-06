import java.util.Scanner;

public class TrafficLights {
    public static void main(String[] args) {

        //Escribe un programa que basado en el color del semáforo verde, amarillo o rojo determine las acciones de un conductor 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the traffic light color (green, yellow, red): ");
        String color = scanner.nextLine().toLowerCase();
        if (color.equals("green")) {
            System.out.println("You can go.");
        } else if (color.equals("yellow")) {
            System.out.println("Be careful.");
        } else if (color.equals("red")) {
            System.out.println("Stop!");
        } else {
            System.out.println("The traffic light is malfunctioning");
        }
        //Si es verde imprime en la terminal: Puedes seguir
        //Si es amarillo imprime en la terminal: Ten cuidado
        //Si es rojo imprime en la terminal: ¡¡¡Para!!!
        //Si es otro color imprime en la terminal: El semáforo está dañado

        //Cambia el valor de la variable, corre el programa y mira el resultado 
        scanner.close();
    }
    
}
