/*
*/
import java.util.Scanner;

public class Assign3 extends Sort {
	public static void main (String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value for n to test: ");
		int n = sc.nextInt();
		
		int [] k1 = createArraySorted(n);
		int [] k2 = createArrayReverse(n);
		int [] k3 = createArrayRandom(n);
		
		/*
		System.out.println("Original Arrays: ");
		displayArray(k1);
		displayArray(k2);
		displayArray(k3);
		*/
		
		Sort sort = new Sort();
		long start;
		long end;
		
		System.out.println("************************");
		System.out.println("Selection Sort");
		System.out.println("************************");
		//n
		start = System.currentTimeMillis();
		int [] selectk1 = sort.selectionSort(k1);
		end = System.currentTimeMillis();
		System.out.println("K1 Selection Sort n=" + n + " " +(end-start));
		
		start = System.currentTimeMillis();
		int [] selectk2 = sort.selectionSort(k2);
		end = System.currentTimeMillis();
		System.out.println("K2 Selection Sort n=" + n + " " +(end-start));
		
		start = System.currentTimeMillis();
		int [] selectk3 = sort.selectionSort(k3);
		end = System.currentTimeMillis();
		System.out.println("K3 Selection Sort n=" + n + " " +(end-start));
		System.out.println("************************");
		
		n = 2*n; //2n
		k1 = createArraySorted(n);
		k2 = createArrayReverse(n);
		k3 = createArrayRandom(n);
		
		start = System.currentTimeMillis();
		selectk1 = sort.selectionSort(k1);
		end = System.currentTimeMillis();
		System.out.println("K1 Selection Sort n=" + n + " " +(end-start));
		
		start = System.currentTimeMillis();
		selectk2 = sort.selectionSort(k2);
		end = System.currentTimeMillis();
		System.out.println("K2 Selection Sort n=" + n + " " +(end-start));
		
		start = System.currentTimeMillis();
		selectk3 = sort.selectionSort(k3);
		end = System.currentTimeMillis();
		System.out.println("K3 Selection Sort n=" + n + " " +(end-start));
		System.out.println("************************");
		
		n = 2*n; //4n
		k1 = createArraySorted(n);
		k2 = createArrayReverse(n);
		k3 = createArrayRandom(n);
		
		start = System.currentTimeMillis();
		selectk1 = sort.selectionSort(k1);
		end = System.currentTimeMillis();
		System.out.println("K1 Selection Sort n=" + n + " " +(end-start));
		
		start = System.currentTimeMillis();
		selectk2 = sort.selectionSort(k2);
		end = System.currentTimeMillis();
		System.out.println("K2 Selection Sort n=" + n + " " +(end-start));
		
		start = System.currentTimeMillis();
		selectk3 = sort.selectionSort(k3);
		end = System.currentTimeMillis();
		System.out.println("K3 Selection Sort n=" + n + " " +(end-start));
		System.out.println("************************");
		
		n = 2*n; //8n
		k1 = createArraySorted(n);
		k2 = createArrayReverse(n);
		k3 = createArrayRandom(n);
		
		start = System.currentTimeMillis();
		selectk1 = sort.selectionSort(k1);
		end = System.currentTimeMillis();
		System.out.println("K1 Selection Sort n=" + n + " " +(end-start));
		
		start = System.currentTimeMillis();
		selectk2 = sort.selectionSort(k2);
		end = System.currentTimeMillis();
		System.out.println("K2 Selection Sort n=" + n + " " +(end-start));
		
		start = System.currentTimeMillis();
		selectk3 = sort.selectionSort(k3);
		end = System.currentTimeMillis();
		System.out.println("K3 Selection Sort n=" + n + " " +(end-start));
		
		
		System.out.println("************************");
		System.out.println("Insertion Sort");
		System.out.println("************************");
		
		n = n/8; //n
		k1 = createArraySorted(n);
		k2 = createArrayReverse(n);
		k3 = createArrayRandom(n);
		
		start = System.currentTimeMillis();
		selectk1 = sort.insertionSort(k1);
		end = System.currentTimeMillis();
		System.out.println("K1 Insertion Sort n=" + n + " " +(end-start));
		
		start = System.currentTimeMillis();
		selectk2 = sort.insertionSort(k2);
		end = System.currentTimeMillis();
		System.out.println("K2 Insertion Sort n=" + n + " " +(end-start));
		
		start = System.currentTimeMillis();
		selectk3 = sort.selectionSort(k3);
		end = System.currentTimeMillis();
		System.out.println("K3 Insertion Sort n=" + n + " " +(end-start));
		System.out.println("************************");
		
		n = n*2; //2n
		k1 = createArraySorted(n);
		k2 = createArrayReverse(n);
		k3 = createArrayRandom(n);
		
		start = System.currentTimeMillis();
		selectk1 = sort.insertionSort(k1);
		end = System.currentTimeMillis();
		System.out.println("K1 Insertion Sort n=" + n + " " +(end-start));
		
		start = System.currentTimeMillis();
		selectk2 = sort.insertionSort(k2);
		end = System.currentTimeMillis();
		System.out.println("K2 Insertion Sort n=" + n + " " +(end-start));
		
		start = System.currentTimeMillis();
		selectk3 = sort.selectionSort(k3);
		end = System.currentTimeMillis();
		System.out.println("K3 Insertion Sort n=" + n + " " +(end-start));
		System.out.println("************************");
		
		n = n*2; //4n
		k1 = createArraySorted(n);
		k2 = createArrayReverse(n);
		k3 = createArrayRandom(n);
		
		start = System.currentTimeMillis();
		selectk1 = sort.insertionSort(k1);
		end = System.currentTimeMillis();
		System.out.println("K1 Insertion Sort n=" + n + " " +(end-start));
		
		start = System.currentTimeMillis();
		selectk2 = sort.insertionSort(k2);
		end = System.currentTimeMillis();
		System.out.println("K2 Insertion Sort n=" + n + " " +(end-start));
		
		start = System.currentTimeMillis();
		selectk3 = sort.selectionSort(k3);
		end = System.currentTimeMillis();
		System.out.println("K3 Insertion Sort n=" + n + " " +(end-start));
		System.out.println("************************");
		
		n = n*2; //8n
		k1 = createArraySorted(n);
		k2 = createArrayReverse(n);
		k3 = createArrayRandom(n);
		
		start = System.currentTimeMillis();
		selectk1 = sort.insertionSort(k1);
		end = System.currentTimeMillis();
		System.out.println("K1 Insertion Sort n=" + n + " " +(end-start));
		
		start = System.currentTimeMillis();
		selectk2 = sort.insertionSort(k2);
		end = System.currentTimeMillis();
		System.out.println("K2 Insertion Sort n=" + n + " " +(end-start));
		
		start = System.currentTimeMillis();
		selectk3 = sort.selectionSort(k3);
		end = System.currentTimeMillis();
		System.out.println("K3 Insertion Sort n=" + n + " " +(end-start));
		System.out.println("************************");
		
		
		System.out.println("************************");
		System.out.println("Bubble Sort");
		System.out.println("************************");
		
		n = n/8; //n
		k1 = createArraySorted(n);
		k2 = createArrayReverse(n);
		k3 = createArrayRandom(n);
		
		start = System.currentTimeMillis();
		selectk1 = sort.bubbleSort(k1);
		end = System.currentTimeMillis();
		System.out.println("K1 Bubble Sort n=" + n + " " +(end-start));
		
		start = System.currentTimeMillis();
		selectk2 = sort.bubbleSort(k2);
		end = System.currentTimeMillis();
		System.out.println("K2 Bubble Sort n=" + n + " " +(end-start));
		
		start = System.currentTimeMillis();
		selectk3 = sort.bubbleSort(k3);
		end = System.currentTimeMillis();
		System.out.println("K3 Bubble Sort n=" + n + " " +(end-start));
		System.out.println("************************");
		
		n = n*2; //2n
		k1 = createArraySorted(n);
		k2 = createArrayReverse(n);
		k3 = createArrayRandom(n);
		
		start = System.currentTimeMillis();
		selectk1 = sort.bubbleSort(k1);
		end = System.currentTimeMillis();
		System.out.println("K1 Bubble Sort n=" + n + " " +(end-start));
		
		start = System.currentTimeMillis();
		selectk2 = sort.bubbleSort(k2);
		end = System.currentTimeMillis();
		System.out.println("K2 Bubble Sort n=" + n + " " +(end-start));
		
		start = System.currentTimeMillis();
		selectk3 = sort.bubbleSort(k3);
		end = System.currentTimeMillis();
		System.out.println("K3 Bubble Sort n=" + n + " " +(end-start));
		System.out.println("************************");
		
		n = n*2; //4n
		k1 = createArraySorted(n);
		k2 = createArrayReverse(n);
		k3 = createArrayRandom(n);
		
		start = System.currentTimeMillis();
		selectk1 = sort.bubbleSort(k1);
		end = System.currentTimeMillis();
		System.out.println("K1 Bubble Sort n=" + n + " " +(end-start));
		
		start = System.currentTimeMillis();
		selectk2 = sort.bubbleSort(k2);
		end = System.currentTimeMillis();
		System.out.println("K2 Bubble Sort n=" + n + " " +(end-start));
		
		start = System.currentTimeMillis();
		selectk3 = sort.bubbleSort(k3);
		end = System.currentTimeMillis();
		System.out.println("K3 Bubble Sort n=" + n + " " +(end-start));
		System.out.println("************************");
		
		n = n*2; //8n
		k1 = createArraySorted(n);
		k2 = createArrayReverse(n);
		k3 = createArrayRandom(n);
		
		start = System.currentTimeMillis();
		selectk1 = sort.bubbleSort(k1);
		end = System.currentTimeMillis();
		System.out.println("K1 Bubble Sort n=" + n + " " +(end-start));
		
		start = System.currentTimeMillis();
		selectk2 = sort.bubbleSort(k2);
		end = System.currentTimeMillis();
		System.out.println("K2 Bubble Sort n=" + n + " " +(end-start));
		
		start = System.currentTimeMillis();
		selectk3 = sort.bubbleSort(k3);
		end = System.currentTimeMillis();
		System.out.println("K3 Bubble Sort n=" + n + " " +(end-start));
		System.out.println("************************");
		
		//Merge Sort NEEDS FIXED 
		/*
		k1 = sort.mergeSort(k1);
		k2 = sort.mergeSort(k2);
		k3 = sort.mergeSort(k3);
		System.out.println("\n" + "MergeSort: ");
		*/
		
		
		System.out.println("************************");
		System.out.println("Shell Sort");
		System.out.println("************************");
		
		n = n/8; //n
		k1 = createArraySorted(n);
		k2 = createArrayReverse(n);
		k3 = createArrayRandom(n);
		
		start = System.currentTimeMillis();
		selectk1 = sort.shellSort(k1);
		end = System.currentTimeMillis();
		System.out.println("K1 Shell Sort n=" + n + " " +(end-start));
		
		start = System.currentTimeMillis();
		selectk2 = sort.shellSort(k2);
		end = System.currentTimeMillis();
		System.out.println("K2 Shell Sort n=" + n + " " +(end-start));
		
		start = System.currentTimeMillis();
		selectk3 = sort.shellSort(k3);
		end = System.currentTimeMillis();
		System.out.println("K3 Shell Sort n=" + n + " " +(end-start));
		System.out.println("************************");
		
		n = n*2; //2n
		k1 = createArraySorted(n);
		k2 = createArrayReverse(n);
		k3 = createArrayRandom(n);
		
		start = System.currentTimeMillis();
		selectk1 = sort.shellSort(k1);
		end = System.currentTimeMillis();
		System.out.println("K1 Shell Sort n=" + n + " " +(end-start));
		
		start = System.currentTimeMillis();
		selectk2 = sort.shellSort(k2);
		end = System.currentTimeMillis();
		System.out.println("K2 Shell Sort n=" + n + " " +(end-start));
		
		start = System.currentTimeMillis();
		selectk3 = sort.shellSort(k3);
		end = System.currentTimeMillis();
		System.out.println("K3 Shell Sort n=" + n + " " +(end-start));
		System.out.println("************************");
		
		n = n*2; //4n
		k1 = createArraySorted(n);
		k2 = createArrayReverse(n);
		k3 = createArrayRandom(n);
		
		start = System.currentTimeMillis();
		selectk1 = sort.shellSort(k1);
		end = System.currentTimeMillis();
		System.out.println("K1 Shell Sort n=" + n + " " +(end-start));
		
		start = System.currentTimeMillis();
		selectk2 = sort.shellSort(k2);
		end = System.currentTimeMillis();
		System.out.println("K2 Shell Sort n=" + n + " " +(end-start));
		
		start = System.currentTimeMillis();
		selectk3 = sort.shellSort(k3);
		end = System.currentTimeMillis();
		System.out.println("K3 Shell Sort n=" + n + " " +(end-start));
		System.out.println("************************");
		
		n = n*2; //8n
		k1 = createArraySorted(n);
		k2 = createArrayReverse(n);
		k3 = createArrayRandom(n);
		
		start = System.currentTimeMillis();
		selectk1 = sort.shellSort(k1);
		end = System.currentTimeMillis();
		System.out.println("K1 Shell Sort n=" + n + " " +(end-start));
		
		start = System.currentTimeMillis();
		selectk2 = sort.shellSort(k2);
		end = System.currentTimeMillis();
		System.out.println("K2 Shell Sort n=" + n + " " +(end-start));
		
		start = System.currentTimeMillis();
		selectk3 = sort.shellSort(k3);
		end = System.currentTimeMillis();
		System.out.println("K3 Shell Sort n=" + n + " " +(end-start));
		System.out.println("************************");
		
		//ShellSort
		/*
		k1 = sort.shellSort(k1);
		k2 = sort.shellSort(k2);
		k3 = sort.shellSort(k3);
		System.out.println("\n" + "Shell Sort: ");
		*/
		
		//Quicksort
		//displayArray(selectk1);
		//displayArray(selectk2);
		//displayArray(selectk3);
	}
	
	public static void displayArray(int [] arr){
		for (int i = 0; i< arr.length; i++){
			System.out.print(arr[i]+ " ");
		}
		System.out.println("");
	}
	
	public static int [] createArraySorted(int n){
		int [] k1 = new int[n];
		for (int i = 0; i<(k1.length); i++){
			k1[i] = 1+i;
		}
		return k1;
	}
	
	public static int [] createArrayReverse (int n){
		int [] k2 = new int[n];
		//one sorted in reverse order
		for (int i = 0; i<(k2.length); i++){
			k2[i] = (k2.length)-i;
		}
		return k2;
	}
	
	public static int [] createArrayRandom (int n){
		int [] k3 = new int[n];
		//one random filled
		for (int i = 0; i< (k3.length); i++){
			k3[i] = (int)(Math.random()*(((k3.length)-1)+1)+1);
		}
		return k3;
	}
}