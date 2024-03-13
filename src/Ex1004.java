import java.io.IOException;
import java.util.Scanner;

/*
Leia dois valores inteiros. A seguir, calcule o produto entre estes dois valores e 
atribua esta operação à variável PROD. A seguir mostre a variável PROD com mensagem correspondente.  
 */

public class Ex1004 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int produto = n1 * n2;

        System.out.println("PROD = " + produto);
    }

}