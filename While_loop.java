/*
Sintaxe:
    while (condição):
        codigo...
 */

public class While_loop {
    public static void main(String[] args){

        // Método 1 usando while loop
        int x = 1;
        while (x <= 5) {
            System.out.println("O valor de x agora é: ".concat(Integer.toString(x)));
            x++;
        }
        // Método 2 usando do~while
        int y = 1;
        do {
            y++;
            System.out.println("O valor de Y agora é: ".concat(Integer.toString(y)));
        } while (y <= 5); //OBS: Como o código [do] é executado antes do while o resultado invez de 5 vai ate
                            // O 6!
    }
}
