package classes;

import java.time.LocalDate;
import java.util.Date;

public class Venda {
    private LocalDate dataVenda;
    private String produtoVendido;
    private int qtdVenda;

    public Venda(LocalDate dataVenda, String produtoVendido, int qtdVenda) {
        this.dataVenda = dataVenda;
        this.produtoVendido = produtoVendido;
        this.qtdVenda = qtdVenda;
    }

    
    public LocalDate getDataVenda() {
        return dataVenda;
    }
    public void setDataVenda(LocalDate dataVenda) {
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
