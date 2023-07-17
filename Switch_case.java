/*
Switch Case:
    É assim que funciona:

    A switchexpressão é avaliada uma vez.
    O valor da expressão é comparado com os valores de cada um case.
    Se houver uma correspondência, o bloco de código associado será executado.
    As palavras-chave breake defaultsão opcionais e serão descritas mais adiante neste capítulo

    Estrutura:
    Switch ([CASO]) {
        case [CONDICIONAL]:
            codigo...
        case [CONDICIONAL]:
            codigo...
 */

public class Switch_case {
    public static void main(String[] args) {
        int dia = 7;
        switch (dia) {
            case (6):
                System.out.println("Hoje é sabádo");
                break;
            case (7):
                System.out.println("Hoje é domingo");
                break;
            default:
                System.out.println("Dia da semana não registrado?");
                    
        }
    }
}

