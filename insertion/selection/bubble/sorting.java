package lab2;

public class Sorting {

	public Sorting() {
		// TODO Auto-generated constructor stub
	}
	
	static void insertionSort(int[] a) {
		int comparisons = 0, shifts = 0;
		for(int i=1;i<a.length;i++) {
			int key = a[i];
			int j = i-1;
			while(j>=0 && a[j]>key) {
				comparisons++;
				a[j+1]=a[j];
				shifts++;
				j--;
			}
			a[j+1]=key;
		}
		System.out.println("Comparisons: "+ comparisons +"Shifts: " + shifts);
	}
	
	static void bubbleSort(int[] a) {
		int comparisons=0,swaps=0;
		for(int i=0;i<a.length-1;i++) {
			int flag = 0;
			for(int j=0;j<a.length-1-i;j++)
			{
				comparisons++;
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					swaps++;
					flag=1;
				}
			}
			if (flag==0)
				break;
		}
		System.out.println("Comparisons: "+ comparisons +"Swaps: " + swaps);
	}
	
	static void selectionSort(int a[]) {
		int comparisons=0,shifted=0;
		for(int i=0;i<a.length-1;i++) {
			int min = i;
			for(int j=i+1;j<a.length;j++) {
				comparisons++;
				if(a[j]<a[min]) {
					min=j;
				}
			}	
				if(min!=i) {
					int temp=a[i];
					a[i]=a[min];
					a[min]=temp;
					shifted++;
				}
			}
		
		System.out.println("Comparisons: "+ comparisons +"Shifted: " + shifted);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {29,10,14,37,14,5,42,1};
		int[] arr1 = {29,10,14,37,14,5,42,1};
		int[] arr2 = {29,10,14,37,14,5,42,1};
		insertionSort(arr);
        System.out.println(java.util.Arrays.toString(arr));
        bubbleSort(arr1);
        System.out.println(java.util.Arrays.toString(arr1));
        selectionSort(arr2);
        System.out.println(java.util.Arrays.toString(arr2));
	}

}
