package encapsulation;

public class EncapsulationIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop l1 = new Laptop();
		l1.setPrice(35);
	}


}

class Laptop{
	int ram;
	private int price;
	
	public void setPrice(int price) {
		boolean isAdmin = false;
		if(!isAdmin) {
			System.out.println("You cannot set the price");
		}else {
			this.price = price;
		}

	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getPrice() {
		return price;
	}
}