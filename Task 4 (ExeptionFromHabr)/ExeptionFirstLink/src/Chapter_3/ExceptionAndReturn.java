package Chapter_3;

public class ExceptionAndReturn {

    /**
     *Приклади функцій, котрі повинні щось повертати, і як компілятор наглядає, щоб ця умова виконувалася
     */

//    public static double sqr(double arg) { // надо double
//        return arg * arg;                 // double * double - это double
//    }


//    public static double sqr(double arg) { // надо double
//        int k = 1;                        // есть int
//        return k;                        // можно неявно преобразовать int в double
//    }


// на самом деле, компилятор сгенерирует байт-код для следующих исходников
//        public static double sqr(double arg) { // надо double
//            int k = 1;                        // есть int
//            return (double) k;               // явное преобразование int в double
//        }


//    public static double sqr(double arg) {
//        return "hello!";                  // помилка, адже повертається String а треба double
//    }


//    public static double sqr(double arg) {
//    }                                     // помилка: немає return


//не підійде, адже компілятор не впевнений, що точно буде повернення
//    public static double sqr(double arg) {
//        if (System.currentTimeMillis() % 2 == 0) {
//            return arg * arg; // если currentTimeMillis() - четное число, то все ОК
//        }
//        // а если нечетное, что нам возвращать?
//    }


// компілятор слідкує, щоб щось точно поверталося, адже що тоді має бути виведено на екран?
//    public static void main(String[] args) {
//        double d = sqr(10.0); // ну, и чему равно d?
//        System.out.println(d);
//    }
//    public static double sqr(double arg) {
//        // nothing
//    }


//можна нічого не повертати, але "повісити метод" (нічого не буде виконуватися, а комп'ютер задовбеться чекати)
//    public static double sqr(double arg) {
//        while (true); // Удивительно, но КОМПИЛИРУЕТСЯ!
//    }


//аналогічний приклад до попереднього - метод зависне
//    public static void main(String[] args) {
//        double d = sqr(10.0);  // sqr - навсегда "повиснет", и
//        System.out.println(d); // d - НИКОГДА НИЧЕГО НЕ БУДЕТ ПРИСВОЕНО!
//    }
//    public static double sqr(double arg) {
//        while (true); // Вот тут мы на века "повисли"
//    }


//компілятор пропускає "розвилку": або подвоюємо або висимо
//    public static double sqr(double arg) {
//        if (System.currentTimeMillis() % 2 == 0) {
//            return arg * arg; // ну ладно, вот твой double
//        } else {
//            while (true);     // а тут "виснем" навсегда
//        }
//    }


//але механізм виключень дозволяє НІЧОГО НЕ ПОВЕРТАТИ
//    public static double sqr(double arg) {
//        throw new RuntimeException();
//    }


//тому з всього вище перечисленого у нас є 3 варіанти для компілятора
//    public static double sqr(double arg) {// согласно объявлению метода ты должен вернуть double
//        if (arg == 0) {
//            return arg * arg;             // ок, вот твой double
//        }
//        else if (arg == 1) {
//                while (true) ;                 // не, я решил "повиснуть"
//        }
//        else {
//                throw new RuntimeException(); // или бросить исключение
//        }
//    }

    /**
     * main для усіх функцій вище
      * @param args
     */
//    public static void main(String[] args) {
//        System.out.println(sqr(10));
//    }


    /**
     * Приклад програми, яка має повертати double, але кидає exception
     */
    public static void main(String[] args) {
        // sqr - "сломается" (из него "выскочит" исключение),
        double d = sqr(10.0);  // выполнение метода main() прервется в этой строчке и
        // d - НИКОГДА НИЧЕГО НЕ БУДЕТ ПРИСВОЕНО!
        System.out.println(d); // и печатать нам ничего не придется!
    }
    public static double sqr(double arg) {
        throw new RuntimeException(); // "бросаем" исключение
    }
}
