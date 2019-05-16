/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webbrowser.database;

/**
 *
 * @author andre
 */
public class CriandoBanco {
    
    create table historico
(
dataAcesso int (5) NOT NULL,
urlAcesso varchar (20),
PRIMARY KEY (dataAcesso)
)
;
    
}
