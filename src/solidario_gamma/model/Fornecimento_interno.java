/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solidario_gamma.model;

import java.util.Date;

/**
 *
 *  @authores Missy M, Mighty Arroz e Mais velho
 */

//TODO - ACHO QUE ESTA CLASSE É PARA DESAPARECER
public class Fornecimento_interno extends Fornecimento {

    private int id_armazem;
    
    
    public Fornecimento_interno(int id_fornecimento, Requisicao requisicao, Date data_fornecimento, Date estado_autorizacao, Funcionario func_autorizante) {
        super(id_fornecimento, requisicao, data_fornecimento, estado_autorizacao, func_autorizante);
        this.id_armazem=id_armazem;    
    }

    public int getId_armazem() {
        return id_armazem;
    }

    public void setId_armazem(int id_armazem) {
        this.id_armazem = id_armazem;
    }
       
    
   
}
