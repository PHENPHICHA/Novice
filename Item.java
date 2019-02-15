public class Item {
    private String name;
    private int hp;
    private String water;
    private String drug;
    private String apple;
    
    public Item(String name) {
        this.name = name;
        if (this.name.equals("water")) {
            hp = 10;
        } else if (this.name.equals("drug")) {
            hp = 50;
        } else if (this.name.equals("apple")) {
            hp = 20;
        }
    }
}