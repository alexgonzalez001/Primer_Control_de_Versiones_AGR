import java.util.Scanner;
import java.lang.Object;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hi! I am Alex");
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String nombre = entrada.nextLine();

        System.out.println("¡Hola, " + nombre + "! Bienvenido.");

        entrada.close();

    }
    //Documentar
    //*author=AGR 
    //* @version=1.0
    //* @date=2025--12
    //*/
}
