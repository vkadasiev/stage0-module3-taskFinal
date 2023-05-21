package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {

        int digit1 = (number / 1000) % 10;
        int digit2 = (number / 100) % 10;
        int digit3 = (number / 10) % 10;
        int digit4 = number % 10;

        int sum = digit1 + digit2 + digit3 + digit4;

        System.out.println(sum);

    }

    public static void main (String [] arg){
        DigitsSumCalculator calcNum = new DigitsSumCalculator();
        calcNum.calculateSum(4578);




    }
}



//You will be given a four-digit number your task will be to find the sum of all digits in the given number. Code snippet: