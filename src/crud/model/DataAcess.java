/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Mario
 */
public class DataAcess {
    
    public static  Connection conexao;
    
   public DataAcess(){
       try {
            Class.forName("org.postgresql.Driver");
        
            try (  Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/dependentes", "postgres", "masterkey")) {
                conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/dependentes", "postgres", "masterkey");
                System.out.println("Conectado com sucesso.");

     
            } catch (SQLException e) {
                System.out.println("A conexao falhou.");
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            System.err.println("Não foi possível carregar o Driver JDBC");
        }
    }
    
}
