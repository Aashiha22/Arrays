//Majority element if count in array > n/2 //Output: atmost 1 element in a array
// Using Hash Map O(N)

import java.util.*;
import java.util.Arrays;
class main
{
    public static int[] majority(int[] arr, int size)
    {
        int[] out = new int[size];
        int index = 0;
        int n = (int)size/2;
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i=0;i<size;i++)
        {
            if(hm.get(arr[i]) != null)
            {
                int val = (int)hm.get(arr[i]);
                hm.put(arr[i],val+1);
            }
            else
            {
                hm.put(arr[i],1);
            }
        }
        Set set = hm.entrySet();
        Iterator itr = set.iterator();
        while(itr.hasNext())
        {
            Map.Entry me = (Map.Entry)itr.next();
            if((int)me.getValue() > n)
            {
                out[index] = (int)me.getKey();
                index = index + 1;
            }
        }
        for(int j=0;j<index;j++)
        {
            System.out.println(out[j]);
        }
        return out;
    }
    public static void main(String args[])
    {
        System.out.println("Hello");
        int[] arr = {1, 3, 3, 1, 2, 3,3};
        int size = arr.length;
        int[] out = majority(arr,size);
    }    
}
