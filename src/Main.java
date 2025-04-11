
// метод main - точка входа в программу, компьютер понимает это как "начинай отсюда"
public class Main {
    public static void main(String[] args) {

        Cat firstCat = new Cat("Борис", "бежевый",2);
        // Cat - класс, из которого создается объект; firstCat - объект (экземпляр) класса);
        // new Cat - создание нового объекта с помощью конструктора;
        // в () аргументы, которые передаются в конструктор класса Cat


        Cat secondCat = new Cat( "Мурзик", "черно-белый", 3);

        System.out.println("Данные первого кота: " + firstCat.getName() + " , " +
                firstCat.getColor() + " , " + firstCat.getAge());
        firstCat.meow();
        firstCat.sleep();

        System.out.println("Данные второго кота: " + secondCat.getName() + " , " +
                secondCat.getColor() + " , " + secondCat.getAge());
        secondCat.meow();
    }
}