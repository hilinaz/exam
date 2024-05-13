
package question1;
import java.util.Scanner;
public class Search {

	public static void main(String[] args) {
		
		search();
	}

	static void search() {
		Scanner sc =new Scanner(System.in);
		Search sh=new Search();
		int[]num=sh.inserted();
	
System.out.println("Enter number you want to search for");
int target=sc.nextInt();
int count=0;
for(int i=0;i<num.length;i++) {
	if(num[i]==target) {count+=1;}
}

System.out.println("The  value "+target+" occures "+count+" times");}
	
	int[] inserted ()
{
		Scanner sc =new Scanner(System.in);

System.out.println("How many elements do you want in your list");
int size=sc.nextInt();
int []num=new int[size];
System.out.println("Enter elements you want in your array");
for(int i=0;i<size;i++) {
num[i]=sc.nextInt();
}
return num;
		}
}
