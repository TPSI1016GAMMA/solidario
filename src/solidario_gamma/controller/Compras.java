package solidario_gamma.controller;

import java.util.Scanner;
import static solidario_gamma.MocData.*;
import static solidario_gamma.controller.Diversos.data;
import solidario_gamma.model.*;

/**
 *
 *  @author Missy M and Mighty Arroz
 */
public class Compras {
    
    public static void introduzir_compras(){
    
        Abastecimento_armazem abastecimento=new Abastecimento_armazem(0,0,null,null);
        
        char answer = 0;
        int x=compras.size(), s=stores.size();
        abastecimento.setId_fornecimento(x); 
        
        do{
            do{     
                System.out.println("Introduza armazém: \n(0 - Para listar armazens)");
                x=new Scanner(System.in).nextInt();
            }while(x<0 && x>stores.size() );
            if(x==0){
                do{
                    System.out.println("Armazéns");
                    Armazem.listar();           
                    System.out.println("0 - Criar novo armazém");
                    x=new Scanner(System.in).nextInt();
                }while(x<0 && x>stores.size() );
            }if(x!=0){
                abastecimento.setId_armazem(x);
            }else{           
                Armazem.criar_novo();           
                if (s<stores.size()){
                    abastecimento.setId_armazem(stores.size()-1);
                }else{
                    System.out.println("Criação de novo armazém cancelada. \n1- Seleccionar armazém existente\n2-Sair de interface de compras");
                    x=new Scanner(System.in).nextInt();
                    switch (x){
                        case 1: break;
                        case 2: System.exit(0);}}}//verificar maneira mais correcta
        }while(s==stores.size());
        abastecimento.setData_fornecimento(data);  
         
        do{
            s=product.size();     
            System.out.println("PASSE O CODIGO DE BARRAS PELO LEITOR: \n0-criar novo produto sem codigo de barras\n1-Seleccionar existente\n2-Sair do interface de compras");
            x=new Scanner(System.in).nextInt();
            switch (x) {
                case 0:
                    Produto.criar_novo(x);
                    break;
                case 1:
                    System.out.println("Produto: ");
                    Produto.listar();
                    System.out.println("Seleccione o produto a introduzir: ");
                    s=(new Scanner(System.in).nextInt())-1;
                    break;
                case 2:
                    System.exit(0);//verificar maneira mais correcta
                default:
                    for (Produto produto : product) {
                        if(produto.getBarcode()==x){
                            s=product.indexOf(produto);}}
                    if (s==product.size()){      
                        System.out.println("Produto inexistente.");
                        Produto.criar_novo(x);}
                    break;}
            
        System.out.println("Quantidade: ");        
        abastecimento.produtos_fornecidos.put(product.get(s), new Scanner(System.in).nextFloat());
        //abastecimento.setProdutos_fornecidos(abastecimento.produtos_fornecidos); //isto é necessário??
        
        System.out.println("Continuar? (s/n) "); 
        }while(answer=='s');
        compras.add(abastecimento);
   }}
    

