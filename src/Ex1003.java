import java.io.IOException;
import java.util.Scanner;

/*
Leia dois valores inteiros, no caso para variáveis A e B. A seguir, calcule a soma entre elas e atribua à variável SOMA. 
A seguir escrever o valor desta variável.
 */
public class Ex1003 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int soma = n1 + n2;
        System.out.println("SOMA = " + soma);
    }

}