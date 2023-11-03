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
        int a = 36;
        byte b = 126;
        short c = 30967;
        long d = 4736298763847264530L;
        float e = 2.1f;
        double f = 22.846;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }

    public static void task2 () {
        System.out.println("Задача 2");
        double a = 27.12;
        long b = 987678965549L;
        float c = 2.786F;
        short d = 569;
        short e = -159;
        short f = 27897;
        byte g = 67;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
    }

    public static void task3 () {
        System.out.println("Задача 3");
        int studentsOfLudmilaPavlovna = 23;
        int studentsOfAnnaSergeevna = 27;
        int studentsOfEkaterinaAndreevna = 30;
        int allPaper = 480;
        int allStudents = studentsOfLudmilaPavlovna + studentsOfAnnaSergeevna + studentsOfEkaterinaAndreevna;
        System.out.println("Всего " + allStudents + " учеников");
        int everyStudent = allPaper / allStudents;
        System.out.println("Каждому ученику достанется по " + everyStudent + " листов");
    }

    public static void task4 () {
        byte bottlesInTwoMinute = 16;
        int bottlesInTwentyMinute = bottlesInTwoMinute * 10;
        System.out.println("За двадцать минут будет произведено " + bottlesInTwentyMinute + " бутылок");
        int bottlesInDay = bottlesInTwoMinute * 720;
        System.out.println("За сутки " + bottlesInDay + " бутылок");
        int bottlesInThreeDay = bottlesInTwoMinute * 2160;
        System.out.println("За трое суток " + bottlesInThreeDay + " бутылок");
        int bottledInMouth = bottlesInTwoMinute * 44640;
        System.out.println("За месяц " + bottledInMouth + " бутылок");

    }

    public static void task5 () {
        byte totalPaint = 120;
        byte whitePaintForOneClass = 2;
        byte brownPaintForOneClass = 4;
        int allPaintsForOneClass = (whitePaintForOneClass + brownPaintForOneClass);
        System.out.println("Всего краски на один класс " + allPaintsForOneClass + " банок");
        int classesAtSchool = totalPaint /6;
        System.out.println("Всего в школе " + classesAtSchool + " классов");
        int whiteForEveryClass = whitePaintForOneClass * 20;
        int brownForEveryClass = brownPaintForOneClass * 20;
        System.out.println("На один кабинет требуется " + brownForEveryClass + " банок коричневой и " + whiteForEveryClass + " белой краски");

    }

    public static void task6 () {
        byte bananas = 5;
        byte weightOneBananaGr = 80;
        int milk = 200;
        byte weight100MlMilkGr = 105;
        byte iceCream = 2;
        byte weightIceCreamGr = 100;
        byte eggs = 4;
        byte weightEggsGr = 70;
        int totalWeightBreakfastGr = bananas * weightOneBananaGr + weight100MlMilkGr * 2 + iceCream * weightIceCreamGr + eggs * weightEggsGr;
        System.out.println("В завтраке " + totalWeightBreakfastGr + " грамм");
        float totalWeightBreakfastKg = totalWeightBreakfastGr / 1000;
        System.out.println("В завтраке " + totalWeightBreakfastKg + " килограмм");

    }

    public static void task7 () {
        byte totalWeightKg = 7;
        int totalWeightGr = totalWeightKg * 1000;
        short weightGr1 = 250;
        short weightGr2 = 500;
        int daysInTheFirstOption = totalWeightGr / weightGr1;
        System.out.println("Потребуется " + daysInTheFirstOption + " дней при сжигании 250 грамм в день");
        int daysInTheSecondOption = totalWeightGr / weightGr2;
        System.out.println("Потребуется " + daysInTheSecondOption + " дней при сжигании 500 грамм в день");
        int average = (daysInTheFirstOption + daysInTheSecondOption) / 2;
        System.out.println("Потребуется " + average + " дней в среднем");

    }

    public static void task8 () {
        int salaryMounthMaria = 67760;
        int salaryMounthDenis = 83690;
        int salaryMounthKristina = 76230;
        float increase = 1.1f;
        int year = 12;
        int newSalaryMounthMaria = (int) (salaryMounthMaria* increase );
        int newSalaryMounthDenis = (int) (salaryMounthMaria* increase );
        int newSalaryMounthKristina = (int) (salaryMounthMaria* increase );
        int differenseMaria = (newSalaryMounthMaria % salaryMounthMaria) *12;
        int differenseDenis = (newSalaryMounthDenis % salaryMounthMaria) *12;
        int differenseKristina = (newSalaryMounthKristina % salaryMounthMaria) *12;
        System.out.println("Годовая разница зарплаты Марии: " + differenseMaria + " ,новая месячная зарплата: " + newSalaryMounthMaria);
        System.out.println("Годовая разница зарплаты Дениса: " + differenseDenis + " ,новая месячная зарплата: " + newSalaryMounthDenis);
        System.out.println("Годовая разница зарплаты Кристины: " + differenseKristina + " ,новая месячная зарплата: " + newSalaryMounthKristina);

    }