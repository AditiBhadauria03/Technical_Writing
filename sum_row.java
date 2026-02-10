//WAP to find the sum of every row of a matrix.

import java.util.Scanner;
class sum_row
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
            sum=0;
            for(int j=0;j<cols;j++)
            {
                sum=sum+matrix[i][j];
            }
            System.out.println("Sum of row "+(i+1)+" is:"+sum);
        }
        
    }
}