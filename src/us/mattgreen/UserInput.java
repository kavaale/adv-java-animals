package us.mattgreen;

import java.util.Scanner;

public class UserInput {

    public static Pet UserMenu() {
        Scanner read = new Scanner(System.in);
        System.out.println("What kind of animal? (lower case)");
        String animal = read.nextLine();
        if (animal == "cat") {
            System.out.println("What is it's name?");
            String name = read.nextLine();
            System.out.println("How many mice has it killed?");
            int mice = read.nextInt();
            Cat pet = new Cat(mice, name);
            return pet;
        }
        else if (animal == "dog"){
            System.out.println("What is it's name?");
            String name = read.nextLine();
            System.out.println("Is it friendly? (true or false)");
            boolean friend = read.nextBoolean();
            Dog pet = new Dog(friend, name);
            return pet;
        }
        else{
            return null;
        }
    }
}
