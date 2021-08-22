package gomes.filipe.Exercicios;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        String moeda = "###,###.##";
        DecimalFormat dfServico = new DecimalFormat(moeda);
        dfServico.setRoundingMode(RoundingMode.DOWN);

        Scanner servico = new Scanner(System.in);

        String servico1 = "Serviço 1: Segurança com câmeras - Preço fixo de US $ 1.500 por mês.";
        int precoServico1 = 1500;
        System.out.println(servico1);

        String servico2 = "Serviço 2: Câmera de segurança + patrulha - Preço de $ 1500 + $ 700 para serviço de patrulha.";
        int precoServico2 = 1500 + 700;
        System.out.println(servico2);

        System.out.println();

        System.out.println("Escolha o tipo de serviço para a Empresa 1. Digite 1 ou 2: ");
        int empresa1 = servico.nextInt();

        System.out.println("Escolha o tipo de serviço para a Empresa 2. Digite 1 ou 2: ");
        int empresa2 = servico.nextInt();

        System.out.println("Escolha o tipo de serviço para a Empresa 3. Digite 1 ou 2: ");
        int empresa3 = servico.nextInt();

        System.out.println("Escolha o tipo de serviço para a Empresa 4. Digite 1 ou 2: ");
        int empresa4 = servico.nextInt();

        System.out.println("Escolha o tipo de serviço para a Empresa 5. Digite 1 ou 2: ");
        int empresa5 = servico.nextInt();

        System.out.println("Escolha o tipo de serviço para a Empresa 6. Digite 1 ou 2: ");
        int empresa6 = servico.nextInt();

        System.out.println("Escolha o tipo de serviço para a Empresa 7. Digite 1 ou 2: ");
        int empresa7 = servico.nextInt();

        if (empresa1 == 1) {
            System.out.println("Empresa: Empresa1");
            System.out.println("Serviço: " + servico1);
            System.out.println("Fatura: $ " + (dfServico.format(precoServico1)));
            System.out.println();
        } else {
            System.out.println("Empresa: Empresa1");
            System.out.println("Serviço: " + servico2);
            System.out.println("Fatura: $ " + (dfServico.format(precoServico2)));
            System.out.println();
        }

        if (empresa2 == 1) {
            System.out.println("Empresa: Empresa2");
            System.out.println("Serviço: " + servico1);
            System.out.println("Fatura: $ " + (dfServico.format(precoServico1)));
            System.out.println();
        } else {
            System.out.println("Empresa: Empresa2");
            System.out.println("Serviço: " + servico2);
            System.out.println("Fatura: $ " + (dfServico.format(precoServico2)));
            System.out.println();
        }

        if (empresa3 == 1) {
            System.out.println("Empresa: Empresa3");
            System.out.println("Serviço: " + servico1);
            System.out.println("Fatura: $ " + (dfServico.format(precoServico1)));
            System.out.println();
        } else {
            System.out.println("Empresa: Empresa3");
            System.out.println("Serviço: " + servico2);
            System.out.println("Fatura: $ " + (dfServico.format(precoServico2)));
            System.out.println();
        }

        if (empresa4 == 1) {
            System.out.println("Empresa: Empresa4");
            System.out.println("Serviço: " + servico1);
            System.out.println("Fatura: $ " + (dfServico.format(precoServico1)));
            System.out.println();
        } else {
            System.out.println("Empresa: Empresa4");
            System.out.println("Serviço: " + servico2);
            System.out.println("Fatura: $ " + (dfServico.format(precoServico2)));
            System.out.println();
        }

        if (empresa5 == 1) {
            System.out.println("Empresa: Empresa5");
            System.out.println("Serviço: " + servico1);
            System.out.println("Fatura: $ " + (dfServico.format(precoServico1)));
            System.out.println();
        } else {
            System.out.println("Empresa: Empresa5");
            System.out.println("Serviço: " + servico2);
            System.out.println("Fatura: $ " + (dfServico.format(precoServico2)));
            System.out.println();
        }

        if (empresa6 == 1) {
            System.out.println("Empresa: Empresa6");
            System.out.println("Serviço: " + servico1);
            System.out.println("Fatura: $ " + (dfServico.format(precoServico1)));
            System.out.println();
        } else {
            System.out.println("Empresa: Empresa6");
            System.out.println("Serviço: " + servico2);
            System.out.println("Fatura: $ " + (dfServico.format(precoServico2)));
            System.out.println();
        }

        if (empresa7 == 1) {
            System.out.println("Empresa: Empresa7");
            System.out.println("Serviço: " + servico1);
            System.out.println("Fatura: $ " + (dfServico.format(precoServico1)));
            System.out.println();
        } else {
            System.out.println("Empresa: Empresa7");
            System.out.println("Serviço: " + servico2);
            System.out.println("Fatura: $ " + (dfServico.format(precoServico2)));
            System.out.println();
        }
    }
}
