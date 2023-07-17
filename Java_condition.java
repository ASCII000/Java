/*
Operadores if...else e Ternary Operator

    variable = (condition) ? expressionTrue :  expressionFalse;

    Menor que: a < b
    Menor ou igual a: a <= b
    Maior que: a > b
    Maior ou igual a: a >= b
    Igual a a == b
    Diferente de: a != b
 */

public class Java_condition {
    public static void main(String[] args) {
        int idade = 18;
        String nome = "Emerson da Silva";

        // If e Else
        if (idade < 18) { //Condição If... (se)
            System.out.println("Você é menor de idade.");
        } else { //Condição Else...(Senão)
            System.out.println("Você é maior de idade.");
        }

        // Else if
        if (nome.length() < 7) {
            System.out.println("Seu nome tem menos de 7 caracteres.");
        } else if (nome.indexOf("Silva") > 0) {
            System.out.println("Seu nome tem mais de 7 caractere e tem o sobrenome Silva.");
        }
        /*
        Ternary Operator

        variable = (condition) ? expressionTrue :  expressionFalse;
         */

        int time = 18;
        String resultado = (time >= 18) ? "Bom dia" : "Boa noite";
        System.out.println(resultado);

    }
}
