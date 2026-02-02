//Given an integer array of size N,in one second you can increase the value of 1 element by 1.Find the minimum time in seconds to make all the elements of the array equal.
//Eg:arr=[2 4 1 3]
//Output=6

//OBSERVATION:
//To minimize the time,make all elements equal to the maximum element in the array.

//PSEUDO CODE:
//STEP1:Find the maximum element in the array.
//STEP2:For every element calculate how much it needs to be increased to reach the maximum.
//STEP3:Sum all those differences to get the total time.

import java.util.Scanner;
class time
{
    public static void main(String args[])
    {
        int arr[];
        int n;
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements");
        n=sc.nextInt();
        arr=new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        int max=arr[0];
        for(int i=0;i<n;i++)
        {
            if (arr[i]>max)
            {
                max=arr[i];
            }
        }
        int time=(max*n)-sum;
        System.out.println("Minimum time is:" +time);
    }
}