package javaCodeability;


public class MyOwnArrayList {

	private static final int DefaultSize = 5;
	private Object[] arrayList;
	private int iArraySize;
	private int iArrayIndex;
	
	public MyOwnArrayList() {
		iArraySize = 5;
		arrayList = new Object[5];
	}
	public MyOwnArrayList(int size) {
		iArraySize = size;
		arrayList = new Object[size];
	}
	
	public void add(Object obj) {
		if(this.iArrayIndex == this.iArraySize -1) {
			increaseSizeAndArray();
		}
		arrayList[this.iArrayIndex] = obj;
		this.iArrayIndex++;
	}
	private void increaseSizeAndArray() {
		//size increase
		this.iArraySize += DefaultSize;
		
		Object[] newArrayList = new Object[this.iArraySize];
		
		for (int i = 0; i < arrayList.length; i++) {
			newArrayList[i] = arrayList[i];
		}
		this.arrayList = newArrayList;
	}
	
	public void remove(int index) throws Exception {
		if((index>this.iArrayIndex-1) || (index<0)){
			throw new Exception("InvalidIndexException");
		}
		for(int i=index; i<this.arrayList.length-1;i++){
			arrayList[i]=arrayList[i+1];
		}
		this.iArrayIndex--;
	}
	public Object get(int i) throws Exception{
		return this.arrayList[i];
		
	}
}
