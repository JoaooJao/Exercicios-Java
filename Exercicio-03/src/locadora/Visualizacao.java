package locadora;
public class Visualizacao {
    private Cliente espectador;
    private Video filme;
    //Constructor

    public Visualizacao(Cliente espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotalAssistido(this.espectador.getTotalAssistido()+1);
        this.filme.setViews(this.filme.getViews()+1);
    }
    
    
    //Gettter and Setters
    public Cliente getEspectador() {
        return espectador;
    }

    public void setEspectador(Cliente espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }
    public void setFilme(Video filme) {
        this.filme = filme;
    }
    //End Getters and Setters

    @Override
    public String toString() {
        return "Visualizacao{" + "espectador=" + espectador + ", filme=" + filme + '}';
    }

    
    
}
