
public class Item {
	
	public String itemID;
	public String name;
	public String color;
	public String vintage;
	public String vineyard;
	public String origin;
	public double purchasePrice;
	public double salePrice;
	public int qty;
		
	/*
	 * Constructor
	 */
	
	public Item(String itemID, String name, String color, String vintage,
			String vineyard, String origin, double purchasePrice,
			double salePrice, int qty) {
		this.itemID = itemID;
		this.name = name;
		this.color = color;
		this.vintage = vintage;
		this.vineyard = vineyard;
		this.origin = origin;
		this.purchasePrice = purchasePrice;
		this.salePrice = salePrice;
		this.qty = qty;
	}
	
	public String getItemID() {
		return itemID;
	}
	
	public void setItemID(String itemID) {
		this.itemID = itemID;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getVintage() {
		return vintage;
	}
	
	public void setVintage(String vintage) {
		this.vintage = vintage;
	}
	
	public String getVineyard() {
		return vineyard;
	}
	
	public void setVineyard(String vineyard) {
		this.vineyard = vineyard;
	}
	
	public String getOrigin() {
		return origin;
	}
	
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	
	public double getPurchasePrice() {
		return purchasePrice;
	}
	
	public void setPurchasePrice(double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}
	
	public double getSalePrice() {
		return salePrice;
	}
	
	public void setSalePrice(double salePrice) {
		this.salePrice = salePrice;
	}
	
	public int getQty() {
		return qty;
	}
	
	public void setQty(int qty) {
		this.qty = qty;
	}	
}
