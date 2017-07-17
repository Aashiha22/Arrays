//GCD, LCM of 2 numbers
class main
{
    public static int gcd(int num1,int num2)  //Euclidean algorithm
    {
        int temp,a,b;
        if(num1 > num2)
        {
            a = num1;
            b = num2;
        }
        else
        {
            b = num1;
            a = num2;
        }
        while(b>0)
        {
            temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static int lcm(int num1, int num2)  //Reduction by gcd method
    {
        int gcd_res = gcd(num1,num2);             
        int lcm = (int)(num1*num2)/gcd_res;
        return lcm;
    }
    public static void main(String args[])
    {
        int num1=40, num2=64;
        int gcd = gcd(num1,num2);
        System.out.println("GCD : "+gcd);
        int lcm = lcm(num1,num2);
        System.out.println("LCM : "+lcm);
    }
}
