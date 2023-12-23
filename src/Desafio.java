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
        double valorTransferencia = 0;
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

            if(opcao == 1){
                System.out.println("O Saldo atual é: R$"+ saldoConta);
            }else if (opcao == 2){
                System.out.println("Qual valor deseja transferir: ");
                valorTransferencia = leitura.nextDouble();
                if(valorTransferencia > saldoConta){
                    System.out.println("Saldo insuficiente para realizar a transferencia!");
                }else{
                    saldoConta-= valorTransferencia;
                    System.out.println("Transferência realizada com sucesso!");
                    System.out.println("Seu saldo atual agora é: "+saldoConta);
                    valorTransferencia = 0;
                }
            }else if (opcao == 3){
                System.out.println("Qual valor a receber: ");
                valorTransferencia = leitura.nextDouble();
                saldoConta+= valorTransferencia;
                System.out.println("Valor Recebido com sucesso!");
                System.out.println("Seu saldo atual agora é: "+saldoConta);
                valorTransferencia = 0;
            }else if (opcao != 4){
                System.out.println("Opção Inválida!");
            }
        }
    }
}
