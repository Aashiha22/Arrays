class main
{
    static int n_index;
    public static int[] array_delete(int arr[], int size,int ele,int n_index)
    {
        int i=0;
        while((arr[i] != ele)&&(i<=n_index))
        {
            i++;
        }
        if(i == size)
        {
            return null;
        }
        System.out.println("i :  "+i);
        if(i<size)
        {
            int j;
            for(j=i;j<= n_index-1;j++)
            {
                arr[j] = arr[j+1];
            }
            arr[j] = 0;
        }
        return arr;
    }
    public static void main(String args[])
    {
        System.out.println("Hello");
        int[] arr = new int[10];
        arr[0] = 10;
        arr[1] = 11;
        arr[2] = 13;
        arr[3] = 15;
        arr[4] = 18;
        arr[5] = 21;
        int size = 10;
        int ele = 10;
        n_index = 5;
        arr = array_delete(arr,size,ele,n_index);
        for(int i=0;i<=size;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
