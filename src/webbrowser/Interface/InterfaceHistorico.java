/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webbrowser.Interface;

import java.sql.SQLException;
import webbrowser.model.Historico;

/**
 *
 * @author andre
 */
public interface InterfaceHistorico {
    
    public void Inserir(Historico historico)throws SQLException;
    
    public void Alterar();
    
    public void Excluir(Historico historico)throws SQLException;

   // public void Consultar();
    
}

