package Chapter_8;

public class TryPlusCatchPlusFinally {

    /**
     * Нет исключения
     * Не заходим в catch, заходим в finally, продолжаем после оператора
     * @param args
     */
//    public static void main(String[] args) {
//        try {
//            System.err.print(" 0");
//            // nothing
//            System.err.print(" 1");
//        } catch(Error e) {
//            System.err.print(" 2");
//        } finally {
//            System.err.print(" 3");
//        }
//        System.err.print(" 4");
//    }

    /**
     * Есть исключение и есть подходящий catch
     * Заходим в catch, заходим в finally, продолжаем после оператора
     * @param args
     */
//    public static void main(String[] args) {
//        try {
//            System.err.print(" 0");
//            if (true) {throw new Error();}
//            System.err.print(" 1");
//        } catch(Error e) {
//            System.err.print(" 2");
//        } finally {
//            System.err.print(" 3");
//        }
//        System.err.print(" 4");
//    }

    /**
     * Есть исключение но нет подходящего catch
     * Не заходим в catch, заходим в finally, не продолжаем после оператора — вылетаем с неперехваченным исключением
     * @param args
     */
    public static void main(String[] args) {
        try {
            System.err.print(" 0");
            if (true) {throw new RuntimeException();}
            System.err.print(" 1");
        } catch(Error e) {
            System.err.print(" 2");
        } finally {
            System.err.print(" 3");
        }
        System.err.print(" 4");
    }
}
