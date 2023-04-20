import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Triangulo triangulo1= new Triangulo();
        Circulo circulo1=new Circulo(triangulo1);
        triangulo1.ingresarCoordenadas();
        triangulo1.impreciondebari();
        triangulo1.ladotriangulo();
        circulo1.circuferencia();

    }
}