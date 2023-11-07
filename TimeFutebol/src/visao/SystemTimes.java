package visao;

import controle.TimeFutebol;
import java.util.Scanner;


public class SystemTimes {
    
public static void main(String[] args) {
        int op;

        TimeFutebol escolhaOpcao = new TimeFutebol();

        while (true) {

            op = imprimirMenu();

            if (op == 0) {
                System.out.println("Finalizando Programa!");
                break;
            }
            
            switch (op) {
                case 1:
                    escolhaOpcao.cadastrarTime();
                    break;
                    
                case 3:
                    escolhaOpcao.removerTimesDisponiveis();
                    break;
      
                case 4:
                    escolhaOpcao.listarTimesDisponiveis();
                    break;

                case 5:
                    escolhaOpcao.visualizarTimesDisponiveis();
                    break;
                    
                case 7:
                    //escolhaOpcao.pesquisarTimesDisponiveis();
                    break;
            }
        }
    }

    public static int imprimirMenu() {
        int op = -1;

        Scanner ler = new Scanner(System.in);

        System.out.println("...:::  Menu  :::...");
        System.out.println(""
                + "\t1) Cadastrar\n"    // Digitar todos os atributos da classe modelo criada para cada um
                + "\t2) Editar\n"       // Pesquisar e editar um contato, se ele não existe avisar o usuário com mensagem
                + "\t3) Remover\n"      // Pesquisar e remover um contato, fazer a confirmação da exclusão via msg para o usuário
                + "\t4) Listar\n"       // Listar é mostrar os dois atributos mais relavante da classe de todos os objetos da lista
                + "\t5) Visualizar\n"   // Visualizar é exibir todos os atributos de um contato pesquisado
                + "\t6) Ordenar\n"      // Ordenar // vamos implementar na próxima aula
                + "\t7) Pesquisar\n"    // Pesquisar por um certo contato, ler um nome e pesquisar em toda a lista e depois chamar o visualizar para apresentar os contatos
                + "\t0) Sair");
        System.out.print("Digite a Opção-> ");

        op = ler.nextInt();

        return op;
    }
    
     public static String lerPesquisaTimes() {
  
         Scanner ler = new Scanner(System.in);
        
        String timeProcurado = null;
         
        System.out.println("Digite o nome do time:");
        
        timeProcurado = ler.next();
        
        return timeProcurado;
       

    }
}
