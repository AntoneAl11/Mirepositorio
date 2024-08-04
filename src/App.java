import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
        System.out.println("Hello, World!/n");

    //Prueba para crear arreglos
    String[] flores = {"Rosa", "Clavel", "Tulipan", "Girasol"};
    for(int i = 0; i < flores.length; i++){
        System.out.println(flores[i]);
    }
    // Prueba de arreglo usuario ingresando valores sencillo
    String[] canciones = new String[3];
    System.out.println("Ingresa una canción: ");
    canciones[0] = sc.nextLine();     
    System.out.println("Ingresa una segunda canción: ");
    canciones[1] = sc.nextLine();
    System.out.println("Ingresa una tercera canción: ");
    canciones[2] = sc.nextLine();

    for (int i = 0; i < canciones.length; i++ ){
        System.out.println("La canción que ingresaste es : "+canciones[i]);

    }
    }
}
