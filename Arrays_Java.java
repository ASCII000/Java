/*
Arrays são usados para armazenar vários valores em uma única variável, em vez de declarar variáveis ​​separadas para cada valor.

Para declarar um array, defina o tipo de variável com colchetes :
 */

public class Arrays_Java {
    public static void main(String[] args) {
        // Para definir a Array/Matriz usamos os conchetes e logo apos chaves para fechar os valores;
        String[] carros = {"Ford", "BMW", "Volvo"};
        int[] numeros = {1, 12, 33, 11};
        double[] flutuantes = {1.32, 12.3};

        //  Para acessar os valores usamos o indice
        //System.out.println(carros[1]);

        //  Para alterar o valor acessamos o indice e igualamos ao novo valor.
        //carros[1] = "Corsa";
        //System.out.println(carros[1]);

        //  Tamanho do array
        //System.out.println(numeros.length);

        //  Percorrer uma matriz

        // Método 1 For each
        //for (String carro : carros) {
        //    System.out.println(carro);
        //}

        //Método 2
        // (int indice = 0; indice < carros.length; indice++) {
        //    System.out.println(carros[indice]);
        //}

        int[][] multidimensoes = {{1, 2, 3}, {4,5,6}};
        //System.out.println(multidimensoes[1][1]);

        multidimensoes[1][1] = 9;
        //System.out.println(multidimensoes[1][1]);

        for (int coluna = 0; coluna < multidimensoes.length; coluna++) {
            for (int linha = 0; linha < multidimensoes[coluna].length; linha++) {
                System.out.println(multidimensoes[coluna][linha]);
            }
        }
    }
}
