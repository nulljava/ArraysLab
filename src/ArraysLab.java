/*David Huang
 * October 26th
 * 
 */
import java.util.Arrays;

public class ArraysLab {
	public static void main(String[] args) {
	    int[] a1 = {5, 10, 15, 20, 25, 30, 35, 40};
	    int[] a2 = {7, 14, 21, 28, 35, 42, 49, 56};
	    int[] sumArr=sum(a1,a2);
	    int appendNum=200;
	    int[] appendArr = append(a1, appendNum);
	    int removeIdx=5;
	    int[]removeArr = remove(a2, removeIdx);    
	    int sumOfEvens = sumEven(appendArr);
	    int[] rotateToRight = rotateRight(a1);

	    System.out.println(Arrays.toString(sumArr));
	    System.out.println(Arrays.toString(appendArr));
	    System.out.println(Arrays.toString(removeArr));
	    System.out.println(sumOfEvens);
	    System.out.println(Arrays.toString(rotateToRight));
	    
	}
	public static int[] sum(int[] arr1, int[] arr2) {
		int[] sumOutput = new int[arr1.length];
		for(int i = 0; i<sumOutput.length; i++) {
			sumOutput[i] = arr1[i] + arr2[i];	
		}
		return sumOutput;
	}
	public static int[] append(int[] arr, int num) {
		int[] appendOutput = new int[arr.length+1];
		for(int i=0; i<(appendOutput.length-1); i++) {
			appendOutput[i] = arr[i];
		}
		appendOutput[appendOutput.length-1] = num;
		return appendOutput;
	}
	public static int[] remove(int[] arr, int idx) {
		int[] removeOutput = new int[arr.length-1];
		for(int i=1; i<arr.length-1;i++) {
			removeOutput[i] = arr[i+1];
		}
		for (int i = 0; i<(idx); i++) {
			removeOutput[i] = arr[i];
		}
		return removeOutput;
	}
	public static int sumEven(int[] arr) {
		int evens = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				evens++;
			}
		}
		return evens;
	}
	public static int[] rotateRight(int[] arr) {
		int[] rightArr = new int [arr.length];
		for(int i=1; i<arr.length-1;i++) {
			rightArr[i+1] = arr[i];
		}
		rightArr[0] = arr[arr.length-1];
		return rightArr;
	}
}
