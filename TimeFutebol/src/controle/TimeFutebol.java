package controle;

import java.util.ArrayList;
import java.util.Scanner;
import modelo.Time;

public class TimeFutebol {

    private ArrayList<Time> listaTimes = new ArrayList<>();
    

    public ArrayList<Time> getListarTimes() {
        return listaTimes;
    }

    public void setListarTimes(ArrayList<Time> listaDeTimes) {
        this.listaTimes = listaDeTimes;
    }

    public void cadastrarTime() {
        System.out.println("...:::  Adicionar Time :::...");
        System.out.println("--------------------------------");

        Time timess = new Time();
        timess.lerTimes();
        listaTimes.add(timess);

        System.out.println("----------------------------");
    }

    public void listarTimesCadastrados() {
        System.out.println("...:::  Listar Times :::...");
        System.out.println("----------------------------");

        for (int i = 0; i < listaTimes.size(); i++) {
            Time timess = listaTimes.get(i);
            timess.listarTimes();
        }

        System.out.println("----------------------------");
    }

    public void visualizarTimesCadastrados() {
        System.out.println("...:::  Visualizar Times :::...");
        System.out.println("----------------------------");

        for (int i = 0; i < listaTimes.size(); i++) {
            Time timess = listaTimes.get(i);
            timess.visualizarTimes();
        }

        System.out.println("----------------------------");
    }

    
    
    public void removerTimesDisponiveis() {
        
    System.out.println("...::: Remover Time :::...");
    System.out.println("------------------------------");

    Scanner ler = new Scanner(System.in);
    System.out.print("Time para Remover: ");
    String nomeTime = ler.next();

    Time timeEncontrado = null;

    for (Time time : listaTimes) {
        if (time.getNome().equals(nomeTime)) {
            timeEncontrado = time;
            break;  
        }
    }

    if (timeEncontrado != null) {
        listaTimes.remove(timeEncontrado);
        System.out.println("");
        System.out.println("Time Removido!");
        
    } else {
        System.out.println("O time pesquisado nao existe!!!!.");
    }

    System.out.println("----------------------------");
}


    
        
    
    public void pesquisarTimesCadastrados() {
        
        System.out.println("...::: Pesquisar Time :::...");
        System.out.println("------------------------------");
       
        Scanner ler = new Scanner(System.in);
        System.out.print("Pesquisar: ");
        String nomeTime = ler.next();
       
        Time timePrintado = null;

        for (Time time : listaTimes) {
            
            if (time.getNome().equals(nomeTime)) {
                timePrintado = time;
                timePrintado.pesquisarTimes();
                
            }else {
                      System.out.println(); 
                      System.out.println("Time nao cadastrado!!!!"); 
                      System.out.println(); 
                    }
                
        }
      
        System.out.println("----------------------------");
    }
    
    public void editarTimesCadastrados() {
    System.out.println("...::: Editar Time :::...");
    System.out.println("------------------------------");

    Scanner ler = new Scanner(System.in);
    System.out.print("Nome do time a ser editado: ");
    String nomeTime = ler.next();

    boolean timeProcurado = false;

    for (Time time : listaTimes) {
        if (time.getNome().equalsIgnoreCase(nomeTime)) {
            System.out.print("Digite o novo id: ");
            int novoId = ler.nextInt();
            
            System.out.print("Digite o novo nome do time: ");
            String novoNomeTime = ler.next();
            
            System.out.print("Numero de Titulos: ");
            int novoNumTitulos= ler.nextInt();
            
            System.out.print("Nova Idade: ");
            int novoIdade = ler.nextInt();
            
            System.out.print("Torcedores: ");
            int novoTorcedores = ler.nextInt();

            time.setIdTime(novoId);
            time.setNome(novoNomeTime);
            time.setTitulos(novoNumTitulos);
            time.setIdade(novoIdade);
            time.setTorcedores(novoTorcedores);
            break;
        }
        
        if (! timeProcurado) {
        System.out.println("Time não cadastrado");
    } else{
        System.out.println("Time Editado");
    }

    }

    System.out.println("----------------------------");
}

}
