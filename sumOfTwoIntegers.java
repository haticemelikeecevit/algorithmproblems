/*
Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.
*/
class sumOfTwoIntegers {
    public int getSum(int a, int b) {
        int negative = 1;
        if (b == -2147483648)
            negative = -1;
        if (a < 0){
            if (b < 0)
                negative = -1;
            else if(Math.abs(a) > b)
                negative = -1;
        }
        else if(b < 0 && Math.abs(b) > a){
            negative = -1;
        }
        int mult = 2 * a * b;
        a = a * a;
        b = b * b;
        int sum = mult + a + b;
        return (int)Math.sqrt(sum) * negative;
    }
}
