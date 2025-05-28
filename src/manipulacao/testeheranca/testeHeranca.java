/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manipulacao.testeheranca;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import manipulacao.obj.Aluno;
import manipulacao.obj.AlunoConvenio;
import manipulacao.obj.AvaliacaoFisica;
import manipulacao.obj.Convenio;
import manipulacao.obj.Exibivel;
import manipulacao.obj.Impressora;
import manipulacao.obj.Plano;
import manipulacao.obj.Professor;

/**
 *
 * @author 20241PF.CC0014
 */
public class testeHeranca {
    public static void main(String[] args) {
        
         
        
        
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        Professor p=new Professor();
        p.setNome("ana cluadia");
         p.setCpf("123.123.123-67");
        p.setEspecializacao("personal trainer de felinos obesos");
        System.out.println(p.exibirDados());

        System.out.println("---- ");
        Plano plano1=new Plano("A","Obesidade mórbida",200);
        Plano plano2=new Plano("B","Pilates",120);
        
        
        
        Aluno a=new Aluno();
        a.setNome("chiquinho");
        a.setDataNascimento(LocalDate.parse("10/01/2008", formato));
        a.setMatricula("123");
        a.setCpf("123.123.133-55");
        AvaliacaoFisica av1=new AvaliacaoFisica(a);
        av1.setAlturaPeso(0.32,8.4);
        av1.calcularimc();
        av1.setIdade(2);
        a.addAvaliacao(av1);
        av1.setProfessor(p);
        System.out.println(a.exibirDados());
        System.out.println("---- ");
        System.out.println(av1.exibirDados());
        System.out.println("---- ");
        


//novos testes
        
        
        
        Aluno aluno1=new Aluno();
        aluno1.setNome("Florencio");
        aluno1.setDataMatricula(LocalDate.of(2024,01,23));
        aluno1.setMatricula("2024Abcd");
        aluno1.setPlano(plano1);
        System.out.println(aluno1.exibirDados());
        System.out.println("---- ");
        
        
        Aluno aluno2=new Aluno();
        aluno2.setNome("Valdespino");
        aluno2.setDataMatricula(LocalDate.of(2025,03,23));
        aluno2.setMatricula("2025Abcd");
        aluno2.setPlano(plano2);
        System.out.println(aluno2.exibirDados()); 
        
        Convenio c1 = new Convenio();
        c1.setNome("IFSUL");
        c1.setDesconto(5);
        
        AlunoConvenio a3 = new AlunoConvenio(c1);
        a3.setNome("Vivente");
        a3.setMatricula("123");
        a3.setDataNascimento(LocalDate.of(2002,04,24)); 
        a3.setDataMatricula(LocalDate.parse("10/04/2024", formato));
        a3.setPlano(plano2);
        System.out.println(a3.exibirDados());
        
        
         System.out.println("---- ");
        
        AlunoConvenio a4 = new AlunoConvenio(c1);
        a4.setNome("Ana Claudia");
        a4.setMatricula("123567");
        a4.setDataNascimento(LocalDate.of(2002,04,24)); 
        a4.setDataMatricula(LocalDate.parse("10/04/2025", formato));
        a4.setPlano(plano2);
        System.out.println(a4.exibirDados());
        
        
        Impressora.imprimirDados(p); // p é uma instância de Professor
        Impressora.imprimirDados(plano1); // plano1 é uma instância de Plano
        Impressora.imprimirDados(av1); // av1 é uma instância de AvaliacaoFisica
        Impressora.imprimirDados(a); // a é uma instância de Aluno
        
    }
}
