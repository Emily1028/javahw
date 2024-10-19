import java.util.Random;

/***
 * <p>PlayGenerator.</p>
 */
public class PlayGenerator {
  /***
   * <p>隨機生成遊戲手勢並回傳.</p>
   */
  public Gesture generateGestureByRandom() {
    Random random = new Random();
    Gesture[] gestures = Gesture.values();
    int game = random.nextInt(gestures.length);
    return gestures[game];
  }
}
