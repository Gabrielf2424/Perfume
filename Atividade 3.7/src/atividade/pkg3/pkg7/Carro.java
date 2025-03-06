
package atividade.pkg3.pkg7;


public class Carro {
    private String modelo;
    private double consumoPorKm;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getConsumoPorKm() {
        return consumoPorKm;
    }

    public void setConsumoPorKm(double consumoPorKm) {
        this.consumoPorKm = consumoPorKm;
    }
    
    public double calcularConsumo(double valor){
        if(consumoPorKm==0){
            return 0;
        }
        return valor/consumoPorKm;
    }
    public void mostrar(){
        System.out.println("O modelo do carro e " +modelo);
        System.out.println("O consumo gastado na viagem foi de "+consumoPorKm);
        
    }

}