//WAP to find the second largest element of the array.

import java.util.Scanner;
class sec_largest
{
    public static void main(String args[])
    {
        int arr[];
        int size;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        size=sc.nextInt();
        arr=new int[size];
        System.out.println("Enter array elements");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        int largest=arr[0];
        int second_largest=arr[0];
        for(int i=1;i<size;i++)
        {
            if(arr[i]>largest)
            {
                second_largest=largest;
                largest=arr[i];
            }
            else if(arr[i]>second_largest && arr[i]!=largest)
            {
                second_largest=arr[i];
            }
        }
        if(second_largest==largest)
        {
            System.out.println("There is no second largest element in the array");
        }
        else
        {
            System.out.println("Second largest element is:"+second_largest);
        }
    }
}