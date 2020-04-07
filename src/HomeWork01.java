public class HomeWork01 {
    /**
1. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат с плавающей точкой,
    где a, b, c, d – целочисленные входные параметры этого метода;*/

   public static double WorkOne(int a, int b, int c, int d) {
        return a * (b + (c / d));
       System.out.println("Результат вычисления равен " + return );
    }
    /**
2. Написать метод, принимающий на вход два целых числа, и проверяющий что их сумма
    лежит в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false; */
    static boolean WorkTwo(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) return true;
        System.out.println("*** Выражение истинно! ***");
        else return false;
        System.out.println("*** Выражение ложно! ***");
    }
/**
3. Написать метод, которому в качестве параметра передается целое число, метод должен проверить
    положительное ли число передали, или отрицательное. Замечание: ноль считаем положительным числом.
    Результат работы метода вывести в консоль */
    static void WorkThree(int a) {
       if (a >= 0)
           System.out.println(a + "Положительное");
         else
        System.out.println(a + "Отрицательное");
}
/**
4. Написать метод, которому в качестве параметра передается строка, обозначающая имя,
    метод должен вернуть приветственное сообщение «Привет, переданное_имя!»;
Вывести приветствие в консоль.*/
    static void WorkFour(String name) {
        System.out.println("Привет, " + name + "!");
}
/**
5. Написать метод, который определяет является ли год високосным.
        Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    Для проверки работы вывести результаты работы метода в консоль */
    static void WorkFive(int year) {
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0)))
            System.out.println(year + " Год не високосный");
        else
            System.out.println(year + " Год високосный");
    }
}
