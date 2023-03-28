/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControllerDAO;

import Connection.ConnectionFactory;
import Modelo.CadastroProdutos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.List;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author MANHICA
 */
public class ProdutosDAO {

    public void create(CadastroProdutos p) {
        Connection con = (Connection) ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = (PreparedStatement) con.prepareStatement("INSERT INTO tbprodutos (Nome, Marca,Modelo,Referencia,ValorDeCompra,ValorDeVenda,Quantidade, AnoFabrico) VALUES (?, ?,?,?,?,?,?,?)");

            stmt.setString(1, p.getNomeProduto());
            stmt.setString(2, p.getMarca());
            stmt.setString(3, p.getModelo());
            stmt.setString(4, p.getReferenciaPeca());
            stmt.setDouble(5, p.getValorDeCompra());
            stmt.setDouble(6, p.getValorDeVenda());
            stmt.setInt(7, p.getQuantidade());
            stmt.setInt(8, p.getAnoFabrico());
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
        String sql = "select * from tbprodutos";

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
     public void update(CadastroProdutos p) {
        Connection con = (Connection) ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = (PreparedStatement) con.prepareStatement("UPDATE tbprodutos SET Nome=?, Marca = ?,Modelo = ?,Referencia = ?,ValorDeCompra = ?,ValorDeVenda = ?,Quantidade = ?, AnoFabrico = ? WHERE Id = ?");
            
            stmt.setString(1, p.getNomeProduto());
            stmt.setString(2, p.getMarca());
            stmt.setString(3, p.getModelo());
            stmt.setString(4, p.getReferenciaPeca());
            stmt.setDouble(5, p.getValorDeCompra());
            stmt.setDouble(6, p.getValorDeVenda());
            stmt.setInt(7, p.getQuantidade());
            stmt.setInt(8, p.getAnoFabrico());
            stmt.setInt(9, p.getId());
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Actualizado com sucesso");

        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(ProdutosDAO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao Actualizar" + ex);
        } finally {
            ConnectionFactory.fecharConexao(con, stmt);
        }

    }
     public void delete(CadastroProdutos p) {
        Connection con = (Connection) ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = (PreparedStatement) con.prepareStatement("DELETE FROM tbprodutos  WHERE Id = ?");
            
            stmt.setInt(1, p.getId());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Removido  com sucesso");

        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(ProdutosDAO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao Remover" + ex);
        } finally {
            ConnectionFactory.fecharConexao(con, stmt);
        }

    }

}
