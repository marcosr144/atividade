package cadastro;


public class Cliente<T> {
    private T nome;
    private T sobrenome;
    private T idade;
    private T endereco;
    private T email;

    public Cliente(T nome, T sobrenome, T idade, T endereco, T email) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.endereco = endereco;
        this.email = email;
    }

    public T getNome() {
        return nome;
    }

    public void setNome(T nome) {
        this.nome = nome;
    }

    public T getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(T sobrenome) {
        this.sobrenome = sobrenome;
    }

    public T getIdade() {
        return idade;
    }

    public void setIdade(T idade) {
        this.idade = idade;
    }

    public T getEndereco() {
        return endereco;
    }

    public void setEndereco(T endereco) {
        this.endereco = endereco;
    }

    public T getEmail() {
        return email;
    }

    public void setEmail(T email) {
        this.email = email;
    }
    
   
    
}
