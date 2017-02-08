package solidario_gamma.model;

/**
 *
 *  @author Missy M and Mighty Arroz
 */
import java.util.*;
public class Fornecimento {

 private int id_fornecimento; 
 private Date data_fornecimento; 
 public HashMap <Produto,Float> produtos_fornecidos;

    public Fornecimento(int id_fornecimento, Date data_fornecimento, HashMap<Produto, Float> produtos_fornecidos) {
        this.id_fornecimento = id_fornecimento;
        this.data_fornecimento = data_fornecimento;
        this.produtos_fornecidos = new HashMap<>();
    }
    

    public int getId_fornecimento() {
        return id_fornecimento;
    }

    public void setId_fornecimento(int id_fornecimento) {
        this.id_fornecimento = id_fornecimento;
    }

    
    public Date getData_fornecimento() {
        return data_fornecimento;
    }

    public void setData_fornecimento(Date data_fornecimento) {
        this.data_fornecimento = data_fornecimento;
    }

    public HashMap<Produto, Float> getProdutos_fornecidos() {
        return produtos_fornecidos;
    }

    public void setProdutos_fornecidos(HashMap<Produto, Float> produtos_fornecidos) {
        this.produtos_fornecidos = produtos_fornecidos;
    }
 
     
}
