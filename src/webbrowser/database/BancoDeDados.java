/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webbrowser.database;




/**
 *
 * @author finan
 */
public class BancoDeDados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
    ConexaoMySQL.statusConection();
    ConexaoMySQL.getConexaoMySQL();
    ConexaoMySQL.statusConection();
    System.out.println(ConexaoMySQL.status);
    FazConsulta consulta = new FazConsulta();
    consulta.fazConsultaSQL("select * from historico");
    }
    
}
