public class Usuario {
    int id;
    String username, psw, name;
    boolean autenticar;
      
    Usuario (){
        
    }

    Usuario(String name, String psw, String username) {
        this.id = 0;
        this.username = username;
        this.name = name;
        this.psw = psw;
        
    }
}
