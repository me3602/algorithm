package sort;

import baseInterface.IAlgorithm;

public class QuickSort implements IAlgorithm {

	private int level = 0;
	
	@Override
	public int[] sort(int[] array) {
		return quickSort(array,0,array.length-1);
	}
	
	
	private int partition(int[] array, int left, int right, int pivotIndex){
		int temp;
		int pivot= array[pivotIndex];		
		
		while(left <= right){ // ����, ������ ���� ��Ģ�� ���� ���� ���� �Ѿ
			while(array[left] < pivot){
				left++;
			}
			
			while(array[right] > pivot && right > 0){
				right--;
			}
			
			if(left <= right){ //������ ���غ��� ũ��, �������� ���غ��� ������
				temp = array[left];
				array[left] = array[right];
				array[right] = temp;				
				right--;
			}			
		}
		
		//������ ���� �ε����� ���� ������ �Ǻ��� �־��� �� �ش� ���� �� �������� �ű�
		temp = array[left];
		array[left] = pivot;
		array[pivotIndex] = temp;
		return left;		
	}
	
	private int[] quickSort(int[] array, int left, int right){
		
		int pivotIndex = right; // �迭�� �ֿ��� ���� �������� ����
		
		//����(pivot) �� �����ϰ� �����ϱ� ���� -1
		pivotIndex  = partition(array,left,right-1,pivotIndex);
		if(left < pivotIndex -1){
			quickSort(array,left,pivotIndex-1); //���� ���� �κ� ���
		}
		if(pivotIndex + 1 < right){
			quickSort(array,pivotIndex + 1, right); // ���� ������ �κ� ���
		}
		
		
		return array;
	}

}
