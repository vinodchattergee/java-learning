public class App {
    public static void main(String[] args) {
        sayHello();
    }

    static void sayHello() {
        System.out.println("Hi whats up?");
        punishmentWritting(5);
        getTenPercentDiscountOfPrice(20000);
        getDiscountOfPrice(5000, 5);
        getDiscountOfPrice(5000.5, 5);
        System.out.println("The energy consumption is : " + getEnergyConsumption('A'));
        System.out.println("The energy consumption is : " + getEnergyConsumption('B'));
        System.out.println("The energy consumption is : " + getEnergyConsumption('g'));
        System.out.println("The energy consumption is : " + getEnergyConsumption('Z'));
        getCarStatus("Honda BRV",1998,"Awsome");
    }

    static void punishmentWritting(int numberOfTimes) {
        for (int i = 1; i <= numberOfTimes; i++) {
            System.out.println(i + ". I will study well");
        }
    }

    static double getTenPercentDiscountOfPrice(int actualPrice) {
        double discount = 10 * actualPrice / 100.0;
        System.out.println("The 10% discounted price of " + actualPrice + " is INR " + discount);
        return discount;
    }

    // Overloading
    static double getDiscountOfPrice(int actualPrice, int percentage) {
        double discount = percentage * actualPrice / 100.0;
        System.out.println("The " + percentage + "% discounted price of " + actualPrice + " is INR " + discount);
        return discount;
    }


    static double getDiscountOfPrice(double actualPrice, int percentage) {
        double discount = percentage * actualPrice / 100;
        System.out.println("The " + percentage + "% discounted price of " + actualPrice + " is INR " + discount);
        return discount;
    }

    static String getEnergyConsumption(char energyCategory) {
        switch (Character.toUpperCase(energyCategory)) {
            case 'A':
                return "Very Low";
            case 'B':
                return "Low";
            case 'C':
                return "Normal";
            case 'D':
                return "Above Normal";
            case 'E':
                return "High";
            case 'F':
                return "Very High";
            case 'G':
                return "Extremely High";
            default:
                return "unknown";
        }
    }

    static void getCarStatus(String model, int productionYear, String condition) {
        System.out.println(" The car "+ model );
        System.out.println(" Production Year "+ productionYear );
        System.out.println(" Condition of the Car "+ condition );
    }

}