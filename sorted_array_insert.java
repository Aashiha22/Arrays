class main
{
    static int n_index;
    public static int[] array_insert(int arr[], int size,int ele,int n_index)
    {
        int i=0;
        while(arr[i] <= ele)
        {
            i++;
        }
        if(i<size)
        {
            for(int j=n_index;j>=i;j--)
            {
                arr[j+1] = arr[j];
            }
            arr[i] = ele;
        }
        n_index = n_index+1;
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
        int ele = 14;
        n_index = 5;
        arr = array_insert(arr,size,ele,n_index);
        System.out.println(n_index);
        for(int i=0;i<=size;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
