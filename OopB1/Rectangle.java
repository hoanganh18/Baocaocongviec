package OopB1;

import java.util.Scanner;

public class Rectangle {

	private static Double weight;
	private static Double height;
	
	public Rectangle() {
		
	}

	
	public  Double getWeight() {
		return weight;
	}

	public  void setWeight(Double weight) {
		Rectangle.weight = weight;
	}

	public  Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		Rectangle.height = height;
	}



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rectangle re = new Rectangle();
		System.out.println("Nhap chieu rong: ");
		weight = sc.nextDouble();
		System.out.println("Nhap chieu cao: ");
		height = sc.nextDouble();
		System.out.println("Dien tich la: "+ re.dienTich());
		System.out.println("Chu vi la: " + re.chuVi());
	}
	
	public  double dienTich() {
		return weight*height;
	}
	public double chuVi() {
		return (weight+height)/2;
	}
}
