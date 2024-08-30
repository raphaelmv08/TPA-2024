package ex_02_08;

import java.util.Scanner;

public class EstatisticaAlunos {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        // Declaração de variáveis
        int qta, qmb, qb, qr, qi, escolha;
        double pormb, porb, porr, pori;

        // Leitura das quantidades
        System.out.print("Informe a quantidade total de alunos: ");
        qta = ler.nextInt();
        System.out.print("Informe a quantidade de alunos com menção MB: ");
        qmb = ler.nextInt();
        System.out.print("Informe a quantidade de alunos com menção B: ");
        qb = ler.nextInt();
        System.out.print("Informe a quantidade de alunos com menção R: ");
        qr = ler.nextInt();
        System.out.print("Informe a quantidade de alunos com menção I: ");
        qi = ler.nextInt();

        // Solicita ao usuário qual porcentagem deseja ver
        System.out.println("Escolha a menção para calcular a porcentagem:");
        System.out.println("1 - MB");
        System.out.println("2 - B");
        System.out.println("3 - R");
        System.out.println("4 - I");
        escolha = ler.nextInt();
        
        // Usa switch case para calcular e exibir a porcentagem com base na escolha do usuário
        switch (escolha) {
            case 1:
                pormb = (double) qmb / qta * 100;
                System.out.printf("Porcentagem de alunos com menção MB: %.2f%%\n", pormb);
                break;
            case 2:
                porb = (double) qb / qta * 100;
                System.out.printf("Porcentagem de alunos com menção B: %.2f%%\n", porb);
                break;
            case 3:
                porr = (double) qr / qta * 100;
                System.out.printf("Porcentagem de alunos com menção R: %.2f%%\n", porr);
                break;
            case 4:
                pori = (double) qi / qta * 100;
                System.out.printf("Porcentagem de alunos com menção I: %.2f%%\n", pori);
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
                break;
        }

        // Fecha o scanner
        ler.close();
    }
}
