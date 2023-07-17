/*
Esté é um estudo de variaveis Java

As regras gerais para nomear variáveis são:

Os nomes podem conter letras, dígitos, sublinhados e cifrões
Os nomes devem começar com uma letra
Os nomes devem começar com letra minúscula e não podem conter espaços em branco
Os nomes também podem começar com $ e _ (mas não usaremos neste tutorial)
Os nomes diferenciam maiúsculas de minúsculas ("myVar" e "myvar" são variáveis ​​diferentes)
Palavras reservadas (como palavras-chave Java, como intou boolean) não podem ser usadas como nomes

 */

public class Variaveis {
    public static void main(String[] args) {

        //Variavel Letras/Texto em Java
        String String = "Emerson";
        char Caractere = 'D';

            //Variavel de Impressão
        String = String + " da Silva";

        //Variavel de numeros em Java
        int N1 = 10, N2 = 12, N3 = 23;

        int Numero = 10;
        float Flutuante = 1.99f;

        final int Numero2 = 25;

            //Variavel de Impressão
        Numero = Numero + 20;

        //Boleanos
        boolean Boleano = false;

        //OUT CONSOLE
        System.out.println(Boleano);
        System.out.println(Caractere);
        System.out.println(Flutuante);
        System.out.println(String);
        System.out.println(Numero);
        System.out.println(N1 + N2 + N3);
    }
}
