package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public void toFahrenheit(int temperatureCelsius) {
    double fahrenheit = (temperatureCelsius * 9.0 / 5.0 ) + 32.0;
     System.out.println(fahrenheit);

    }

    public static void main(String[] arg){
        TemperatureConverter celsius = new TemperatureConverter();
        celsius.toFahrenheit(1);


    }
}



//You will be given temperature in celsius and your task will be to print this temperature in fahrenheit (formula will be required). Code snippet: