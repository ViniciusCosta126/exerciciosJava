import java.io.IOException;
import java.util.Scanner;

/*
A fórmula para calcular a área de uma circunferência é: area = π . raio2. Considerando para este problema que π = 3.14159:
Efetue o cálculo da área, elevando o valor de raio ao quadrado e multiplicando por π.
 */
public class Ex1002 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        double pi = 3.14159;
        double raio = sc.nextDouble();
        double area = pi * raio * raio;

        System.out.printf("A=%.4f", area);
    }

}