package lesson9;

import java.sql.SQLException;

/**
 * homework lesson9
 *
 * @author Amina
 * 31.03.2021
 */
public class Main {

    /*
    1.Создать класс кота, с полями имя, цвет, что-нибудь еще.
    2.Создать в базе таблицу с котами.
    3.***Сделть класс для работы с котами в бд: запись кота в БД, чтение кота из базы, изменение...
     */
    public static void main(String[] args) {

        Cat[] cats = {new Cat("Kokos", "white", 1),
                new Cat("Barsik", "black", 2),
                new Cat("Boby", "blue", 5)};

        DatabaseConnection databaseConnection = new DatabaseConnection(
                "jdbc:mysql://localhost:3306/javadatabase","sa","05082020"
        );

        try {
            databaseConnection.connect();
            databaseConnection.execute("DROP TABLE if exists cats");
            databaseConnection.execute("CREATE TABLE if not exists cats (" +
                    "  `id_cats` INT UNSIGNED NOT NULL AUTO_INCREMENT," +
                    "  `name` VARCHAR(255) NULL," +
                    "  `color` VARCHAR(255) NULL," +
                    "  `age` INT NULL," +
                    "  PRIMARY KEY (`id_cats`));");
            for (Cat cat:cats) {
                cat.insertTable(databaseConnection);
                cat.selectTable(databaseConnection);
            }

            cats[2].updateTable(databaseConnection,"color = 'red'");
            cats[2].updateAge(4,databaseConnection);
            cats[2].selectTable(databaseConnection);

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            databaseConnection.disconnect();
        }
    }

}
