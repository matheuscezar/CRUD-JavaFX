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
public class Empregado {
    private String nome;
    private String nomedomeio;
    private String sobrenome;
    private String codigo;
    private String dtnascimento;
    private String endereco;
    private String sexo;
    private String salario;
    private String gerente;
    private String departamento;

    Empregado(String nome) {
         //To change body of generated methods, choose Tools | Templates.
    }

    public Empregado(String nome, String nomedomeio, String sobrenome, String codigo, String dtnascimento, String endereco, String sexo, String salario, String gerente, String departamento) {
        this.nome = nome;
        this.nomedomeio = nomedomeio;
        this.sobrenome = sobrenome;
        this.codigo = codigo;
        this.dtnascimento = dtnascimento;
        this.endereco = endereco;
        this.sexo = sexo;
        this.salario = salario;
        this.gerente = gerente;
        this.departamento = departamento;
    }
    
    public static void removerEmpregado(java.sql.Connection conexao, String codigo) {
        try {

            String SQL = "DELETE FROM empregado WHERE codigo = ?";
            
            PreparedStatement query = conexao.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            query.setString(1, codigo);
            int affectedRows = query.executeUpdate();
            if (affectedRows > 0) {
                System.out.println ("Registro removido com sucesso.");
            } 
        } catch (SQLException e) {
            System.out.println("A remoção falhou.");
            e.printStackTrace();
        }
    }
    
        public static void atualizarEmpregado(java.sql.Connection conexao, String nome, String nomeMeio, String sobrenome,
            String codigo, String endereco, String sexo, String salario, String gerente, String departamento) {
            System.out.println("Inicio UPDATE"); 
        try {
            String query = "UPDATE empregado SET nome = ?, nomedomeio = ?, sobrenome = ?"
                    + ", endereco = ?, sexo = ?, salario = ?, gerente = ?, departamento = ? WHERE codigo = ?";
            PreparedStatement preparedStmt = conexao.prepareStatement(query);
            preparedStmt.setString(1, nome);
            preparedStmt.setString(2, nomeMeio);
            preparedStmt.setString(3, sobrenome);
            preparedStmt.setString(4, endereco);
            preparedStmt.setString(5, sexo);
            preparedStmt.setInt(6, Integer.parseInt(salario));
            preparedStmt.setString(7, gerente);
            preparedStmt.setInt(8, Integer.parseInt(departamento));
            preparedStmt.setString(9, codigo);
            System.out.println("Antes do Execute - UPDATE"); 
            preparedStmt.executeUpdate();
            conexao.close();
            System.out.println("Empregado atualizado com sucesso!");        
        } catch (SQLException e) {
            System.out.println("A consulta falhou.");
            e.printStackTrace();
        }

    }


    public static void inserirEmpregado(java.sql.Connection conexao, String nome, String nomeMeio, String sobrenome,
            String codigo, String dtnascimento, String endereco, String sexo, String salario, String gerente, String departamento) {
        try {

            String SQL = "INSERT INTO empregado (nome, nomedomeio, sobrenome, codigo, "
                    + "dtnascimento, endereco, sexo, salario, gerente, departamento) VALUES ('"+nome+"', '"+nomeMeio+"', '"+sobrenome+"', '"+codigo+"',"
                    + "'"+dtnascimento+"', '"+endereco+"','"+sexo+"', "+1+", '"+gerente+"', "+2+")";

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

    
    
    public static ArrayList listarEmpregados(java.sql.Connection conexao) {
        ArrayList lista_empregados = new ArrayList();
        try {
            Statement query = conexao.createStatement();

            ResultSet resultSet = query.executeQuery("SELECT * FROM EMPREGADO ORDER BY nome");
                    
            while (resultSet.next()) {
               // System.out.printf(resultSet.getString("nome") + "\n");
                lista_empregados.add(new Empregado(resultSet.getString("nome"),
                resultSet.getString("nomedomeio"),
                resultSet.getString("sobrenome"),
                resultSet.getString("codigo"),
                resultSet.getString("dtnascimento"),
                resultSet.getString("endereco"),
                resultSet.getString("sexo"),
                resultSet.getString("salario"),
                resultSet.getString("gerente"),
                resultSet.getString("departamento")));
            }
        } catch (SQLException e) {
            System.out.println("A consulta falhou.");
            e.printStackTrace();
        }
        return lista_empregados;
    }

    public String getNome() {
        return nome;
    }

    public String getNomedomeio() {
        return nomedomeio;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDtnascimento() {
        return dtnascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getSexo() {
        return sexo;
    }

    public String getSalario() {
        return salario;
    }

    public String getGerente() {
        return gerente;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNomedomeio(String nomedomeio) {
        this.nomedomeio = nomedomeio;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setDtnascimento(String dtnascimento) {
        this.dtnascimento = dtnascimento;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    
}
