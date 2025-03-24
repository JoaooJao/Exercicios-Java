package ringue;

import java.util.Random;

public class Luta {
//Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
//Getters And Setter
    public void setDesafiado( Lutador desafiado){
        this.desafiado = desafiado;
    }
    public Lutador getDesafiado(){
        return desafiado;
    }
    public void setDesafiante(Lutador desafiante){
        this.desafiante = desafiante;
    }
    public Lutador getDesafiante(){
        return desafiante;
    }
    
    public void setRounds(int rounds){
        this.rounds = rounds;
    }
    public int getRounds(){
        return rounds;
    }
    
    public void setAprovada(boolean aprovada){
        this.aprovada = aprovada;
    }
    public boolean getAprovada(){
        return aprovada;
    }
//Métodos
    public void marcarLuta(Lutador l1, Lutador l2){ //Verifica a categoria e se são pessoas diferentes.
        if(l1.getCategory().equals(l2.getCategory())){
             if(l1!=l2){
                System.out.println("Luta Aprovada");
                this.aprovada = true;
                this.desafiante = l1;
                this.desafiado = l2;
             }else{
                 System.out.println("Impossivel Se Auto-Desafiar");
                 this.aprovada = false;
             }
        }else{
            System.out.println("Categorias Diferentes");
            System.out.println("Impossivel Marcar a Luta");
            this.aprovada = false;
        }
    }
    
    public void lutar(){
        if(this.aprovada){
            System.out.println("Desafiado:");
            this.desafiado.apresentation();
            System.out.println("Desafiante:");
            this.desafiante.apresentation();
            
            Random aleatorio = new Random();
            int vencedor  =aleatorio.nextInt(3);
            switch(vencedor){
                case 0 :
                    System.out.println("Empate");
                    desafiado.drawfight();
                    desafiante.drawfight();
                    break;
                case 1:
                    System.out.println("Ganhador é o desafiado: " + this.desafiado.getName());
                    desafiado.winfight();
                    desafiante.losefight();
                    break;
                case 2:
                    System.out.println("Ganhador é o desafiante: " + this.desafiante.getName());
                    desafiante.winfight();
                    desafiado.losefight();
                    break;
            }
        }else{
            System.out.println("A luta não pode ocorrer");
        }
    }
    
}
