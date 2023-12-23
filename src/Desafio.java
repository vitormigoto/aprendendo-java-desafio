import java.util.Scanner;
public class Desafio {

    public static void main(String[] args) {
        /*
        Objetivo: Criar um controle de conta virtual
        Dados do cliente virtual:
            Nome:               Vitor Migoto
            Tipo de Conta:      Corrente
            Saldo Inicial:      R$ 100,00
        */

        String nomeCliente = "Vitor Migoto";
        String tipoConta = "Corrente";
        double saldoConta = 100;
        int opcao = 0;

        // Exibindo dados do cliente
        System.out.println("******************************************************");
        System.out.println("Nome do Cliente:        " + nomeCliente);
        System.out.println("Tipo de Conta:          " + tipoConta);
        System.out.println("Saldo Inicial:          R$ " + saldoConta);
        System.out.println("******************************************************");

        String menu = """
                ** Digite a opção desejada **
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Sair
                
                """;

        Scanner leitura = new Scanner(System.in);
        while( opcao != 4){
            System.out.println(menu);
            opcao = leitura.nextInt();

        }
    }
}
