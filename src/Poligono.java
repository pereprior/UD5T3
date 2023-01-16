public class Poligono {
    public static final int NUMERO_MINIMO_PUNTOS = 3;
    Punto[] puntos;
    public Poligono(Punto[] ptos){
        puntos = new Punto[ptos.length];
        for (int i=0; i<ptos.length; i++){
            puntos[i] = new Punto(ptos[i]);
        }
    }
    public Poligono(Segmento[] sgtos){ //TODO verificar secuencia valida de segmentos
        puntos = new Punto[sgtos.length];
        for (int i=0;i<sgtos.length; i++){
            puntos[i] = new Punto(sgtos[i].getInicio());
        }
    }
    public String toString(){
        String valor = "";
        if (puntos.length>0){
            valor = puntos[0].toString();
            for (int i=1; i<puntos.length; i++){
                valor += " - " + puntos[i].toString();
            }
        }
        return valor;
    }
    public void desplaza(Punto p){
        for (int i=0;i<puntos.length;i++){
            puntos[i].desplaza(p);
        }
    }
    public double perimetro(){
        double valor = 0F;
        if (puntos.length>=NUMERO_MINIMO_PUNTOS) {
            valor = puntos[0].distancia(puntos[puntos.length-1]);
            for (int i = 1; i < puntos.length; i++) {
                valor += puntos[i - 1].distancia(puntos[i]);
            }
        }
        return valor;
    }

    /**
     * Cálculo del área por triangulación conocido como "Slicker algorithm"
     * @return
     */
    public double areaTriangulos(){
        double valorArea = 0F;
        if (puntos.length>=NUMERO_MINIMO_PUNTOS) {
            for (int i=1;i<puntos.length-1; i++){
                valorArea += puntos[0].areaTriangulo(puntos[i],puntos[i+1]);
            }
        }
        return valorArea;
    }
    public double areaIntegral(){
        double valorArea = 0F;
        if(puntos.length>=NUMERO_MINIMO_PUNTOS){
            for (int i=0;i<puntos.length-1;i++){
                valorArea += puntos[i].areaIntegral(puntos[i+1]);
            }
            // Cierre del poligono entre el último punto y el primero.
            valorArea += puntos[puntos.length-1].areaIntegral(puntos[0]);
        }
        return valorArea;
    }
 }
