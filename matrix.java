//WAP to read and print a matrix.
//INPUT:[1 2 3 4 5 6 7 8 9]
//OUTPUT: 1 2 3
//        4 5 6
//        7 8 9

//OBSERVATION:
//A matrix is a 2D array of numbers arranged in rows and columns. To read and print a matrix, we can use nested loops to iterate through the rows and columns of the matrix. We will first take input for the number of rows and columns, then read the elements of the matrix from the user, and finally print the matrix in a formatted way.

//ALGORITHM:
//  1.Take input from the user for number of rows and columns of the matrix.
//  2.Create a 2D array to store the matrix elements.
//  3.Take input from the user to fill the matrix.
//  4.Iterate through the matrix using nested loops to print the elements in a formatted way, where each row is printed on a new line and elements in the same row are separated by spaces.


import java.util.Scanner;
class matrix
{
    public static void main(String args[])
    {
        int rows,cols;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows");
        rows=sc.nextInt();

        System.out.println("Enter number of columns");
        cols=sc.nextInt();

        int mat[][]=new int[rows][cols];
        System.out.println("Enter elements of the matrix");

        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix elements are:");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}