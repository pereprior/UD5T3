public class Main4 {
    public static void main(String[] args){
        /*
        Punto[] ptos = {new Punto(2,0), new Punto(0,4), new Punto(-2,0)};
        Poligono miPoligono = new Poligono(ptos);
        System.out.println("Poligono: " + miPoligono.toString() + " Perimetro: " + miPoligono.perimetro());
        System.out.println("Area por triangulos: " + miPoligono.areaTriangulos());
        System.out.println("Area por integral: " + miPoligono.areaIntegral());
        miPoligono.desplaza(new Punto(1,2));
        System.out.println("Poligono: " + miPoligono.toString() + " Perimetro: " + miPoligono.perimetro());
        Segmento[] sgtos = {new Segmento(new Punto(2,1), new Punto(2,4)), new Segmento(new Punto(2,4), new Punto(-1, 4)),
            new Segmento(new Punto(-1, 4), new Punto(-1,1)), new Segmento(new Punto(-1,1), new Punto(2,1))};
        Poligono otroPoligono = new Poligono(sgtos);
        System.out.println("Poligono: " + otroPoligono.toString() + " Perimetro: " + otroPoligono.perimetro());
        System.out.println("Area por triangulos: " + otroPoligono.areaTriangulos());
        System.out.println("Area por integral: " + otroPoligono.areaIntegral());
        */

        Punto[] ptos2 = { new Punto(2,2), new Punto(0,4), new Punto(-2,4), new Punto(-3,3),
                new Punto(-1,3), new Punto(0,2), new Punto(-2,0), new Punto(-2,-2)};
        Poligono otroPoligono2 = new Poligono(ptos2);
        //otroPoligono2.desplaza(new Punto(5,5));
        System.out.println("Poligono: " + otroPoligono2.toString() + " Perimetro: " + otroPoligono2.perimetro());
        System.out.println("Area por triangulos: " + otroPoligono2.areaTriangulos());
        System.out.println("Area por integral: " + otroPoligono2.areaIntegral());
    }
}

