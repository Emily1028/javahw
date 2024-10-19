/***
 * <p>有兩個私有成員變數customer, price.</p>
 */
public abstract class DrinkOrder {
  private String customer;
  private double price;

  public String getCustomer() {
    return customer;
  }

  public void setCustomer(String customer) {
    this.customer = customer;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public DrinkOrder(String customer, double price) {
    this.customer = customer;
    this.price = price;
  }

  public abstract double calcPrice();

  public String getInfo() {
    return customer + "\t" + price;
  }
}
