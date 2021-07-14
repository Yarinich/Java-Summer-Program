package Chapter_4;

/**
 * Рассмотрим ситуацию с кодом, который может бросать проверяемые исключения разных типов.
 * Далее учитывайте, что EOFException и FileNotFoundException — потомки IOException.
 */

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;


public class NumerousException {

    /**
     * Мы можем точно указать, что выбрасываем
     * @param args
     * @throws EOFException
     * @throws FileNotFoundException
     */
    // пугаем ОБОИМИ исключениями
//    public static void main(String[] args) throws EOFException, FileNotFoundException {
//        if (System.currentTimeMillis() % 2 == 0) {
//            throw new EOFException();
//        } else {
//            throw new FileNotFoundException();
//        }
//    }

    // пугаем ОБОИМИ исключениями
//    public static void main(String[] args) throws EOFException, FileNotFoundException {
//        f0();
//        f1();
//    }
//    public static void f0() throws EOFException {...}
//    public static void f1() throws FileNotFoundException {...}

    /**
     * А можем «испугать» сильнее (предком обоих исключений)
     * @param args
     * @throws IOException
     */
    // пугаем ПРЕДКОМ исключений
//    public static void main(String[] args) throws IOException {
//        if (System.currentTimeMillis() % 2 == 0) {
//            throw new EOFException();
//        } else {
//            throw new FileNotFoundException();
//        }
//    }

    // пугаем ПРЕДКОМ исключений
//    public static void main(String[] args) throws IOException {
//        f0();
//        f1();
//    }
//    public static void f0() throws EOFException {...}
//    public static void f1() throws FileNotFoundException {...}

    /**
     * Можно и вот так: EOFException и FileNotFoundException «обобщаем до» IOException,
     * а InterruptedException «пропускаем нетронутым» (InterruptedException — НЕ потомок IOException)
     * @param args
     * @throws IOException
     * @throws InterruptedException
     */
//    public static void main(String[] args) throws IOException, InterruptedException {
//        f0();
//        f1();
//        f2();
//    }
//    public static void f0() throws EOFException {...}
//    public static void f1() throws FileNotFoundException {...}
//    public static void f2() throws InterruptedException {...}
}
