import java.util.Scanner;

/***
 * <p>work.</p>
 */
public class App {
  /***
   * <p>work.</p>
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("可以抽出的號碼:");
    int total;
    total = scanner.nextInt();
    System.out.println("可以抽出的號碼個數:");
    int lottery;
    lottery = scanner.nextInt();
    lotteryGenerator generator = new lotteryGenerator();
    while (total < lottery || total > lotteryGenerator.maxTotalNumber) {
      System.out.println("超過可以抽出的號碼範圍。");
      System.out.println("可以抽出的號碼:");
      total = scanner.nextInt();
      System.out.println("可以抽出的號碼個數:");
      lottery = scanner.nextInt();
    }
    generator.setTotalNumbers(total);
    generator.setLotteryNumbers(lottery);

    int[] numbers = generator.generateLotteryNumbers();

    System.out.println("產生的樂透號碼:");
    for (int num : numbers) {
      System.out.print(num + " ");
    }
    System.out.println();
    double average = lotteryGenerator.average(numbers);
    System.out.printf("樂透號碼的平均值: %.2f%n", average);
  }
}

