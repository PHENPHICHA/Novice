import java.util.Scanner;

public class Game{

    public static void main(String[] args){
        Boolean eat;
        Boolean eater;
        Scanner input = new Scanner(System.in);
        Novice novice = new Novice("100");
       

        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Welcome to Game!!" + " " + name);
         
        eat = true;
        eater = true;
        
        while (eat){
            System.out.println();
            System.out.println("Menu");
            System.out.println("1: Show Info");
            System.out.println("2: Add Items");
            System.out.println("3: Show My Items");
            System.out.println("0: Exit");
            System.out.print("Enter the number: ");
    
            int enter = input.nextInt();

                if (enter == 1) {
                    novice.showInfo();
                }
                if (enter == 2) {
                    System.out.println("1) Add Water");
                    System.out.println("2) Add Drug");
                    System.out.println("3) Add Apple");
                    System.out.print("Enter the number: ");
                        
                        int num = input.nextInt();

                            if (num == 1) {
                                novice.addItem("water");
                            }
                            if (num == 2) {
                                novice.addItem("drug");
                            }
                            if (num == 3) {
                                novice.addItem("apple");
                            }
                            if (num == 0) {
                                eat = false;
                                System.out.println("Exit");
                            }
                }
                if (enter == 3) {
                    System.out.println("My Item : ");
                    novice.showItem();
                }
                if (enter == 0) {
                    eater = false;
                    System.out.println();
                    System.out.print("Good Bye");
                }
        }
    }
}
