package solidario_gamma.model;

import static solidario_gamma.MocData.estados;

/**
 *
 *  @author Missy M and Mighty Arroz
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
    
    public void criar_novo(){ //TODO
    Estado estado=new Estado(0,null);
    }
     
}
