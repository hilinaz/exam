package question4;

import java.util.Scanner;



public class Bubblealpha {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String value=sc.nextLine();
		char[] arr=value.toCharArray();
		bubbleSort(arr);
		for(char i:arr) {System.out.println(i);}
		
	}
	 public static void bubbleSort(char[] arr) {
	        int len = arr.length;
	        
	        for (int i = 0; i < len - 1; i++) {
	   
	            for (int j = 0; j < len - i - 1; j++) {
	                if (arr[j] > arr[j + 1]) {
	                    char temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                }
	            }
	        }
	    }

}
