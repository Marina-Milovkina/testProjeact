public class Cat {
    // свойства класса
    private String name;
    private String color;
    private  int age;

    // конструктор - метод, который создает объект
public Cat(String name, String color, int age) {
    this.name = name;
    this.color = color;
    this.age = age;
}

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

}
