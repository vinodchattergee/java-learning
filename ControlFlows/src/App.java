public class App {
    public static void main(String[] args) {
        boolean isDamaged = true;
        String carColor = "Red";
        char carEfficiencyCategory = 'A';
        // If Statement
        if (isDamaged)
            System.out.println("its a damaged class");
        else
            System.out.println("its a good car");
        // If else statement
        if (carColor.equals("Red"))
            System.out.println("The car colour is  red");
        else if (carColor.equals("purple"))
            System.out.println("The car colour is  purple");
        else if (carColor.equals("green"))
            System.out.println("The car colour is  green");
        else
            System.out.println("I have no idea on the colour of this car.");
        // switch cases

        switch (carEfficiencyCategory) {
            case 'A':
            case 'B':
                System.out.println("low energy consumption");
                break;
            case 'G':
                System.out.println("high energy consumption");
                break;
            default:
                System.out.println("energy consumption not defined");
        }
    }
}
