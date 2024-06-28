import java.util.Random;
import java.util.Scanner;

public class JogoDeAdivinhacao {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        Random computAdivinha = new Random();
        int adivinhacao = computAdivinha.nextInt(100) + 1;

        System.out.println("ESTOU PENSANDO EM UM NÚMERO... TENTE ACERTÁ-LO!");
        int tentativas = 0;
        while (tentativas <= 0 || tentativas > 5) {
            System.out.println("Quantas tentativas? (1 até 5): ");
            tentativas = leitor.nextInt();
            if (tentativas <= 0 || tentativas > 5) {
                System.out.println("O número de tentativas está incorreto.");
                System.out.println("Você deve escolher entre 1 e 5.");
            }
        }

        int i = 1;
        int numUsuario;
        while (i <= tentativas) {
            System.out.println("Chute um número entre 1 e 100.");
            numUsuario = leitor.nextInt();

            if(numUsuario > adivinhacao){
                System.out.println("O valor que você chutou é maior que o número secreto. ");
            } else if (numUsuario < adivinhacao) {
                System.out.println("O valor que você chutou é menor que o número secreto. ");
            } else {
                System.out.println("PARABÉNS! Você acertou!!");
            } break;
        }
            i++;

        if(i < tentativas){
            System.out.println("QUE PENA! Você perdeu!");
            System.out.println("O número secreto era " + adivinhacao);

            //char é caractere;
        }
    }
}




