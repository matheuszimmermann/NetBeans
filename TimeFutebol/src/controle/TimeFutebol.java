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
}
