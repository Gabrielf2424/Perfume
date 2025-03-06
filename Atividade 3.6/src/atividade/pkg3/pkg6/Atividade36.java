
package atividade.pkg3.pkg6;

import java.util.Scanner;



public class Atividade36 {

   
    public static void main(String[] args) {
     Scanner ler=new Scanner(System.in);  
     Aluno al=new Aluno();
        System.out.println("Nome do aluno:");
       al.setNome(ler.nextLine());
        System.out.println("Nota 1:");
        al.setNota1(ler.nextDouble());
        System.out.println("Nota 2:");
        al.setNota2(ler.nextDouble());
        al.mostrar();
        
    }
    
}
