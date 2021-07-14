package Chapter_7;

public class TryPlusFinalyy {
    /**
     * finally-секция получает управление, если try-блок завершился успешно
     * @param args
     */
//    public static void main(String[] args) {
//        try {
//            System.err.println("try");
//        } finally {
//            System.err.println("finally");
//        }
//    }

    /**
     * finally-секция получает управление, даже если try-блок завершился исключением
     * @param args
     */
//    public static void main(String[] args) {
//        try {
//            throw new RuntimeException();
//        } finally {
//            System.err.println("finally");
//        }
//    }

    /**
     * finally-секция получает управление, даже если try-блок завершился директивой выхода из метода
     * @param args
     */
//    public static void main(String[] args) {
//        try {
//            return;
//        } finally {
//            System.err.println("finally");
//        }
//    }

    /**
     * finally-секция НЕ вызывается только если мы «прибили» JVM
     * @param args
     */
//    public static void main(String[] args) {
//        try {
//            System.exit(42);
//        } finally {
//            System.err.println("finally");
//        }
//    }

    /**
     * System.exit(42) и Runtime.getRuntime().exit(42) — это синонимы
     * @param args
     */
//    public static void main(String[] args) {
//        try {
//            Runtime.getRuntime().exit(42);
//        } finally {
//            System.err.println("finally");
//        }
//    }

    /**
     * И при Runtime.getRuntime().halt(42) — тоже не успевает зайти в finally
     * @param args
     */
//    public static void main(String[] args) {
//        try {
//            Runtime.getRuntime().halt(42);
//        } finally {
//            System.err.println("finally");
//        }
//    }

    /**
     * Однако finally-секция не может «починить» try-блок завершившийся исключение
     * (заметьте, «more» — не выводится в консоль)
     * @param args
     */
//    public static void main(String[] args) {
//        try {
//            System.err.println("try");
//            if (true) {throw new RuntimeException();}
//        } finally {
//            System.err.println("finally");
//        }
//        System.err.println("more");
//    }

    /**
     * Трюк с «if (true) {...}» требуется,
     * так как иначе компилятор обнаруживает недостижимый код (последняя строка) и отказывается его компилировать
     * @param args
     */
//    public static void main(String[] args) {
//        try {
//            System.err.println("try");
//            throw new RuntimeException();
//        } finally {
//            System.err.println("finally");
//        }
//        System.err.println("more");
//    }

    /**
     * И finally-секция не может «предотвратить» выход из метода, если try-блок вызвал return
     * («more» — не выводится в консоль)
     * @param args
     */
//    public static void main(String[] args) {
//        try {
//            System.err.println("try");
//            if (true) {return;}
//        } finally {
//            System.err.println("finally");
//        }
//        System.err.println("more");
//    }

    /**
     * Однако finally-секция может «перебить» throw/return при помощи другого throw/return
     * @param args
     */
//    public static void main(String[] args) {
//        System.err.println(f());
//    }

//    public static int f() {
//        try {
//            return 0;
//        } finally {
//            return 1;
//        }
//    }

//    public static int f() {
//        try {
//            throw new RuntimeException();
//        } finally {
//            return 1;
//        }
//    }

//    public static int f() {
//        try {
//            return 0;
//        } finally {
//            throw new RuntimeException();
//        }
//    }

//    public static int f() {
//        try {
//            throw new Error();
//        } finally {
//            throw new RuntimeException();
//        }
//    }
}
