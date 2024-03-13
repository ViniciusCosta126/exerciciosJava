import java.io.IOException;
import java.util.Scanner;

/*
Escreva um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. 
A seguir, mostre o número e o salário do funcionário, com duas casas decimais.
 */
public class Ex1008 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();
        int horas = sc.nextInt();
        double valorHora = sc.nextDouble();

        System.out.println("NUMBER = " + numero);
        System.out.printf("SALARY = U$ %.2f", (horas * valorHora));
    }
}