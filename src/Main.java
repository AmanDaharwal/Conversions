
import com.conversion.length.*;
import com.conversion.temparature.Celsius;
import com.conversion.temparature.Fahrenheit;
import com.conversion.temparature.Kelvin;
import com.conversion.temparature.Temperature;
import com.conversion.volume.Cup;
import com.conversion.volume.Volume;

public class Main {
    public static void main(String[] args) throws Exception {

        Temperature<Celsius> temp = new Temperature<Celsius>();
        temp.pairConversion(new Celsius());

        System.out.println("Celsius to fahrenheit - "+temp.convertToFahrenheit(20.0));

        Temperature<Fahrenheit> temp2 = new Temperature<Fahrenheit>();
        temp2.pairConversion(new Fahrenheit());

        System.out.println("Fahrenheit to Celsius - "+temp2.convertToCelsius(68.0));

        Temperature<Kelvin> temp3 = new Temperature<Kelvin>();
        temp3.pairConversion(new Kelvin());

        System.out.println("Fahrenheit to Celsius - "+temp3.convertToCelsius(68.0));

        Temperature<Kelvin> temp4 = new Temperature<Kelvin>();
        temp4.pairConversion(new Kelvin());

        System.out.println("Fahrenheit to Celsius - "+temp4.convertToFahrenheit(68.0));

        Length<Yard> length = new Length<Yard>();
        length.pairConversion(new Yard());

        System.out.println("Yard to Mile - "+length.convertToMile(2.0));

        System.out.println("Yard to Feet - "+length.convertToFeet(23.0));

        System.out.println("Yard to Inch - "+length.convertToInch(200.0));

        Length<Inch> length2 = new Length<Inch>();
        length2.pairConversion(new Inch());

        System.out.println("Inch to Mile - "+length2.convertToMile(10000.0));

        System.out.println("Inch to Feet - "+length2.convertToFeet(172.0));

        System.out.println("Inch to Yard - "+length2.convertToYard(12000.0));

        Length<Mile> length3 = new Length<Mile>();
        length3.pairConversion(new Mile());

        System.out.println("Mile to Inch - "+length3.convertToInch(3.0));

        System.out.println("Mile to Feet - "+length3.convertToFeet(5.0));

        System.out.println("Mile to Yard - "+length3.convertToYard(6.0));

        Length<Feet> length4 = new Length<Feet>();
        length4.pairConversion(new Feet());

        System.out.println("Feet to Inch - "+length4.convertToInch(1200.0));

        System.out.println("Feet to Mile - "+length4.convertToMile(1300.0));

        System.out.println("Feet to Yard - "+length4.convertToYard(1400.0));

        Volume<Cup> volume = new Volume<Cup>();
        volume.pairConversion(new Cup());

        System.out.println("Cup = Pint - "+volume.equivalentToPint(2.0));

        System.out.println("Cup = TeaSpoon - "+volume.equivalentToTeaSpoon(3.0));

        System.out.println("Cup = TableSpoon - "+volume.equivalentToTableSpoon(4.0));

    }
}