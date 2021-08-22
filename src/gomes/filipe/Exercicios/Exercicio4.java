package gomes.filipe.Exercicios;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner diario = new Scanner(System.in);

        int leitorDiarioA = 0;
        int leitorDiariosAB = 0;
        int leitorDiariosAC = 0;
        int leitorDiariosABC = 0;
        int leitorDiarioB = 0;
        int leitorDiariosBC = 0;
        int leitorDiarioC = 0;
        int naoCurteLer = 0;

        for (int i = 0; i < 5 ; i++) {
            int leDiarioA = 2;
            int leDiarioB = 2;
            int leDiarioC = 2;

            System.out.println("Entrevistado número: " + (i + 1));

            System.out.println("Leitor do Diário A (Digite 1 para sim ou 2 para não):");
            leDiarioA = diario.nextInt();

            System.out.println("Leitor do Diário B (Digite 1 para sim ou 2 para não):");
            leDiarioB = diario.nextInt();

            System.out.println("Leitor do Diário C (Digite 1 para sim ou 2 para não):");
            leDiarioC = diario.nextInt();

            if (leDiarioA == 1 && leDiarioB != 1 && leDiarioC != 1 ) {
                leitorDiarioA += 1;
            } else if (leDiarioA == 1 && leDiarioB == 1 && leDiarioC != 1 ) {
                leitorDiariosAB += 1;
            } else if (leDiarioA == 1 && leDiarioB != 1 && leDiarioC == 1 ) {
                leitorDiariosAC += 1;
            } else if (leDiarioA == 1 && leDiarioB == 1 && leDiarioC == 1 ) {
                leitorDiariosABC += 1;
            } else if (leDiarioA != 1 && leDiarioB == 1 && leDiarioC != 1 ) {
                leitorDiarioB += 1;
            } else if (leDiarioA != 1 && leDiarioB == 1 && leDiarioC == 1 ) {
                leitorDiariosBC += 1;
            } else if (leDiarioA != 1 && leDiarioB != 1 && leDiarioC == 1) {
                leitorDiarioC += 1;
            } else {
                naoCurteLer += 1;
            }
        }

        int totalEntrevistados = leitorDiarioA + leitorDiariosAB + leitorDiariosAC + leitorDiariosABC +
                leitorDiarioB + leitorDiariosBC + leitorDiarioC + naoCurteLer;

        System.out.println("Leitores que lêem somente o Diário A:" + leitorDiarioA);
        System.out.println("Leitores que lêem somente os Diários A e B:" + leitorDiariosAB);
        System.out.println("Leitores que lêem somente os Diários A e C:" + leitorDiariosAC);
        System.out.println("Leitores que lêem somente os Diários A, B e C:" + leitorDiariosABC);
        System.out.println("Leitores que lêem somente o Diário B:" + leitorDiarioB);
        System.out.println("Leitores que lêem somente os Diários B e C:" + leitorDiariosBC);
        System.out.println("Leitores que lêem somente o Diário C:" + leitorDiarioC);
        System.out.println("Não curte ler: " + naoCurteLer);
        System.out.println("\nTotal de entrevistados: " + totalEntrevistados);
    }
}
