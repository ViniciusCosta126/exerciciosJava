import java.io.IOException;
import java.util.Scanner;

/*
Leia 3 valores, no caso, variáveis A, B e C, que são as três notas de um aluno. A seguir, calcule a média do aluno, 
sabendo que a nota A tem peso 2, a nota B tem peso 3 e a nota C tem peso 5. 
Considere que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.
 */
public class Ex1006 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        double n1 = sc.nextDouble() * 2;
        double n2 = sc.nextDouble() * 3;
        double n3 = sc.nextDouble() * 5;

        double media = (n1 + n2 + n3) / 10;

        System.out.printf("MEDIA = %.1f", media);
    }
}