//Subarray series
//1) Return largest sum of the subsets --> Dynamic programming
class main
{
    public static int subset_sum(int[] arr, int size)
    {
        int max_curr=0, max_end=0;
        for(int i=0;i<size;i++)
        {
            max_curr = Math.max(max_curr+arr[i],arr[i]);
            max_end = Math.max(max_curr,max_end);
        }
        return max_end;
    }
    public static void main(String args[])
    {
        System.out.println("Largest subset sum problem");
        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        int size = arr.length;
        int sum = subset_sum(arr,size);
        System.out.println(sum);
    }
}
