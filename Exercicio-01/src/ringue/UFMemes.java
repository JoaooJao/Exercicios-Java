package ringue;
public class UFMemes {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];
        l[0] = new Lutador("Canarinho Pistola", "Brasil", 25, 1.75f, 68.9f, 11, 2, 1);
        l[1] = new Lutador("Sam the Eagle", "United States", 30, 1.80f, 90f, 5, 4, 2);
        l[2] = new Lutador("Zakumi", "África do Sul", 27, 1.72f, 70.5f, 8, 3, 1);
        l[3] = new Lutador("Footix", "França", 28, 1.78f, 75.8f, 9, 2, 0);
        l[4] = new Lutador("Goleo VI", "Alemanha", 32, 1.90f, 85.4f, 12, 1, 2);
        l[5] = new Lutador("Juanito", "México", 29, 1.76f, 733.2f, 10, 3, 3);
        
//        for(int i = 0; i<6;i++){
//            System.out.println("Lutador " + (i+1));
//            l[i].apresentation();
//            System.out.println("");
//        }
        
        Luta c1 = new Luta();
        c1.marcarLuta(l[1], l[5]);
        c1.lutar();
        l[1].apresentation();
        l[5].apresentation();


    }
}
