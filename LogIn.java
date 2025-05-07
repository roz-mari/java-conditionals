import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        //Escribe un programa que pida al usuario ingresar un nombre de usuario y una constraseña, si son iguales a los datos dados imprimirá en terminal: Acceso concedido, si no son iguales imprimirá en terminal: Nombre de usuario o contraseña incorrecta.
        final String correctUsername = "admin";
        final String correctPassword = "1234";
        //Averigua como hacer para poder ingresar el dato justo al lado de lo que termine la pregunta, es decir, que no haga un salto de línea.
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Enter username: ");
        String username = scanner.nextLine();
        System.out.print ("Enter password: ");
        String password = scanner.nextLine();
        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("Access granted");
        } else {
            System.out.println("Incorrect username or password.");
        }
        scanner.close();
    }
}