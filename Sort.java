/*
* 
*/

public class Sort {
	public Sort(){
	}
	
	public static int[] selectionSort (int [] arr){
		int min;
		int temp;
		for (int i = 0; i< arr.length; i++){
			min = i;
			for(int j = 0; j<arr.length; j++){
				if (arr[j] < arr[min]){
					min = j;
					temp = arr[i];
					arr[i] = arr[min];
					arr[min] = temp;
				}
			}
		}
		return arr;
	}
	
	public static int[] insertionSort (int [] arr){
		int v;
		int j;
		for (int i = 1; i< arr.length; i++){
			v = arr[i];
			j = i-1;
			while (j>=0 && arr[j] > v){
				arr[j+1] = arr[j];
				j = j-1;
			}
			arr[j+1] = v;
		}
		return arr;
	}
	
	public static int[] bubbleSort (int [] arr){
		int temp;
		for(int i = 0; i<= (arr.length - 2); i++){
			for (int j = 0; j<= (arr.length - 2-i); j++){
				if(arr[j+1]<arr[j]){
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}
	
	public static void showWork(int [] arr){
		for (int i = 0; i< arr.length; i++){
			System.out.print(arr[i]+ " ");
		}
		System.out.println("");
	}
	
	//FIX
	public static int [] mergeSort (int [] arrA){
		//System.out.println("********");
		if( arrA.length >1){
			int arrB [] = new int [(int)Math.floor(arrA.length/2)];
			int arrC [] = new int [arrA.length-arrB.length];
			for (int i = 0; i < arrB.length; i++){
				arrB[i] = arrA[i];
			}
			for(int j = 0; j< arrC.length; j++){
				arrC[j] = arrA[(int)Math.floor(arrA.length/2)+j];
			}
			
			//System.out.println("Array B: ");
			//showWork(arrB);
			//System.out.println("Array C: ");
			//showWork(arrC);
			arrB = mergeSort(arrB);
			arrC = mergeSort(arrC);
			arrA = merge(arrB, arrC);
		}
		return arrA;
	}
	
	public static int [] merge(int [] arrB, int [] arrC){
		int i = 0;
		int j = 0;
		int k = 0;
		//System.out.print("\nMerge: ");
		//showWork(arrB);
		//showWork(arrC);
		int [] arrA = new int [arrB.length+arrC.length];
		while(i< arrB.length && j < arrC.length){
			if(arrB[i] <= arrC[j]){
				arrA[k] = arrB[i];
				i = i+1;
			}
			else{
				arrA[k] = arrC[j];
				j = j+1;
			}
			k = k+1;
		}
		if(i ==arrB.length){
			for (int l = j; l < arrC.length; l++){
				arrA[k] = arrC[l];
				k++;
			}
		}
		else{
			for (int l = i; l < arrB.length; l++){
				arrA[k] = arrB[l];
				k++;
			}
		}
		return arrA;	
	}
	
	public static int[] shellSort (int arr[]){
		int h=1;
		while (h<= (arr.length-1)/9){
			h = (3*h)+1;
		}
		while(h>0){
			for(int i = h; i < arr.length; i++){
				int v = arr[i];
				int j = i-h;
				while (j>=0 && arr[j]>v){
					arr[j+h] = arr[j];
					j = j-h;
				}
				arr[j+h] = v;
			}
			h = (int)(Math.floor(h/3));
		}
		return arr;
	}
	
	
	public static int[] quickSort (int arr[], int l, int r){
		if (l<r){
			int s = lomutoPartition(arr, l, r);
			int arrB [] = new int [s];
			int arrC [] = new int [arr.length - arrB.length];
			arrB = quickSort(arr, l, s-1);
			//System.out.println("B: ");
			//showWork(arrB);
			arrC = quickSort(arr, s+1, r);
			//System.out.println("C: ");
			//showWork(arrC);
		}
		return arr;
	}
	
	public static int lomutoPartition(int arr [], int l, int r){ //pg 159
		int p = arr[l];
		int s = l;
		int temp;
		for (int i = l+1; i<=r; i++){
			if( arr[i]< p){
				s=s+1;
				temp = arr[s];
				arr[s] = arr[i];
				arr[i] = temp;
			}
		}
		temp = arr[l];
		arr[l] = arr[s];
		arr[s] = temp;
		return s;
	}
	
	/*
	public static int hoarePartition(int arr[], int l, int r ){
		int p = arr[l];
		int i = l;
		int j = r+1; //puts out of bounds... 
		while(i<j){
			System.out.println("In while...");
			while(arr[i] < p){
				System.out.println("while 1");
				i++;
			}
			while(arr[j] > p){
				System.out.println("while 2");
				j--;
			}
			showWork(arr);
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			showWork(arr);
		}
		System.out.println("Out of while...");
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		temp = arr[l];
		arr[l] = arr[j];
		arr[j] = arr[l];
		return j;
	}
		*/
		
}