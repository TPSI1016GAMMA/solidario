package solidario_gamma.model;

/**
 *
 *  @author Missy M, Mighty Arroz e Mais velho
 */
import java.util.*;
public class Fornecimento {


 private int id_fornecimento;
 private Requisicao requisicao;
 private Date data_fornecimento;
 private Date estado_autorizacao;
 private Funcionario func_autorizante;
 private HashMap <Produto,Float> produtos_fornecidos=new HashMap <>();

    public Fornecimento(int id_fornecimento, Requisicao requisicao, Date data_fornecimento, Date estado_autorizacao, Funcionario func_autorizante) {
        this.id_fornecimento = id_fornecimento;
        this.requisicao = requisicao;
        this.data_fornecimento = data_fornecimento;
        this.estado_autorizacao = estado_autorizacao;
        this.func_autorizante = func_autorizante;
    }

    public int getId_fornecimento() {
        return id_fornecimento;
    }

    public void setId_fornecimento(int id_fornecimento) {
        this.id_fornecimento = id_fornecimento;
    }

    public Requisicao getRequisicao() {
        return requisicao;
    }

    public void setRequisicao(Requisicao requisicao) {
        this.requisicao = requisicao;
    }

    public Date getData_fornecimento() {
        return data_fornecimento;
    }

    public void setData_fornecimento(Date data_fornecimento) {
        this.data_fornecimento = data_fornecimento;
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

    public HashMap<Produto, Float> getProdutos_fornecidos() {
        return produtos_fornecidos;
    }

    public void setProdutos_fornecidos(HashMap<Produto, Float> produtos_fornecidos) {
        this.produtos_fornecidos = produtos_fornecidos;
    }
 
 
  

    
}
