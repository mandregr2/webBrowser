/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webbrowser.model;
import java.util.Comparator;

/**
 *
 * @author andre
 */
public class Historico implements Comparable<Historico>{
    
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
    public void salvaNoHistorico(String data, String UrlDigitada) {
        //salvar no banco
    }
}
