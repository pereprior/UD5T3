public class Segmento {
    private Punto inicio;
    private Punto fin;

    public Segmento(){
        inicio = new Punto();
        fin = new Punto();
    }
    public Segmento(Punto inicio, Punto fin){
        this.inicio = new Punto(inicio.getX(), inicio.getY());
        this.fin = new Punto(fin.getX(), fin.getY());
    }

    public double longitud(){
        return inicio.distancia(fin);
    }

    public String toString(){
        return inicio.toString() + " - " + fin.toString();
    }
    public void desplaza(Punto p){
        inicio.desplaza(p);
        fin.desplaza(p);
    }

    public Punto getInicio() {
        return inicio;
    }

    public void setInicio(Punto inicio) {
        this.inicio = inicio;
    }

    public Punto getFin() {
        return fin;
    }

    public void setFin(Punto fin) {
        this.fin = fin;
    }
}