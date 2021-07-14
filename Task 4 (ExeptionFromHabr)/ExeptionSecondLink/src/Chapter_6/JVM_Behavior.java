package Chapter_6;

/**
 * Необходимо понимать, что
 * — проверка на cheched исключения происходит в момент компиляции (compile-time checking)
 * — перехват исключений (catch) происходит в момент выполнения (runtime checking)
 */
public class JVM_Behavior {
//    // пугаем Exception
//    public static void main(String[] args) throws Exception {
//        Throwable t = new Exception(); // и лететь будет Exception
//        throw t; // но тут ошибка компиляции
//    }

//    public static void main(String[] args) throws Exception {
//        Object ref = "Hello!";  // ref указывает на строку
//        char c = ref.charAt(0); // но тут ошибка компиляции
//    }

    /**
     * Компилятор не пропустит этот код, хотя метод main ГАРАНТИРОВАННО НЕ ВЫБРОСИТ ИСКЛЮЧЕНИЯ
     * @param args
     * @throws Exception
     */
    // пугаем Exception
//    public static void main(String[] args) throws Exception {
//        try {
//            Throwable t = new Exception(); // и лететь будет Exception
//            throw t; // но тут ошибка компиляции
//        } catch (Exception e) {
//            System.out.println("Перехвачено!");
//        }
//    }

    // ТЕПЕРЬ пугаем Throwable
    public static void main(String[] args) throws Throwable {
        try {
            Throwable t = new Exception(); // а лететь будет Exception
            throw t;
        } catch (Exception e) { // и мы перехватим Exception
            System.out.println("Перехвачено!");
        }
    }
}
