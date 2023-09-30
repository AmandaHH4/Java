package EstruturasDecisao;

import java.util.Scanner;

public class Exemplo3 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in); // leitura

         System.out.print("Digite o primeiro valor: ");  // console.log
         double valor1 = leitor.nextDouble();
         System.out.print("Digite o segundo valor: ");  // console.log
         double valor2 = leitor.nextDouble();
//        double salario = Double.parseDouble(leitor.nextLine());



        if (valor1 > valor2) {
            System.out.print(valor1);
        } else  if (valor2 > valor1){
            System.out.print(valor2);
        }else{
            System.out.print("Os numeros sao iguais");
        }



    }
}


//  numero maior