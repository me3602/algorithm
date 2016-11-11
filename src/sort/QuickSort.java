package sort;

import baseInterface.IAlgorithm;

public class QuickSort implements IAlgorithm {

	private int level = 0;
	
	@Override
	public int[] sort(int[] array) {
		return quickSort(array,0,array.length-1);
	}
	

	private int partition(int[] array, int left, int right, int pivot){
		int leftPtr = left - 1;
		int rightPtr = right;
		
		while (true) {
		  while (array[++leftPtr] < pivot);		
		  while (rightPtr > 0 && array[--rightPtr] > pivot);
		
		  if (leftPtr >= rightPtr)
		    break;
		  else
		    swap(array,leftPtr, rightPtr);
		}
		
		swap(array,leftPtr, right);
		return leftPtr;
	}
	
	private int[] quickSort(int[] array, int left, int right){
		int pivotIndex = right; // �迭�� �ֿ��� ���� �������� ����

		if (right - left <= 0)      // if size is 1,
			return array;                    //  it's already sorted
		else {
			int  partition = partition (array,left, right,array[pivotIndex]);
			quickSort (array,left, partition-1);
			quickSort (array,partition+1, right);
		}
		
		
		return array;
	}
	
	private void swap(int[] array, int i, int j){
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;		
	}
	
	/*private int partition(int[] array, int left, int right, int pivotIndex){
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
	}*/

}
