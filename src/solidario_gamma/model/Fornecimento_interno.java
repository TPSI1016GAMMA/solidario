package solidario_gamma.model;

import java.util.Date;
import java.util.HashMap;

/**
 *
 *  @author Missy M and Mighty Arroz
 */

public class Fornecimento_interno extends Fornecimento {

    private Requisicao requisicao;
    private Date estado_autorizacao;
    private Funcionario func_autorizante;

    public Fornecimento_interno(Requisicao requisicao, Date estado_autorizacao, Funcionario func_autorizante, int id_fornecimento, Date data_fornecimento, HashMap<Produto, Float> produtos_fornecidos) {
        super(id_fornecimento, data_fornecimento, produtos_fornecidos);
        this.requisicao = requisicao;
        this.estado_autorizacao = estado_autorizacao;
        this.func_autorizante = func_autorizante;
    }

    public Requisicao getRequisicao() {
        return requisicao;
    }

    public void setRequisicao(Requisicao requisicao) {
        this.requisicao = requisicao;
    }

    public Date getEstado_autorizacao() {
        return estado_autorizacao;
    }

    public void setEstado_autorizacao(Date estado_autorizacao) {
        this.estado_autorizacao = estado_autorizacao;
    }

    public Funcionario getFunc_autorizante() {
        return func_autorizante;
    }

    public void setFunc_autorizante(Funcionario func_autorizante) {
        this.func_autorizante = func_autorizante;
    }
    
}