/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webbrowser.database;

import java.sql.*;

class MysqlCon {

    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/webbrowser"
            );
//here sonoo is database name, root is username and password 
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from historico");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "  " + rs.getString(2));// + "  " + rs.getString(3));
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
