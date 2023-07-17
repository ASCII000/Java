/*
Os tipos de dados são divididos em dois grupos:

    Tipos de dados primitivos - inclui byte, short, int, long, float, doubleebooleanchar
        - Verificar a disponibilidade de todos aqui: https://www.w3schools.com/java/java_data_types.asp
    Tipos de dados não primitivos - como String, Arrays e Classes.
 */

public class TiposPrimitivos {
    public static void main(String[] args) {

        //NUMEROS
        //      Inteiros possuem estes tipos validos: byte, short, int e long
        //      Flutuantes possuem float e double.
        //      Cada um seu limite maximo de armazenamento.

        byte numByte = 127; // max -128 a 127
        short numShort = 5000; // max -32768 a 32767
        int numInt = 10_000; // max -2147483648 a 2147483647.
        long numLong = 12_000; // max -9223372036854775808 a 9223372036854775807

        System.out.println(numByte);
        System.out.println(numShort);
        System.out.println(numInt);
        System.out.println(numLong);

            // Numeros Flutuante
        float Flutuante = 12.99f; // Float seis numeros apos o ponto.
        double FlutuanteDouble = 12.333d; // Double 15 digitos

            // Numeros cientificos
        //Um número de ponto flutuante também pode ser um número científico com um "e" para indicar a potência de 10:
        float f1 = 35e3f;
        double d1 = 12E4d;

        //STRING
        String Texto = "Olá Mundo!"; //Tipo String/Texto
        char Caractere = 'D'; //Tipo caractere *Aceita numeros ASCII
        boolean Boleano = true; //Tipo boloeano

        //Boleanos
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);     // Outputs true
        System.out.println(isFishTasty);   // Outputs false
    }
}
