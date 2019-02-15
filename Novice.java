public class Novice {
    private int level;
    private int exp;
    private int hp;
    private Bag bag;
    

    public Novice(String value) {
        this.bag = new Bag();
        this.level = 1;
        this.exp = 0;
        this.hp = 0;
        this.name = "namwan";
    }
   
    public void showInfo() {

        Novice novice = new Novice("100");
        System.out.println();
        System.out.println("Level = " + this.level);
        System.out.println("Exp = " + this.exp);
        System.out.println("HP = " + this.hp);
    }
    public void addItem(String itemName) {
        this.bag.addItem(itemName);
    }
}