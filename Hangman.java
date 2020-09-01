import java.util.Scanner;

public class Hangman { 
  
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {

    String userIn = "";
    String[] userChoice;
    System.out.println("Welcome to Hangman!");
    System.out.println("You are given 6 tries before the player is hanged and you loose.");
    System.out.println("Choose a topic(number) from the following: ");
    System.out.println("1. Programming Languages: 'p' ");
    System.out.println("2. Movies: 'm' ");
    System.out.println("3. Fruits: 'f' ");
    System.out.println("4. Animals: 'a' ");
    System.out.println("5. Countries: 'c' ");
    System.out.println(
        "Choose a random number from 1 - 10 in order to guess a word from that " + "category.");
    System.out.println("Input your choice with a space like p 1 or m 5 ");

    userIn = sc.nextLine();
    userChoice = userIn.split(" ");

    switch (userChoice[0]) {
      case "p":
        programLang(Integer.valueOf(userChoice[1]));
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
        programLang(Integer.valueOf(userChoice[1]));
        break;

    }
  }

  private static void programLang(int choice) {
    String progLang = "";
    String userLet = "";
    int step = 0;
    String currStr = "";
    System.out.println("Your category is programming languages.");
    switch (choice) {
      case 1:
        progLang = "javascript";
        break;
      case 2:
        progLang = "python";
        break;
      case 3:
        progLang = "sql";
        break;
      case 4:
        progLang = "matlab";
        break;
      case 5:
        progLang = "java";
        break;
      case 6:
        progLang = "swift";
        break;
      case 7:
        progLang = "c";
        break;
      case 8:
        progLang = "php";
        break;
      case 9:
        progLang = "ruby";
        break;
      case 10:
        progLang = "haskell";
        break;
      default:
        progLang = "javascript";
        break;

    }
    while (step <= 6) {
      draw(step, progLang);
      if (step >= 6) {
        break;
      }

      currStr = printWord(progLang, userLet, currStr);
      System.out.println(currStr);
      if (!currStr.contains("_")) {
        System.out.println("Congratulations! You have won!");
        break;
      }
      System.out.println("Enter a letter to make a guess. ");
      userLet = sc.next();

      if (!(valid(progLang, userLet, currStr))) {
        step++;
      }

    }

  }

  private static void movies(int choice) {
    String movies = "";
    String userLet = "";
    int step = 0;
    String currStr = "";
    System.out.println("Your category is movies.");
    System.out.println("There are no spaces between different words");
    switch (choice) {
      case 1:
        movies = "thedarkknight";
        break;
      case 2:
        movies = "heat";
        break;
      case 3:
        movies = "megamind";
        break;
      case 4:
        movies = "interstellar";
        break;
      case 5:
        movies = "inception";
        break;
      case 6:
        movies = "spectre";
        break;
      case 7:
        movies = "kungfupanda";
        break;
      case 8:
        movies = "parasite";
        break;
      case 9:
        movies = "findingnemo";
        break;
      case 10:
        movies = "joker";
        break;
      default:
        movies = "avengers";
        break;

    }
    while (step <= 6) {
      draw(step, movies);
      if (step >= 6) {
        break;
      }

      currStr = printWord(movies, userLet, currStr);
      System.out.println(currStr);
      if (!currStr.contains("_")) {
        System.out.println("Congratulations! You have won!");
        break;
      }
      System.out.println("Enter a letter to make a guess. ");
      userLet = sc.next();

      if (!(valid(movies, userLet, currStr))) {
        step++;
      }


    }

  }

  private static void fruits(int choice) {
    String fruit = "";
    String userLet = "";
    int step = 0;
    String currStr = "";
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
    while (step <= 6) {
      draw(step, fruit);
      if (step >= 6) {
        break;
      }

      currStr = printWord(fruit, userLet, currStr);
      System.out.println(currStr);
      if (!currStr.contains("_")) {
        System.out.println("Congratulations! You have won!");
        break;
      }
      System.out.println("Enter a letter to make a guess. ");
      userLet = sc.next();

      if (!(valid(fruit, userLet, currStr))) {
        step++;
      }

    }

  }

  private static void animals(int choice) {
    String animal = "";
    String userLet = "";
    int step = 0;
    String currStr = "";
    System.out.println("Your category is animals.");
    switch (choice) {
      case 1:
        animal = "badger";
        break;
      case 2:
        animal = "racoon";
        break;
      case 3:
        animal = "lion";
        break;
      case 4:
        animal = "giraffe";
        break;
      case 5:
        animal = "rhinoceros";
        break;
      case 6:
        animal = "zebra";
        break;
      case 7:
        animal = "dogs";
        break;
      case 8:
        animal = "coyote";
        break;
      case 9:
        animal = "bat";
        break;
      case 10:
        animal = "elephant";
        break;
      default:
        animal = "giraffe";
        break;

    }
    while (step <= 6) {
      draw(step, animal);
      if (step >= 6) {
        break;
      }

      currStr = printWord(animal, userLet, currStr);
      System.out.println(currStr);
      if (!currStr.contains("_")) {
        System.out.println("Congratulations! You have won!");
        break;
      }
      System.out.println("Enter a letter to make a guess. ");
      userLet = sc.next();

      if (!(valid(animal, userLet, currStr))) {
        step++;
      }

    }

  }

  private static void countries(int choice) {
    String countries = "";
    String userLet = "";
    int step = 0;
    String currStr = "";
    System.out.println("Your category is countries.");
    System.out.println("There are no spaces between different words");
    switch (choice) {
      case 1:
        countries = "japan";
        break;
      case 2:
        countries = "denmark";
        break;
      case 3:
        countries = "southkorea";
        break;
      case 4:
        countries = "vietnam";
        break;
      case 5:
        countries = "india";
        break;
      case 6:
        countries = "philippines";
        break;
      case 7:
        countries = "unitedstates";
        break;
      case 8:
        countries = "qatar";
        break;
      case 9:
        countries = "sweden";
        break;
      case 10:
        countries = "norway";
        break;
      default:
        countries = "france";
        break;

    }
    while (step <= 6) {
      draw(step, countries);
      if (step >= 6) {
        break;
      }

      currStr = printWord(countries, userLet, currStr);
      System.out.println(currStr);
      if (!currStr.contains("_")) {
        System.out.println("Congratulations! You have won!");
        break;
      }
      System.out.println("Enter a letter to make a guess. ");
      userLet = sc.next();

      if (!(valid(countries, userLet, currStr))) {
        step++;
      }

    }


  }
  
  private static String printWord(String word, String userLet, String currStr) {
    String retStr = currStr;
    int idx = 0;

    if (userLet.equals("")) { // first iteration of while loop
      for (int i = 0; i < word.length(); i++) {
        if ((word.charAt(i)) == (' ')) {
          retStr += "";

        } else {
          retStr += "_ ";
        }
      }
      System.out.println();
      return retStr;
    }

    if (word.contains(userLet)) {
      for (int i = 0; i < word.length(); i++) { // for duplicate letters
        if ((Character.toString(word.charAt(i))).equals(userLet) && (!word.contains(" "))) {
          idx = i;
          retStr = retStr.substring(0, 2 * idx) + userLet
              + retStr.substring(2 * idx + 1); /*
                                                * appends the string with appropriate correct letter
                                                */
          System.out.println();
        }
      }
    } else {
    }
    return retStr;

  }


  
  private static boolean valid(String word, String userLet, String currStr) {
    if (word.contains(userLet)) { // player guessed correct letter
      printWord(word, userLet, currStr);
      return true;
    } else {
      return false;
    }

  }
  
  private static void draw(int step, String word) {
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
        System.out.println("The answer was " + word);
        break;

      default:
        break;
    }
  }
}
