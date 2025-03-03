/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade3.pkg3;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Atividade33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       Producao pro = new Producao();
        System.out.println("O nome do produto");
        pro.setNome(ler.nextLine());
        System.out.println("Qual a quantidade");
        pro.setQuantidade(ler.nextInt());
        System.out.println("O preço e");
        pro.setPreco(ler.nextDouble());
        pro.monstrar();
        System.out.println("O valor do estoque"+pro.calcularEstoque(0)+"");
        
    }
    
}
