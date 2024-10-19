import java.util.Random;

/***
 * <p>build.</p>
 */
public class lotteryGenerator {
  private int totalNumbers;
  private int lotteryNumbers;

  public int getTotalNumbers() {
    return totalNumbers;
  }

  public void setTotalNumbers(int totalNumbers) {
    this.totalNumbers = totalNumbers;
  }

  public int getLotteryNumbers() {
    return lotteryNumbers;
  }

  public void setLotteryNumbers(int lotteryNumbers) {
    this.lotteryNumbers = lotteryNumbers;
  }

  public static final int maxTotalNumber = 99;

  public lotteryGenerator() {
  }

  public lotteryGenerator(int totalNumbers, int lotteryNumbers) {
    this.totalNumbers = totalNumbers;
    this.lotteryNumbers = lotteryNumbers;
  }

  /***
   * <p>隨機產生樂透號碼.</p>
   */
  public int[] generateLotteryNumbers() {
    if (totalNumbers < lotteryNumbers) {
      throw new IllegalArgumentException("Total numbers cannot be less than lottery numbers.");
    }
    if (totalNumbers > maxTotalNumber) {
      throw new IllegalArgumentException("Total numbers cannot exceed the maximum total number.");
    }

    int[] lotteryArray = new int[lotteryNumbers];
    Random random = new Random();

    for (int i = 0; i < lotteryNumbers; i++) {
      int number;
      do {
        number = random.nextInt(totalNumbers) + 1;
      } while (containsNumber(lotteryArray, number));

      lotteryArray[i] = number;
    }

    return lotteryArray;
  }

  private boolean containsNumber(int[] array, int number) {
    for (int value : array) {
      if (value == number) {
        return true;
      }
    }
    return false;
  }

  /***
   * <p>計算產生樂透號碼的平均值.</p>
   */
  public static double average(int[] numbers) {
    int sum = 0;
    for (int number : numbers) {
      sum += number;
    }
    return (double) sum / numbers.length;
  }
}

