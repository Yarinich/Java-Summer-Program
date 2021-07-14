package Chapter_5;

/**
 * То, что исключения являются объектами важно для нас в двух моментах
 * 1. Они образуют иерархию с корнем java.lang.Throwable (java.lang.Object — предок java.lang.Throwable,
 * но Object — уже не исключение)
 * 2. Они могут иметь поля и методы (в этой статье это не будем использовать)
 */

public class TryPlusCatch {

    /**
     * catch — полиморфная конструкция, т.е. catch по типу Parent перехватывает летящие экземпляры любого типа,
     * который является Parent-ом (т.е. экземпляры непосредственно Parent-а или любого потомка Parent-а)
     * @param args
     */
//    public static void main(String[] args) {
//        try {
//            System.err.print(" 0");
//            if (true) {throw new RuntimeException();}
//            System.err.print(" 1");
//        } catch (Exception e) { // catch по Exception ПЕРЕХВАТЫВАЕТ RuntimeException
//            System.err.print(" 2");
//        }
//        System.err.println(" 3");
//    }

    /**
     * в блоке catch мы будем иметь ссылку типа Exception на объект типа RuntimeException
     * @param args
     */
//    public static void main(String[] args) {
//        try {
//            throw new RuntimeException();
//        } catch (Exception e) {
//            if (e instanceof RuntimeException) {
//                RuntimeException re = (RuntimeException) e;
//                System.err.print("Это RuntimeException на самом деле!!!");
//            } else {
//                System.err.print("В каком смысле не RuntimeException???");
//            }
//        }
//    }

    /**
     * catch по потомку не может поймать предка
     * @param args
     * @throws Exception
     */
//    public static void main(String[] args) throws Exception { // пока игнорируйте 'throws'
//        try {
//            System.err.print(" 0");
//            if (true) {throw new Exception();}
//            System.err.print(" 1");
//        } catch (RuntimeException e) {
//            System.err.print(" 2");
//        }
//        System.err.print(" 3");
//    }

    /**
     * catch по одному «брату» не может поймать другого «брата»
     * (Error и Exception не находятся в отношении предок-потомок, они из параллельных веток наследования от Throwable)
     * @param args
     */
//    public static void main(String[] args) {
//        try {
//            System.err.print(" 0");
//            if (true) {throw new Error();}
//            System.err.print(" 1");
//        } catch (Exception e) {
//            System.err.print(" 2");
//        }
//        System.err.print(" 3");
//    }

    /**
     * По предыдущим примерам — надеюсь вы обратили внимание, что если исключение перехвачено,
     * то JVM выполняет операторы идущие ПОСЛЕ последних скобок try+catch.
     * Но если не перехвачено, то мы
     * 1. не заходим в блок catch
     * 2. покидаем фрейм метода с летящим исключением
     *
     * А что будет, если мы зашли в catch, и потом бросили исключение ИЗ catch?
     *
     * В таком случае выполнение метода тоже прерывается (не печатаем «3»).
     * Новое исключение не имеет никакого отношения к try-catch
     * @param args
     */
//    public static void main(String[] args) {
//        try {
//            System.err.print(" 0");
//            if (true) {throw new RuntimeException();}
//            System.err.print(" 1");
//        } catch (RuntimeException e) {     // перехватили RuntimeException
//            System.err.print(" 2");
//            if (true) {throw new Error();} // но бросили Error
//        }
//        System.err.println(" 3");          // пропускаем - уже летит Error
//    }

    /**
     * Мы можем даже кинуть тот объект, что у нас есть «на руках»
     * @param args
     */
//    public static void main(String[] args) {
//        try {
//            System.err.print(" 0");
//            if (true) {throw new RuntimeException();}
//            System.err.print(" 1");
//        } catch (RuntimeException e) { // перехватили RuntimeException
//            System.err.print(" 2");
//            if (true) {throw e;}       // и бросили ВТОРОЙ раз ЕГО ЖЕ
//        }
//        System.err.println(" 3");      // пропускаем - опять летит RuntimeException
//    }

    /**
     * мы не попадем в другие секции catch, если они есть
     * Обратите внимание, мы не напечатали «3», хотя у нас летит Error а «ниже» расположен catch по Error.
     * Но важный момент в том, что catch имеет отношение исключительно к try-секции, но не к другим catch-секциям.
     * @param args
     */
//    public static void main(String[] args) {
//        try {
//            System.err.print(" 0");
//            if (true) {throw new RuntimeException();}
//            System.err.print(" 1");
//        } catch (RuntimeException e) {     // перехватили RuntimeException
//            System.err.print(" 2");
//            if (true) {throw new Error();} // и бросили новый Error
//        } catch (Error e) { // хотя есть cath по Error "ниже", но мы в него не попадаем
//            System.err.print(" 3");
//        }
//        System.err.println(" 4");
//    }

    /**
     * Как покажем ниже — можно строить вложенные конструкции, но вот пример, «исправляющий» эту ситуацию
     * @param args
     */
//    public static void main(String[] args) {
//        try {
//            System.err.print(" 0");
//            if (true) {throw new RuntimeException();}
//            System.err.print(" 1");
//        } catch (RuntimeException e) { // перехватили RuntimeException
//            System.err.print(" 2.1");
//            try {
//                System.err.print(" 2.2");
//                if (true) {throw new Error();} // и бросили новый Error
//                System.err.print(" 2.3");
//            } catch (Throwable t) {            // перехватили Error
//                System.err.print(" 2.4");
//            }
//            System.err.print(" 2.5");
//        } catch (Error e) { // хотя есть cath по Error "ниже", но мы в него не попадаем
//            System.err.print(" 3");
//        }
//        System.err.println(" 4");
//    }
}
