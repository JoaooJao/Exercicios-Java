package locadora;
public class Locadora {
    public static void main(String[] args) {
    Video v1 = new Video("Shrek");
   
    
    Cliente c[] = new Cliente[2];
    c[0] = new Cliente("Josias",15,'M',"MoviEater");
    c[1] = new Cliente("Jade",23,'F',"FairyGirl");
    c[0].assitiuFilme();
    
    Visualizacao visu[] = new Visualizacao[5];
    visu[0] = new Visualizacao(c[0], v1);
    visu[1] = new Visualizacao(c[1], v1);
    System.out.println(visu[0].toString());

    }
    
    
}
