import java.util.Scanner;

public class Hangman { 
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String userIn = "" ;
    String[] userChoice;
    System.out.println("Welcome to Hangman!");
    System.out.println("You are given 6 tries before the player is hanged and you loose.");
    System.out.println("Choose a topic(number) from the following: ");
    System.out.println("1. Words: 'w' ");
    System.out.println("2. Movies: 'm' ");
    System.out.println("3. Fruits: 'f' ");
    System.out.println("4. Animals: 'a' ");
    System.out.println("5. Countries: 'c' ");
    System.out.println("Choose a random number from 1 - 10 in order to guess a word from that "
        + "category.");
    System.out.println("Input your choice with a space like w 1 or m 5 ");
    
    userIn = sc.nextLine();
    userChoice = userIn.split(" ");
    
    switch (userChoice[0]) {
      case "w":
        words(Integer.valueOf(userChoice[1]));
        break;
      case "m":
        movies(Integer.valueOf(userChoice[1]));
        break;
      case "f":
        fruits(Integer.valueOf(userChoice[1]));
        break;
      case "a":
        animals(Integer.valueOf(userChoice[1]));
        break;
      case "c":
        countries(Integer.valueOf(userChoice[1]));
        break;
      default:
        words(Integer.valueOf(userChoice[1]));
        break;

    }

    

  } 

  private static void words(int choice) {
    System.out.println("w");
  }

  private static void movies(int choice) {
    System.out.println("m");
    
  }

  private static void fruits(int choice) {
    String fruit = "";
    int step = 0;
    boolean bool = true;
    System.out.println("Your category is fruit.");
    switch (choice) {
      case 1:
        fruit = "pineapple";
        break;
      case 2:
        fruit = "apple";
        break;
      case 3:
        fruit = "strawberry";
        break;
      case 4:
        fruit = "grape";
        break;
      case 5:
        fruit = "orange";
        break;
      case 6:
        fruit = "watermelon";
        break;
      case 7:
        fruit = "pear";
        break;
      case 8:
        fruit = "raspberry";
        break;
      case 9:
        fruit = "pomegranate";
        break;
      case 10:
        fruit = "kiwi";
        break;
      default:
        fruit = "banana";
        break;
     
    }
    while(bool) {
      step = draw(0);
      printWord(fruit);
      bool = false;
    }

  }

  private static void animals(int choice) {
    System.out.println("a");

  }

  private static void countries(int choice) {
    System.out.println("c");

  }
  
  private static int draw(int step) {
    System.out.println("The hangman is: ");
    System.out.println();

    switch (step) {
      case 0:
        System.out.println("    _____");
        System.out.println("   |     |");
        System.out.println("   |   ");
        System.out.println("   |   ");
        System.out.println("   |   ");
        System.out.println("___|___");

        break;

      case 1:
        System.out.println("    _____");
        System.out.println("   |     |");
        System.out.println("   |     O");
        System.out.println("   |      ");
        System.out.println("   |      ");
        System.out.println("___|___   ");
        break;

      case 2:
        System.out.println("    _____");
        System.out.println("   |     |");
        System.out.println("   |     O");
        System.out.println("   |     | ");
        System.out.println("   |       ");
        System.out.println("___|___    ");
        break;

      case 3:
        System.out.println("    _____");
        System.out.println("   |     |");
        System.out.println("   |     O");
        System.out.println("   |     | ");
        System.out.println("   |    / ");
        System.out.println("___|___    ");
        break;
      case 4:
        System.out.println("    _____");
        System.out.println("   |     |");
        System.out.println("   |     O");
        System.out.println("   |     | ");
        System.out.println("   |    / \\");
        System.out.println("___|___    ");
        break;
      case 5:
        System.out.println("    _____");
        System.out.println("   |     |");
        System.out.println("   |    _O ");
        System.out.println("   |     | ");
        System.out.println("   |    / \\");
        System.out.println("___|___    ");
        break;
      case 6:
        System.out.println("    _____");
        System.out.println("   |     |");
        System.out.println("   |    _O_");
        System.out.println("   |     |");
        System.out.println("   |    / \\");
        System.out.println("___|___");
        System.out.println();
        System.out.println("The player is hanged! You loose.");
        break;

      default:
        break;
    }
    
    return step++;
 
  }
  private static void printWord(String word) {
    
    
  }

}
