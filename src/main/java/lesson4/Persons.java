package lesson4;

/**
 * homework lesson4
 *
 * @author Amina
 * 15.03.2021
 */
public class Persons {
    private String name;
    private String position;
    private String email;
    private String phone;
    private double salary;
    private int    age;

    /*
     * 2.Конструктор класса должен заполнять эти поля при создании объекта.
     *
     * @param name
     * @param position
     * @param email
     * @param phone
     * @param salary
     * @param age
     */
    public Persons(String name, String position, String email, String phone, double salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }
    /*
     * 3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
     */
    public void info() {
        System.out.println("Информация о сотруднике " + name +":");
        System.out.println(" Должность - "+ position);
        System.out.println(" Возвраст - "+ age);
        System.out.println(" Доход - " + salary);
        System.out.println(" Контактная информация: телефон - "+ phone + "; email - " + email+".");
    }
}
