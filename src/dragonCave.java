import java.util.Scanner;
public class dragonCave {
    public static void main(String[] args) {
        String welcome =    "You are in a land full of dragons. \n"+
                            "In front of you, you see two caves.\n"+
                            "In one cave, the dragon is friendly and will share his treasure with you.\n"+
                            "The other dragon is greedy and will eat you on sight\n"+
                            "Which cave will you go into? (1 or 2)";

        String badCave =   "You approach the cave..\n"+
                            "It is dark and full of terrors...\n"+
                            "A large dragon jumps out in front of you! He opens his jaws and...\n"+
                            "Gobbles you down in one bite!";

        String goodCave =   "You approach the cave..\n"+
                            "It is dark and full of terrors...\n"+
                            "A large dragon jumps out in front of you! He opens his jaws and...\n"+
                            "Has atrocious breath, but is actually a very nice guy.\n"+
                            "Dave the dragon gives you half of his treasures and sends you on your way!\n" +
                            "Congratulations!";
        Boolean flag = false;
        Scanner sc = new Scanner(System.in);
        System.out.println(welcome);
        do {
            String input = sc.nextLine();
            try {
                int userChoice = Integer.parseInt(input);
                if (userChoice == 1) {
                    System.out.println(badCave);
                    flag = true;
                } else if (userChoice == 2) {
                    System.out.println(goodCave);
                    flag = true;
                } else {
                    System.out.println("Invalid choice!");
                }
            } catch (Exception e) {
                System.out.print("Invalid choice!");
            }
        }while(flag == false);
    }
}
