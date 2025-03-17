public class Main {
    public static void main(String[] args) {
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
        paper = paper -7639;
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
        var a = 78.2;
        var b = 82.7;
        var c = a + b;
        System.out.println(c);
        var d = b - a;
        System.out.println(d);

        System.out.println("Задача7");
        var z = b%a;
        System.out.println(z);

        System.out.println("Задача8");
        var x = 640;
        var v = 8;
        var n = x/v;
        System.out.println("Всего работников в компании - " + n + " человек");
        var hum = n + 94;
        var caat = hum/v;
        System.out.println("Если в компании работает "+ hum + " человек, то всего "+ caat +" часов работы может быть поделено между сотрудниками");
    }
}
