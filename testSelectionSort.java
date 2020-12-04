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
	 public void testPostive(){
	 		int[] arr = new int[5];
	 		arr[0]=8;
	 		  arr[1] = 9;
	 		  arr[2] = 7;
	 		  arr[3] = 10;
	 		  arr[4] = 2;
	 		  int[] Sortedarr = new int[5];
	 		  Sortedarr[0] = 2;
	 		  Sortedarr[1] = 7;
	 		  Sortedarr[2] = 8;
	 		  Sortedarr[3] = 9;
	 		  Sortedarr[4] = 10;
	 		  /** add tests to check for this unit test **/
	 		  SelectionSort temp2 = new SelectionSort();
	 		  int[] x = temp2.basicSelectionSort(arr);
	 		  assertArrayEquals(Sortedarr,arr);
	 	}
	 	public void testNegative(){
	 		int[] arr = new int[5];
	 		  arr[0] = -8;
	 		  arr[1] = -9;
	 		  arr[2] = -7;
	 		  arr[3] = -10;
	 		  arr[4] = -2;
	 		  int[] Sortedarr = new int[5];
	 		  Sortedarr[0] = -10;
	 		  Sortedarr[1] = -9;
	 		  Sortedarr[2] = -8;
	 		  Sortedarr[3] = -7;
	 		  Sortedarr[4] = -2;
	 		  SelectionSort temp2 = new SelectionSort();
	 		  int[] x = temp2.basicSelectionSort(arr);
	 		  assertArrayEquals(Sortedarr,arr);
	 	}







}
