//Given an array of integer A find and return the product array of the same size where the ith element of the product array will be equal to the product of all elements divided by the ith element of the array.
//A=[1 2 3 4 5]
//OUTPUT=120 60 40 30 24
//A =[5 1 10 1]
//OUTPUT=10 50 5 50

//OBSERVATION:
//The product array element at index i can be calculated by dividing the product of all elements in the array by the element at index i

//ALGORITHM:
//1.Take input from the user.
//2.Calculate the product of all elements in the array.
//3.Create another array productArray[] of same size as input array.
//4.For every index i in productArray[],set productArray[i]=product/inputArray[i].
//5.Print the productArray[].

import java.util.Scanner;
class ProductArray
{
    public static void main(String args[])
    {
        int arr[];
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements");
        n=sc.nextInt();
        arr=new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int product=1;
        for(int i=0;i<n;i++)
        {
            product=product*arr[i];
        }
        int prodArr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            prodArr[i]=product/arr[i];
        }
        System.out.println("Product Array elements are:");
        for(int i=0;i<n;i++)
        {
            System.out.print(prodArr[i]+" ");
        }
    }
}