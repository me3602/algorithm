import java.util.Arrays;

import baseInterface.IAlgorithm;
import baseInterface.IAlgorithm2;
import search.BinarySearch;
import sort.QuickSort;
	
public class Main {

	static public void main(String[] args){
		//sortTest();
		searchTest();
		
		
	}
	
	
	static public void sortTest(){
		int[] array = {8,6,75,5,4,36,7,10,2,0,1};
		System.out.println(Arrays.toString(array));
		
		//IAlgorithm algorithm = new MergeSort();
		//IAlgorithm algorithm = new BubbleSort();
		//IAlgorithm algorithm = new SelectionSort();
		IAlgorithm algorithm = new QuickSort();
		//IAlgorithm algorithm = new CountSort();
		System.out.println("result : " + Arrays.toString(algorithm.sort(array)));
	}
	
	static public void searchTest(){
		int[] array = {0,1,2,3,4,5,6,7,8,9,10};
		int target = 9;
		
		System.out.println("배열 : "+Arrays.toString(array));
		System.out.println("찾는 수 : "+ target);
		
		IAlgorithm2 algorithm = new BinarySearch();
		
		System.out.printf("결과 : %d ",algorithm.search(array, target));
	}
}
