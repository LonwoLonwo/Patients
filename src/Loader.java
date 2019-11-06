import java.text.DecimalFormat;

public class Loader
{
    public static void main(String[] args) {
        double[] patientsTemperature = new double[30];
        arrayFilling(patientsTemperature);
        double middleTemperature = middleTemperatureSearch(patientsTemperature);
        DecimalFormat f = new DecimalFormat("##.00");
        System.out.println("Middle hospital temperature : " + f.format(middleTemperature));
        healthyPatientsSearch(patientsTemperature);
    }

    private static void arrayFilling(double[] array){
        for(int i = 0; i < array.length; i++){
            array[i] = 32 + Math.round((Math.random()*8)*10.0)/10.0;
            System.out.println(array[i]);
        }
    }

    private static double middleTemperatureSearch(double[] array){
        double sum = 0;
        for(double i : array){
            sum = sum + i;
        }
        return sum / array.length;
    }

    private static void healthyPatientsSearch(double[] array){
        int healthyPatientsCount = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] >= 36.2 && array[i] <= 36.9){
                healthyPatientsCount++;
                System.out.println("A patient number " + i + " is healthy! His temperature is: " + array[i] + "\u00b0");
            }
        }
        System.out.println("The number of healthy patients is: " + healthyPatientsCount);
    }
}
