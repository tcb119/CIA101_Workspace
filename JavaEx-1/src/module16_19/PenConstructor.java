package module16_19;

public class PenConstructor {
	private String brand;
	private double price;
	
//	public PenConstructor(String brandXXX, double priceXXX) {
//		brand = brandXXX;
//		price = priceXXX;
//	}
	public PenConstructor(String brand, double price) {
		this.brand = brand;        // 不會報錯，只是這樣的結果
		this.price = price;        // 是指定給自己。等於還是預設參數
	}
	
	public static void main(String[] args) {
		PenConstructor pc = new PenConstructor("SKB", 10);
		System.out.println(pc.brand);
		System.out.println(pc.price);
	}
	
}
