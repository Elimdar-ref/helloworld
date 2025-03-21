public class Main {
    public static void main(String[] args) {
        System.out.println("Привет");
        System.out.println();

        System.out.println("Задача1");
        byte a = 15;
        short b = 12566;
        int c = 7777777;
        long d = 8978784454L;
        float z = 2.55f;
        double x = 4.52555;
        System.out.println("Значение переменной a с типом byte равно " + a);
        System.out.println("Значение переменной b с типом short равно " + b);
        System.out.println("Значение переменной c с типом int  равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной z с типом float равно " + z);
        System.out.println("Значение переменной x с типом double равно " + x);
        System.out.println();

        System.out.println("Задача2");
        float q = 27.12F;
        long w = 987678965549L;
        double e = 2.786;
        short r = 569;
        short t = -159;
        short y = 27897;
        byte u = 67;
        System.out.println();

        System.out.println("Задача3");
        byte ludmila = 23;
        byte anna = 27;
        byte ekaterina = 30;
        short papers = 480;
        int oneStudent = papers / (ludmila + anna +ekaterina);
        System.out.println("На каждого ученика рассчитано " + oneStudent + " листов бумаги");
        System.out.println();

        System.out.println("Задача4");
        byte machinePerformanceBottles = 16;
        byte minut = 2;
        byte minutes_20 = 20;
        short perDay = 1440;
        short days_3 = 4320;
        int month = 131400;
        int oneminutes = machinePerformanceBottles / minut;
        int bottles = minutes_20 * oneminutes;
        int bottlesPerDay = perDay * oneminutes;
        int bottlesDays_3 = days_3 * oneminutes;
        int bottlesMonth = month * oneminutes;
        System.out.println("За " + minutes_20 + " минут машина произвела " + bottles + " штук бутылок");
        System.out.println("За " + perDay + " минут машина произвела " + bottlesPerDay + " штук бутылок");
        System.out.println("За " + days_3 + " минут машина произвела " + bottlesDays_3 + " штук бутылок");
        System.out.println("За " + month + " минут машина произвела " + bottlesMonth + " штук бутылок");
        System.out.println();

        System.out.println("Задача5");
        byte cansOfPaint = 120;
        byte oneClassWhite = 2;
        byte oneClassBrown = 4;
        int classes = cansOfPaint / (oneClassWhite + oneClassBrown);
        int white = classes * oneClassWhite;
        int brown = classes * oneClassBrown;
        System.out.println("В школе, где " + classes + " классов, нужно " + white + " банок белой краски и " + brown + " банок коричневой краски");
        System.out.println();

        System.out.println("Задача6");
        short bananas = 5 * 80;
        short milk = 200 * 105;
        short ice = 2 * 100;
        short eggs = 4 * 70;
        int weightNumberOfGrams = bananas + milk + ice + eggs;
        float weightNuantityKilograms = weightNumberOfGrams / 1000F;
        System.out.println("Вес завтрака составляет " + weightNumberOfGrams + " граммах");
        System.out.println("Вес завтрака составляет " + weightNuantityKilograms + " килограммах");
        System.out.println();

        System.out.println("Задача7");
        short oneDay = 250;
        short twoDay = 500;
        int weight = 7 * 1000;
        int uantityPerDay1 = weight / oneDay;
        int uantityPerDay2 = weight / twoDay;
        int averageDay = (uantityPerDay1 + uantityPerDay2) / 2;
        System.out.println("Если спортсмен будет терять каждый день по 250 грамм, то на похудение уйдет " + uantityPerDay1 + " дней");
        System.out.println("Если спортсмен будет терять каждый день по 500 грамм, то на похудение уйдет " + uantityPerDay2 + " дней");
        System.out.println("В среднем может потребоваться " + averageDay + " дней");
        System.out.println();

        System.out.println("Задача8");
        int masha = 67760;
        int deniz = 83690;
        int krictina = 76230;
        float increasedMasha = masha * 1.1F;
        float increasedDeniz = deniz * 1.1F;
        float increasedKrictina = krictina * 1.1F;
        float upMasha = masha * 12F;
        float upDeniz = deniz * 12F;
        float upKrictina = krictina * 12F;
        System.out.println("Маша теперь получает " + upMasha + " рублей. Годовой доход вырос на " + increasedMasha + " рублей");
        System.out.println("Маша теперь получает " + upDeniz + " рублей. Годовой доход вырос на " + increasedDeniz+ " рублей");
        System.out.println("Маша теперь получает " + upKrictina + " рублей. Годовой доход вырос на " + increasedKrictina + " рублей");
    }
}