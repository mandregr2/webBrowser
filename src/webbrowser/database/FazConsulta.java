/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webbrowser.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import webbrowser.model.Historico;

/**
 *
 * @author finan
 */
public class FazConsulta {

    public void fazConsultaSQL(String SQL) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/webbrowser?useTimezone=true&serverTimezone=UTC", "root", "admin");

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(SQL);
            while (rs.next()) {
                Historico h = new Historico();
                h.setDataConsulta("" + rs.getInt(1));
                h.setUrlConsultada("" + rs.getString(2));
                ListaConsulta.aList.add(h);//System.out.println(rs.getInt(1) + "  " + rs.getString(2));// + "  " + rs.getString(3));

            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        ListaConsulta print = new ListaConsulta();
        print.PrintList(ListaConsulta.aList);
    }
}
