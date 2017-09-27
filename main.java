public class main {
    public static void main(String[] args) { 
    	Product product = new Product("Edam", 3.3, 120, 150);
    	System.out.println("Product value is " + product.countValue());
    	System.out.println("New value is " + product.changeBalance());
        product.printProduct();
     }
}

 class Product {
	private String name;
	private double price;
	private int amount; //Amount in storage
	private int newvalue;

	public Product(String name, double price, int amount, int newvalue) {
		this.name = name;
		this.price = price;
		this.amount = amount;
        this.newvalue = newvalue;
	}
	public double countValue() {
		return(amount * price);
	}

	public double changeBalance(){
        return(newvalue * price);
    }
 
	public void printProduct() {
		System.out.printf("Product %s, price %4.1f and balance %d pcs", name,price,amount);
	}
}