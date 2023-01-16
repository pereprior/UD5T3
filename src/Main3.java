public class Main3 {
    public static void main(String[] args) {
        Segmento miSegmento = new Segmento(new Punto(4, 5), new Punto(6, 8));
        System.out.println("Segmento: " + miSegmento.toString() + " Longitud: " + miSegmento.longitud());
        miSegmento.desplaza(new Punto(4,3));
        System.out.println("Segmento: " + miSegmento.toString() + " Longitud: " + miSegmento.longitud());
    }
}
