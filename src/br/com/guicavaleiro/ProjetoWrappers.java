package br.com.guicavaleiro;

import java.util.Scanner;

public class ProjetoWrappers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int antesConversao;
        Integer depoisConversao;

        System.out.print("Digite um valor numérico inteiro: ");
        antesConversao = scanner.nextInt();

        depoisConversao = Integer.valueOf(antesConversao);
        System.out.println("Seu valor foi convertido para o Wrapper \"Integer\"");
        System.out.println("Agora o valor do Wrapper é de: " + depoisConversao);
    }
}
