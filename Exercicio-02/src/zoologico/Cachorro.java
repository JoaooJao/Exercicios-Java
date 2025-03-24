package zoologico;
public class Cachorro extends Lobo {
    @Override
    public void emitirSom(){
        System.out.println("GRhhh! Au!Au!");
    }
    
    public void reagir(String frase){
        if(frase.equals("Toma")|| frase.equals("Cade o lindao")){
            System.out.println("Abanando e Latindo ");
        }else{
            System.out.println("Rosnar");
        }
    }
    
    public void reagir(int hora, int main){
        if(hora > 12){
            System.out.println("Abanando o Rabo");
        }else if(hora >= 18){
            System.out.println("Ignorar");
        }else{
            System.out.println("Abanando e Latindo");
        }
    }
    public void reagir(boolean dono){
        if(dono == true){
            System.out.println("Abanando e latindo");
        }else{
            System.out.println("Rosnar e Latir");
            this.emitirSom();
        }
    }
}
