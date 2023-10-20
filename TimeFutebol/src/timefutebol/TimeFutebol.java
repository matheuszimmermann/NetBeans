package timefutebol;

import java.util.Scanner;
import times.Time;


public class TimeFutebol {
    
    final static Scanner LER = new Scanner(System.in);
    
    

    public static void main(String[] args) {
        
        Time time1 = new Time();
        
        time1 = lerTime(time1);
        
        System.out.println(time1.toString());
       
    }
    
    public static Time lerTime(Time t){
        
        System.out.println("id:");
        t.setIdTime(LER.nextInt());
        
        System.out.println("Nome:");
        t.setNome(LER.next());
        
        System.out.println("Titulos:");
        t.setTitulos(LER.nextInt());
        
        System.out.println("Idade:");
        t.setIdade(LER.nextInt());
        
        System.out.println("Torcedores:");
        t.setTorcedores(LER.nextInt());
        
        return t;
    }
    
}
