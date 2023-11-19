import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numeroAleatorio = random.nextInt(11);
        int resposta;

        System.out.println("Você tem três chances de adivinhar o numero que estou pensando, está entre 0 e 10");
        resposta = scanner.nextInt();

        for (int i = 0; i < 2; i++) {
            if (resposta != numeroAleatorio) {
                System.out.println("Tente de novo");
                resposta = scanner.nextInt();
            }
        }

        if (resposta != numeroAleatorio) {
            System.out.println("Você não conseguiu adivinhar dessa vez, melhore sua clarividencia");
        } else {
            System.out.println("voce conseguiu ler minha mente... juro que na proxima vou te vencer!");
        }
    }
}
