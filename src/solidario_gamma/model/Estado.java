/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solidario_gamma.model;

import static solidario_gamma.MocData.estados;
import static solidario_gamma.MocData.locations;

/**
 *
 *  @author Missy M, Mighty Arroz e Mais velho
 */
public class Estado {
    
    private int id_estado;
    private String nome_estado;
    
    public Estado(int id_estado, String nome_estado){
        this.id_estado=id_estado;
        this.nome_estado=nome_estado;
    }

    public int getId_estado() {
        return id_estado;
    }

    public void setId_estado(int id_estado) {
        this.id_estado = id_estado;
    }

    public String getNome_estado() {
        return nome_estado;
    }

    public void setNome_estado(String nome_estado) {
        this.nome_estado = nome_estado;
    }
    
    public static void listar(){
        for ( int j=0; j>estados.size(); j++){
              System.out.println( (j+1) + " - " + (estados.get(j)).getNome_estado());} 
    }
     
}
