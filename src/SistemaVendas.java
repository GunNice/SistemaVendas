import java.util.Scanner;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import classes.Produto;
import classes.Venda;


public class SistemaVendas {
    public static void main(String[] args) throws Exception {

    int opcao;
    Scanner sc = new Scanner(System.in);
    List<Produto>listaProdutos = new ArrayList<>();
    List<Venda>listaVendas = new ArrayList<>(); 
    
    
    
        do {
         System.out.println("===============================");
         System.out.println("=      \u001B[3mSistema de Vendas      =");
         System.out.println("= \u001B[3mselecione a opção desejada  =");
         System.out.println("===============================\n\n");
         System.out.println("1 - Incluir produto");
         System.out.println("2 - Consultar produto");
         System.out.println("3 - Listagem de produtos");
         System.out.println("4 - Vendas por período - detalhado");
         System.out.println("5 - Realizar venda");
         System.out.println("0 - Sair\n\n");

         opcao = sc.nextInt();
         sc.nextLine();
            if (opcao == 1) {
                System.out.println("Digite o código do Produto:");
                String codigoProduto = sc.nextLine();

                System.out.print("Digite o nome do produto: ");
                String nomeProduto = sc.nextLine();

                System.out.print("Digite o valor do produto: ");
                double valorProduto = sc.nextDouble();

                System.out.print("Digite o estoque do produto: ");
                int qtdEstoque = sc.nextInt();

            // Consumir o restante da linha após a leitura do estoque
                sc.nextLine();

            // Criar um novo produto e adicioná-lo à lista
                Produto produto = new Produto(codigoProduto, nomeProduto, valorProduto, qtdEstoque);
                listaProdutos.add(produto);
    
            }
           if (opcao == 2) {
                // Consultar produtos por código ou nome
                System.out.println("========== Relatório de Consulta de Produtos ==========");
            
                while (true) {
                    System.out.print("Digite o código ou nome do produto para consultar (ou 'sair' para encerrar): ");
                    String consulta = sc.nextLine();
            
                    if (consulta.equalsIgnoreCase("sair")) {
                        break;
                    }
            
                    boolean encontrado = false;
            
                    System.out.println("\n======================== Produtos Encontrados ========================");
                    System.out.printf("%-15s %-20s %-10s %-10s\n", "Código", "Nome", "Valor", "Estoque");
                    System.out.println("--------------------------------------------------------------------");
            
                    for (Produto produto : listaProdutos) {
                        if (produto.getCodigoProduto().equalsIgnoreCase(consulta)
                                || produto.getNomeProduto().equalsIgnoreCase(consulta)) {
                            System.out.printf("%-15s %-20s %-10.2f %-10d\n", produto.getCodigoProduto(), produto.getNomeProduto(),
                                    produto.getValorProduto(), produto.getQtdEstoque());
                            encontrado = true;
                        }
                    }
            
                    if (!encontrado) {
                        System.out.println("Produto não encontrado.\n");
                    }
            
                    System.out.println("=====================================================================\n");
                }
            
                System.out.println("========================================================================");
                System.out.println("======= Relatório de Consulta de Produtos Finalizado =======");
                System.out.println("========================================================================\n");
            }
            
            if (opcao == 3) {
                // Exibir a lista de produtos
                System.out.println("============ Relatório de Listagem de Produtos =============");
                System.out.printf("%-15s %-20s %-10s %-10s\n", "Código", "Nome", "Valor", "Estoque");
                System.out.println("------------------------------------------------------------");
            
                for (Produto produto : listaProdutos) {
                    System.out.printf("%-15s %-20s %-10.2f %-10d\n", produto.getCodigoProduto(),
                            produto.getNomeProduto(), produto.getValorProduto(), produto.getQtdEstoque());
                }
            
                System.out.println("============================================================");
                System.out.println("======= Relatório de Listagem de Produtos Finalizado =======");
                System.out.println("============================================================");
            
            System.out.println("\n\nTecle enter para Voltar ao menu");
            sc.nextLine();
            }

          

     }  while (opcao != 0);

     System.out.println("Fim do programa!");

     sc.close();
    }
      
       
}
