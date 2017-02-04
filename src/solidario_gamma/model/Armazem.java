
package solidario_gamma.model;

import java.util.Date;
import java.util.HashMap;
import static solidario_gamma.MocData.*;
import static solidario_gamma.controller.Diversos.data;
import static solidario_gamma.controller.Diversos.scan;

/**
 *
 *  @author Missy M, Mighty Arroz e Mais velho
 */
public class Armazem {
  
    
    private int id_armazem;
    private String nome_armazem;
    private Localizacao local;
    private Funcionario responsavel_de_armazem;
    private Estado estado;
    private Date data_estado_armazem;
    private HashMap <Produto,Float> produtos_armazenados=new HashMap <>(); 

    public Armazem(int id_armazem, String nome_armazem, Localizacao local, Funcionario responsavel_de_armazem, Estado estado, Date data_estado_armazem) {
        this.id_armazem = id_armazem;
        this.nome_armazem = nome_armazem;
        this.local = local;
        this.responsavel_de_armazem = responsavel_de_armazem;
        this.estado = estado;
        this.data_estado_armazem = data_estado_armazem;
        this.produtos_armazenados=produtos_armazenados;
    }

    public int getId_armazem() {
        return id_armazem;
    }

    public void setId_armazem(int id_armazem) {
        this.id_armazem = id_armazem;
    }

    public String getNome_armazem() {
        return nome_armazem;
    }

    public void setNome_armazem(String nome_armazem) {
        this.nome_armazem = nome_armazem;
    }

    public Localizacao getLocal() {
        return local;
    }

    public void setLocal(Localizacao local) {
        this.local = local;
    }

    public Funcionario getResponsavel_de_armazem() {
        return responsavel_de_armazem;
    }

    public void setResponsavel_de_armazem(Funcionario responsavel_de_armazem) {
        this.responsavel_de_armazem = responsavel_de_armazem;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Date getData_estado_armazem() {
        return data_estado_armazem;
    }

    public void setData_estado_armazem(Date data_estado_armazem) {
        this.data_estado_armazem = data_estado_armazem;
    }

    public HashMap<Produto, Float> getProdutos_armazenados() {
        return produtos_armazenados;
    }

    public void setProdutos_armazenados(HashMap<Produto, Float> produtos_armazenados) {
        this.produtos_armazenados = produtos_armazenados;
    }
     
    public static void listar(){
        for ( int j=0; j>stores.size(); j++){
            System.out.println( (j+1) + " - " + (stores.get(j)).getNome_armazem());} 
    }
    
    public static void criar_novo(){

            String z;
            int g;
            System.out.println("Introduza os dados relativos ao novo armazém");
            System.out.println("Designação do armazém");
            store.setNome_armazem(scan.nextLine());
            store.setId_armazem(stores.size());
            System.out.println("Localização:");
            Localizacao.listar();
            System.out.println("0 - Criar nova localização");
            try{
                store.setLocal(locations.get((scan.nextInt())-1));
            }catch (IndexOutOfBoundsException e){    //??? pk o e?        
                Localizacao.criar_nova();
                store.setLocal(locations.get(locations.size()-1));}
            //System.out.println("Numero do funcionário do responsável de armazém:");//Falta classe funcionario do outro grupo
            //store.setResponsavel_de_armazem(scan.nextInt());//Falta classe funcionario do outro grupo
            store.setData_estado_armazem(data);            
            stores.add(store);    
    
}
 
    
}
