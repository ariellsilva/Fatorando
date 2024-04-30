import java.util.Scanner;

public class FatorandoFor {

    public static void main(String[]args){
        int numbers;


        Scanner digite = new Scanner(System.in);

        System.out.println("Digite um número: ");
        numbers = digite.nextInt();

        long fatorial = 1;

        for(int i =1; i<= numbers; i++){
            fatorial = fatorial *i;

            System.out.println("O número " + numbers + "fatorado é " + fatorial);
        }


    }
}
