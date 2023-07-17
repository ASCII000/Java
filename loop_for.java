/*
Sintaxe:
    for (instrução 1; instrução 2; instrução 3) {
        codigo...
    }

    A instrução 1 é executada (uma vez) antes da execução do bloco de código.
    A instrução 2 define a condição para executar o bloco de código.
    A instrução 3 é executada (todas as vezes) após a execução do bloco de código.

        // Exemplo de loop
        for (int x = 0; x < 5; x++) {
            System.out.println("O código foi executado: ".concat(Integer.toString(x+1)));
        }
        // Inner loop ou Loops aninhados
        for (int y = 0; y < 5; y++) {
            System.out.println("O valor de Y é: " + y);
            for(int j = 0;j < 5; j++) {
                System.out.println("O valor de J é: " + j);
            }
        }
 */
public class loop_for {
    public static void main(String[] args) {
        /*
        For each loop / Para cada loop
        for (type variableName : arrayName) {
            codigo...
        }
        */
        String[] cars = {"Volvo", "Honda", "Ford", "BMW"};

        for (String car : cars) {
            System.out.println(car);
        }
    }
}
