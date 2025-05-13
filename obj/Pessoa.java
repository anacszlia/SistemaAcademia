/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manipulacao.obj;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 20241PF.CC0014
 */
public class Pessoa {

    //encapsulamento
    private LocalDate dataNascimento;
    private String nome;
    private String CPF;
    private List<AvaliacaoFisica> avaliacoes;
    //construtores
    Pessoa(String nome) {
        this.nome = nome;
        this.avaliacoes = new ArrayList<>();
    }
    Pessoa(){
        this.avaliacoes = new ArrayList<>();
    }



    Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.CPF = cpf;
        this.avaliacoes = new ArrayList<>();
    }

    Pessoa(String nome, String cpf, LocalDate dtnas) {
        this.nome = nome;
        this.CPF = cpf;
        this.dataNascimento = dtnas;
    }
    

    // Métodos de acesso (Getters e Setters)
    public String getNome() {
        return nome;
    }
    
    public List getAvaliacao(){
        return avaliacoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNasc) {
        //pega a variavel global e atribui a desse método 
        this.dataNascimento = dataNasc;
    }

    public String getCpf() {
        return CPF;
    }
    public void addAvaliacao(AvaliacaoFisica av){
        //adicionar uma avaliação à lista
        this.avaliacoes.add(av);
    }
    

    public void setCpf(String cpf) {
        cpf = cpf.replace(".", "").replace("-", "").trim();
        if (cpf != null && cpf.length() == 11) {
            this.CPF = cpf;
        } else {
            System.out.println("CPF inválido.");
           
        }

    }
    @Override
    public String toString(){
        return nome; /*+ "->" + "Person" + name + "------"*/
    }
    public String mostraAvaliacoes(){
        String aux="Historico de Avaliações\n";
        //de cada pessoa
        for(AvaliacaoFisica i:avaliacoes){
            aux+=i+"\n";
        }
        return aux;
    }

    //metodos desse objeto(pessoa) para exibir informações
    public String exibirDados() {
        String aux = "Dados da pessoa cadastrada:";
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        aux += "Nome " + nome + "\n";
        if ((CPF != null)) {
            aux += "Cpf " + CPF + "\n";
        }
        if (dataNascimento != null) {
            aux += "Data de Nascimento: " + formato.format(dataNascimento);
        }
        
        //o tamanho da lista de avalicoes de cada aluno
       // 

        return aux;
    }

}
