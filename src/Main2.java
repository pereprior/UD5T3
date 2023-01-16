public class Main2 {
    public static void main(String[] args) {
        Punto punto0 = new Punto(4, 5);
        Punto punto1 = new Punto(6, 8);

        punto0.desplaza(3,4);
        punto1.desplaza(3,4);
        System.out.println(punto0.toString());
        System.out.println(punto1.toString());
    }
}
