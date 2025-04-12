
// метод main - точка входа в программу, компьютер понимает это как "начинай отсюда"
public class Main {
    public static void main(String[] args) {
        // создаем массив котов через метод createCats из класса Cat
        Cat[] cats = Cat.createCats();

        // перебираем массив котов и вызываем их методы
        for (int i = 0; i < cats.length; i++){
            // выводим информацию о коте
            System.out.println("Имя:" + cats[i].getName() + ", цвет: " + cats[i].getColor() +
                    ", возраст: " + cats[i].getAge());

            // вызываем методы для каждого кота
            cats[i].meow();
            cats[i].sleep();
            cats[i].checkAge();
        }
    }
}