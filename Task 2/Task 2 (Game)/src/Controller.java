import java.util.Scanner;

public class Controller {
    private final Model model;
    private final View view;

    public Controller (Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser(){
        Scanner sc = new Scanner (System.in);
        view.printMessage(View.START_GAME);
        int number, comparison;
        while ((comparison = (model.comparisonOfNumbers(number = inputInt(sc)))) != 0){
            view.printMessage(comparison, model.getBottom_bound(), model.getTop_bound(), model.getTry_list());
        }
        view.printMessage(number, model.getTry_list());

    }

    private int inputInt(Scanner sc){
        while ( !sc.hasNextInt ()){
            view.printMessage(View.INCORRECT_NUMBER_INPUT, model.getBottom_bound(), model.getTop_bound());
            sc.next ();
        }

        int attempt = sc.nextInt ();

        if (attempt <= model.getTop_bound() && attempt >= model.getBottom_bound()){
            return attempt;
        }
        else {
            view.printMessage(View.INCORRECT_NUMBER_INPUT, model.getBottom_bound(), model.getTop_bound());
            return inputInt(sc);
        }
    }
}
