package bank.management.system;

import java.sql.*;

public class conn {
    Connection connection;
    Statement statement;
    public conn() {
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/banksystem","root","14753690");
            statement = connection.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
