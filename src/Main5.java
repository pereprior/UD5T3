public class Main5 {

    public static void main(String[] args) {

        //i
        Punto punto = new Punto();
        Rectangulo rectangulo = new Rectangulo(punto);

        //ii
        System.out.println(rectangulo.toString());

        //iii
        rectangulo.desplaza(4,7);

        //iv
        System.out.println(rectangulo.toString());

    }

}