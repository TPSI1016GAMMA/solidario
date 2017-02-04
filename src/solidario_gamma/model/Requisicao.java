/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solidario_gamma.model;

import java.util.Date;
import java.util.HashMap;

/**
 *
 *  @author Missy M, Mighty Arroz e Mais velho
 */
public class Requisicao {
    
    private int id_requisicao;
    private Departamento departamento_destino;
    private Funcionario funcionario_requisitante;
    private Date data_requisicao;
    private Date data_autorizacao;
    private Funcionario funcionario_autorizante; //autorizante??? wtf
    private Armazem armazem_requisitado;
    private HashMap <Produto,Float> produtos_requisitados=new HashMap <>();
 
    
 
public Requisicao(int id_requisicao,Departamento departamento_destino, Funcionario funcionario_requisitante, Date data_requisicao, HashMap <Produto,Float> produtos_requisitados, Armazem armazem_requisitado) {
    this.id_requisicao=id_requisicao;
    this.departamento_destino = departamento_destino;
    this.funcionario_requisitante = funcionario_requisitante;
    this.data_requisicao = data_requisicao;
    this.produtos_requisitados=produtos_requisitados;
    this.armazem_requisitado=armazem_requisitado;
    }

    public int getId_requisicao() {
        return id_requisicao;
    }

    public void setId_requisicao(int id_requisicao) {
        this.id_requisicao = id_requisicao;
    }

    public Departamento getDepartamento_destino() {
        return departamento_destino;
    }

    public void setDepartamento_destino(Departamento departamento_destino) {
        this.departamento_destino = departamento_destino;
    }

    public Funcionario getFuncionario_requisitante() {
        return funcionario_requisitante;
    }

    public void setFuncionario_requisitante(Funcionario funcionario_requisitante) {
        this.funcionario_requisitante = funcionario_requisitante;
    }

    public Date getData_requisicao() {
        return data_requisicao;
    }

    public void setData_requisicao(Date data_requisicao) {
        this.data_requisicao = data_requisicao;
    }

    public Date getData_autorizacao() {
        return data_autorizacao;
    }

    public void setData_autorizacao(Date data_autorizacao) {
        this.data_autorizacao = data_autorizacao;
    }

    public Funcionario getFuncionario_autorizante() {
        return funcionario_autorizante;
    }

    public void setFuncionario_autorizante(Funcionario funcionario_autorizante) {
        this.funcionario_autorizante = funcionario_autorizante;
    }

    public Armazem getArmazem_requisitado() {
        return armazem_requisitado;
    }

    public void setArmazem_requisitado(Armazem armazem_requisitado) {
        this.armazem_requisitado = armazem_requisitado;
    }

    public HashMap<Produto, Float> getProdutos_requisitados() {
        return produtos_requisitados;
    }

    public void setProdutos_requisitados(HashMap<Produto, Float> produtos_requisitados) {
        this.produtos_requisitados = produtos_requisitados;
    }


}

    
