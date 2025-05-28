/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manipulacao.obj;

/**
 *
 * @author anacs
 */
public class Gerente extends Funcionario {
   

    @Override
    public double calculaSalarioMes() {
        return salario * 1.5;
    }
 
}
