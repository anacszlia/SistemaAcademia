/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manipulacao.obj;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author anacs
 */
public class AlunoConvenio extends Aluno {
     private Convenio convenio;

    public AlunoConvenio(Convenio convenio) {
       this.convenio = convenio;
    }
    
    public Convenio getConvenio() {
        return convenio;
    }

    public void setConvenio(Convenio convenio) {
        this.convenio = convenio;
    }

     @Override
    public void setPlano(Plano plano) {
        this.plano = plano;
        if (verificaDesconto()) {
            valorMensalidade = plano.getValor() * (0.9 - convenio.getDesconto()/100);
        } else {
            System.out.println("Aluno não possui tempo para desconto,apenas é aplicado o valor do desconto do convenio");
            valorMensalidade = plano.getValor() * (1- convenio.getDesconto()/100);
        }

    }

    @Override
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

    @Override
    public String exibirDados() {
       
         //mostrar os dados herdados + o nome e percentual do convênio
        String aux=super.exibirDados();
        aux+="Nome do convênio:"+convenio.getNome()+ "\nPercentual do convênio:"+convenio.getDesconto();
        
        
        return aux;
         // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        
    
    }
    
    
   
}
