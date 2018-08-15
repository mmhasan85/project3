package Constructor;

public class Car {
	int carPrice = 5000;
	int carYear = 2012;
	String carColor = "Black";
	String carDoor ="Four Door";
	
	public Car() {}
	
	public Car(int carPrice) {
		this.carPrice= carPrice;
		System.out.println("price");
	}
	
	public Car(int carPrice, int carYear) {
		this.carPrice=carPrice;
		this.carYear=carYear;
		System.out.println(carPrice+" "+carYear);
	}
    public Car(int carYear,String carColor,String carDoor) {
    	this.carYear=carYear;
    	this.carColor=carColor;
    	this.carDoor=carDoor;
    	System.out.println(carPrice+" "+carYear+" "+carDoor);
    }
    public void displayCarPrice(){
    	System.out.println("My car price is:" +carPrice);
    }
    public void displayCarYear() {
    	System.out.println("My car year is:" + carYear);
    }
    public void displayCarcolor() {
    	System.out.println("My car color is:" +carColor);
    }
    public void displayCarDoor() {
    	System.out.println("How many door my car has:" +carDoor);
    }
}
