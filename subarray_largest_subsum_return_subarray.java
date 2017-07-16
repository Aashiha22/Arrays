//Subarray series
// 2) Return largest sum subarray of the subsets --> Dynamic programming
//Returning subarray in a array
class main
{
    public static int subset_sum(int[] arr, int size)
    {
        int max_curr=0, max_sum=0,start_index=0,stop_index=0;
        for(int i=0;i<size;i++)
        {
            int val = (arr[i]+max_curr);
            max_curr = Math.max(max_curr+arr[i],arr[i]);
            if(arr[i] > val)
            {
                start_index = i;
                stop_index = i;
            }
            int val2 = max_sum;
            max_sum = Math.max(max_curr,max_sum);
            
            if(max_curr > val2)
            {
                stop_index = i;
            }
        }
        
        for(int j=start_index;j<=stop_index;j++)
        {
            System.out.println(arr[j]);
        }
        return max_sum;
    }
    public static void main(String args[])
    {
        System.out.println("Largest subset sum problem");
        int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        int size = arr.length;
        int sum = subset_sum(arr,size);
        System.out.println("Sum : "+sum);
    }
}
