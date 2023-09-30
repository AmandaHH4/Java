package EstruturaRepeticao;

public class Exemplo11 {

    public static void main(String[] args) {
        String[] ListaProfessores = {"Alexia", "Odirlei", "Jessica", "Thiago", "Samanta"};


        for (int contador = 0; contador < ListaProfessores.length; contador++) {
            if (contador == 0) {
                System.out.println("O numero do indice do(a) professor(a)" +
                        ListaProfessores[contador] + "e zero");


            } else if (contador % 2 == 0) {
                System.out.println("O numero do indice do(a) professor(a)" +
                        ListaProfessores[contador] + "e par");

            } else {
                System.out.println("O numero do indice do(a) professor(a)" +
                        ListaProfessores[contador] + "e impar");
            }


        }
    }

}