//WAP to find sum of frame elements of a matrix.
// 1 2 3 
// 4 5 6
// 7 8 9    
//Sum=40         

import java.util.Scanner;
public class frame
{
    public static void main(String args[])
    {
        int arr[][];
        int row,col;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows and columns");
        row=sc.nextInt();
        col=sc.nextInt();
        arr=new int[row][col];
        System.out.println("Enter array elements");

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        int sum=0;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(i==0 || i==row-1 || j==0 || j==col-1)
                {
                    sum+=arr[i][j];
                }
            }
        }
        System.out.println("Sum of frame elements is:"+sum);

    }
}