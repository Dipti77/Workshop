Write a java program to create class called "shirt" with instance variables size, color, price. Include a method to calculate the discount on the shirt based on its size and a method to print the shirt size, color and discounted price

public class Shirt{

	String color;
	int size;
	float price;
	float dis1;
	float dis2;
	float dis3;


public void calculateDis(float dis1, float dis2, float dis3){

	if (size == L){
		res = price*dis1/100;
	}
	if(size == XL){
		res = price*dis2/100;
	}
	if(size == XXL){
		res = price*dis3/100;
	}

	System.out.println("price after discount: " + res)
}
public void input(){
	Scanner sc = new Scanner(System.in);
//	Scanner sc = new Scanner(System.in);
	System.out.println("Enter shirt size:");
	System.out.println("1. L");
	System.out.println("2. XL");
	System.out.println("3. XXL");
	size = sc.nextInt();

	System.out.println("Enter shirt color: ");
	color= sc.next();
	
	System.out.println("Enter price of shirt: ");
	price = sc.nextFloat();
}

	public static void main(String[] args){
		Shirt shirt = new Shirt();
		shirt.calculateDis(3, 5, 8);
		shirt.input();

}
}