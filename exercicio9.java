import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] produtos = {
            "Cachorro quente",
            "Bauru Simples",
            "Bauru com ovo",
            "Hambúrguer",
            "Cheeseburguer",
            "Refrigerante"
        };
        
        double[] precos = {1.20, 1.30, 1.50, 1.20, 1.30, 1.00};

        double valorTotalCompra = 0;
        boolean continuarComprando = true;

        while (continuarComprando) {

            System.out.println("Código\tProduto\t\tPreço");
            for (int i = 0; i < produtos.length; i++) {
                System.out.printf("%d\t%s\t%.2f\n", 100 + i, produtos[i], precos[i]);
            }

            System.out.print("Digite o código do produto: ");
            int codigo = scanner.nextInt();

            if (codigo < 100 || codigo > 105) {
                System.out.println("Código inválido! Tente novamente.");
                continue;
            }

            System.out.print("Digite a quantidade: ");
            int quantidade = scanner.nextInt();

            double valorProduto = precos[codigo - 100];
            double totalProduto = valorProduto * quantidade;

            valorTotalCompra += totalProduto;

            System.out.printf("Total do produto %s: R$ %.2f\n", produtos[codigo - 100], totalProduto);

            System.out.print("Deseja continuar comprando? (s/n): ");
            char resposta = scanner.next().charAt(0);
            continuarComprando = (resposta == 's' || resposta == 'S');
        }

        System.out.printf("Valor total da compra: R$ %.2f\n", valorTotalCompra);

        scanner.close();
    }
}
