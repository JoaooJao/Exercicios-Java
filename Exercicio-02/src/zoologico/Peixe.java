package zoologico;
public class Peixe extends Animal {
    private String corEscama;
    
    
    public void soltarBolha(){
        System.out.println("○°°\n°°○\n°○\n°○");
    }
    
    public void setCorEscama(String corEscama){
        this.corEscama = corEscama;
    }
    public String getCorEscama(){
        return corEscama;
    }


    @Override
    public void locomover() {
        System.out.println("Nadando...");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Algas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe Não Faz Som, Glub Glub...");
    }
}