

package Dao;




import factory.ConnectionFactory;
import lavajato.LavaJato;
import java.sql.*;
import java.sql.PreparedStatement;


public class clienteDao {
   private final Connection connection;
   long id_cliente;
   String jTextNome;
   String jTextCpf;
   String jTextCep;
   String jTextCidade;
   String jTextEmail;
   String jTextTelefone;
   String jTextEndereco;
   String jTextEstado;
   String jTextCarros;
   String jTextPlaca;
   
   public clienteDao(){
       this.connection = new ConnectionFactory().getConnection();
    }

    public void adiciona(LavaJato cliente){

        String sql = "INSERT INTO cliente(nome,cpf,Email,Telefone,Endereco,Cep,Cidade,Estado,Carro,Placa) VALUES(?,?,?,?,?,?,?,?,?,?)";
        try {

            try (PreparedStatement stmt = this.connection.prepareStatement(sql)) {
                stmt.setString(1, cliente.getjTextNome());
                stmt.setString(2, cliente.getjTextCpf());
                stmt.setString(3, cliente.getjTextTelefone());
                stmt.setString(4, cliente.getjTextCidade());
                stmt.setString(5, cliente.getjTextEmail());
                stmt.setString(6, cliente.getjTextEndereco());
                stmt.setString(7, cliente.getjTextCep());
                stmt.setString(8, cliente.getjTextEstado());
                stmt.setString(9, cliente.getjTextCarros());
                stmt.setString(10, cliente.getjTextPlaca());
                
                stmt.execute();
                stmt.close();
            }

        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
}
