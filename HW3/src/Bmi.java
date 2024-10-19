import java.util.Scanner;

/***
 * <p>bmi class.</p>
 **/
public class Bmi {
  /***
   * <p>計算bmi.</p>
   **/
  public static void main(String[] args) {

    Scanner scannerObject = new Scanner(System.in);
    System.out.println("請輸入名字、年齡(以逗號區隔):");
    String info;
    info = scannerObject.next();

    System.out.println("請輸入身高(公尺):");
    float tall;
    tall = scannerObject.nextFloat();
    System.out.println("請輸入體重(公斤):");
    float weight;
    weight = scannerObject.nextFloat();

    float bmi = weight / (tall * tall);
    String[] str = info.split(",");
    System.out.printf("Name:" + str[0] + "\n" + "Age:" + str[1] + "\n" + "BMI:%.2f%n", bmi);
  }
}
