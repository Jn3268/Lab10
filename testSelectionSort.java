package Lab10Package;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class testSelectionSort {
private SelectionSort temp2;
	@Test
	public void test() {
		testPositive();
		testNegative();
		testMixed();
		testDuplicates();
		//fail("Not yet implemented");
	}
	 public testSelectionSort() {

	 }

	 public void testMixed(){
 		int[] arr = new int[5];
 		  arr[0] = -8;
 		  arr[1] = -9;
 		  arr[2] = 0;
 		  arr[3] = 10;
 		  arr[4] = -2;
 		  int[] Sortedarr = new int[5];
 		  Sortedarr[0] = -9;
 		  Sortedarr[1] = -8;
 		  Sortedarr[2] = -2;
 		  Sortedarr[3] = 0;
 		  Sortedarr[4] = 10;
 		  SelectionSort temp2 = new SelectionSort();
 		  int[] x = temp2.basicSelectionSort(arr);
 		  assertArrayEquals(Sortedarr,arr);
 	}
 	public void testDuplicates(){
 		int[] arr = new int[5];
 		  arr[0] = -8;
 		  arr[1] = 10;
 		  arr[2] = 7;
 		  arr[3] = 10;
 		  arr[4] = -8;
 		  int[] Sortedarr = new int[5];
 		  Sortedarr[0] = -8;
 		  Sortedarr[1] = -8;
 		  Sortedarr[2] = 7;
 		  Sortedarr[3] = 10;
 		  Sortedarr[4] = 10;
 		  SelectionSort temp2 = new SelectionSort();
 		  int[] x = temp2.basicSelectionSort(arr);
 		  assertArrayEquals(Sortedarr,arr);
 	}






}
