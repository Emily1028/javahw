import java.util.Scanner;

/***
 * <p>成績計算.</p>
 */
public class Main {
  /***
   * <p>成績計算.</p>
   */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int score;
    double sum = 0, adj = 0;
    for (int i = 0; i < 5; i++) {
      System.out.println("請輸入成績:");
      score = sc.nextInt();
      if (score >= 0 && score <= 100) {
        switch (score / 10) {
          case 10:
          case 9:
            System.out.println("A");
            break;
          case 8:
            System.out.println("B");
            break;
          case 7:
            System.out.println("C");
            break;
          case 6:
            System.out.println("D");
            break;
          default:
            System.out.println("F");
        }
        sum += score;
        adj += (10 * Math.sqrt(score)) / 5;
      } else {
        System.out.println("輸入為無效成績，請重新輸入");
        i--;
      }
    }
    double avg;
    avg = (sum / 5);
    System.out.printf("調整前平均成績:%.2f\n", avg);

    System.out.printf("調整後平均成績:%.2f", adj);
  }
}