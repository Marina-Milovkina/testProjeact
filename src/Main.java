
// метод main - точка входа в программу, компьютер понимает это как "начинай отсюда"
public class Main {
    public static void main(String[] args) {
        // создаем массив котов через метод createCats из класса Cat
        Cat[] cats = Cat.createCats();

        // выводим информацию о коте через getInfo
        for (int i = 0; i < cats.length; i++) {
            System.out.println(cats[i].getInfo());
        // перебираем массив котов и вызываем их методы
        // for (int i = 0; i < cats.length; i++) {
            // выводим информацию о коте
          //  System.out.println("Имя: " + cats[i].getName() + ", цвет: " + cats[i].getColor() +
          //          ", возраст: " + cats[i].getAge());

            // вызываем методы для каждого кота
            cats[i].meow();
            cats[i].sleep();
            cats[i].checkAge();
        }

        // сравниваем всех котов между собой
        for (int i = 0; i < cats.length; i++) {
            for (int j = i + 1; j < cats.length; j++) {
                compareCatsByAge(cats[i], cats[j]);
            }
        }
    }

    // метод для сравнения котов по возрасту
    public static void compareCatsByAge(Cat cat1, Cat cat2) {
        if (cat1.getAge() > cat2.getAge()) {
            System.out.println(cat1.getName() + " старше " + cat2.getName() + "а");
        } else if (cat1.getAge() < cat2.getAge()) {
            System.out.println(cat2.getName() + " старше " + cat1.getName() + "а");
        } else {
            System.out.println((cat1.getName() + " и" + cat2.getName() + " одного возраста"));
        }
    }
}