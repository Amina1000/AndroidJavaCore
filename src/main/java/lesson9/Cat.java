package lesson9;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * homework lesson9
 *
 * @author Amina
 * 01.04.2021
 */
public class Cat {
    private String name;
    private String color;
    private int age;

    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void insertTable(DatabaseConnection databaseConnection) throws SQLException {
        PreparedStatement ps = databaseConnection.preparedStatement(
                "INSERT INTO javadatabase.cats (name,color,age)" +
                "VALUES (?,?,?);");
        ps.setString(1,name);
        ps.setString(2,color);
        ps.setInt(3,age);
        ps.addBatch();
        ps.executeBatch();
    }
    public void selectTable(DatabaseConnection databaseConnection) throws SQLException {
        ResultSet rs = databaseConnection.selectRs(String.format("SELECT * FROM cats where name ='%s'", name));
        while (rs.next()){
            System.out.printf("Cat:____name: %s >>>> color: %s >>>> age: %d\n", rs.getString("name"),
                    rs.getString("color"),rs.getInt("age"));
        }

    }
    public void updateTable(DatabaseConnection databaseConnection,String set){
        try {
            databaseConnection.insertDatabase(String.format("UPDATE cats set %s where name = '%s';",set,name));
            System.out.printf("update cat %s ----- %s\n",name,set);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void updateAge(int age, DatabaseConnection databaseConnection){
        try {
            CallableStatement cs = databaseConnection.getConnection().prepareCall("{ CALL updateAge(?,?) }");
            cs.setString(1,name);
            cs.setInt(2,age);
            cs.addBatch();
            cs.executeBatch();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
