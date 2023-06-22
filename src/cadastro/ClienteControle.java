package cadastro;


public class ClienteControle<T> {
    private Cliente<T> cliente;

    public ClienteControle(Cliente<T> cliente) {
        this.cliente = cliente;
    }
    
     public void imprimirCliente() {
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Sobrenome: " + cliente.getSobrenome());
        System.out.println("Idade: " + cliente.getIdade());
        System.out.println("Endereco: " + cliente.getEndereco());
        System.out.println("E-mail: " + cliente.getEmail());
    }
    
}
