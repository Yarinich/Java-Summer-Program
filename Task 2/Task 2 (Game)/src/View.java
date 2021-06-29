public class View {

    public static final String START_GAME = "Hello. You are playing an interesting game: \"Tracker\".\n" +
            "You have to guess the number between 0 and 100. " +
            "If you can't guess right away, tips will appear on the screen to help you win. \n" +
            "Let`s get started. Input your number: ";

    public static final String INCORRECT_NUMBER_INPUT = "\nYou enter incorrect data or number. " +
            "Your must enter a number, which must be in an interval (%d; %d). Try again: ";

    public static final String IF_NUMBER_LESS = "Your number is less than what was hidden. " +
            "Try entering a number in between %d and %d: ";

    public static final String IF_NUMBER_GREATER = "Your number is greater than what was hidden. " +
            "Try entering a number in between %d and %d: ";

    public static final String WIN_GAME = "\nYou win. The hidden number is %d.";

    public static final String YOUR_GUESSES = "\nYour guesses: %s \n";


    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printMessage(String message, int number1, int number2) {
        System.out.printf(message, number1, number2);
    }


    public void printMessage(int number, String guesses) {
        System.out.printf(WIN_GAME, number);
        System.out.printf(YOUR_GUESSES, guesses);
    }


    public void printMessage(int comparison, int top_bound, int bottom_bound, String  guesses) {
        System.out.printf(YOUR_GUESSES, guesses);

        if(comparison == 1) {
            System.out.printf(IF_NUMBER_GREATER, top_bound, bottom_bound);
        }
        else {
            System.out.printf(IF_NUMBER_LESS, top_bound, bottom_bound);
        }
    }


}
