package recursiveMethod;

public class MergeSort {

	public static void main(String[] args) {

//		int[] arr = { 1 , 5 , 4 ,2 , 6, 9};
//		merge(0, 5, arr);
//		
//		for (int i = 0; i <arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
//		
		
		
		int[] vect = {1,3,2,5};
		MergeSort.merge(0, 3, vect);
		
		
		for (int x =0; x < vect.length; x++) {
			System.out.println(vect[x] + " ");
		}
		
	}
	
	
	public static void merge(int start , int end, int[] arr) {
		
		
		int mid = (start + end) / 2;
		
		if ( start == end ) return;
		
		merge(start, mid, arr);
		merge(mid + 1 , end, arr);
		
		int a = start;
		int b = mid + 1;
		
		int aEnd = mid + 1;
		int bEnd = end + 1;
		int[] result = new int[10];
		int t =0;
		
		while (true) {
			
			if ( a == aEnd && b == bEnd) break;
			if (a == aEnd) result[t++] = arr[b++];
			else if (b == bEnd) result[t++] = arr[a++];
			else if ( arr[a] < arr[b]) result[t++] = arr[a++];
			else if ( arr[a] > arr[b]) result[t++] = arr[b++];
			
			for (int i = 0; i <t; i++) {
				arr[start+i] = result[i];
			}
		}
		
		
		
		
	}

		
	

}
