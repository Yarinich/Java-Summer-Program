package Chapter_2;

/**
 * чому використовується System.err а не System.out
 */

public class ErrOrOut {
    public static void main(String[] args) {
        System.out.println("sout");
        throw new Error();
    }

//        public static void main(String[] args) {
//            System.err.println("sout");
//            throw new Error();
//        }
}
