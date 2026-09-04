package com.bank;
import java.sql.*;


public class Conn {
    Connection c;
    Statement s;
    public Conn(){

        try{

            c = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/bankmanagmentsystem",
                    "root",
                    "root"
            );
            s=c.createStatement();



        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
