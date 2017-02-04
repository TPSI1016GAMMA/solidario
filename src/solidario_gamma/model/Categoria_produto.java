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
public class Categoria_produto {
    
    private int id_categoria_produto;
    private String nome_categoria_produto;
    
    public Categoria_produto(int id_categoria_produto, String nome_categoria_produto){
        this.id_categoria_produto=id_categoria_produto;
        this.nome_categoria_produto=nome_categoria_produto;
    }

    public int getId_categoria_produto() {
        return id_categoria_produto;
    }

    public void setId_categoria_produtos(int id_categoria_produto) {
        this.id_categoria_produto = id_categoria_produto;
    }

    public String getNome_categoria_produto() {
        return nome_categoria_produto;
    }

    public void setNome_categoria_produto(String nome_categoria_produto) {
        this.nome_categoria_produto = nome_categoria_produto;
    }
    
    public static void listar(){
        for ( int j=0; j>categoria_prod.size(); j++){
              System.out.println( (j+1) + " - " + (categoria_prod.get(j)).getNome_categoria_produto());}   
    }
    
    public static void criar_nova(){
        int g=categoria_prod.size();
        cat_prod.setId_categoria_produtos(g);
        System.out.println("Indique o nome da nova categoria de produto:");
        cat_prod.setNome_categoria_produto(new Scanner(System.in).nextLine());
        categoria_prod.add(cat_prod);
        produto.setCategoria_produto(categoria_prod.get(g));//hummm aqui???
    }
    
} 


