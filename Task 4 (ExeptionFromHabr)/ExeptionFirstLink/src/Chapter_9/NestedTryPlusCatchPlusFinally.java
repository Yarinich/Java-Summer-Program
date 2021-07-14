package Chapter_9;

public class NestedTryPlusCatchPlusFinally {
    /**
     * Вложенный try-catch-finally без исключения
     * Мы НЕ заходим в обе catch-секции (нет исключения),
     * заходим в обе finally-секции и выполняем обе строки ПОСЛЕ finally.
     * @param args
     */
//    public static void main(String[] args) {
//        try {
//            System.err.print(" 0");
//            try {
//                System.err.print(" 1");
//                // НИЧЕГО
//                System.err.print(" 2");
//            } catch (RuntimeException e) {
//                System.err.print(" 3"); // НЕ заходим - нет исключения
//            } finally {
//                System.err.print(" 4"); // заходим всегда
//            }
//            System.err.print(" 5");     // заходим - выполнение в норме
//        } catch (Exception e) {
//            System.err.print(" 6");     // НЕ заходим - нет исключения
//        } finally {
//            System.err.print(" 7");     // заходим всегда
//        }
//        System.err.print(" 8");         // заходим - выполнение в норме
//    }

    /**
     * Вложенный try-catch-finally с исключением, которое ПЕРЕХВАТИТ ВНУТРЕННИЙ catch
     * Мы заходим в ПЕРВУЮ catch-секцию (печатаем «3»),
     * но НЕ заходим во ВТОРУЮ catch-секцию (НЕ печатаем «6», так как исключение УЖЕ перехвачено первым catch),
     * заходим в обе finally-секции (печатаем «4» и «7»),
     * в обоих случаях выполняем код после finally (печатаем «5»и «8», так как исключение остановлено еще первым catch).
     * @param args
     */
//    public static void main(String[] args) {
//        try {
//            System.err.print(" 0");
//            try {
//                System.err.print(" 1");
//                if (true) {throw new RuntimeException();}
//                System.err.print(" 2");
//            } catch (RuntimeException e) {
//                System.err.print(" 3"); // ЗАХОДИМ - есть исключение
//            } finally {
//                System.err.print(" 4"); // заходим всегда
//            }
//            System.err.print(" 5");     // заходим - выполнение УЖЕ в норме
//        } catch (Exception e) {
//            System.err.print(" 6");     // не заходим - нет исключения, УЖЕ перехвачено
//        } finally {
//            System.err.print(" 7");     // заходим всегда
//        }
//        System.err.print(" 8");         // заходим - выполнение УЖЕ в норме
//    }

    /**
     * Вложенный try-catch-finally с исключением, которое ПЕРЕХВАТИТ ВНЕШНИЙ catch
     * Мы НЕ заходим в ПЕРВУЮ catch-секцию (не печатаем «3»),
     * но заходим в ВТОРУЮ catch-секцию (печатаем «6»), заходим в обе finally-секции (печатаем «4» и «7»),
     * в ПЕРВОМ случае НЕ выполняем код ПОСЛЕ finally (не печатаем «5», так как исключение НЕ остановлено),
     * во ВТОРОМ случае выполняем код после finally (печатаем «8», так как исключение остановлено).
     * @param args
     */
//    public static void main(String[] args) {
//        try {
//            System.err.print(" 0");
//            try {
//                System.err.print(" 1");
//                if (true) {throw new Exception();}
//                System.err.print(" 2");
//            } catch (RuntimeException e) {
//                System.err.print(" 3"); // НЕ заходим - есть исключение, но НЕПОДХОДЯЩЕГО ТИПА
//            } finally {
//                System.err.print(" 4"); // заходим всегда
//            }
//            System.err.print(" 5");     // не заходим - выполнение НЕ в норме
//        } catch (Exception e) {
//            System.err.print(" 6");     // ЗАХОДИМ - есть подходящее исключение
//        } finally {
//            System.err.print(" 7");     // заходим всегда
//        }
//        System.err.print(" 8");         // заходим - выполнение УЖЕ в норме
//    }

    /**
     * Вложенный try-catch-finally с исключением, которое НИКТО НЕ ПЕРЕХВАТИТ
     * Мы НЕ заходим в ОБЕ catch-секции (не печатаем «3» и «6»),
     * заходим в обе finally-секции (печатаем «4» и «7»)
     * и в обоих случаях НЕ выполняем код ПОСЛЕ finally (не печатаем «5» и «8», так как исключение НЕ остановлено),
     * выполнение метода прерывается по исключению.
     * @param args
     */
    public static void main(String[] args) {
        try {
            System.err.print(" 0");
            try {
                System.err.print(" 1");
                if (true) {throw new Error();}
                System.err.print(" 2");
            } catch (RuntimeException e) {
                System.err.print(" 3"); // НЕ заходим - есть исключение, но НЕПОДХОДЯЩЕГО ТИПА
            } finally {
                System.err.print(" 4"); // заходим всегда
            }
            System.err.print(" 5");     // НЕ заходим - выполнение НЕ в норме
        } catch (Exception e) {
            System.err.print(" 6");     // не заходим - есть исключение, но НЕПОДХОДЯЩЕГО ТИПА
        } finally {
            System.err.print(" 7");     // заходим всегда
        }
        System.err.print(" 8");         // не заходим - выполнение НЕ в норме
    }
}
