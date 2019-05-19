/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webbrowser.ConectDatabase;

import java.sql.SQLException;

/**
 *
 * @author andre
 */
public class testesBanco {

    public static void main(String[] args) throws SQLException {
        FazConsulta fc = new FazConsulta();
        fc.fazConsultaSQL("select * from historico");

    }
}
