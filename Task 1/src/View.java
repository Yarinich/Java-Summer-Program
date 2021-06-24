public class View {
    public static final String INPUT_FIRST_WORDS = "Input words \"Hello\": ";
    public static final String INPUT_SECOND_WORDS = "Input word \"world!\": ";
    public static final String INCORRECT_INPUT = "You must write the right word. Try again.";

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printHelloMessage(String message) {
        System.out.println("Well done. Your string: " + message);
    }
}
