package com.company;

public class PracticeSet6 {
    public static void main(String[] args) {
        // Problem 1
    /*    float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float sum = 0;
        for (float element:marks) {
            sum = sum + element;
        }
            System.out.println("The value of sum is: "+ sum);

     */

        // Problem 2
    /*    float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float num = 45.8f;
        boolean isInArray = false;
        for (float element:marks) {
            if (num==element){
                isInArray = true;
                break;
            }
        }
        if (isInArray) {
            System.out.println("The value is present in the array");
        }
        else {
            System.out.println("The value is not present in the array");
        }

     */

        // Problem 3
    /*    float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float sum = 0;
        for (float element:marks) {
            sum = sum + element;
        }
        System.out.println("The value of average marks is: "+ sum/ marks.length);

     */

        // Problem 4
    /*    int [][] mat1 = { {1, 2, 3},
                          {4, 5, 6}};
        int[][] mat2 = { {2, 6, 13},
                         {3, 7, 1}};
        int[][] result = { {0, 0, 0},
                         {0, 0, 0}};

        for (int i=0; i<mat1.length; i++){ // row number of times
            for (int j=0; j<mat1[i].length; j++) { // column number of time
                System.out.format("Setting value for i =%d and  j=%d\n", i, j);
                result[i][j] = mat1[i][j] + mat2[i][j];

            }
        }
        //Printing the elements of a 2-D Array
        for (int i=0; i<mat1.length; i++){ // row number of times
            for (int j=0; j<mat1[i].length; j++) { // column number of time
                System.out.print(result[i][j] + " ");
                result[i][j] = mat1[i][j] + mat2[i][j];

            }
            System.out.println(""); // Prints a new line
        }

     */

        // Problem 5
    /*    int[] arr = {1, 2, 3, 4, 5, 6};
        int l = arr.length;
        int n = Math.floorDiv(l, 2);
        int temp;

        for (int i=0; i<n; i++){
            //swap a[i] and a[l-1-i]
            // a    b   temp
            // |4| |3| ||
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;
        }
        for (int element: arr){
            System.out.print(element + " ");
        }

     */
        // Problem 6
    /*    int[] arr = {1, 21, 3, 455, 5, 34, 67};
        int max = 0;
        for (int e: arr){
            if (e>max){
                max = e;
            }
        }
        System.out.println("The value of the maximum element in this array is " + max);

     */

        // Problem 8
        boolean isSorted = true;
        int [] arr = {1, 2, 3, 455, 5, 34, 67};
        for (int i=0; i<arr.length; i++){
            if (arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if (isSorted){
            System.out.println("The Array is Sorted");
        }
        else {
            System.out.println("The Array is not sorted");
        }


    }
}
