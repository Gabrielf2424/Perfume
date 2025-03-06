
package atividade.pkg3.pkg7;

import java.util.Scanner;


public class Atividade37 {

   
    public static void main(String[] args) {
     Scanner ler=new Scanner(System.in);
     Carro car=new Carro();
        System.out.println("Modelo do carro:");
        car.setModelo(ler.nextLine());
        System.out.println("Consumo gastado:");
        car.setConsumoPorKm(ler.nextDouble());
        car.mostrar();
        System.out.println("O total gasto da viagem foi de " +car.calcularConsumo((0)));
        
    }
    
}
