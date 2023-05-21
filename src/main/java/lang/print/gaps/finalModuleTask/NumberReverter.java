package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        String intToString = String.valueOf(number);
        StringBuilder revIntToString = new StringBuilder(intToString).reverse();

        System.out.println(revIntToString);

    }

    public static void main(String[] arg){
        NumberReverter reverted = new NumberReverter();
        reverted.revert(489);

    }
}


//Revert 3-digit number that will be passed (e.g.: given -> 489, expected -> 984) and print it. Code snippet: