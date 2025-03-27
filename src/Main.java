public class Main {
    public static void main(String[] args) {
        System.out.println("Привет");
        System.out.println("Hello world");
        System.out.println();
        System.out.println("Задание №1");
        int age = 19;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " н не достиг совершеннолетия, " +
                    "нужно немного подождать");
        }
        System.out.println();
        System.out.println("Задание №2");
        int temperature = 5;
        if (temperature <= 5) {
            System.out.println("На улице " + temperature + " градусов, холодно, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, cегодня тепло, можно идти без шапки");
        }
        System.out.println();
        System.out.println("Задание №3");
        int speed = 59;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " то можно ездить спокойно");
        }
        System.out.println();
        System.out.println("Задание №4");
        int ageT = 17;
        if (ageT >= 2 && ageT <= 6) {
            System.out.println("Если возраст человека равен " + ageT + " то ему нужно ходить в детский сад");
        } else if (ageT >= 7 && ageT <= 17) {
                System.out.println("Если возраст человека равен " + ageT + " то ему нужно ходить в школу");
            } else if (ageT >= 18 && ageT <= 24) {
                    System.out.println("Если возраст человека равен " + ageT + " то его место в университете");
                } else if (ageT > 24) {
                        System.out.println("Если возраст человека равен " + ageT + " то ему пора ходить на работу");
                    }
                    System.out.println();
                    System.out.println("Задание №5");
                    int child = 15;
                    if (child < 5) {
                        System.out.println("Если возраст ребенка равен " + child + " то он не может кататься на " +
                                "аттракционе");
                    } else if (child >= 5 && child <= 14) {
                            System.out.println("Если возраст ребенка равен " + child + " то он может кататься только в " +
                                    "сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
                        } else if (child > 14) {
                                System.out.println("Если возраст ребенка равен " + child + " то он может кататься без " +
                                        "сопровождения взрослого.");
                                System.out.println();
                                System.out.println("Задание №6");
                                int trainCarriage = 103;
                                if (trainCarriage <= 60) {
                                    System.out.println("Вагон есть сидячее места");
                                } else if (trainCarriage <= 102) {
                                    System.out.println("Вагон есть стоячее места");
                                    } else {
                                    System.out.println("Вагон уже полностью забит");
                                    System.out.println();
                                    System.out.println("Задание №7");
                                    int one = 2;
                                    int two = 5;
                                    int three = 6;
                                    if (one > two && one > three) {
                                    System.out.println("Первое число самое большое");
                                    } else if (two > one && two > three) {
                                    System.out.println("Второе число самое большое");
                                    } else {
                                    System.out.println("Третье число самое большое");
                                        }
                                    }
                                }
                            }
                        }
