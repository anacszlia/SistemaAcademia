/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manipulacao.obj;

/**
 *
 * @author 20241PF.CC0014
 */

//herança
public class Professor extends Funcionario{
   private String especializacao;


    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }
    
   @Override //assinatura
    public String exibirDados() {
        //vai pegar do objeto pai Pessoa
        String aux=super.exibirDados(); 
        aux+="\nEspecialização:"+especializacao;
        return aux;
    }
    
    @Override
    public double calculaSalarioMes() {
        return salario * 1.25;
    }
    
  
}
