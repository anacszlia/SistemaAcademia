/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manipulacao.obj;

import java.text.DecimalFormat;

/**
 *
 * @author 20241PF.CC0014
 */


//relacionamento entre aluno e plano
public class Plano implements Exibivel{
    private String nome;
    private String descricao;
    private double valor;
    DecimalFormat formatoMoeda = new DecimalFormat("#,##0.00");

    
    
    public Plano(String nome, String descricao, double valor) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    @Override
    public String toString() {
        
        return nome + " - " +formatoMoeda.format(valor);
    }

    public String exibirDados() {
        String aux = "Dados do Plano:";
        aux += "\nNome: "+nome;
        aux += "\nDescrição: "+descricao;
        aux += "\nValor: R$ "+formatoMoeda.format(valor);
        
        return aux;
                
    }
    
}


