//GCD, LCM - array of numbers
class main
{
    public static int gcd(int num1, int num2)
    {
        int temp,a,b;
        if(num1 > num2)
        {
            a=num1;
            b=num2;
        }
        else
        {
            a=num2;
            b=num1;
        }
        while(b>0)
        {
            temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static int lcm(int num1,int num2)
    {
        int lcm = (int)(num1*num2)/gcd(num1,num2);
        return lcm;
    }
    public static void main(String args[])
    {
        int arr[] = {2,4,8};
        //GCD
        int res = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            res = gcd(res, arr[i]);
        }
        System.out.println("GCD of array : "+res);
        //LCM
        int res1 = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            res1 = lcm(res1,arr[i]);
        }
        System.out.println("LCM of array : "+res1);
    }
}
