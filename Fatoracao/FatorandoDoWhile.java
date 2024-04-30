import java.util.Scanner;

public class FatorandoDoWhile {

    public static void main(String[] args) {
        
        int numbers;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número: ");
        numbers = teclado.nextInt();
        long fatorial = 1;
        int i =1;

        do{
            fatorial = fatorial*i;
            i ++;
         }while(i <= numbers);
         System.out.println("O número " + numbers + " fatorado é "+ fatorial);
    }

}
