package Tranning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student {
	public static void main(String[] args) {
	
		int[] A = {4,5,2,7,8};
		int temp = A[0];
	for(int i=0; i<A.length-1;i++) {
		for(int j=i+1; j<A.length; j++) {
			if(A[i]>A[j]) {
				temp = A[i];
				A[i]=A[j];
				A[j]=temp;
				
			}
			
		}
	}
	for(int i=0; i<5;i++) {
		System.out.println(A[i]);
	}
}
}