public class Main {
    public static void main(String[] args) {
        System.out.println("Привет");
        System.out.println("Hello world");

        System.out.println("Задача1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 163789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("Задача2");
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("Задача3");
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("Задача4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        System.out.println("Задача5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        System.out.println("Задача6");
        var boxerFirst = 78.2;
        var boxerSecond = 82.7;
        var totalMassOfTwoFightersc = boxerFirst + boxerSecond;
        System.out.println(totalMassOfTwoFightersc);
        var differenceBetweenTheMassesOfFighters = boxerSecond - boxerFirst;
        System.out.println(differenceBetweenTheMassesOfFighters);

        System.out.println("Задача7");
        var balanceBetweenScales = boxerSecond%boxerFirst;
        System.out.println(balanceBetweenScales);

        System.out.println("Задача8");
        var workingHoursAreDividedBetweenEmployees = 640;
        var eachEmployeeIsDedicatedToWork = 8;
        var howManyWorkersInTotal = workingHoursAreDividedBetweenEmployees / eachEmployeeIsDedicatedToWork;
        System.out.println("Всего работников в компании - " + howManyWorkersInTotal + " человек");
        var manIsWorking = howManyWorkersInTotal + 94;
        var caat = manIsWorking / eachEmployeeIsDedicatedToWork;
        System.out.println("Если в компании работает " + manIsWorking + " человек, то всего "+ caat +" часов работы может быть поделено между сотрудниками");
    }
}