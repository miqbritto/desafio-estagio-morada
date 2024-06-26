import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valorSaque;

        do {
            System.out.print("\nInsira o valor que deseja sacar: ");
            valorSaque = scanner.nextInt();

            if (valorSaque <=0 ) {
                System.out.println("\nErro! O valor do saque deve ser um inteiro positivo.");
            }

        } while (valorSaque <= 0);

        int valorRestante = valorSaque;

        int qtd100 = 0, qtd50 = 0, qtd20 = 0, qtd10 = 0, qtd5 = 0, qtd2 = 0;


        if (valorRestante >= 100) {
            qtd100 = valorRestante / 100;
            valorRestante = valorRestante % 100;
        }
        if (valorRestante >= 50) {
            qtd50 = valorRestante / 50;
            valorRestante = valorRestante % 50;
        }
        if (valorRestante >= 20) {
            qtd20 = valorRestante / 20;
            valorRestante = valorRestante % 20;
        }
        if (valorRestante >= 10) {
            qtd10 = valorRestante / 10;
            valorRestante = valorRestante % 10;
        }
        if (valorRestante >= 5) {
            qtd5 = valorRestante / 5;
            valorRestante = valorRestante % 5;
        }
        if (valorRestante >= 2) {
            qtd2 = valorRestante / 2;
            valorRestante = valorRestante % 2;
        }

        System.out.println("\nPara o valor de saque de " + valorSaque + " reais, a quantidade de cédulas é:");
        System.out.println("Cédulas de 100: " + qtd100);
        System.out.println("Cédulas de 50: " + qtd50);
        System.out.println("Cédulas de 20: " + qtd20);
        System.out.println("Cédulas de 10: " + qtd10);
        System.out.println("Cédulas de 5: " + qtd5);
        System.out.println("Cédulas de 2: " + qtd2);

        if (valorRestante > 0) {
            System.out.println("\nNão foi possível sacar exatamente o valor desejado. Restante: " + valorRestante);
        }
        
    }
}