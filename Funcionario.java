
import java.util.Date;

public class Funcionario {

    int id, qntvendas;
    double salario;
    String banco;
    Date dataadmissao;
    String nome, tempcontrato;

    Funcionario(int id, int qntvendas, double salario, String nome, String tempcontrato) {
        this.id = id;
        this.qntvendas = qntvendas;
        this.salario = salario;
        this.nome = nome;
        this.tempcontrato = tempcontrato;

    }
}
