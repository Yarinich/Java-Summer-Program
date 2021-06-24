import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void inputWord() {
        Scanner scanner = new Scanner(System.in);
        model.setFirst_word(inputFirstWord(scanner));
        model.setSecond_word(inputSecondWord(scanner));
        view.printHelloMessage(model.getFirst_word() + " " + model.getSecond_word());
    }

    public String inputFirstWord(Scanner scanner) {
        view.printMessage(View.INPUT_FIRST_WORDS);
        String str = scanner.next();
        while(!str.equals("Hello")) {
            view.printMessage(View.INCORRECT_INPUT + View.INPUT_FIRST_WORDS);
            str = scanner.next();
        }
        return str;
    }

    public String inputSecondWord(Scanner scanner) {
        view.printMessage(View.INPUT_SECOND_WORDS);
        String str = scanner.next();
        while(!str.equals("world!")) {
            view.printMessage(View.INCORRECT_INPUT + View.INPUT_SECOND_WORDS);
            str = scanner.next();
        }
        return str;
    }

    public static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }
}
