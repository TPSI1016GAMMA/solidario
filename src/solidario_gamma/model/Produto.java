
package solidario_gamma.model;

import static solidario_gamma.MocData.categoria_prod;
import static solidario_gamma.MocData.product;
import static solidario_gamma.MocData.produto;
import static solidario_gamma.MocData.sub_categoria_prod;
import static solidario_gamma.controller.Diversos.scan;

/**
 *
 *  @author Missy M, Mighty Arroz e Mais velho
 */
public class Produto {
    
    private int id_produto;
    private String nome_produto;
    private Categoria_produto categoria_produto;
    private Sub_categoria_produto sub_categoria_produto; 
    private float stock_produto; //stock total em todos os armazéns
    private Estado estado_produto;
    private int barcode;
    private float stock_minimo;
    
    public Produto(int id_produto, String nome_produto, Categoria_produto Categoria_produto, Sub_categoria_produto sub_categoria_produto, float stock_produto, Estado estado_produto, int barcode, float stock_minimo ){
        this.id_produto=id_produto;
        this.nome_produto=nome_produto;
        this.sub_categoria_produto=sub_categoria_produto;
        this.stock_produto=stock_produto;
        this.estado_produto=estado_produto;
        this.barcode=barcode;
        this.stock_minimo=stock_minimo;
        
    }

    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    public String getNome_produto() {
        return nome_produto;
    }

    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }

    public Sub_categoria_produto getSub_categoria_produto() {
        return sub_categoria_produto;
    }

    public void setSub_categoria_produto(Sub_categoria_produto sub_categoria_produto) {
        this.sub_categoria_produto = sub_categoria_produto;
    }

    public float getStock_produto() {
        return stock_produto;
    }

    public void setStock_produto(float stock_produto) {
        this.stock_produto = stock_produto;
    }

    public Estado getEstado_produto() {
        return estado_produto;
    }

    public void setEstado_produto(Estado estado_produto) {
        this.estado_produto = estado_produto;
    }

    public int getBarcode() {
        return barcode;
    }

    public void setBarcode(int barcode) {
        this.barcode = barcode;
    }

    public Categoria_produto getCategoria_produto() {
        return categoria_produto;
    }

    public void setCategoria_produto(Categoria_produto categoria_produto) {
        this.categoria_produto = categoria_produto;
    }

    public float getStock_minimo() {
        return stock_minimo;
    }

    public void setStock_minimo(float stock_minimo) {
        this.stock_minimo = stock_minimo;
    }
    
        public static void criar_novo(){

            String z;
            int g;
            System.out.println("Insira os dados relativos ao novo produto.");
            System.out.println("Designação do produto:");
            produto.setNome_produto(scan.nextLine());
            produto.setId_produto(product.size());
            System.out.println("Categoria de produto:");
            Categoria_produto.listar();
            System.out.println("0 - Criar nova categoria de produto");
            g=scan.nextInt();            
            if(g!=0){
                produto.setCategoria_produto(categoria_prod.get((g-1)));
                System.out.println("Sub-categoria do produto:");
                Sub_categoria_produto.listar();         
                System.out.println("0 - Criar nova sub-categoria de produto");
                g=scan.nextInt();
                if (g!=0){
                    produto.setSub_categoria_produto(sub_categoria_prod.get((g-1)));
                }else{
                    
                    Sub_categoria_produto.criar_nova();
                    produto.setSub_categoria_produto(sub_categoria_prod.get(sub_categoria_prod.size()-1));}
            }else{
                Categoria_produto.criar_nova();
                produto.setCategoria_produto(categoria_prod.get(categoria_prod.size()-1));
                System.out.println("Introduzir sub-categoria? (s/n)");
                char y= scan.next().charAt(0);
                if(y=='s'){
                    System.out.println("Sub-categoria do produto:");
                    Sub_categoria_produto.listar();              
                    System.out.println("0 - Criar nova sub-categoria de produto");
                     g=scan.nextInt();
                    if (g!=0){
                      produto.setSub_categoria_produto(sub_categoria_prod.get((g-1)));
                    }else{
                        Sub_categoria_produto.criar_nova();
                        produto.setSub_categoria_produto(sub_categoria_prod.get(sub_categoria_prod.size()-1));}}} 
            product.add(produto);
        }

}

