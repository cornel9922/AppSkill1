package main.appskill1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
public class DatabaseHandler extends Configs{
    Connection dbconnection;

    public Connection getDbconnection() throws ClassNotFoundException, SQLException {
        String connectionString = "jdbc:mysql://" + dbHost + ":"  + dbPort + "/" + dbName;
        Class.forName("com.mysql.cj.jdbc.Driver");

        dbconnection = DriverManager.getConnection(connectionString, dbUser, dbPass);

        return dbconnection;
    }

    public ResultSet getUser(User user) {
        ResultSet resSet = null;
        String select = "SELECT * FROM " + Const.USER_TABLE +  " WHERE " +
                Const.USERS_USERNAME + "=? AND" + Const.USERS_PASSWORD + "=?";
    }
    public void signUpUser (User user) {
        String insert = "INSERT INTO " + Const.USER_TABLE + "(" + Const.USERS_FIRSTNAME + "," + Const.USERS_LASTNAME +
                "," + Const.USERS_USERNAME + "," + Const.USERS_PASSWORD + "," + Const.USERS_LOCATION +
                "," + Const.USERS_GENDER + ")" + "VALUES(?,?,?,?,?,?)";

        try {
            PreparedStatement prSt = getDbconnection().prepareStatement(insert);
            prSt.setString(1, user.getFirstName());
            prSt.setString(2, user.getLastName());
            prSt.setString(3, user.getUserName());
            prSt.setString(4, user.getPassword());
            prSt.setString(5, user.getLocation());
            prSt.setString(6, user.getGender());
            prSt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
