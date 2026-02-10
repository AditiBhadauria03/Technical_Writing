//Given N array elements ,check if there exits a pair (i,j) such that arr[i]+arr[j]==k and i!=j.
//Note:I and j are the indices of the array and k is a given sum.
//INPUT:Arr=[3,-2,1,4,3,6,8]
//      k=10
//OUTPUT:Yes

//OBSERVATION:
//To check if there exists a pair of indices (i, j) such that arr[i] + arr[j] == k and i != j, we can use a brute-force approach by iterating through all possible pairs of indices in the array. We will check if the sum of the elements at those indices equals k. If we find such a pair, we can conclude that the answer is "Yes". If we finish checking all pairs without finding any that satisfy the condition, the answer will be "No".

o99o99099098
import java.util.Scanner;
class pair
{
    public static void main(String args[])
    {
        int arr[];
        int n,k;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements");
        n=sc.nextInt();
        arr=new int[n];

        System.out.println("Enter array elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the value of k");
        k=sc.nextInt();
        boolean pairExists=false;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr[i]+arr[j]==k)
                {
                    pairExists=true;
                    break;
                }
            }
            if(pairExists)
            {
                break;
            }
        }
        if(pairExists)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}
