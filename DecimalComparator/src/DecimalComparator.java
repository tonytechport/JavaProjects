import java.text.*;

public class DecimalComparator {

    // Parsing is way too hard for decimals lol

    public static boolean areEqualByThreeDecimalPlaces(double x, double y){

        DecimalFormat df = new DecimalFormat("#.###");


        if(df.format(x) == df.format(y)){
            return true;
        }
        else{
            return false;
        }

    }

}
