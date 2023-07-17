public class Break_continue {
    public static void main(String[] args) {
        for (int x = 0; x < 10; x++) {
            if (x == 4) {
                break; // Usado para quebrar o bloco.
            }

            System.out.println(x);
        }

        for (int y = 0; y < 10; y++) {
            if (y == 4) {
                continue; // Usado para ignorar bloco recorrente.
            }

            System.out.println(y);
        }
    }
}
