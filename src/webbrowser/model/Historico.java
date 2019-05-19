/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webbrowser.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Comparator;
import webbrowser.ConectDatabase.ClsSQLHistorico;
import webbrowser.ConectDatabase.ConexaoMySQL;


/**
 *
 * @author andre
 */
public class Historico implements Comparable<Historico> {

 //caso precise criar o banco de dados   
 //   CREATE TABLE historico (
 //   dataAcesso varchar (100) PRIMARY KEY NOT NULL,
 //   urlAcesso VARCHAR (200)   
//)
    private String urlConsultada;
    private String dataConsulta;

    @Override
    public int compareTo(Historico o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the urlConsultada
     */
    public String getUrlConsultada() {
        return urlConsultada;
    }

    /**
     * @param urlConsultada the urlConsultada to set
     */
    public void setUrlConsultada(String urlConsultada) {
        this.urlConsultada = urlConsultada;
    }

    /**
     * @return the dataConsulta
     */
    public String getDataConsulta() {
        return dataConsulta;
    }

    /**
     * @param dataConsulta the dataConsulta to set
     */
    public void setDataConsulta(String dataConsulta) {
        this.dataConsulta = dataConsulta;
    }
//salva no historico  - ta ok esse metodo
    public void salvaNoHistorico(String data, String UrlDigitada) {
        Connection con;
        
        con = new ConexaoMySQL().getConnection();

        String sql = "insert into historico(dataAcesso,urlAcesso)VALUES(?,?)";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, data);
            stmt.setString(2, UrlDigitada);

            stmt.execute(); //executa comando       
            stmt.close();
            con.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }

    }
}
