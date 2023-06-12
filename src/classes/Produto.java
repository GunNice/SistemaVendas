package classes;

public class Produto {
 private String codigoProduto;
 private String nomeProduto;
 private Double valorProduto;
 private int qtdEstoque;

 public Produto(String codigoProduto, String nomeProduto, double valorProduto, int qtdEstoque) {
    this.codigoProduto = codigoProduto;
    this.nomeProduto = nomeProduto;
    this.valorProduto = valorProduto;
    this.qtdEstoque = qtdEstoque;
}

@Override
public String toString() {
    return  codigoProduto + "   -   " + nomeProduto + "     -    " + valorProduto + "     -     " + qtdEstoque;
}

public String getCodigoProduto() {
    return codigoProduto;
}
public void setCodigoProduto(String codigoProduto) {
    this.codigoProduto = codigoProduto;
}
public String getNomeProduto() {
    return nomeProduto;
}
public void setNomeProduto(String nomeProduto) {
    this.nomeProduto = nomeProduto;
}
public Double getValorProduto() {
    return valorProduto;
}
public void setValorProduto(Double valorProduto) {
    this.valorProduto = valorProduto;
}
public int getQtdEstoque() {
    return qtdEstoque;
}
public void setQtdEstoque(int qtdEstoque) {
    this.qtdEstoque = qtdEstoque;
}

}
