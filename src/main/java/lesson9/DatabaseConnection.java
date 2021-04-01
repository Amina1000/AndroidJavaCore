package lesson9;

import java.sql.*;

/**
 * homework lesson9
 *
 * @author Amina
 * 31.03.2021
 */
public class DatabaseConnection {
    private String url;
    private String user;
    private String password;

    public DatabaseConnection(String url, String user, String password) {
        this.url = url;
        this.user = user;
        this.password = password;
    }

    private Connection connection;
    private Statement statement;

    public Connection getConnection() {
        return connection;
    }

    public void disconnect() {
        try {
            if (statement != null) statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            if (connection != null) connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void connect() throws ClassNotFoundException, SQLException {

        Class.forName("org.sqlite.JDBC");
        connection = DriverManager.getConnection(url, user, password);
        statement = connection.createStatement();
    }

    public void execute(String query) {
        try {
            statement.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ResultSet selectRs(String query) throws SQLException {
        return statement.executeQuery(query);
    }

    public PreparedStatement preparedStatement(String query) {
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ps;
    }

    public void insertDatabase(String query) throws SQLException {
        try {
            connection.setAutoCommit(false);
            execute(query);
        } catch (SQLException e) {
            connection.rollback();
            e.printStackTrace();
        }
    }
}
