import java.io.IOException;
import java.util.Scanner;

/*
Leia 2 valores inteiros e armazene-os nas variáveis A e B. Efetue a soma de A e B atribuindo o seu resultado
na variável X. Imprima X conforme exemplo apresentado abaixo. Não apresente mensagem alguma além daquilo que
está sendo especificado e não esqueça de imprimir o fim de linha após o resultado, caso contrário,
você receberá "Presentation Error". 
*/

public class Ex1001 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        System.out.println("X = " + (n1 + n2));

    }

}