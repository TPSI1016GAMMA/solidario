
package solidario_gamma.model;

import java.util.Date;
import java.util.Scanner;
import static solidario_gamma.MocData.*;


/**
 *
 *  @author Missy M, Mighty Arroz e Mais velho
 */

public class Localizacao {
    
    private int id_localizacao;
    private String morada_localizacao;
    private Estado estado;
    private Date data_estado;

 

    public Localizacao(int id_localizacao, String morada_localizacao, Estado estado, Date data_estado) {
        this.id_localizacao=id_localizacao;
        this.morada_localizacao=morada_localizacao;
        this. estado=estado;
        this.data_estado=data_estado;    }

 

    public int getId_localizacao() {
        return id_localizacao;
    }

    public void setId_localizacao(int id_localizacao) {
        this.id_localizacao = id_localizacao;
    }

    public String getMorada_localizacao() {
        return morada_localizacao;
    }

    public void setMorada_localizacao(String morada_localizacao) {
        this.morada_localizacao = morada_localizacao;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Date getData_estado() {
        return data_estado;
    }

    public void setData(Date data) {
        this.data_estado = data_estado;
    }

    public static void listar(){
        for ( int j=0; j>locations.size(); j++){
              System.out.println( (j+1) + " - " + (locations.get(j)).getMorada_localizacao());} 
    }
    
    public static void criar_nova(){
       Localizacao local=new Localizacao(0,null,null, null);
       local.setId_localizacao(locations.size());
       System.out.println("Introduza a nova morada:");
       local.setMorada_localizacao(new Scanner(System.in).nextLine());
       locations.add(local);
       
   }
}

