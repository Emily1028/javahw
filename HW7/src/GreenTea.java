/***
 * <p>繼承DrinkOrder.</p>
 */
public class GreenTea extends DrinkOrder {
  public GreenTea(String customer, double price) {
    super(customer, price);
  }

  private int bottle;

  public int getBottle() {
    return bottle;
  }

  public void setBottle(int bottle) {
    this.bottle = bottle;
  }

  public double calcPrice() {
    return getPrice() * bottle;
  }

  @Override
  public String getInfo() {
    return super.getInfo();
  }

  public GreenTea(String customer, double price, int bottle) {
    super(customer, price);
    this.bottle = bottle;
  }
}
