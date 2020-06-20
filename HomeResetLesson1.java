public class HomeResetLesson1 {
    public static void main(String[] args) {
        System.out.print (scrool());
        System.out.println(calc(1,2,3,4));
        System.out.println(comparison(5,5));
        System.out.println(integer(-20));
        System.out.println(integer1(10));
        hallo ("Вячеслав");
        leapYear(2028);
    }

    public static String scrool() {
        String resalt="";
                byte newbyte=127;
                short newshort=32767;
                int newint=2147483647;
                long newlong=9223372036854775807L;
                float newfloat = 120.0f;
                double newdouble = 15.72775;
                boolean newboolean = true;
                char newchar = 'C';
                resalt += ("newbyte = " + newbyte);
        resalt += ("newshort = " + newshort);
        resalt += ("newint = " + newint);
        resalt +=  ("newlong = " + newlong);
        resalt += ("newfloat = " + newfloat);
        resalt += ("newdouble = " + newdouble);
        resalt += ("newboolean = " + newboolean);
        resalt += ( "newchar = " + newchar);
        return resalt;
    }

    //3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    //где a, b, c, d – входные параметры этого метода
    public static float calc (int a,int b,int c,int d){
        return (float)a * ((float)b + ((float)c / (float)d));
    }

    //4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в
    //пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false
    public static boolean comparison (int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20)
        return true;
        else {
            return false;
        }
    }

    //5. Написать метод, которому в качестве параметра передается целое число, метод должен
    //напечатать в консоль положительное ли число передали, или отрицательное; Замечание:
    //ноль считаем положительным числом.
    public static String integer (int a) {
        String resalt ="";
        if (a >= 0) {
            resalt += ("Число " + a +" полжительное");
        }
        else {
            resalt += ("Число " + a + " отрицательное");
        }
        return resalt;
    }

    //6. Написать метод, которому в качестве параметра передается целое число, метод должен
    //вернуть true, если число отрицательное
    public static boolean integer1 (int a) {
               if (a < 0) {
           return true;
        }
        else {
            return false;
        }
    }
    //7. Написать метод, которому в качестве параметра передается строка, обозначающая имя,
    //метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
    public static void hallo (String youname) {
        System.out.println("Привет, " + youname + "!");
    }

    //8*. Написать метод, который определяет является ли год високосным, и выводит сообщение в
    //консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й –
    //високосный.
    private static void leapYear (int year){
        boolean myLeapYear=false;

        if ( (year % 4 == 0) && ( (year % 100 != 0) || (year % 400 == 0) ) ) myLeapYear=true;

        if (myLeapYear)
            System.out.println("Год " + year + " високосный!");
        else
            System.out.println("Год " + year + " не високосный!");
    }


}
