/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manipulacao.obj;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author anacs
 */
public class AvaliacaoFisica {
    private Aluno aluno;
    private LocalDate dataAtual;
    private double peso;
    private double altura;
    private int idade;
    private double imc;
    private Professor professor;
    
    DateTimeFormatter formato=DateTimeFormatter.ofPattern("dd/MM/yyyy");
    //construtores

    public AvaliacaoFisica(Aluno aluno) {
        this.aluno=aluno;
        dataAtual=LocalDate.now();

    }
    
//receber esses parametros,o restante é proveniente da classe pessoa
    
    AvaliacaoFisica(Aluno aluno,double altura,double peso) {
        this.altura=altura;
        this.aluno=aluno;
        this.peso=peso;
        dataAtual=LocalDate.now();
    }
    
    
    //metodos
     public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public void setAlturaPeso(double altura,double peso){
        this.altura=altura;
        this.peso=peso;
    }
    

    public int getIdade() {
        return idade;
    }
    public int calculaIdade(){
        Period diferenca=Period.between(aluno.getNascimento(),dataAtual);
        idade=diferenca.getYears();
        return idade;
    }
    
    @Override //sobreescrita(esse método já existe,apenas sobreescrevendo
    public String toString(){
        return "data realizada :"+dataAtual.format(formato) + " IMC: "+imc ; /*+ "->" + "Person" + name + "------"*/
    }
    public double calcularimc(){
        double imc = (peso / (altura * altura));
        this.imc=imc;
        return this.imc;
    }
    public void setProfessor(Professor prof){
        this.professor=prof;
    }
    
    
    public String exibirDados(){
        String concatena="Dados da avaliacao fisica do aluno \n";
        
        //tem outra forma
        if(aluno.getNome() !=null){
            concatena+="Nome: "+aluno.getNome()+"\n";
        }
        calculaIdade();
        if(idade != 0){
            concatena+="Idade:"+idade+"\n";
        }
        
        concatena+="Data da avaliacao:"+dataAtual.format(formato)+"\n" + "\nimc calculado:"+imc;
        concatena += "\nProfessor: "+professor;
        
       return concatena;
    }
    
    
    

    public Professor getProfessor() {
        return professor;
    }

    
    
    
        
    
    
}
