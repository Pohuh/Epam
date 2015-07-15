package model.dao.impl;

import com.mysql.fabric.jdbc.FabricMySQLDriver;

import java.sql.*;

/**
 * Created by ооо on 14.07.2015.
 */

public class TableDaoImpl {

    private static final String URL = "jdbc:mysql://localhost:3306/hodor";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "hodor";
    public static int id;
    public static String data;
    public static String title;
    public static ResultSet res;

    public static void main(String[] args){

        try {
            Driver driver = new FabricMySQLDriver();
            DriverManager.registerDriver(driver);
        } catch (SQLException e) {
            System.err.println("Не удалось загрузить класс драйвера!");
        }
        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD); Statement statement = connection.createStatement()){
            //statement.execute("INSERT INTO articles (title, text) VALUES ('Один', 'Два');");
            res = statement.executeQuery("SELECT * FROM articles");
            ResultSet res2 = statement.executeQuery("SELECT * FROM comments");
            while (res.next()){
                id = res.getInt(1);
                data = res.getString(2);
                title = res.getString(3);
                String text = res.getString(4);
                System.out.println(id);
                System.out.println(data);
                System.out.println(title);
                System.out.println(text);
            }
            while (res2.next()){
                int idc = res2.getInt(1);
                int num = res2.getInt(2);
                String comm = res2.getString(3);
                System.out.println(idc);
                System.out.println(num);
                System.out.println(comm);
            }
            statement.getConnection();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
