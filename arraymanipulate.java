package question6;

import java.util.Arrays;

public class arraymanipulate {

	public static void main(String[] args) {
		int[]num= {1,2,3,4,5};
		int []newar=insert(num,3,9);
		System.out.println(Arrays.toString(newar));

	}
static int[] insert(int[]num,int index,int value) {
	
	if(index<0||index>=num.length) {
		System.out.println("Invalid index");
		return num;
		
	}
	else {
		int[] newArray=new int[num.length+1];
		newArray[index]=value;
		for(int i=0;i<num.length;i++) {if(i<index) {newArray[i]=num[i];}
		else if(i>=index) {newArray[i+1]=num[i];}
		}
		return newArray;
	}
	
}
}
