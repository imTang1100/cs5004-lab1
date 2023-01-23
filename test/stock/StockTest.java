package stock;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * The type Stock test.
 */
public class StockTest {
  private Stock nike;
  private Stock adidas;
  private Stock sony;
  /**
   * Sets up.
   *
   * @throws Exception the exception
   */
  @org.junit.Before
  public void setUp() throws Exception {
    nike = new Stock("NK", "Nike-CO", 18.08);
    adidas = new Stock("AD","Adidas",9.06);
    sony = new Stock("SN", "Sony",21.22);
  }

  /**
   * Sets cost basis.
   */
  @org.junit.Test
  public void setCostBasis() {
    assertEquals(18.08, nike.getCostBasis(), 0.001);
    assertEquals(9.06, adidas.getCostBasis(), 0.001);
    assertEquals(21.22, sony.getCostBasis(), 0.001);
  }

  /**
   * Sets currnt price.
   */
  @org.junit.Test
  public void setCurrntPrice() {
    nike.setCurrentPrice(25.0);
    adidas.setCurrentPrice(16.66);
    sony.setCurrentPrice(14.89);
    assertEquals(25.0,nike.getCurrentPrice(),0.001);
    assertEquals(16.66,adidas.getCurrentPrice(),0.001);
    assertEquals(14.89,sony.getCurrentPrice(),0.001);
  }

  /**
   * Gets symbol.
   */
  @org.junit.Test
  public void getSymbol() {
    assertEquals("NK", this.nike.getSymbol());
    assertEquals("AD", this.adidas.getSymbol());
    assertEquals("SN", this.sony.getSymbol());
  }

  /**
   * Gets name.
   */
  @org.junit.Test
  public void getName() {
    assertEquals("Nike-CO", nike.getName());
    assertEquals("Adidas", adidas.getName());
    assertEquals("Sony", sony.getName());
  }

  /**
   * Gets cost basis.
   */
  @org.junit.Test
  public void getCostBasis() {
    assertEquals(18.08, nike.getCostBasis(),0.001);
    assertEquals(9.06, adidas.getCostBasis(),0.001);
    assertEquals(21.22, sony.getCostBasis(),0.001);
  }

  /**
   * Gets current price.
   */
  @org.junit.Test
  public void getCurrentPrice() {
    nike.setCurrentPrice(13.91);
    adidas.setCurrentPrice(6.02);
    sony.setCurrentPrice(12.43);
    assertEquals(13.91,this.nike.getCurrentPrice(), 0.001);
    assertEquals(6.02,this.adidas.getCurrentPrice(), 0.001);
    assertEquals(12.43,this.sony.getCurrentPrice(), 0.001);

  }

  /**
   * Gets change percent.
   */
  @org.junit.Test
  public void getChangePercent() {
    nike.setCurrentPrice(10.00);
    adidas.setCurrentPrice(12.50);
    sony.setCurrentPrice(12.50);
    assertEquals(-0.447,nike.getChangePercent(),0.001);
    assertEquals(0.379,adidas.getChangePercent(),0.001);
    assertEquals(-0.410,sony.getChangePercent(),0.001);
  }

  /**
   * Test to string.
   */
  @org.junit.Test
  public void testToString() {
    nike.setCurrentPrice(16.88);
    adidas.setCurrentPrice(11.05);
    sony.setCurrentPrice(4.05);
    System.out.println(sony.toString());
    assertEquals("Nike-CO Current Price: $ 16.88\nGain/Loss: -$ 6.64%",nike.toString());
    assertEquals("Adidas Current Price: $ 11.05\nGain/Loss: $ 21.96%",adidas.toString());
    assertEquals("Sony Current Price: $ 4.05\nGain/Loss: -$ 80.91%",sony.toString());
  }
}