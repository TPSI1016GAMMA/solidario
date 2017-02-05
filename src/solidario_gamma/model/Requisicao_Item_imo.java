package solidario_gamma.model;

import java.util.*;
/**
 *
 *  @author Missy M, Mighty Arroz e Mais velho
 */
public class Requisicao_Item_imo extends Requisicao {
    
   private HashMap <Produto,Float> item=new HashMap <>();
   private Date data_inicio;
   private Date data_fim;

    public Requisicao_Item_imo(Date data_inicio, Date data_fim, int id_requisicao, Departamento departamento_destino, Funcionario funcionario_requisitante, Date data_requisicao, HashMap<Produto, Float> produtos_requisitados, Armazem armazem_requisitado) {
        super(id_requisicao, departamento_destino, funcionario_requisitante, data_requisicao, produtos_requisitados, armazem_requisitado);
        this.data_inicio = data_inicio;
        this.data_fim = data_fim;
    }
        
    public Date getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(Date data_inicio) {
        this.data_inicio = data_inicio;
    }

    public Date getData_fim() {
        return data_fim;
    }

    public void setData_fim(Date data_fim) {
        this.data_fim = data_fim;
    }
    
}
