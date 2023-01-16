public class Main {
    public static void main(String[] args){
        Punto miPunto = new Punto(4,3);
        System.out.println(miPunto.toString());
        miPunto.posiciona(-3, 1);
        System.out.println(miPunto.toString());
    }
}
