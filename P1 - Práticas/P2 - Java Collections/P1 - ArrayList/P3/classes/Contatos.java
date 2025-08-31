package classes;

public class Contatos {
    //Atributo
    private String nome;
    private String email;
    private String telefone;

    //Construtor
    public Contatos(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }
    public Contatos() {}

    //Métodos Específicos da Classe
    @Override
    public String toString() {
        return "• Nome do Contato: "+nome+" | Email: "+email+" | Telefone: "+telefone;
    }

    //Getters & Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        //Retira todos os caracteres especiais
        telefone = telefone.replaceAll("[()\\s-]","");

        //Verifica se o comprimento da string é 10 ou 11
        if(telefone.matches("\\d{10,11}")) {
            this.telefone = telefone;
        }
        else {
            System.out.println("\nTelefone invalido! Informe o DDD juntamente ao N°.");
            this.telefone = null;
        }
    }
}
