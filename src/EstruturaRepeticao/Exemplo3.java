package EstruturaRepeticao;

import java.util.Scanner;
public class Exemplo3 {
    public static void  main (String[]args) throws InterruptedException{
        String[] ListaCarros = { "SP2", "Maverick", "Fusca", "GT40"};

        for (String cadaCarro : ListaCarros) {
            System.out.println(cadaCarro);
            Thread.sleep( 1000);
        }
    }
}
