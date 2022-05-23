public class App {
    public static void main(String[] args) {
        System.out.println("Who is named as the father of the light bulb?");
        char rightAnswer='C';

        switch(rightAnswer) {
            case 'C':
                System.out.println("Your answer is right! The answer is option C Thomas Edison");
                break;
            default:
                System.out.println("Your answer is wrong! Sorry.");
        }

    }
}
