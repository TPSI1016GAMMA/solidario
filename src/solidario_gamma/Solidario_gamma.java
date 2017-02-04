
package solidario_gamma;

import solidario_gamma.model.*;
import java.util.*;
import static solidario_gamma.MocData.*;


/**
 *
 * @author Missy M
 */
public class Solidario_gamma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                       
    
        int p, x=compras.size();
        compra.setId_fornecimento(x); 
        
        System.out.println("Introduza armazém: \n(0 - Para listar armazens)");
        x=new Scanner(System.in).nextInt();
        if(x==0){
            System.out.println("Armazéns");
            Armazem.listar();           
            System.out.println("0 - Criar novo armazém");
             x=new Scanner(System.in).nextInt();}
        if (x==0) Armazem.criar_novo();
        
        
        System.out.println("Passe o código pelo leitor:");
        x=new Scanner(System.in).nextInt();
        
        for (Produto produto : product) {
            if(produto.getBarcode()==x){
                p=product.indexOf(produto);
            }else{
                System.out.println("Produto inexistente.");
                Produto.criar_novo();
                p=product.size();}
        }
        
       
        
    }}
