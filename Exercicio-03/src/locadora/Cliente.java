package locadora;
public class Cliente extends Pessoa {
    private String login;
    private int totalAssistido;

    public Cliente(String nome, int idade, char sexo,String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totalAssistido = 0;
    }

    @Override
    public String toString() {
        return "Cliente{" + super.toString() + "login=" + login + ", totalAssistido=" + totalAssistido + '}';
    }
    
    
    public void assitiuFilme(){
        this.totalAssistido ++;
    }
    
    //Getters and Setters
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotalAssistido() {
        return totalAssistido;
    }

    public void setTotalAssistido(int totalAssistido) {
        this.totalAssistido = totalAssistido;
    }
    //End of Getters and setters
    
    
}
