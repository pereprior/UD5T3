public class Rectangulo {

    private Punto inferiorIzquierda;
    private Punto inferiorDerecho;
    private Punto superiorDerecho;
    private Punto superiorIzquierda;
    private Segmento segmento;
    private int ancho;
    private int alto;

    public Rectangulo(Punto p) {

        inferiorIzquierda = new Punto(p);
        ancho = 0;
        alto = 0;

    }

    public Rectangulo(Punto p, int ancho, int alto) {

        inferiorIzquierda = new Punto(p);
        this.ancho = ancho;
        this.alto = alto;

    }

    public Rectangulo(Punto p, Punto q) {

        inferiorIzquierda = new Punto(p);
        superiorDerecho = new Punto(q);

    }

    public Rectangulo(Segmento superior, Segmento inferior) {



    }

    public String toString() {

        return "{" + inferiorIzquierda.toString() + " anchura: " + ancho + " altura: " + alto + "}";

    }

    public void desplaza(int despX, int despY) {

        inferiorIzquierda.desplaza(despX,despY);

    }

    public String getArea() {

        return "El area del rectangulo es: " + alto*ancho;

    }

    public String getPunto() {

        return inferiorIzquierda.toString();

    }

    public String getSuperiorIzquierda() {

        return superiorIzquierda.toString();

    }

    public String getSuperiorDerecha() {

        return superiorDerecho.toString();

    }

    public String getInferiorIzquierda() {

        return inferiorIzquierda.toString();

    }

    public String getInferiorDerecho() {

        return inferiorDerecho.toString();

    }

    public int getAlto() {

        return alto;

    }

    public int getAncho() {

        return ancho;

    }

    public void setAlto(int alto) {

        this.alto = alto;

    }

    public void setAncho(int ancho) {

        this.ancho = ancho;

    }
}