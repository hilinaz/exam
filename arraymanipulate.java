package question6;

import java.util.Arrays;

public class arraymanipulate {

	public static void main(String[] args) {
		int[]num= {1,2,3,4,5};
		int []newar=delete(num,3,9);
		System.out.println(Arrays.toString(newar));

	}
static int[] delete(int[] num, int index) {
    if (index < 0 || index >= num.length) {
        System.out.println("Invalid index");
        return num;
    } else {
        int[] newArray = new int[num.length - 1];
        for (int i = 0, j = 0; i < num.length; i++) {
            if (i != index) {
                newArray[j] = num[i];
                j++;
            }
        }
        return newArray;
    }
}
}
