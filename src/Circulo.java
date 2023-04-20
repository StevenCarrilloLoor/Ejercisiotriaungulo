public class Circulo {
    double barix;
    Triangulo triangulo2;
    public Circulo(Triangulo triangulo2) {
        this.triangulo2 = triangulo2;

    }
public void area(){
triangulo2.setBarix(barix);
}

    public Circulo() {
    }

    public void circuferencia(){
    double radio = Math.sqrt(Math.pow(triangulo2.verticeBx - triangulo2.barix, 2) + Math.pow(triangulo2.verticeBy - triangulo2.bariy, 2));
    double circunferencia = 2 * Math.PI * radio;
    double areacirlo=Math.PI*(Math.pow(radio,2));
    System.out.println("El radio de la circunferencia circunscrita es: " + radio);
    System.out.println("El Area de circulo circunscrito es: "+ areacirlo);
    System.out.println("La circunferencia circunscrita es: " + circunferencia);
}
}
