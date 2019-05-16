/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webbrowser.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.SQLException;

/**
 *
 * @author finan
 */
public class ConexaoMySQL {
    public static String status = "Não conectou...";
    

public ConexaoMySQL() {
 
    }
public static java.sql.Connection getConexaoMySQL() {
 
        Connection connection = null;          //atributo do tipo Connection
 
  
 
try {
    System.out.println("Tentando conectar com Banco de Dados....");
 
// Carregando o JDBC Driver padrão
 
String driverName = "com.mysql.cj.jdbc.Driver";//"com.mysql.cj.jdbc.Driver";                        
 
Class.forName(driverName);
 
  
 
// Configurando a nossa conexão com um banco de dados//
 
            String serverName = "127.0.0.1:3306";  
            
            String mydatabase = "webbrowser";
 
            String url = "jdbc:mysql://" + serverName + "/" + mydatabase+ "?useTimezone=true&serverTimezone=UTC";
 
            String username = "root";        //nome de um usuário de seu BD      
 
            String password = "admin";      //sua senha de acesso
 
            connection = DriverManager.getConnection(url, username, password);
 
  
 
            //Testa sua conexão//  
 
            if (connection != null) {
 
                status = ("STATUS--->Conectado com sucesso!");
          
 
            } else {
 
                status = ("STATUS--->Não foi possivel realizar conexão");
 
            }
 
  
 
            return connection;
 
  
 
        } catch (ClassNotFoundException e) {  //Driver não encontrado
 
  
 
            System.out.println("O driver expecificado nao foi encontrado.");
 
            return null;
 
        } catch (SQLException e) {
 
//Não conseguindo se conectar ao banco
 
            System.out.println("Nao foi possivel conectar ao Banco de Dados.");
 
            return null;
 
        }
 
  
 
    }
public static String statusConection() {
 
        return status;
 
    }
 
   
 
   //Método que fecha sua conexão//
 
    public static boolean FecharConexao() {
 
        try {
 
            ConexaoMySQL.getConexaoMySQL().close();
 
            return true;
 
        } catch (SQLException e) {
 
            return false;
 
        }
 
  
 
    }
 
   
 
   //Método que reinicia sua conexão//
 
    public static java.sql.Connection ReiniciarConexao() {
 
        FecharConexao();
 
  
 
        return ConexaoMySQL.getConexaoMySQL();
 
    }
 
}
