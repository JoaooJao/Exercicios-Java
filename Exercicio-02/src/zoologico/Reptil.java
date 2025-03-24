package zoologico;
public class Reptil extends Animal {
    private String corEscama;
    
    public void setCorEscama(String corEscama){
        this.corEscama = corEscama;
    }
    public String getCorEscama(){
        return corEscama;
    }
    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }

    @Override
    public void alimentar() {
        System.out.println("Alimentando com insetos");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de reptil");
    }
}
