public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int a = 5000;
        byte b = -120;
        short c = 32000;
        long d = 9000000;
        float e = 12.356f;
        double f = 15.56666666;
        System.out.println("Значение переменной с типом int равно " + a);
        System.out.println("Значение переменной с типом byte равно " + b);
        System.out.println("Значение переменной с типом short равно " + c);
        System.out.println("Значение переменной с типом long равно " + d);
        System.out.println("Значение переменной с типом float равно " + e);
        System.out.println("Значение переменной с типом double равно " + f);

    }

    public static void task2() {
        float a = 27.12f;
        long b = 987678965549l;
        float c = 2.786f;
        int d = 569;
        float e = -159;
        int f = 27897;
        byte g = 67;
    }

    public static void task3() {
        System.out.println("Задача 3");
        int LP = 23;
        int AS = 27;
        int EA = 30;
        int totalPaperList = 480;
        int paperList = totalPaperList / (LP + AS + EA);
        System.out.println("На каждого ученика рассчитано " + paperList + " листов бумаги ");
    }

    public static void task4() {
        System.out.println("Задача 4");
        int capacity2Min = 16;
        int capacity20Min = capacity2Min * 10;
        int capacityDay = capacity2Min / 2 * 60 * 24;
        int capacity3day = capacityDay * 3;
        int capacityMonth = capacityDay * 30;
        System.out.println("За 20 минут машина произвела " + capacity20Min + " штук бутылок»");
        System.out.println("За сутки машина произвела " + capacityDay + " штук бутылок»");
        System.out.println("За 3 дня машина произвела " + capacity3day + " штук бутылок»");
        System.out.println("За месяц машина произвела " + capacityMonth + " штук бутылок»");
    }

    public static void task5() {
        System.out.println("Задача 5");
        byte tin = 120;
        byte room = 120 / (4 + 2);
        byte brownTin = (byte) (4 * room);
        byte whiteTin = (byte) (2 * room);
        System.out.println("В школе, где " + room + " классов, нужно " + whiteTin + " банок белой краски и " + brownTin + " банок коричневой краски");
    }

    public static void task6() {
        System.out.println("Задача 6");
        int banana = 5 * 80;
        int milk = 2 * 105;
        int icecream = 2 * 100;
        int eggs = 4 * 70;
        int sumGr = banana + milk + icecream + eggs;
        int sumKg = sumGr/1000;
        System.out.println("Спортсмен сьедает в день "+sumKg+ " кг.");
    }
    public static void task7() {
        System.out.println("Задача 7");
        int days250 = 7*1000/250;
        int days500 = 7*1000/500;
        System.out.println("Чтобы достичь результата теряя каждый день по 250г, нужно "+days250+ " дней.");
        System.out.println("Чтобы достичь результата теряя каждый день по 500г, нужно "+days500+ " дней.");
    }
    public static void task8() {
        System.out.println("Задача 8");
        double salaryMasha = 67760;
        double salaryDenis = 83690;
        double salaryKristina = 76230;
        double newSalaryMasha = 67760 * 1.1;
        double newSalaryDenis = 83690 * 1.1;
        double newSalaryKristina = 76230 * 1.1;
        double newSalYearMasha = 67760 * 0.1 * 12;
        double newSalYearDenis = 83690 * 0.1 * 12;
        double newSalYearKristina = 76230 * 0.1 * 12;
        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на " + newSalYearMasha + " рублей");
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + newSalYearDenis + " рублей");
        System.out.println("Денис теперь получает " + newSalaryKristina + " рублей. Годовой доход вырос на " + newSalYearKristina + " рублей");
    }

}