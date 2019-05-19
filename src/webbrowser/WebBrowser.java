/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webbrowser;

import webbrowser.ConectDatabase.FazConsulta;

/**
 *
 * @author andre
 */
public class WebBrowser {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       FazConsulta fc = new FazConsulta();
       fc.fazConsultaSQL("select * from historico");
       
        // TODO code application logic here
    }
    
}
