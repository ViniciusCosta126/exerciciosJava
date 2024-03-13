import java.io.IOException;
import java.util.Scanner;

/*

 */
public class Ex1009 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String nome = sc.nextLine();
        double salário = sc.nextDouble();
        double totalVendas = sc.nextDouble();
        double total = salário + (totalVendas * 0.15);
        System.out.printf("TOTAL = %.2f", total);
    }
}