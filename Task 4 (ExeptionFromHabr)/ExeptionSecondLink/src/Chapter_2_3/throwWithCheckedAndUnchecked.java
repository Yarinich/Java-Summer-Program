package Chapter_2_3;

/**
 * связь между проверяемыми исключениями называют и throws — «пессимистичной»,
 * поскольку мы можем «напугать» о большем, чем может произойти на самом деле, но не наоборот
 */

import java.io.IOException;

public class throwWithCheckedAndUnchecked {

    /**
     * Мы не можем бросать, но не предупредить
     * @param args
     */
//    public static void main(String[] args) {
//        throw new Exception(); // тут ошибка компиляции
//    }

    /**
     * Мы не можем бросать, но предупредить о «меньшем»
     * @param args
     * @throws IOException
     */
//    public static void main(String[] args) throws IOException {
//        throw new Exception(); // тут ошибка компиляции
//    }

    /**
     * Мы можем предупредить точно о том, что бросаем
     * @param args
     * @throws Exception
     */
//    public static void main(String[] args) throws Exception { // предупреждаем о Exception
//        throw new Exception(); // и кидаем Exception
//    }

    /**
     * Мы можем предупредить о большем, чем мы бросаем
     * @param args
     * @throws Throwable
     */
//    public static void main(String[] args) throws Throwable { // предупреждаем "целом" Throwable
//        throw new Exception(); // а кидаем только Exception
//    }

    /**
     * Можем даже предупредить о том, чего вообще нет
     * @param args
     * @throws Exception
     */
//    public static void main(String[] args) throws Exception { // пугаем
//        // но ничего не бросаем
//    }

    /**
     * Даже если предупреждаем о том, чего нет — все обязаны бояться
     * @param args
     */
//    public static void main(String[] args) {
//        f(); // тут ошибка компиляции
//    }
//
//    public static void f() throws Exception {
//    }

    /**
     * Хотя они (испугавшиеся) могут перепугать остальных еще больше
     * @param args
     * @throws Throwable
     */
    // они пугают целым Throwable
//    public static void main(String[] args) throws Throwable {
//        f();
//    }
    // хотя мы пугали всего-лишь Exception
//    public static void f() throws Exception {
//    }

    /**
     * В чем цель «пессимистичности»? Все достаточно просто.
     * Вы в режиме протипирования «набросали», скажем, класс-утилиту для скачивания из интернета
     * и хотели бы «принудить» пользователей вашего класса УЖЕ ОБРАБАТЫВАТЬ возможное исключение IOException,
     * хотя из реализации-пустышки вы ПОКА НЕ ГЕНЕРИРУЕТЕ такое исключение. Но в будущем — собираетесь.
     */
//    public class InternetDownloader {
//    public static byte[] (String url) throws IOException {
//            return "<html><body>Nothing! It's stub!</body></html>".getBytes();
//        }
//    }



    /**
     * throws с непроверяемым (unckecked) исключением
     */



    /**
     * Вызов метода, который «пугает» unchecked исключением не накладывает на нас никаких обязанностей.
     *
     * Эта конструкция служит цели «указать» программисту-читателю кода на то,
     * что ваш метод может выбросить некоторое непроверяемое (unchecked) исключение.
     * @param args
     */
//    public static void main(String[] args) {
//        f();
//    }
//    public static void f() throws RuntimeException {
//    }

    /**
     * Пример (java.lang.NumberFormatException — непроверяемое исключение):
     * Integer.parseInt() может бросить unchecked NumberFormatException на неподходящем аргументе
     * (int k = Integer.parseInt(«123abc»)), это отразили
     * — в сигнатуре метода: throws NumberFormatException
     * — в документации (javadoc): @ exception
     * но это ни к чему нас не обязывает.
     */
//    public final class Integer extends Number implements Comparable<Integer> {
//    ...
//        /**
//         * ...
//         *
//         * @param s    a {@code String} containing the {@code int}
//         *             representation to be parsed
//         * @return     the integer value represented by the argument in decimal.
//         * @exception  NumberFormatException  if the string does not contain a
//         *               parsable integer.
//         */
//        public static int parseInt(String s) throws NumberFormatException {
//            return parseInt(s,10);
//        }
//    ...
//    }
}
