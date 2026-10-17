package lab1;
import java.util.Scanner;
import java.util.Arrays;
public class Lab_1 {

	public Lab_1() {
		// TODO Auto-generated constructor stub
		
	}
	static int linearSearch(int[] a,int key) {
		int comparisons=0;
		for(int i=0;i<a.length;i++) {
			comparisons++;
			if(a[i]==key) {
				System.out.println("Comparisons: "+ comparisons);
				return -1;
			}
		}
		System.out.println("Comparisons: "+ comparisons);
		return -1;
	}
	
	static int binarySearch(int[] a,int key) {
		int low=0,high=a.length-1,comparisons=0;
		while(low<=high) {
			comparisons++;
			int mid=(low+high)/2;
			if(a[mid]==key) {
				System.out.println("Comparisons: "+ comparisons);
				return mid;
			}
			else if(a[mid]<key) {
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
		System.out.println("Comparsions: "+ comparisons);
		return -1;
	}
	
	public static void main(String[] args) {
	int[] data= new int[10000];
	for(int i=0;i<data.length;i++) {
		data[i]=(int)(Math.random()*10000);
	}
	int[]sorted=data.clone();
	int key=data[8];
	for(int i=0;i<data.length;i++) {
		System.out.println(data[i]+" ");
	}
	System.out.println("Linear Search Index "+ linearSearch(data,key));
	System.out.println("Binary Search Index "+ binarySearch(data,key));
	System.out.println();
	}
}
