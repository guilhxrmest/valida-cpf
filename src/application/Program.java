package application;

import entities.Cpf;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o CPF: ");
        System.out.println(new Cpf(sc.next()));

        sc.close();
    }
}
