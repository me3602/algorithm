package sort;

import java.util.Arrays;

import baseInterface.IAlgorithm;

public class MergeSort implements IAlgorithm {

	
	@Override
	public int[] sort(int[] array) {		
		return mergeSort(array);
	}
	
	private int[] mergeSort(int[] array){
		if(array.length <= 1) return array;
		
		int pivot = (int)Math.floor(array.length/2);
		int[] left = Arrays.copyOfRange(array, 0, pivot);
		int[] right = Arrays.copyOfRange(array, pivot, array.length);
				
		return merge(mergeSort(left),mergeSort(right)); //��ͷ�  ó��
	}
	
	private int[] merge(int[] left, int[] right){
		int[] result = new int[left.length+right.length];
		
		
		int i=0, j=0, k=0;
		while(i < left.length){
			if(j < right.length){ 
				// left�� i��° ��ҿ� right�� j��° ��� ��
				// �� ���� ���� ��� �迭�� �־� �� 
				if(left[i] < right[j]){ 
					result[k] = left[i];
					i++;
				}else{
					result[k] = right[j];
					j++;
				}
				k++;
			}else{
				//left���� ���� ��Ұ� �ִٸ� �� �о����
				while(i < left.length){
					result[k] = left[i];
					i++;
					k++;
				}
			}
			
		}
		
		//right���� ���� ��Ұ� �ִٸ� �� �о����
		while(j < right.length){
			result[k] = right[j];
			j++;
			k++;
		}
	
		System.out.println(Arrays.toString(result));
		
		return result;
	}

}
