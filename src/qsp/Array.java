package qsp;

import javax.management.openmbean.OpenMBeanAttributeInfo;

public class Array {

	public static void main(String[] args) {
		int a[]= {20,30,10,15,5};
		//        0   1   2  3 4
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
		}
		int sum=0;
		for(int i=0;i<2;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
	}
}
