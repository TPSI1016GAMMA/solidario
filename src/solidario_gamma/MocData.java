/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solidario_gamma;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import solidario_gamma.model.*;

/**
 *
 * @author Missy M
 */
public class MocData {
    
     
    public static Fornecimento_interno compra=new Fornecimento_interno(0,null,null,null,null);
    public static Produto produto=new Produto(0,null,null,null,0,null,0,0);
    public static Categoria_produto cat_prod=new Categoria_produto(0, null);
    public static Sub_categoria_produto sub_cat_prod=new Sub_categoria_produto(0,null,0, null);
    public static Armazem store=new Armazem(0,null,null, null, null, null);
    public static Localizacao local=new Localizacao(0,null,null, null);
    public static Estado estado=new Estado(0,null);
    
    public static ArrayList<Fornecimento_interno> compras=new ArrayList<Fornecimento_interno> ();
    
    public static ArrayList<Produto> product=new ArrayList<Produto> ();
    
    public static ArrayList<Categoria_produto> categoria_prod=new ArrayList<Categoria_produto> ();
    
    public static ArrayList<Sub_categoria_produto> sub_categoria_prod=new ArrayList<Sub_categoria_produto> ();
    
    public static ArrayList<Armazem> stores=new ArrayList<Armazem> ();
    
    public static ArrayList<Localizacao> locations=new ArrayList<Localizacao> ();
    
    public static ArrayList<Estado> estados=new ArrayList<Estado> ();
    

    
}
