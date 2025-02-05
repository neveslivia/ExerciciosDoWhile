package DoWhile;

import java.util.Scanner;

public class ex_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String palavra = sc.next();
        int i = palavra.length();
        do {
            System.out.println(palavra.charAt(i));
            i --;

        }while (i > palavra.length());



    }
}
