import java.util.Scanner;


public class SistemaVendas {
    public static void main(String[] args) throws Exception {

    int opcao;
    Scanner sc = new Scanner(System.in);
    
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
                
                
            }



     }  while (opcao != 0);

     System.out.println("Fim do programa!");

     sc.close();
    }
      
       
}
