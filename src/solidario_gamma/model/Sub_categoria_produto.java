/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solidario_gamma.model;

import java.util.Scanner;
import static solidario_gamma.MocData.*;
import static solidario_gamma.controller.Diversos.scan;
/**
 *
 * @author Missy M, Mighty Arroz e Mais velho
 */
public class Sub_categoria_produto extends Categoria_produto {
    
   private int id_sub_categoria_produto;
    private String nome_subcategoria_produto;
    
    public Sub_categoria_produto(int id_categoria_produto, String nome_categoria_produto, int id_sub_categoria_produto, String nome_subcategoria_produto ){

        super(id_categoria_produto, nome_categoria_produto);
        this.id_sub_categoria_produto=id_sub_categoria_produto;
        this.nome_subcategoria_produto=nome_subcategoria_produto;
    }

    public int getId_sub_categoria_produto() {
        return id_sub_categoria_produto;
    }

    public void setId_sub_categoria_produto(int id_sub_categoria_produto) {
        this.id_sub_categoria_produto = id_sub_categoria_produto;
    }

    public String getNome_subcategoria_produto() {
        return nome_subcategoria_produto;
    }

    public void setNome_subcategoria_produto(String nome_subcategoria_produto) {
        this.nome_subcategoria_produto = nome_subcategoria_produto;
    }
    
    public static void listar(){
        for ( int j=0; j>sub_categoria_prod.size(); j++){
                    System.out.println( (j+1) + " - " + (sub_categoria_prod.get(j)).getNome_subcategoria_produto());}   
    }
    
    public static void criar_nova(){
        int g=sub_categoria_prod.size();
        sub_cat_prod.setId_sub_categoria_produto(g);
        System.out.println("Indique o nome da nova sub-categoria de produto:");
        String z=scan.nextLine();
        sub_cat_prod.setNome_subcategoria_produto(z);
        sub_categoria_prod.add(sub_cat_prod);
        produto.setSub_categoria_produto(sub_categoria_prod.get(g));//hummmm
    }
    
    
}
