package solidario_gamma.model;

/**
 *
 *  @author Missy M and Mighty Arroz
 */
public class Item_imobilizado extends Produto {
    
    private int qr_code;
    private Localizacao local;
    private String sala;
    
  
    public Item_imobilizado(int id_produto, String nome_produto, Categoria_produto categoria_produto, Sub_categoria_produto sub_categoria_produto, float stock_produto, Estado estado_produto, int barcode, int qr_code, Localizacao local, String sala, float stock_minimo){
            super(id_produto, nome_produto, categoria_produto,  sub_categoria_produto, stock_produto, estado_produto, barcode, stock_minimo);
            this.qr_code=qr_code;
            this.local=local;
            this.sala=sala;
}

    public int getQr_code() {
        return qr_code;
    }

    public void setQr_code(int qr_code) {
        this.qr_code = qr_code;
    }

    public Localizacao getLocal() {
        return local;
    }

    public void setLocal(Localizacao local) {
        this.local = local;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }
    
            
            
    
}

