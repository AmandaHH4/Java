package EstruturasDecisao;

import java.util.Scanner;

public class Exemplo11 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in); // leitura

        System.out.print("Digite o salario: ");  // console.log

//        double salario = Double.parseDouble(leitor.nextLine());
        double salario = leitor.nextDouble(); //


        if (salario < 1000) {
            double salarioReajustado = salario * 1.1;
            System.out.print(salarioReajustado);
        } else {
            System.out.print("Salario sem Reajuste");
        }


    }
}