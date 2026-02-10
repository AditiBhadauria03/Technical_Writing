//Write a program of sum of upper diagonal elements of a matrix.

import java.util.Scanner;
class upper
{
    public static void main(String args[])
    {
        int matrix[][];
        int rows,cols;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows");
        rows=sc.nextInt();

        System.out.println("Enter number of columns");
        cols=sc.nextInt();
        
        matrix=new int[rows][cols];
        System.out.println("Enter matrix elements");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }
        int sum=0;
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(j>i)
                {
                    sum=sum+matrix[i][j];
                }
            }
        }
        System.out.println("Sum of upper diagonal elements is:"+sum);
    }
}