package ringue;
public class Lutador implements IRingue{
    private String name;
    private String nationality;
    private int age;
    private float height;
    private float weight;
    private String category;
    private int wins;
    private int loses;
    private int draw;
    
    
    // Special Methods
    public Lutador(String na,String nat, int ag, float he, float we, int wi, int los, int drw ){
        this.name = na;
        this.nationality = nat;
        this.age = ag;
        this.setHeight(he);
        this.weight = we;
        this.wins = wi;
        this.loses = los;
        this.draw = drw;
    }
    // Public Methods
// Getters and seters    
    public String getName() {
        return name;
    }

    public void setName(String na) {
        this.name = na;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
        setCategory();
    }

    public float getWeight() {
        return weight;
    }

// Atributos
    public void setWeight(float weight) {    
        this.weight = weight;
    }

    public String getCategory() {
        return category;
    }

    private void setCategory() {
        if (this.height < 52.2){
            this.category = "Invalid";
        }else if(this.height <= 70.3){
            this.category = "Low";
        }else if (this.height >=83.9){
            this.category = "Medium";
        }else if (this.height <=120.2){
            this.category = "Heavy";
        }else{
            this.category = "Invalid";
        }
    }
    
    

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLoses() {
        return loses;
    }

    public void setLoses(int loses) {
        this.loses = loses;
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    @Override
    public void apresentation(){
        System.out.println("----------------------------------------");
        System.out.println("Fighter: " + this.getName());
        System.out.println("Nationality: " + this.getNationality());
        System.out.println("Age: " + this.getAge());
        System.out.println("Height: " + this.getHeight());
        System.out.println("Weight: " + this.getWeight());
        System.out.println("Wins: " + this.getWins());
        System.out.println("Loses: "+this.getLoses());
        System.out.println("Draw: "+ this.getDraw());
        System.out.println("----------------------------------------");
    }

    @Override
    public void status() {
    }

    @Override
    public void winfight() {
        this.setWins(this.getWins() + 1);
    }

    @Override
    public void losefight() {
        this.setLoses(this.getLoses() + 1);
    }

    @Override
    public void drawfight() {
    }
    
    
}
