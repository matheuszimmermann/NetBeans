package controle;

import java.util.ArrayList;
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

    public void listarTimesDisponiveis() {
        System.out.println("...:::  Listar Times :::...");
        System.out.println("----------------------------");

        for (int i = 0; i < listaTimes.size(); i++) {
            Time timess = listaTimes.get(i);
            timess.listarTimes();
        }

        System.out.println("----------------------------");
    }

    public void visualizarTimesDisponiveis() {
        System.out.println("...:::  Visualizar Times :::...");
        System.out.println("----------------------------");

        for (int i = 0; i < listaTimes.size(); i++) {
            Time timess = listaTimes.get(i);
            timess.visualizarTimes();
        }

        System.out.println("----------------------------");
    }
    
     public void removerTimesDisponiveis() {
        System.out.println("...:::  Remover Time :::...");
        System.out.println("----------------------------");

        for (int i = 0; i < listaTimes.size(); i++) {
            Time timess = listaTimes.remove(i);
            timess.visualizarTimes();
        }
        System.out.println("----------------------------");
        System.out.println("Time Removido!!!");
        System.out.println("----------------------------");

    }
    

}
