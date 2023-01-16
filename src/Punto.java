public class Punto {
    private int x;
    private int y;

    public Punto(){
        x = 0;
        y = 0;
    }
    public Punto(Punto p){
        x  = p.getX();
        y = p.getY();
    }
    public Punto(int x, int y){
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return "(" + x + ", " + y + ")";
    }
    public void posiciona(int x, int y){
        this.x = x;
        this.y = y;
    }

    // Funciones del punto 3

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    // Funciones para el punto 5
    public void desplaza(int despX, int despY){
        x += despX;
        y += despY;
    }
    public void desplaza(Punto p){
        desplaza(p.getX(), p.getY());
    }
    public double distancia(Punto p){
        return Math.sqrt(Math.pow(x-p.getX(),2) + Math.pow(y-p.getY(),2));
    }
    // Funciones para cálculo de área
    /**
     * El producto vectorial de dos vectores (vXu) da como resultado un vector perpendicular (w) al plano
     * formado por estos, cuyo módulo es el área del paralelogramo que forman y cuyo signo indica
     * la dirección del vector siguiendo la llamada "regla de la mano derecha". En un plano este valor
     * nos indica si el ángulo recorrido es positivo o negativo ya que uXv=-(vXu).
     * Calculamos el área de un paralelogramo a partir del producto vectorial de dos vectores
     * tridimensionales que comparten el plano XY con z=0.
     * @param p1 punto para obtener el primer vector (p1-p)
     * @param p2 punto para obtener el segundo vector (p2-p)
     * @return El módulo del resultado es el área del paralelogramo y el signo indica si el ángulo
     * recorrido es positivo o negativo.
     */
    public double areaParalelogramo(Punto p1, Punto p2){
        return ((p1.getX()-x) * (p2.getY()-y)) - ((p1.getY()-y) * (p2.getX()-x));
    }
    public double areaTriangulo(Punto p1, Punto p2){
        return areaParalelogramo(p1, p2)/2;
    }
    public double areaIntegral(Punto p){
        Punto baseTriangulo = new Punto(p.getX(),y);
        Punto baseParalelogramo = new Punto(x, 0);
        Double area = areaParalelogramo(baseTriangulo,baseParalelogramo);
        area += areaTriangulo(p, baseTriangulo);
        return area;
    }
}
