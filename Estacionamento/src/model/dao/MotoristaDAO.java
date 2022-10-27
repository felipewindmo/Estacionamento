package model.dao;
import model.bean.Motorista;
import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class MotoristaDAO {
    public void create(Motorista m){
    Connection con = ConnectionFactory.getConnection();
    PreparedStatement stmt = null;
    
    try{
    stmt = con.prepareStatement("INSERT INTO motorista (Nome, Email, Senha, Rg, Cpf, Genero, Celular )VALUES (?, ?, ?, ?, ?, ?, ?)");
    stmt.setInt(1, m.getRg());
    stmt.setString(2, m.getNome());
    stmt.setString(3, m.getEmail());
    stmt.setString(4, m.getSenha());
    stmt.setString(5, m.getGenero());
    stmt.setInt(6, m.getCelular());
    stmt.setInt(7, m.getCpf());
    stmt.executeUpdate();
    JOptionPane.showMessageDialog(null, "Motorista salvo com sucesso!");
    }catch (SQLException e){
    JOptionPane.showMessageDialog(null, "Erro ao salvar: " + e);
    }finally{
   ConnectionFactory.closeConnection(con, stmt);
    }
    
    }
}
