package gomes.filipe.Exercicios;

import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class Exercicio1 {
    public static void main(String[] args) {
        double porcentagem = 0;
        int distancia = 0;
        Scanner diasCampanha = new Scanner(System.in);
        System.out.println("Digite o preço de custo: ");
        int precoDeCusto = diasCampanha.nextInt();

        System.out.println("Fábrica 1 a 500KM de distância e a taxa de envio de 7%");
        System.out.println("Fábrica 2 a 780KM de distância e a taxa de envio de 15%");
        System.out.println("Fábrica 3 a 1200KM de distância e a taxa de envio de 22%");

        Scanner fabrica = new Scanner(System.in);
        System.out.println("Digite a fábrica");
        int idFabrica = fabrica.nextInt();

        if (idFabrica == 1) {
            porcentagem = 0.7;
            distancia = 500;
        } else if (idFabrica == 2) {
            porcentagem = 0.15;
            distancia = 780;
        } else if (idFabrica == 3) {
            porcentagem = 0.22;
            distancia = 1200;
        }
        double custoEnvio =  porcentagem * precoDeCusto;
        double produtoLucro = precoDeCusto + custoEnvio;
        double custoFinal = produtoLucro + (produtoLucro * 0.25) ;
        System.out.println("Valor do produto: " + NumberFormat.getCurrencyInstance(Locale.US).format(custoFinal));
        System.out.println("Você escolheu a fábrica " + idFabrica + " que fica ao uma distância de " + distancia + "KM da Sede.");
    }
}
