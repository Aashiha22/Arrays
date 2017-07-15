//2 sum problem -- Hash map method O(n)
import java.util.Collections; 
import java.util.HashMap;
class main
{
    public static boolean two_sum(int[] arr,int size, int sum)
    {
        boolean a = false;
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i=0;i<size;i++)
        {
            hm.put(arr[i],i);
            if(hm.get(sum-arr[i]) != null)
            {
                if(hm.get(sum-arr[i]) != i)
                    a = true;
            }
        }
        return a;
    }
    public static void main(String args[])
    {
        System.out.println("Hello");
        int[] arr = {1, 4, 45, 6, 10, -8};
        int sum = 49;
        int size = 6;
        boolean a = two_sum(arr,size,sum);
        System.out.println(a);
    }
}
