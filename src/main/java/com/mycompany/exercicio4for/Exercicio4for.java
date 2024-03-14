package com.mycompany.exercicio4for;
import java.util.Scanner;
public class Exercicio4for {
public static void main(String[] args) {
// i=2 ele já começa no 2
// i+=2 ele pula de dois em dois 2.4.6.8.10
// caso eu coloque i++ ele vai aparecer 1.2.3.4.5
// i <=n - enquanto i for menor ou igual a n, o loop vai continuar.



Scanner teclado = new Scanner(System.in);

int n = 10;
int soma = 0;

n=teclado.nextInt();
soma=teclado.nextInt();


for (int i=2; i<=n; i+=2){
    soma +=i;
    System.out.println(i);
    
}
    System.out.println("A soma dos números pares até " + n + " é " + soma);
















        }
        }
        

