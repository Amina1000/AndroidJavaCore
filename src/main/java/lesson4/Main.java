package lesson4;

/**
 * homework lesson4
 *
 * @author Amina
 * 15.03.2021
 */
public class Main {

    public static void main(String[] args) {
        /*
          4. Создать массив из 5 сотрудников.
         */
        Persons[] persArray = new Persons[5];
        persArray[0] = new Persons("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312",
                30000, 30);
        persArray[1] = new Persons("Isaev Oleg", "Programmer", "isaevol@mailbox.com", "892312318",
                180000.25, 42);
        persArray[2] = new Persons("Sergeeva Elena", "Accountant", "sergeeva@mailbox.com", "892412318",
                150000.40, 45);
        persArray[3] = new Persons("Kudrin Evgeniy", "Manager", "kudrin@mailbox.com", "892418318",
                130000.10, 25);
        persArray[4] = new Persons("Mihaylov Grigoryi", "Manager", "mihaylov@mailbox.com", "892418818",
                120000.45, 43);
        persArray[4].setName("Mihaylova Maria");
        /*
         * 5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
         */
        for (Persons persons : persArray) {
            if (persons.getAge() > 40) {
                persons.info();
            }

        }

    }
}
