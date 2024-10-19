import java.util.Random;
import java.util.Scanner;

/***
 * <p>Main.</p>
 */
public class Main {
  /***
   * <p>隨機生成 3 個物件並要求使用者輸入該物件所需資料.</p>
   */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();

    DrinkOrder[] drinkOrders = new DrinkOrder[3];


      if (rd.nextInt(2) == 0) {
        for (int i = 0; i < 3; i++) {
          System.out.println("Please enter black tea customer:");
          String customer = sc.nextLine();

          System.out.println("Please enter black tea price:");
          double price = Double.parseDouble(sc.nextLine());

          System.out.println("Please enter black tea cup:");
          double cup = Double.parseDouble(sc.nextLine());

          drinkOrders[i] = new BlackTea(customer, price, cup);
        }
        System.out.println("All customer and price:");
        for (DrinkOrder drinkOrder : drinkOrders) {
          System.out.println(drinkOrder.getInfo());
        }
        double totalDrinkPrice = 0;
        double totalBlackTeaPrice = 0;
        int totalBlackTeaCup = 0;

        for (DrinkOrder drinkOrder : drinkOrders) {
          totalDrinkPrice += drinkOrder.calcPrice();

          if (drinkOrder instanceof BlackTea) {
            BlackTea blackTea = (BlackTea) drinkOrder;
            totalBlackTeaPrice += blackTea.calcPrice();
            totalBlackTeaCup += blackTea.getCup();
          }
        }

        System.out.println("Total price of all drink: " + totalDrinkPrice);

        System.out.println("Total price and cup of all BlackTea objects:");

        System.out.println("Price: " + totalBlackTeaPrice);

        System.out.println("Cup: " + totalBlackTeaCup);
      } else {
        for (int i = 0; i < 3; i++) {
          System.out.println("Please enter green tea customer:");
          String customer = sc.nextLine();

          System.out.println("Please enter green tea price:");
          double price = Double.parseDouble(sc.nextLine());

          System.out.println("Please enter green tea bottle:");
          int bottle = Integer.parseInt(sc.nextLine());
          drinkOrders[i] = new GreenTea(customer, price, bottle);
        }
        System.out.println("All customer and price:");
        for (DrinkOrder drinkOrder : drinkOrders) {
          System.out.println(drinkOrder.getInfo());
        }
        double totalDrinkPrice = 0;
        double totalGreenTeaPrice = 0;
        int totalGreenTeaCup = 0;

        for (DrinkOrder drinkOrder : drinkOrders) {
          totalDrinkPrice += drinkOrder.calcPrice();

          if (drinkOrder instanceof GreenTea) {
            GreenTea greenTea = (GreenTea) drinkOrder;
            totalGreenTeaPrice += greenTea.calcPrice();
            totalGreenTeaCup += greenTea.getBottle();
          }
        }

        System.out.println("Total price of all drink: " + totalDrinkPrice);

        System.out.println("Total price and bottle of all GreenTea objects:");

        System.out.println("Price: " + totalGreenTeaPrice);

        System.out.println("Bottle: " + totalGreenTeaCup);
      }

  }

}

