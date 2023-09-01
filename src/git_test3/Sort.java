package git_test3;

public class Sort {
	
	public static void sort(int[] a) {
		
	}	// sort 메소드
	
	static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
				
	}	// swap 메소드
	
	static int partition(int[] a, int start, int end) {
		int value = a[end];
		int i = start-1;
		for(int j=start; j<=end-1; ++j) {
			if(a[j] < value) {
				swap(a, ++i, j);
			}	// if 문
		}	// for 문
		swap(a, i + 1, end);
		
		return i+1;
	} // partition 메소드
	
	static void quickSort(int[] a, int start, int end) {
		if(start >= end) return;
		int middle = partition(a, start, end);
		quickSort(a, start, middle-1);
		quickSort(a, middle+1, end);
		
	}
	
}	// sort 클래스
