class main
{
    public static int binary_search(int arr[],int size,int value)
    {
        int low = 0, high = size-1;
        while(low <= high)
        {
            int mid = (int)(low+high)/2;
            System.out.println(low+"   "+high+"    "+mid+"   "+arr[mid]);
            if(arr[mid] < value)
            {
                low = mid+1;
            }
            else if(arr[mid] > value)
            {
                high = mid;
            }
            else if(arr[mid] == value)
            {
                return mid;
            }
        }
        return 0;
    }
    public static void main (String[] args) 
    {
        int[] arr = new int[10];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        arr[5] = 60;
        arr[6] = 70;
        arr[7] = 80;
        arr[8] = 90;
        arr[9] = 100;
        System.out.println("Hello");
        int size = 10;
        int value = 40;
        int index_found = binary_search(arr,size,value);
        System.out.println(index_found);
    }
}
