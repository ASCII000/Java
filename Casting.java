/*
A conversão de tipo é quando você atribui um valor de um tipo de dados primitivo a outro tipo.

Em Java, existem dois tipos de casting:

Widening Casting (automaticamente) - convertendo um tipo menor em um tamanho maior
byte-> short-> char-> int-> long-> float->double

Narrowing Casting (manualmente) - convertendo um tipo maior em um tipo de tamanho menor
double-> float-> long-> int-> char-> short->byte
 */
public class Casting {
    public static void main(String[] args) {
        //Widening Casting
        int numero = 10;
        double numeroConvertido = numero; // Feito automaticamente

        System.out.println("Widening Casting:");
        System.out.println("O numero: " + numero);
        System.out.println("O numero convertido: " + numeroConvertido);

        //Narrowing Casting
        double numeroDouble= 9.78d;
        int numeroNarrowing = (int) numeroDouble;

        System.out.println("Narrowing Casting:");
        System.out.println("O numero: " + numeroDouble);
        System.out.println("O numero convertido: " + numeroNarrowing);

    }
}
