package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

/**
 * Prática
 *
 * Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem
 *
 * eu <nome>, morando no endereço <endereco> confirmo que recebi o salário de <salario>, nada data <data>
 * */

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Preencha os valores conforme solicitado");

        System.out.println("Insira o seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Insira o seu endereço: ");
        String endereco = sc.nextLine();

        System.out.println("Insira o salário recebido: ");
        double salario = sc.nextDouble();

        System.out.println("Insira a Data Recebida: ");
        String data = sc.nextLine();

        System.out.println("Eu "+ nome + ", "
                + "morando no endereço: "
                + endereco
                + "confirmo que recebi o salário de: "
                + salario + ", " + "na data: " + data);

        sc.close();
    }
}
