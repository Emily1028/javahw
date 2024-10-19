import java.util.Random;
import java.util.Scanner;

/***
 * <p>實作.</p>
 */
public class Main {
  /***
   * <p>隨機生成 GeneralGame 或 AdvancedGame 遊戲物件.</p>
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    boolean playAgain = true;

    while (playAgain) {
      playGame();
      System.out.println("game over, start a new game?");
      String userInput = scanner.nextLine().toUpperCase();
      playAgain = userInput.equals("YES");
    }
  }

  private static void playGame() {
    Random random = new Random();
    GeneralGame generalGame = new GeneralGame();
    AdvancedGame advancedGame = new AdvancedGame();
    Scanner scanner = new Scanner(System.in);

    GeneralGame game;
    if (random.nextBoolean()) {
      game = generalGame;
      System.out.println("Please enter 3 gestures.");
    } else {
      game = advancedGame;
      System.out.println("Please enter 5 gestures.");
    }

    Gesture[] userGestures = getUserGestures(scanner, game instanceof AdvancedGame ? 5 : 3);
    String result = game.play(userGestures);
    System.out.println(result);
  }

  private static Gesture[] getUserGestures(Scanner scanner, int numGestures) {
    Gesture[] userGestures = new Gesture[numGestures];
    Gesture[] gestures = Gesture.values();

    for (int i = 0; i < numGestures; i++) {
      String userInput = scanner.nextLine().toUpperCase();

      Gesture gesture = getValidGesture(userInput, gestures);
      while (gesture == null) {
        System.out.println("Wrong input, please re-enter gesture");
        userInput = scanner.nextLine().toUpperCase();
        gesture = getValidGesture(userInput, gestures);
      }

      userGestures[i] = gesture;
    }

    return userGestures;
  }

  private static Gesture getValidGesture(String userInput, Gesture[] gestures) {
    for (Gesture gesture : gestures) {
      if (gesture.toString().equalsIgnoreCase(userInput)) {
        return gesture;
      }
    }
    return null;
  }
}
