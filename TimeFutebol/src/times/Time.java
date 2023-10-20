/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package times;

/**
 *
 * @author aluno
 */
public class Time {
    
    private int idTime;
    private String nome;
    private int titulos;
    private int idade;
    private int torcedores;
    
    

    //Construtor de inicializacao
    public Time(int idTime, String nome, int titulos, int idade, int torcedores) {
        this.idTime = idTime;
        this.nome = nome;
        this.titulos = titulos;
        this.idade = idade;
        this.torcedores = torcedores;
    }

    //Construtor Padrao
    public Time() {
        
    }

    public int getIdTime() {
        return idTime;
    }

    public void setIdTime(int idTime) {
        this.idTime = idTime;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    
    @Override
    public String toString() {
        return "Time{" + "idTime=" + idTime + ", nome=" + nome + ", titulos=" + titulos + ", idade=" + idade + ", torcedores=" + torcedores + '}';
    }
    
    
}
