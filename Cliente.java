import java.util.Date;

public class Cliente extends Usuario {
    int id, qutcompras;
    String endereco, telefone, nome;
    double valorcompra;
    Date dtcadastro;
    Usuario usuario;

    Cliente(int  id, String endereco, String telefone, String nome) {
        
        this.id = 0;
        this.endereco = endereco;
        this.telefone = telefone;
        this.nome = nome;
        this.dtcadastro = new Date();
        this.usuario = new Usuario(name, psw, username);
    }

}
