package javaCodeability;


public class QuickSort {
	
	void quickSort(int iArray[], int iStart, int iEnd) {
		if (iStart < iEnd) {
			int iPartitionIndex = partition(iArray, iStart, iEnd);
		quickSort(iArray, iStart, iPartitionIndex - 1);
		quickSort(iArray, iPartitionIndex + 1, iEnd);
		}
	}

	private int partition(int[] iArray, int iStart, int iEnd) {
		
		int iPivot = iArray[iEnd];
		int iIndex = (iStart - 1);
		
		for (int i = iStart; i< iEnd; i++) {
			if (iArray[i] < iPivot) {
				iIndex++;
				int temp = iArray[iIndex];
				iArray[iIndex] = iArray[i];
				iArray[i]=temp;
			}
		}
			
		int temp = iArray[iIndex + 1];
		iArray[iIndex + 1] = iArray[iEnd];
		iArray[iEnd]=temp;	
		
		
		return iIndex + 1;
	}

}
