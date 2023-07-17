/*
Assim como os loops podem se deparar com o problema do loop infinito,
as funções recursivas podem se deparar com o problema da recursão infinita.
Recursão infinita é quando a função nunca para de chamar a si mesma. Toda função recursiva
deve ter uma condição de parada, que é a condição em que a função para de chamar a si mesma.
No exemplo anterior, a condição de parada é quando o parâmetro kse torna 0.

É útil ver uma variedade de exemplos diferentes para entender melhor o conceito.
Neste exemplo, a função adiciona um intervalo de números entre um início e um fim.
A condição de parada para esta função recursiva é quando o fim não é maior que o início:
 */

public class Recursion_java {
    public static void main(String[] args) {
        int result = sum(5, 10);
        System.out.println(result);
    }
    public static int sum(int start, int end) {
        if (end > start) {
            return end + sum(start, end - 1);
        } else {
            return end;
        }
    }
}
