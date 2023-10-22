package asteristico;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Asteristico as = new Asteristico();
        System.out.println("digite aqui o valor desejado");
           as.n= sc.nextInt();
       as.status(); 
       sc.close();
    }
}
