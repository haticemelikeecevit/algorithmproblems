/*
Write a program that outputs the string representation of numbers from 1 to n.

But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”. For numbers which are multiples of both three and five output “FizzBuzz”.


*/
class fizzBuzz {
    public List<String> fizzBuzz(int n) {
        String s = "";
        ArrayList<String> returned = new ArrayList<String>();
        for (int i = 1; i <= n; i++){
            s = "";
            if (i % 15 == 0)
                s = "FizzBuzz";
            else if (i % 5 == 0)
                s = "Buzz";
            else if (i % 3  == 0)
                s = "Fizz";
            else
                s = s + i;
            returned.add(s);
        }
        return returned;
    }
}
