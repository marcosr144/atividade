package cadastro;

public class Cadastro {

 
    public static void main(String[] args) {
        Cliente<String> cliente = new Cliente<>("Rodrigo", "Silva", "30", "Rua 7", "joao.silva@example.com");
        
        ClienteControle<String> controle = new ClienteControle<>(cliente);
        
        controle.imprimirCliente();
         
    }
     
    
}
