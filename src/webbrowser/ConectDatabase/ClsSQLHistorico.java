/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webbrowser.ConectDatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import webbrowser.model.Historico;

/**
 *
 * @author andre
 */
public class ClsSQLHistorico implements webbrowser.Interface.InterfaceHistorico {

  //Connection con = new ConexaoMySQL().getConnection();

//construtor
    public void clsSQLHistorico() {

    }

    @Override
    public void Inserir(Historico historico) throws SQLException {
        Historico his = new Historico();
        his = historico;

        String sql = "insert into historico(dataAcesso,urlAcesso)VALUES(?,?)";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/webbrowser?useTimezone=true&serverTimezone=UTC",
                    "root",
                    "admin");

            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, his.getDataConsulta());
            stmt.setString(2, his.getUrlConsultada());

            stmt.execute(); //executa comando       
            stmt.close();

        } catch (Exception e) {
          System.out.println(e);
        }

    }

    @Override
    public void Alterar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Excluir(Historico historico) throws SQLException {
        Historico his = new Historico();
        his = historico;

        String sql = "delete from historico where dataAcesso = '" + his.getDataConsulta() + "'      ";
        System.out.println(sql);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/webbrowser?useTimezone=true&serverTimezone=UTC",
                    "root",
                    "admin");

            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.execute(); //executa comando       
            stmt.close();
            con.close();
        } catch (Exception e) {
          System.out.println(e);
        }

    }

}
