public class Novice {
    private int level;
    private int exp;
    private int hp;
    private Bag bag;
    private String name;
    

    public Novice(String value) {
        this.bag = new Bag();
        this.level = 1;
        this.exp = 0;
        this.hp = 0;
        this.name = "namwan";
    }
    public void upExp() {
        exp = this.exp + 1;
    }

    public void upLevel() {
        level = this.level + 1;
    }

    public void upHp() {
        hp = this.hp + 20;
    }
    public void showInfo() {

        Novice novice = new Novice("100");
        System.out.println();
        System.out.println("Name = " + this.name);
        System.out.println("Level = " + this.level);
        System.out.println("Exp = " + this.exp);
        System.out.println("HP = " + this.hp);
        
        System.out.println("----------------------------");
    }
    public void addItem(String itemName) {
        this.bag.addItem(itemName);
    }
    public void showItem() {
        this.bag.showItem();
        System.out.println();
    }
}