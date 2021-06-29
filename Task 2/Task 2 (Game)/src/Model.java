import java.util.ArrayList;

public class Model {
    private ArrayList <Integer> try_list;
    private int top_bound;
    private int bottom_bound;
    private int random_number;

    public Model () {
        try_list = new ArrayList<> ();
        top_bound = 100;
        bottom_bound = 0;
        random_number = (int)(Math.random ()*101);
    }

    public String getTry_list() {
        return try_list.toString();
    }

    public int getTop_bound() {
        return top_bound;
    }

    public int getBottom_bound() {
        return bottom_bound;
    }

    public int getRandom_number() {
        return random_number;
    }

    public void setTry_list(ArrayList<Integer> try_list) {
        this.try_list = try_list;
    }

    public void setTop_bound(int top_bound) {
        this.top_bound = top_bound;
    }

    public void setBottom_bound(int bottom_bound) {
        this.bottom_bound = bottom_bound;
    }

    public void setRandom_number(int random_number) {
        this.random_number = random_number;
    }

    public void addToArrayList(int number) {
        this.try_list.add(number);
    }

    public int comparisonOfNumbers(int number) {
        int comparison = Integer.compare(number, random_number);

        if (comparison == 0) {
            return comparison;
        }
        else if (comparison == 1) {
            top_bound = number;
            addToArrayList(number);
            return comparison;
        }
        else {
            bottom_bound = number;
            addToArrayList(number);
            return comparison;
        }
    }


}
