

public class SortTest extends Sort {
	public static void main (String args[]){
		//3 integer arrays of size 20
		int [] k1 = new int[20];
		int [] k2 = new int[20];
		int [] k3 = new int[20];
		
		//one sorted
		for (int i = 0; i<(k1.length); i++){
			k1[i] = i;
		}
		
		//one sorted in reverse order
		for (int i = 0; i<(k2.length); i++){
			k2[i] = 20-i;
		}
		
		//one random filled
		for (int i = 0; i< (k3.length); i++){
			k3[i] = (int)(Math.random()*((20-1)+1)+1);
		}
		
		System.out.println("Original Arrays: ");
		displayArray(k1);
		displayArray(k2);
		displayArray(k3);
		
		Sort sort = new Sort();
		
		
		//Selection Sort
		/*
		sort.selectionSort(k1);
		sort.selectionSort(k2);
		sort.selectionSort(k3);
		System.out.println("\n" + "SelectionSort: ");
		*/
		
		//Insertion Sort
		/*
		k1 = sort.insertionSort(k1);
		k2 = sort.insertionSort(k2);
		k3 = sort.insertionSort(k3);
		System.out.println("\n" + "InsertionSort: ");
		*/
		
		//Bubble Sort
		/*
		k1 = sort.bubbleSort(k1);
		k2 = sort.bubbleSort(k2);
		k3 = sort.bubbleSort(k3);
		System.out.println("\n" + "BubbleSort: ");
		*/
		
		//Merge Sort
		/*
		k1 = sort.mergeSort(k1);
		k2 = sort.mergeSort(k2);
		k3 = sort.mergeSort(k3);
		System.out.println("\n" + "MergeSort: ");
		*/
		
		//ShellSort
		/*
		k1 = sort.shellSort(k1);
		k2 = sort.shellSort(k2);
		k3 = sort.shellSort(k3);
		System.out.println("\n" + "Shell Sort: ");
		*/
		
		//Quicksort - FIX
		/*
		k1 = sort.quickSort(k1, 0, k1.length-1);
		k2 = sort.quickSort(k2, 0, k2.length-1);
		k3 = sort.quickSort(k3, 0, k3.length-1);
		System.out.println("\n" + "Quick Sort: ");
		*/
		
		
		displayArray(k1);
		displayArray(k2);
		displayArray(k3);
		
	}
	
	public static void displayArray(int [] arr){
		for (int i = 0; i< arr.length; i++){
			System.out.print(arr[i]+ " ");
		}
		System.out.println("");
	}
}