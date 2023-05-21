package lang.print.gaps.finalModuleTask;

public class NumbersPrinter {
    public void printIsPositive(int number) {
       boolean positive = number > 0; //true
       boolean negative = number < 0; //false

       System.out.println((positive || negative) && positive);


    }
    public static void main(String[] args) {
        NumbersPrinter printer = new NumbersPrinter();
        printer.printIsPositive(-15);


    }
}


//Implement program that will print if number is positive true, otherwise false (no if or ternary).