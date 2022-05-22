public class App {
    public static void main(String[] args) {
        byte numberOfSeats=5;
        byte numberOfDoors=3;
        byte numberOfVehicleOwners=1;
        byte emissionSticker=4;

        short power=362;
        short horsePower=492;
        short co2Emission=333;
        short cubicCapacity=6417;

        int price=29999;
        int mileage=14999;

        long registrationNumber=9223372036854775807L;


        float fuelConsumptionCombined=15.5F;
        float fuelConsumptionUrban=21.4F;
        float fuelConsumptionExtraUrban=13.6F;

        double fuelConsumptionPreciseAverage=13.64553435353453453453446546464645F;

        boolean isDamaged=true;

        char energyEfficiencyCategory='S';

        System.out.println( "Maruthi 800 ");
        System.out.println( "Price INR : " + price);
        System.out.println( "Mileage : " + mileage + " KM");
        System.out.println( "The car is damaged  : " + isDamaged);
        System.out.println( "Registration  : " + registrationNumber);
        System.out.println( "Cubic Capacity  : " + cubicCapacity);
        System.out.println( "Power  : " + power + " KW("+ horsePower+")");
        System.out.println( "CO2 Emission " + co2Emission + "g/km");
        System.out.println( "Emission Sticker " + emissionSticker + "(Energy efficient category "+ energyEfficiencyCategory  +")");
        System.out.println( "Combined fuel consumption " + fuelConsumptionCombined + " l/100KM");
        System.out.println( "Urban fuel consumption " + fuelConsumptionUrban + " l/100KM");
        System.out.println( "Extra urban fuel consumption " + fuelConsumptionExtraUrban + " l/100KM");
        System.out.println( "Precise average fuel consumption " + fuelConsumptionPreciseAverage + " l/100KM");
        System.out.println( "Number of previous owners  : " + numberOfVehicleOwners);
        System.out.println( "Number of doors : " + numberOfDoors);
        System.out.println( "Number of seats : " + numberOfSeats);



    }
}
