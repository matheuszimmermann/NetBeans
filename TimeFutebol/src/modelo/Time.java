package modelo;

import java.util.Scanner;

public class Time {
    
    private String nome;
    private int idTime;
    private int titulos;
    private int idade;
    private int torcedores;
    
    
    //Construtor de inicializacao
    public Time(String nome, int idTime, int titulos, int idade, int torcedores) {
        this.nome = nome;
        this.idTime = idTime;
        this.titulos = titulos;
        this.idade = idade;
        this.torcedores = torcedores;
    }

    //Construtor Padrao
    public Time() {
        
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdTime() {
        return idTime;
    }

    public void setIdTime(int idTime) {
        this.idTime = idTime;
    }

    public int getTitulos() {
        return titulos;
    }

    public void setTitulos(int titulos) {
        this.titulos = titulos;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getTorcedores() {
        return torcedores;
    }

    public void setTorcedores(int torcedores) {
        this.torcedores = torcedores;
    }

    
    
    public void lerTimes() {
        Scanner ler = new Scanner(System.in);

        System.out.print("Nome do Time:");
        this.setNome(ler.next());
        
        System.out.print("Pontos:");
        this.setIdTime(ler.nextInt());

        System.out.print("Titulos:");
        this.setTitulos(ler.nextInt());

        System.out.print("Idade:");
        this.setIdade(ler.nextInt());

        System.out.print("Torcedores:");
        this.setTorcedores(ler.nextInt());

    }

    public void visualizarTimes() {
        System.out.println("Nome:" + this.getNome());
        System.out.println("Pontos:" + this.getIdTime());
        System.out.println("Titulos:" + this.getTitulos());
        System.out.println("Idade:" + this.getIdade());
        System.out.println("Torcedores:" + this.getTorcedores());

        System.out.println();
    }

    public void listarTimes() {

        System.out.println("Nome:" + this.getNome());
        System.out.println("Pontos:" + this.getIdTime());

        System.out.println();
    }
    
    public void pesquisarTimes() {
        
       System.out.println();
       System.out.println("Nome:" + this.getNome());
       System.out.println("Pontos:" + this.getIdTime());

        System.out.println();
    }
}

    
