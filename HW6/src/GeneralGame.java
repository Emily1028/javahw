/***
 * <p>GeneralGame.</p>
 */
public class GeneralGame extends PlayGenerator {
  /***
   * <p>隨機生成手勢與使用者相比.</p>
   */
  public String play(Gesture[] user) {
    int userWins = 0;
    int computerWins = 0;

    for (int i = 0; i < 3; i++) {
      Gesture computerGesture = generateGestureByRandom();
      Gesture userGesture = user[i];

      if (userGesture == Gesture.STONE && computerGesture == Gesture.SCISSORS
          || userGesture == Gesture.PAPER && computerGesture == Gesture.STONE
          || userGesture == Gesture.SCISSORS && computerGesture == Gesture.PAPER) {
        userWins++;
      } else {
        computerWins++;
      }
    }

    if (userWins > computerWins) {
      return "You win!";
    } else if (userWins == computerWins) {
      return "Game tie";
    } else {
      return "You lose!";
    }
  }
}


