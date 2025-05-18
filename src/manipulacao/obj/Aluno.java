/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manipulacao.obj;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 20241PF.CC0014
 */
public class Aluno extends Pessoa {

    protected String matricula;
    protected List<AvaliacaoFisica> avaliacoes = new ArrayList<>();
    protected LocalDate dataMatricula;
    protected Plano plano;
    protected double valorMensalidade;

    //DateTimeFormatter formato=DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public void addAvaliacao(AvaliacaoFisica av) {
        //adicionar uma avaliação à lista
        avaliacoes.add(av);
    }

    public String mostraAvaliacoes() {
        String aux = "Historico de Avaliações\n";
        //de cada pessoa
        for (AvaliacaoFisica i : avaliacoes) {
            aux += i + "\n";
        }
        return aux;
    }

    public String getMatricula() {
        return matricula;
    }

    public LocalDate getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(LocalDate dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String exibirDados() {
        
        
        String aux=super.exibirDados();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        aux += "\nMatricula: " + matricula;
        if (dataMatricula != null) {
            aux += "\nData de Matrícula: " + formato.format(dataMatricula);
        }
        aux += "\nAvaliações Físicas Realizadas: "
                + avaliacoes.size(); 
        
        
        if(plano!=null)
            aux += "\nNome do plano:" + plano.getNome();
            aux += "\nValor Mensalidade: R$ "+valorMensalidade;
        
        
        aux += "\n";
        return aux;
    }

    public double getValorMensalsidade() {
        return valorMensalidade;
    }

    public void setPlano(Plano plano) {
        this.plano = plano;
        if (verificaDesconto()) {
            valorMensalidade = plano.getValor() * 0.9;
        } else {
            System.out.println("Aluno não possui tempo para desconto");
            valorMensalidade = plano.getValor();
        }

    }

    public boolean verificaDesconto() {
        int meses = Period.between(dataMatricula, LocalDate.now()).getMonths();
        int anos=Period.between(dataMatricula, LocalDate.now()).getYears();
        
        meses+=(anos*12);
        if (meses >= 3) {
            return true;
        } else {
            return false;
        }
    }

}
