/***
 * <p>繼承DrinkOrder.</p>
 */
public class BlackTea extends DrinkOrder {

  private double cup;

  public double getCup() {
    return cup;
  }

  public void setCup(double cup) {
    this.cup = cup;
  }

  public double calcPrice() {
    return getPrice() * cup;
  }

  @Override
  public String getInfo() {
    return super.getInfo();
  }

  public BlackTea(String customer, double price, double cup) {
    super(customer, price);
    this.cup = cup;
  }
}
