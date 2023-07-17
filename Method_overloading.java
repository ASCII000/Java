/*
Definir o mesmo metodo com funções semelhantes mas com valores diferentes.

Para fazer isso basta definir o mesmo nome mas com retornos diferentes no lugar do void.
 */

public class Method_overloading {

    static int somar(int x, int y) {
        return x + y;
    }

    static double somar (double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        System.out.println(somar(5, 7));
        System.out.println(somar(12.3,2.5));
    }
}
