public class Cat {
    // свойства класса
    private String name;
    private String color;
    private int age;
    private boolean isSleeping;

    // конструктор - метод, который создает объект
    public Cat(String name, String color, int age, boolean isSleeping) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.isSleeping = isSleeping;
    };

    // методы (геттеры возвращают значение поля)
    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    // метод для проверки, спит ли кот
    public void sleep() {
        if (isSleeping) {
            System.out.println(name + " спит...");
        } else {
            System.out.println(name + " не спит.");
        }
    }

    public void meow() {
        System.out.println(name + " говорит: Мяу!");
    }

    // проверка возраста (взрослый или котенок)
    public void checkAge() {
        if (age >= 2) {
            System.out.println(name + " — взрослый кот");
        } else {
            System.out.println(name + " — котенок");
        }
    }

    // статический метод для создания массива котов
    public static Cat[] createCats() {
        Cat[] cats = new Cat[3]; // создаем массив из трех объектов Cat
        cats[0] = new Cat("Борис", "бежевый", 2, true); // заполняем первый элемент
        cats[1] = new Cat("Мурзик", "черно-белый", 3, false); // заполняем второй элемент
        cats[2] = new Cat("Барсик", "рыжий", 1, true); // заполняем третий элемент
        return cats; // возвращаем массив
    }

    // метод, возвращающий строку
    public String getInfo() {
        return "Имя: " + name + ", цвет: " + color + ", возраст: " + age + ", спит: " +
                (isSleeping ? "да" : "нет");
    }
}
