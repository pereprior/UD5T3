public class Main6 {

    public static void main(String[] args) {

        //i
        Punto punto = new Punto(2,2);
        Punto segundoPunto = new Punto(5,8);
        Segmento segmento = new Segmento(punto, segundoPunto);
        Rectangulo rectangulo = new Rectangulo(segmento);

        //ii
        System.out.println(rectangulo.getArea());

        //iii
        Rectangulo[] misRectangulos = new Rectangulo[10];
        for (int i = 0; i < misRectangulos.length; i++) {

            punto.posiciona(i,i);
            misRectangulos[i] = new Rectangulo(punto,3,2);

        }

        //iv
        System.out.println("\nArray de Rectangulos:");
        for (Rectangulo r : misRectangulos) {

            System.out.println(r.toString());

        }

    }

}
