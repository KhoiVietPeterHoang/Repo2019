/*This is a function problem.You only need to complete the function given below*/
//User function Template for Java
/* The task is to complete bubble() which is used 
   in below bubbleSort() */
/* A function to implement bubble sort
void bubbleSort(int arr[], int n)
{
   for (int i = 0; i < n-1; i++)      
        bubble(arr, i, n);
} */
class BubbleSort
{
    static void bubble(int arr[], int i, int n)
    {

        // int n = arr.length;
        // for (int i = 0; i < n-1; i++)
        bubble(arr, i, n);


        if (arr[i] > arr[i+1]) {
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;

            // bubblesort(arr);
            System.out.println("Sorted through bubble sorting");
            // for(int i = 0; i < arr.length; i++);
            System.out.println(arr[i] + " ");


        }

    }

}