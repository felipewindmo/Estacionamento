package model.dao;
import model.bean.Motorista;
import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.util.List;
import java.util.ArrayList;
import java.sql.ResultSet;
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
    public List<Motorista> read() {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Motorista> motoristas = new ArrayList<>();
        try{
            stmt = con.prepareStatement("SELECT * FROM motorista;");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Motorista m = new Motorista();
                m.setIdMotorista(rs.getInt("idMotorista"));
                m.setNome(rs.getString("nome"));
                m.setGenero(rs.getString("genero"));
                m.setRg(rs.getInt("rg"));
                m.setCpf(rs.getInt("cpf"));
                m.setCelular(rs.getInt("celular"));
                m.setEmail(rs.getString("email"));
                m.setSenha(rs.getString("senha"));
                motoristas.add(m);
            }
        } catch(SQLException e) {
            throw new RuntimeException("Erro ao buscar os dados: ", e);
        } finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return motoristas;
    }
}
