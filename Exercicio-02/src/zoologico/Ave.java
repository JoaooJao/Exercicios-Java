package zoologico;
public class Ave extends Animal {
    private String corPena;
    
    public void setCorPena(String corPena){
        this.corPena = corPena;
    }
    public String getCorPena(){
        return corPena;
    }
    @Override
    public void locomover() {
        System.out.println("Voando...");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Sementes...");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de ave");
    }
    
    public void construirNinho(){
        System.out.println("Construindo o ninho...");
    }
}
