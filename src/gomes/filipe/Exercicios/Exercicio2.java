package gomes.filipe.Exercicios;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        String moeda = "###,###.##";
        DecimalFormat dfSalario = new DecimalFormat(moeda);
        dfSalario.setRoundingMode(RoundingMode.DOWN);

        Scanner dados = new Scanner(System.in);

        System.out.println("Digite o número do RG(Ex: 123456789): ");
        String rg = dados.nextLine();
        rg = rg.substring(0, 2) + "." + rg.substring(2, 5) + "." + rg.substring(5, 8) + "-" + rg.charAt(8);

        System.out.println("Digite o valor do salário atual (Ex: 1000): ");
        double salarioAtual = dados.nextDouble();

        double aumentoSalarial = 0;

        if (salarioAtual <= 20000) {
            // 20% = 0.2
            aumentoSalarial = salarioAtual * 0.2;
            System.out.println("--- Dados do funcionário ---" );
            System.out.println("RG: " + rg);
            System.out.println("Salário atual: $ " + (dfSalario.format(salarioAtual)));
            System.out.println("Aumento salarial de 20% totalizando: $ " + (dfSalario.format(aumentoSalarial)));
            System.out.println("Novo salário: $ " + (dfSalario.format(salarioAtual + aumentoSalarial)));
        } else if (salarioAtual > 20000 && salarioAtual <= 45000) {
            // 10% = 0.1
            aumentoSalarial = salarioAtual * 0.1;
            System.out.println("--- Dados do funcionário ---" );
            System.out.println("RG: " + rg);
            System.out.println("Salário atual: $ " + (dfSalario.format(salarioAtual)));
            System.out.println("Aumento salarial de 10% totalizando: $ " + (dfSalario.format(aumentoSalarial)));
            System.out.println("Novo salário: $ " + (dfSalario.format(salarioAtual + aumentoSalarial)));

        } else if (salarioAtual > 45000){
            // 5% = 0.05
            aumentoSalarial = salarioAtual * 0.05;
            System.out.println("--- Dados do funcionário ---" );
            System.out.println("RG: " + rg);
            System.out.println("Salário atual: $ " + (dfSalario.format(salarioAtual)));
            System.out.println("Aumento salarial de 5% totalizando: $ " + (dfSalario.format(aumentoSalarial)));
            System.out.println("Novo salário: $ " + (dfSalario.format(salarioAtual + aumentoSalarial)));
        }
    }
}
