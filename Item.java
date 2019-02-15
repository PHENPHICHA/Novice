public class Item {
    private String name;
    private int hp;
    private int exp;
    private String water;
    private String drug;
    private String apple;
    
    public Item(String name) {
        this.name = name;
        if (this.name.equals("water")) {
            hp = 10;
            exp = 1;
        } else if (this.name.equals("drug")) {
            hp = 50;
            exp = 5;
        } else if (this.name.equals("apple")) {
            hp = 20;
            exp = 10;
        }
    }
    public void showName() {
        System.out.println("#Item: " + this.name);
        System.out.println("Hp: " + this.hp);
        System.out.println("Exp: " + this.exp);
        
    }
}