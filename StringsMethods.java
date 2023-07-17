/*
Ver mais sobre os métodos string:
    https://www.w3schools.com/java/java_ref_string.asp
 */

public class StringsMethods {
    public static void main(String[] args){

        String nome = "Emerson da Silva";

        System.out.println("Tamanho: " + nome.length());
        System.out.println("Nome em caixa alta: " + nome.toUpperCase());
        System.out.println("Localizar texto dentro de uma String: " + nome.indexOf("Silva"));
        System.out.println("Nome: ".concat(nome));
        System.out.println("Teste \"Texto\" Teste");
    }
}
