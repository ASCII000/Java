/*
myMethod()é o nome do método
static significa que o método pertence à classe Main e não um objeto da classe Main.
voidsignifica que este método não tem um valor de retorno. Você aprenderá mais sobre valores de retorno posteriormente neste capítulo
 */

public class Methods_java {
    //Metódo simples
    static void myMethod() {
        System.out.println("Foi executado!");
    }

    //Método com parametro
    static void meuNome(String primeiro_nome, String segundo_nome, int idade) {
        System.out.println(String.format(
                "Meu nome é %s da %s tenho %d", primeiro_nome, segundo_nome, idade));
    }

    //Método com retorno "return"
    //Inves de usar o void, usamos o tipo de variavel de retorno.
    static int somar(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        meuNome("Emerson", "Silva", 19);
        int soma = somar(5, 7);
        System.out.println(soma);
    }
}
