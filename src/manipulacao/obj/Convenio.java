/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manipulacao.obj;

/**
 *
 * @author anacs
 */
public class Convenio {
    private String nome;
    private  String descricao;
    private double desconto;
    
    public Convenio(String nome,String descricao,double valor){
        this.nome=nome;
        this.descricao=descricao;
        this.desconto=valor;
    }
    public Convenio(){
        
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

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double valor) {
        this.desconto = valor;
    }
    
      @Override
    public String toString() {
        return nome + " - "+desconto+"%";
    }
    
    
}
