/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Mario
 */
public class Departamento {
    
    private String nome;
    private String codigo;
    private String dataGerencia;
    private String gerente;

    public Departamento(String nome, String codigo, String gerente, String dataGerencia) {
        this.nome = nome;
        this.codigo = codigo;
        this.dataGerencia = dataGerencia;
        this.gerente = gerente;
    }
    
    
     public static void atualizarDepartamento(java.sql.Connection conexao, String nome, String codigo, String gerente,
           String dtgerencia) {
            System.out.println("Inicio UPDATE"); 
        try {
            String query = "UPDATE departamento SET nome = ?, gerente = ? WHERE codigo = ?";
            PreparedStatement preparedStmt = conexao.prepareStatement(query);
            preparedStmt.setString(1, nome);
            preparedStmt.setString(2, gerente);
            preparedStmt.setInt(3, Integer.parseInt(codigo));
            System.out.println("Antes do Execute - UPDATE"); 
            preparedStmt.executeUpdate();
            conexao.close();
            System.out.println("Departamento atualizado com sucesso!");        
        } catch (SQLException e) {
            System.out.println("Update falhou.");
            e.printStackTrace();
        }

    }
    
    
    public static void inserirDepartamento(java.sql.Connection conexao, String nome, String codigo, String dtgerencia, String gerente) {
        try {

            String SQL = "INSERT INTO departamento (nome, codigo, gerente, iniciogerente) VALUES ('"+nome+"', "+Integer.parseInt(codigo)+", '215112118', '2011-11-11')";

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

    public static ArrayList listarDepartamentos(java.sql.Connection conexao) {
        ArrayList<Departamento> lista_departamentos = new ArrayList();
        try {
            Statement query = conexao.createStatement();

            ResultSet resultSet = query.executeQuery("SELECT * FROM departamento d LEFT JOIN local l ON d.codigo = l.departamento ORDER BY d.nome");
                    
            while (resultSet.next()) {
                System.out.printf(resultSet.getString("nome"));
                lista_departamentos.add(new Departamento(resultSet.getString("nome"),resultSet.getString("codigo"),resultSet.getString("gerente"),resultSet.getString("iniciogerente")));
            }
        } catch (SQLException e) {
            System.out.println("A consulta falhou.");
            e.printStackTrace();
        }
        return lista_departamentos;
    }
    
    public static void removerDepartamento(java.sql.Connection conexao, String codigo) {
        try {

            String SQL = "DELETE FROM departamento WHERE codigo = ?";
            
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

    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDataGerencia() {
        return dataGerencia;
    }

    public String getGerente() {
        return gerente;
    }
    
    
    
}
