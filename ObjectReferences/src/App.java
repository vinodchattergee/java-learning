import java.sql.SQLOutput;
import java.util.Locale;

public class App {
    public static void main(String[] args) {
        Byte numberOfSeats = 5;
        Byte numberOfDoors = 3;
        Byte numberOfVehicleOwners = 1;
        Byte emissionSticker = 4;

        Short power = 362;
        Short horsePower = 492;
        Short co2Emission = 333;
        Short cubicCapacity = 6417;

        Integer price = 29999;
        Integer mileage = 14999;

        Long  registrationNumber = 9223372036854775807L;


        Float  fuelConsumptionCombined = 15.5F;
        Float  fuelConsumptionUrban = 21.4F;
        Float  fuelConsumptionExtraUrban = 13.6F;

        Double fuelConsumptionPreciseAverage = 13.64553435353453453453446546464645;

        Boolean isDamaged = true;

        Character energyEfficiencyCategory = 'S';

        String carModel="Maruthi 800";

        System.out.println("Car Model " + carModel);
        System.out.println("Price INR : " + price);
        System.out.println("Mileage : " + mileage + " KM");
        System.out.println("The car is damaged  : " + isDamaged);
        System.out.println("Registration  : " + registrationNumber);
        System.out.println("Cubic Capacity  : " + cubicCapacity);
        System.out.println("Power  : " + power + " KW(" + horsePower + ")");
        System.out.println("CO2 Emission " + co2Emission + "g/km");
        System.out.println("Emission Sticker " + emissionSticker + "(Energy efficient category " + energyEfficiencyCategory + ")");
        System.out.println("Combined fuel consumption " + fuelConsumptionCombined + " l/100KM");
        System.out.println("Urban fuel consumption " + fuelConsumptionUrban + " l/100KM");
        System.out.println("Extra urban fuel consumption " + fuelConsumptionExtraUrban + " l/100KM");
        System.out.println("Precise average fuel consumption " + fuelConsumptionPreciseAverage + " l/100KM");
        System.out.println("Number of previous owners  : " + numberOfVehicleOwners);
        System.out.println("Number of doors : " + numberOfDoors);
        System.out.println("Number of seats : " + numberOfSeats);

        System.out.println("The object references have behaviour as well example methods or functions");
        System.out.println("Price INR : " + price + " and this is its float value " + price.floatValue());
        System.out.println("Combined fuel consumption " + fuelConsumptionCombined + " l/100KM and this is its integer value " + fuelConsumptionCombined.intValue());
        System.out.println("Car Model with upper case "+ carModel.toUpperCase());
        System.out.println("Car Model with lower case "+ carModel.toLowerCase());
        System.out.println("Is the string with upper and lower are same?  "+ carModel.equals(carModel.toUpperCase()));

    }
}
