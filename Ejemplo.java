import java.util.Scanner;
public class Ejemplo {

public static void main(String[] args) {

    Scanner hola = new Scanner(System.in);

    Integer n1;
    Integer n2;
    System.out.println("Digite el dato 1");
    n1= hola.nextInt();   

    System.out.println("Digite el dato 2 ");
    n2 = hola.nextInt();

    if (n1 == n2) {
        System.out.println("ERROR, los datos estan incorrectos");

    } else {
        System.out.println("Los datos son correctos");
    }
}
}
