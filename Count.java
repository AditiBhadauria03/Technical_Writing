//Given N array Count the number of elements having atleast one element greater than itself.
//Eg: arr=[-3 2 6 8 4 8 5]

//OBSERVATION: For Every Maximum element there won't be any element greater than itself.

//PSEUDO CODE:
//STEP1:Iterate and find the maximum element in the array.
//STEP2:Iterate and get the number of Element that are not equal to maximum element.
//STEP3:Increment the Counter.


import java.util.Scanner;
class Count
{
    public static void main(String args[])
    {
        int arr[],n;
        int c =0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements ");
        n=sc.nextInt();
        arr=new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        for(int i=0;i<n;i++)
            {
                if(arr[i]!=max)
                {
                    c++;
                }
            }
            System.out.println("Number of elements " +c);
        }
    }