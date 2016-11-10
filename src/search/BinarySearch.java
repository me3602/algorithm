package search;

import baseInterface.IAlgorithm2;

public class BinarySearch implements IAlgorithm2 {

	@Override
	public int search(int[] array, int target) {
		int first = 0;
		int last = array.length-1;
		int mid = 0;
		int result = -1;
		
		while(first <= last){
			mid = (first+last)/2;// �߾Ӱ�
						
			if(target == array[mid]){//�߾Ӱ��� ã�� ���ڶ�� ����
				result = mid;
				break;
			}else{
				if(target < array[mid]){
					last = mid - 1;
				}else{
					first = mid + 1;
				}
			}
		}
		
		
		return result;
	}

}
