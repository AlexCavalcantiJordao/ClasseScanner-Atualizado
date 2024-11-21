package classescanner;

import java.util.Scanner;

public class ClasseScanner {

    public static void main(String[] args) {
 
        Scanner texto = new Scanner(System.in);
        String str;
        System.out.print("Entre com o seu nome: ");
        str = texto.nextLine();
        System.out.println();
        System.out.println("Bem-Vindo " + str);
        System.out.println();
        
        System.out.print("Digite um número.");
        int numero = texto.nextInt();
        System.out.println("O número digitado foi: " + numero);
        
        texto.close();
    }   
}