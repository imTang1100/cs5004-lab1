package stock;

import java.text.DecimalFormat;

/**
 * The type Stock.
 */
public class Stock {
  private String symbol;
  private String name;
  private double costBasis;
  private double currentPrice;

  /**
   * Instantiates a new Stock.
   *
   * @param symbol of the brand
   * @param costbasis of the brand
   */
  public Stock(String symbol, String name, double costbasis) {
    this.symbol = symbol;
    this.name = name;
    this.costBasis = costbasis;
  }

  /**
   * Sets cost basis.
   *
   * @param x the x
   */
  public void setCostBasis(double x) {
    this.costBasis = x;
  }

  /**
   * Sets currnt price.
   *
   * @param y the y
   */
  public void setCurrentPrice(double y) {
    this.currentPrice = y;
  }

  /**
   * Gets symbol.
   *
   * @return the symbol
   */
  public String getSymbol() {
    return this.symbol;
  }

  /**
   * Gets name.
   *
   * @return the name
   */
  public String getName() {
    return this.name;
  }

  /**
   * Gets cost basis.
   *
   * @return the cost basis
   */
  public double getCostBasis() {
    return this.costBasis;
  }

  /**
   * Gets current price.
   *
   * @return the current price
   */
  public double getCurrentPrice() {
    return this.currentPrice;
  }

  /**
   * Get change percent double.
   *
   * @return the double
   */
  public double getChangePercent() {
    return (this.currentPrice - this.costBasis) / this.costBasis;
  }

  @Override
  public String toString() {
    DecimalFormat money = new DecimalFormat("$ 0.00");
    DecimalFormat percent = new DecimalFormat("0.00%");
    return this.name + " Current Price: " + money.format(this.currentPrice) + "\n "
        + "Gain/Loss: " + percent.format(this.getChangePercent());
  }

}
