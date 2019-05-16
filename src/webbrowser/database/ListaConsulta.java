/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webbrowser.database;

import java.util.ArrayList;
import webbrowser.model.Historico;

/**
 *
 * @author andre
 */
public class ListaConsulta {

    public Historico historico = new Historico();

    public static ArrayList<Historico> aList = new ArrayList<>();

    public void PrintList(ArrayList<Historico> P) {
        for (int i = 0; i < P.size(); i++) {
            // P.getPos(i);
            System.out.println(P.get(i).getDataConsulta() + " " + P.get(i).getUrlConsultada());

        }
        System.out.println("");
    }

}
