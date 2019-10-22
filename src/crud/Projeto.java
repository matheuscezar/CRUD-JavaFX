/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Mario
 */
public class Projeto {

    public static void removerProjeto(Connection conexao, String codigo) {
        try {

            String SQL = "DELETE FROM projeto WHERE codigo = ?";
            
            PreparedStatement query = conexao.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            query.setInt(1, Integer.parseInt(codigo));
            int affectedRows = query.executeUpdate();
            if (affectedRows > 0) {
                System.out.println ("Registro removido com sucesso.");
            } 
        } catch (SQLException e) {
            System.out.println("A remoção falhou.");
            e.printStackTrace();
        }
    }
    private String descricao;
    private String codigo;
    private String local;
    private String departamento;

    public Projeto(String descricao, String codigo, String local, String departamento) {
        this.descricao = descricao;
        this.codigo = codigo;
        this.local = local;
        this.departamento = departamento;
    }
    
    

    public String getDescricao() {
        return descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getLocal() {
        return local;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    public static ArrayList listarProjetos(java.sql.Connection conexao) {
        ArrayList<Projeto> lista_projetos = new ArrayList();
        try {
            Statement query = conexao.createStatement();

            ResultSet resultSet = query.executeQuery("SELECT * FROM projeto  ORDER BY descricao");
                    
            while (resultSet.next()) {
                //System.out.printf(resultSet.getString("nome"));
                lista_projetos.add(new Projeto(resultSet.getString("descricao"),resultSet.getString("codigo"),resultSet.getString("local"),resultSet.getString("departamento")));
            }
        } catch (SQLException e) {
            System.out.println("A consulta falhou.");
            e.printStackTrace();
        }
        return lista_projetos;
    }
    
    public static void atualizarProjeto(java.sql.Connection conexao, String descricao, String codigo, String local,
           String departamento) {
            System.out.println("Inicio UPDATE"); 
        try {
            String query = "UPDATE projeto SET descricao = ?, local = ?, departamento = ? WHERE codigo = ?";
            PreparedStatement preparedStmt = conexao.prepareStatement(query);
            preparedStmt.setString(1, descricao);
            preparedStmt.setString(2, local);
            preparedStmt.setInt(2, Integer.parseInt(departamento));
            preparedStmt.setInt(2, Integer.parseInt(codigo));
            System.out.println("Antes do Execute - UPDATE"); 
            preparedStmt.executeUpdate();
            conexao.close();
            System.out.println("Departamento atualizado com sucesso!");        
        } catch (SQLException e) {
            System.out.println("Update falhou.");
            e.printStackTrace();
        }

    }
    
    public static void inserirProjeto(java.sql.Connection conexao, String descricao, String codigo, String local, String departamento) {
        try {

            String SQL = "INSERT INTO departamento (nome, codigo, gerente, iniciogerente) VALUES ('"+descricao+"', "+Integer.parseInt(codigo)+",'"+local+"' , '2011-11-11')";

            PreparedStatement query = conexao.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);

            int affectedRows = query.executeUpdate();
            if (affectedRows > 0) {
                System.out.println ("Registro inserido com sucesso.");
            } 
        } catch (SQLException e) {
            System.out.println("A insercao falhou.");
            e.printStackTrace();
        }
        
    }
}


