package zoologico;
public class Mamifero extends Animal {
    protected String corPelo;
    
    public void setCorPelo(String corPelo){
        this.corPelo = corPelo;
    }
    public String getCorPelo(){
        return corPelo;
    }
    
    @Override
    public void locomover() {
        System.out.println("Caminhando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo...");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Mamifero");
    }
    
}
