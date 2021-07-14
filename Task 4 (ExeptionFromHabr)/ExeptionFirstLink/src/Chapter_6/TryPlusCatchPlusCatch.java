package Chapter_6;

/**
 * мы можем расположить несколько catch после одного try.
 */

public class TryPlusCatchPlusCatch {

    /**
     * Но есть такое правило — нельзя ставить потомка после предка!
     * @param args
     */
//    public static void main(String[] args) {
//        try {
//        } catch (Exception e) {
//        } catch (RuntimeException e) {
//        }
//    }

    /**
     * Ставить брата после брата — можно (RuntimeException после Error)
     * @param args
     */
//    public static void main(String[] args) {
//        try {
//        } catch (Error e) {
//        } catch (RuntimeException e) {
//        }
//    }

    /**
     * JVM идет сверху-вниз до тех пор, пока не найдет такой catch что в нем указано ваше исключение или его предок
     * — туда и заходит. Ниже — не идет.
     * @param args
     */
//    public static void main(String[] args) {
//        try {
//            throw new Exception();
//        } catch (RuntimeException e) {
//            System.err.println("catch RuntimeException");
//        } catch (Exception e) {
//            System.err.println("catch Exception");
//        } catch (Throwable e) {
//            System.err.println("catch Throwable");
//        }
//        System.err.println("next statement");
//    }

    /**
     * Выбор catch осуществляется в runtime (а не в compile-time), значит учитывается не тип ССЫЛКИ (Throwable),
     * а тип ССЫЛАЕМОГО (Exception)
     * @param args
     */
    public static void main(String[] args) {
        try {
            Throwable t = new Exception(); // ссылка типа Throwable указывает на объект типа Exception
            throw t;
        } catch (RuntimeException e) {
            System.err.println("catch RuntimeException");
        } catch (Exception e) {
            System.err.println("catch Exception");
        } catch (Throwable e) {
            System.err.println("catch Throwable");
        }
        System.err.println("next statement");
    }
}
