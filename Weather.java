import java.util.Scanner;

public class Weather {
    public static void main(String[] args) {
        //Escribe un programa que pida al usuario que ingrese la temperatura en celcius de su ciudad (La pregunta y la respuesta deberá estar en una sola línea) y según ello devuelva lo siguiente:
        Scanner scanner = new Scanner(System.in);
        //Si es bajo 0: Te estás congelando
        System.out.print("Enter the temperature in Celsius of your city: ");
        int temperature = scanner.nextInt();
        //Si es entre 0 y 10: Hace mucho frío
        if (temperature < 0) {
            System.out.println("You're freezing!");
        } else if (temperature >= 0 && temperature <= 10) {
            System.out.println("It's a very cold.");
            //Si es entre 11 y 17: Con un abrigo estás bien
        } else if (temperature >= 11 && temperature <= 17) {
            System.out.println("A coat will keep you warm.");
            //Si es entre 18 y 25: Parece que ha llegado el verano
        } else if (temperature >= 18 && temperature <= 25) {
            System.out.println("Looks like summer has arrived.");
            //Si es entre 26 y 35: Que calooorrrrr
        } else if (temperature >= 26 && temperature <= 35) {
            System.out.println("So hooooot!");
            //Si es mayor a 36: Ahí no hay quien viva
        } else {
            System.out.println("Nobody can live in that heat!");
            //Imprime el resultado
        }
        scanner.close();
    }
    }