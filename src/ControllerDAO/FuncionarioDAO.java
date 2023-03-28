/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControllerDAO;

import Connection.ConnectionFactory;
import Modelo.CadastroProdutos;
import Modelo.CadastroStaff;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author MANHICA
 */
public class FuncionarioDAO {
    
    public void create(CadastroStaff s) {
        Connection con = (Connection) ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = (PreparedStatement) con.prepareStatement("INSERT INTO `carro`.`tbfuncionario` (`Id`, `Nome`, `Apelido`, `Email`, `Telefone`, `Sexo`, `Nacionalidade`, `EstadoCivil`, `Morada`, `Funcao`, `NivelAcesso`, `Nascimento`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

            stmt.setString(1, s.getNome());
            stmt.setString(2, s.getApelido());
            stmt.setString(3, s.getEmail());
            stmt.setInt(4, s.getTelefone());
            stmt.setString(5, s.getSexo());
            stmt.setString(6, s.getNacionalidade());
            stmt.setString(7, s.getEstadocivil());
            stmt.setString(8, s.getEstadocivil());
            stmt.setString(9, s.getMorada());
            stmt.setString(10, s.getFuncao());
            stmt.setString(11, s.getMorada());
            stmt.setString(12, s.getNivel());
            stmt.setDate(13, (Date) s.getDataNascimento());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");

        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(ProdutosDAO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao salva" + ex);
        } finally {
            ConnectionFactory.fecharConexao(con, stmt);
        }

    }
    
    
    

    public ArrayList<CadastroProdutos> ListarTodos() {

        PreparedStatement stmt = null;
        ResultSet resultado = null;
        Connection con = null;
        String sql = "select * from tbfuncionario";

            ArrayList <CadastroProdutos> lista = new ArrayList();
        try {
            con = ConnectionFactory.getConnection();
            stmt = con.prepareStatement(sql);
            resultado = stmt.executeQuery();
            while (resultado.next()) {
                CadastroProdutos Usuario = new CadastroProdutos();
                Usuario.setId(resultado.getInt(1));
                Usuario.setNomeProduto(resultado.getString(2));
                Usuario.setMarca(resultado.getString(3));
                Usuario.setReferenciaPeca(resultado.getString(5));
                Usuario.setQuantidade(resultado.getInt(8));
                Usuario.setValorDeCompra(resultado.getDouble(6));
                Usuario.setModelo(resultado.getString(4));
                Usuario.setValorDeVenda(resultado.getDouble(7));
                Usuario.setAnoFabrico(resultado.getInt(9));
                lista.add(Usuario);
            }
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e + " Erro ao buscar o registro", "Notificação", JOptionPane.ERROR);
        } finally {
            try {
                stmt.close();
                con.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e + "Erro na conexao");

            }
        }
        return lista;
    }

    
}
