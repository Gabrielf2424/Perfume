
package atividade.pkg3.pkg6;


public class Aluno {
   private String nome;
   private double nota1;
   private double nota2;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    public void calcularNotas(int media){
        media=(int) ((nota1+nota2)/2);
        if(media>=7){
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");
        }  
        }
    public void mostrar(){
        System.out.println("O aluno " +nome+"teve a sua primeira nota foi de " +nota1+",e a sua segunda nota foi " +nota2);
    }
    }  

       
        
   
   
   

