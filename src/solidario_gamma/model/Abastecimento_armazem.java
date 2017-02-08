package solidario_gamma.model;

import java.util.Date;
import java.util.HashMap;

/**
 *
 *  @author Missy M and Mighty Arroz
 */
public class Abastecimento_armazem extends Fornecimento {
    
    private int id_armazem;

    public Abastecimento_armazem(int id_armazem, int id_fornecimento, Date data_fornecimento, HashMap<Produto, Float> produtos_fornecidos) {
        super(id_fornecimento, data_fornecimento, produtos_fornecidos);
        this.id_armazem = id_armazem;
    }
    
    public int getId_armazem() {
        return id_armazem;
    }

    public void setId_armazem(int id_armazem) {
        this.id_armazem = id_armazem;
    }
          
   
}

    

