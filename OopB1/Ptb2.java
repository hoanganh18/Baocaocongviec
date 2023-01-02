package OopB1;

import java.util.Scanner;

public class Ptb2 {
	private double a;
	private double b;
	private double c;
	
	public Ptb2() {
		
	}
	public Ptb2(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public double getC() {
		return c;
	}
	public void setC(double c) {
		this.c = c;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Ptb2 ptb2 = new Ptb2();
		System.out.println("Nhap a: " );
		ptb2.setA(sc.nextDouble());
		
		System.out.println("Nhap b: ");
		ptb2.setB(sc.nextDouble());
		System.out.println("Nhap c: ");
		ptb2.setC(sc.nextDouble());
		
		if(ptb2.delta()<0) {
			System.out.println("Phuong trinh vo nghiem ");
		}
		if(ptb2.delta()>0) {
			System.out.println("Phuong trinh co 2 nghiem la " + "\n" + "x1= " + ptb2.nghiemX1() +"\n"+ "x2= " + ptb2.nghiemX2());
		}
		if(ptb2.delta()==0) {
			System.out.println("Phuong trinh co nghiem x1=x2= " + ptb2.nghiemKep());
		}
	}
	
	public double delta() {
		return (b*b)- (4*a*c);
	}
	public double nghiemX1() {
		return (-b + Math.sqrt(delta()))/(2*a);
	}
	public double nghiemX2() {
		return (-b - Math.sqrt(delta()))/(2*a);
	}
	public double nghiemKep() {
		return (-c/b);
	}


}
