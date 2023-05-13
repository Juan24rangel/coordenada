package ejecutable;

import modelo.Coordenada;

public class Test 
{
    public static void main(String[] args) {
        Coordenada c1 = new Coordenada(5, 7);
        Coordenada c2 = new Coordenada(6, 8);
        
    
        // Imprimir las coordenadas en el formato estandar
        System.out.println("Coordenadas:");
        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        
    
        // Comparar coordenadas
        System.out.println("\nComparacion de coordenadas:");
        System.out.println("Son iguales? = " + c1.equals(c2));

        System.out.println("\nDistancia entre coordenadas:");
        System.out.println("distancia entre c1 y c2 = " + c1.distancia(c2));
    
        
    }
    
}
