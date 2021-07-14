package Chapter_1;

public class throwExample {
    /**
     * Правильне використання throw
     * @param args
     */
    public static void main(String[] args) {
        // Error - потомок Throwable
        throw new Error();
    }

    /**
     * Не правильне використання throw
     * @param args
     */
//    public static void main(String[] args) {
//        throw new String("Hello!");
//    }

    /**
     * throw потребує не null-aргумент, в іншому випадку буде NullPointerException
     * @param args
     */
//    public static void main(String[] args) {
//        throw null;
//    }

    /**
     * new && throw - дві незалежні операції
     * приклад їх окремого використання
     * @param args
     */
//    public static void main(String[] args) {
//        Error ref = new Error(); // создаем экземпляр
//        throw ref;               // "бросаем" его
//    }

    /**
     * чому StackOverflowError? через рекурсію, адже так як кожен раз виловлюється null,
     * то і виходить переповнення стеку
     * @param args
     */
//    public static void main(String[] args) {
//        f(null);
//    }
//    public static void f(NullPointerException e) {
//        try {
//            throw e;
//        } catch (NullPointerException npe) {
//            f(npe);
//        }
//    }
}
