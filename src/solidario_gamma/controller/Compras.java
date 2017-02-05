/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solidario_gamma.controller;

import java.util.Scanner;
import static solidario_gamma.MocData.*;
import static solidario_gamma.controller.Diversos.data;
import solidario_gamma.model.*;

/**
 *
 * @author Missy M
 */
public interface Compras {
    
    public static void Compras (){
        
        Fornecimento_interno compra=new Fornecimento_interno(0,null,null,null,null);
    
        int p=product.size(), x=compras.size(), s=stores.size();
        compra.setId_fornecimento(x); 
        
        System.out.println("Introduza armazém: \n(0 - Para listar armazens)");
        x=new Scanner(System.in).nextInt();
        if(x==0){
            System.out.println("Armazéns");
            Armazem.listar();           
            System.out.println("0 - Criar novo armazém");}
        try{
            compra.setId_armazem(new Scanner(System.in).nextInt()-1);
        }catch (IndexOutOfBoundsException e) {
            do{
            Armazem.criar_novo();
            }while(s==stores.size());
            compra.setId_armazem(stores.size()-1);}
        compra.setData_fornecimento(data);  
        compra.setEstado_autorizacao(data);
        //compra.setFunc_autorizante(); código do responsavel? codigo de quem insere? verificar...
        
        System.out.println("Passe o código pelo leitor:");
        x=new Scanner(System.in).nextInt();
        
        for (Produto produto : product) {
            if(produto.getBarcode()==x){
                p=product.indexOf(produto);}}
                             
        if (p==product.size()){
            System.out.println("Produto inexistente.");
            Produto.criar_novo(x);}
        }
        
}
    

