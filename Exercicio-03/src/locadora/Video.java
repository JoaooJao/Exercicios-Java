package locadora;
public class Video implements IAcoesVideo {
    private String titulo;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    public Video(String titulo) {
        this.titulo = titulo;
        this.views =0;
        this.curtidas= 0;
        this.reproduzindo = false;
        
        
    }
    
    
    
    //Getter And Setters
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getTitulo(){
        return titulo;
    }
    

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidaas() {
        return curtidas;
    }

    public void setCurtidaas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean getReproduzinho() {
        return reproduzindo;
    }

    public void setReproduzinho(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
    
    
    //End of Getters And Setters
    @Override
    public void play() {
        if(this.reproduzindo){
            System.out.println("Filme está sendo reproduzido");
        }else{
            this.reproduzindo = true;
            System.out.println("Voltando a reproduzir o filme");
        }
    }

    @Override
    public void pause() {
        if(this.reproduzindo){
            System.out.println("Pausando o Filme...");
            this.reproduzindo = false;
        }
    }

    @Override
    public void like() {
        System.out.println("❤ ->Curtido");
        this.curtidas ++;
    }
    
}
