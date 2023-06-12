package classes;

import java.util.Date;

public class Venda {
    private Date dataVenda;
    private String produtoVendido;
    private int qtdVenda;

    
    public Date getDataVenda() {
        return dataVenda;
    }
    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }
    public String getProdutoVendido() {
        return produtoVendido;
    }
    public void setProdutoVendido(String produtoVendido) {
        this.produtoVendido = produtoVendido;
    }
    public int getQtdVenda() {
        return qtdVenda;
    }
    public void setQtdVenda(int qtdVenda) {
        this.qtdVenda = qtdVenda;
    }

}
