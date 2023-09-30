package EstruturasDecisao;

import java.util.Scanner;

public class Exemplo4 {
    public static void  main (String[]args){

        Scanner leitor =new Scanner(System.in);



        System.out.print("Digite o nome de usuario: ");  // console.log
        String usuario = leitor.nextLine();
        System.out.print("Digite a senha : ");  // console.log
        String senha = leitor.nextLine();

        if (usuario.equals("admin") && senha.equals("senha123")){
            System.out.println("Login bem-sucedido");

        }  else {
            System.out.println("Nome de usuario ou senha incorretos");
        }


    }
}
