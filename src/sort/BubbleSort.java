package sort;

import java.util.Arrays;

import baseInterface.IAlgorithm;

public class BubbleSort implements IAlgorithm{

	public int[] sort(int[] array) {
		int length = array.length;		
		for(int i= length-1; i>0; i--){
			System.out.printf("level %d : ", length-i);
			for(int j=0; j < i ; j++){
				if(array[j] > array[j+1]){
					swap(array,j,j+1);
				}
			}
			System.out.println(Arrays.toString(array));
		}
		return array;
	}
	
	private void swap(int[] array, int i, int j){
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;		
	}

}
