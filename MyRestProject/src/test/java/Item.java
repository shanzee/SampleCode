import java.math.BigDecimal;

public class Item {

    private String name;
    private int qty;
    private BigDecimal price;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the qty
	 */
	public int getQty() {
		return qty;
	}
	/**
	 * @return the price
	 */
	public BigDecimal getPrice() {
		return price;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @param qty the qty to set
	 */
	public void setQty(int qty) {
		this.qty = qty;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	/**
	 * @param name
	 * @param qty
	 * @param price
	 */
	public Item(String name, int qty, BigDecimal price) {
		this.name = name;
		this.qty = qty;
		this.price = price;
	}

    //constructors, getter/setters 
}