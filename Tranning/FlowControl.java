package Tranning;

public class FlowControl {

	public static void main(String[] args) {
		int a=1,sum=0;
		
		do {
			sum += a;
			++a;
		}while(a<10);
		System.out.println("Tong la: "+ sum);
	}
}
