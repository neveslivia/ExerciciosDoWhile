package DoWhile;

import java.util.Scanner;

public class ex_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String palavra = sc.next();
        int i = palavra.length() -1;
        do {
            System.out.println(palavra.charAt(i));
            i--;

        }while(i > 0);
        sc.close();

    }
}
