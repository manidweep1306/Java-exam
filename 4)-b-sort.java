import java.util.*;
class sorting{
	void BubbleSort(int a[],int n){
	   int i,j,temp;
		for(i=0;i<=n-1;i++)
			for(j=0;j<=n-2-i;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
	}
}
public class sort{

  	public static void main(String[] args){
  	
  	    Scanner sc=new Scanner(System.in);
  		int i,n;
  		sorting obj=new sorting();   //object must be created for class name in which method is written
  		System.out.println("Enter number of elements: ");
  		n=sc.nextInt();
  		int arr[]=new int[n];
  		System.out.println("Enter the elements: ");
  		for(i=0;i<n;i++){
  			arr[i]=sc.nextInt();
  		}
  		obj.BubbleSort(arr,n);
  		System.out.print("After sorting:\n");
      		for(i=0; i<n; i++)
          	    System.out.print(arr[i]+" ");
  	}
   
}
