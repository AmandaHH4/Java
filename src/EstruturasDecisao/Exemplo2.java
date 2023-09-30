package EstruturasDecisao;

import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in); // leitura

        System.out.print("Digite um numero, para verificar se e positivo ou negativo: ");  // console.log

//        double salario = Double.parseDouble(leitor.nextLine());
          double numero = leitor.nextDouble(); //



        if (numero > 0) {
            System.out.print("positivo");
        } else  if (numero < 0){
            System.out.print("Negativo");
        }else{
            System.out.print("Neutro");
        }



    }
}