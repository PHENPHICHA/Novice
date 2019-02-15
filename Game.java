import java.util.Scanner;

public class Game{

    public static void main(String[] args){
        Boolean fight;
        Scanner input = new Scanner(System.in);
        Novice novice = new Novice("100");
       

        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Welcome to Game!!" + " " + name);
         
       fight = true;
        

        while (fight)
            System.out.println();
            System.out.println("Menu");
            System.out.println("1: Show Info");
            System.out.println("2: Add Items");
            System.out.println("3: Show My Items");
            System.out.println("0: Exit");
            System.out.print("Enter the number: ");
        }   
    }
