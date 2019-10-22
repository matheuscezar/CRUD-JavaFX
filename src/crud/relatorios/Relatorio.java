/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud.relatorios;

import crud.model.Departamento;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Mario
 */
public class Relatorio {
    
    private String empregadoNome;
    private String empregadoNomeDoMeio;
    private String empregadoSobrenome;
    private String empregadoCodigo;
    private String empregadoDtNascimento;
    private String empregadoEndereco;
    private String empregadoSexo;
    private String empregadoSalario;
    private String empregadoGerente;
    private String empregadoDepartamento;
    private String empregadoIdade;
    private String empregadoQtdMulher;
    private String empregadoQtdHomem;
    private String mediaDependente;

    public void setEmpregadoQtdMulher(String empregadoQtdMulher) {
        this.empregadoQtdMulher = empregadoQtdMulher;
    }

    public void setEmpregadoQtdHomem(String empregadoQtdHomem) {
        this.empregadoQtdHomem = empregadoQtdHomem;
    }
    
    

    public String getEmpregadoQtdMulher() {
        return empregadoQtdMulher;
    }

    public String getEmpregadoQtdHomem() {
        return empregadoQtdHomem;
    }
    
    

    public void setMediaDependente(String mediaDependente) {
        this.mediaDependente = mediaDependente;
    }

    public String getEmpregadoIdade() {
        return empregadoIdade;
    }

    public void setEmpregadoIdade(String empregadoIdade) {
        this.empregadoIdade = empregadoIdade;
    }
    
    
    
    private String departamentoNome;
    private String departamentoCodigo;
    private String departamentoGerente;
    private String departamentoInicioGerente;
    
    private String departamentoQtd;

    public void setDepartamentoQtd(String departamentoQtd) {
        this.departamentoQtd = departamentoQtd;
    }

    public String getDepartamentoQtd() {
        return departamentoQtd;
    }
    
    private String localDepartamento;
    private String localNome;
    
    private String projetoDescricao;
    private String projetoCodigo;
    private String projetoLocal;
    private String projetoDepartamento;
    
    private String trabalhaEmEmpregado;
    private String trabalhaEmProjeto;
    private String trabalhaEmHoras;
    
    private String dependenteEmpregado;
    private String dependenteNome;
    private String dependenteSexo;
    private String dependenteDtNascimento;
    private String dependenteParentesco;

    public String getEmpregadoNome() {
        return empregadoNome;
    }

    public String getEmpregadoNomeDoMeio() {
        return empregadoNomeDoMeio;
    }

    public String getEmpregadoSobrenome() {
        return empregadoSobrenome;
    }

    public String getEmpregadoCodigo() {
        return empregadoCodigo;
    }

    public String getEmpregadoDtNascimento() {
        return empregadoDtNascimento;
    }

    public String getEmpregadoEndereco() {
        return empregadoEndereco;
    }

    public String getMediaDependente() {
        return mediaDependente;
    }

    
    public String getEmpregadoSexo() {
        return empregadoSexo;
    }

    public String getEmpregadoSalario() {
        return empregadoSalario;
    }

    public String getEmpregadoGerente() {
        return empregadoGerente;
    }

    public String getEmpregadoDepartamento() {
        return empregadoDepartamento;
    }

    public String getDepartamentoNome() {
        return departamentoNome;
    }

    public String getDepartamentoCodigo() {
        return departamentoCodigo;
    }

    public String getDepartamentoGerente() {
        return departamentoGerente;
    }

    public String getDepartamentoInicioGerente() {
        return departamentoInicioGerente;
    }

    public String getLocalDepartamento() {
        return localDepartamento;
    }

    public String getLocalNome() {
        return localNome;
    }

    public String getProjetoDescricao() {
        return projetoDescricao;
    }

    public String getProjetoCodigo() {
        return projetoCodigo;
    }

    public String getProjetoLocal() {
        return projetoLocal;
    }

    public String getProjetoDepartamento() {
        return projetoDepartamento;
    }

    public String getTrabalhaEmEmpregado() {
        return trabalhaEmEmpregado;
    }

    public String getTrabalhaEmProjeto() {
        return trabalhaEmProjeto;
    }

    public String getTrabalhaEmHoras() {
        return trabalhaEmHoras;
    }

    public String getDependenteEmpregado() {
        return dependenteEmpregado;
    }

    public String getDependenteNome() {
        return dependenteNome;
    }

    public String getDependenteSexo() {
        return dependenteSexo;
    }

    public String getDependenteDtNascimento() {
        return dependenteDtNascimento;
    }

    public String getDependenteParentesco() {
        return dependenteParentesco;
    }
    
    

    public void setEmpregadoNome(String empregadoNome) {
        this.empregadoNome = empregadoNome;
    }

    public void setEmpregadoNomeDoMeio(String empregadoNomeDoMeio) {
        this.empregadoNomeDoMeio = empregadoNomeDoMeio;
    }

    public void setEmpregadoSobrenome(String empregadoSobrenome) {
        this.empregadoSobrenome = empregadoSobrenome;
    }

    public void setEmpregadoCodigo(String empregadoCodigo) {
        this.empregadoCodigo = empregadoCodigo;
    }

    public void setEmpregadoDtNascimento(String empregadoDtNascimento) {
        this.empregadoDtNascimento = empregadoDtNascimento;
    }

    public void setEmpregadoEndereco(String empregadoEndereco) {
        this.empregadoEndereco = empregadoEndereco;
    }

    public void setEmpregadoSexo(String empregadoSexo) {
        this.empregadoSexo = empregadoSexo;
    }

    public void setEmpregadoSalario(String empregadoSalario) {
        this.empregadoSalario = empregadoSalario;
    }

    public void setEmpregadoGerente(String empregadoGerente) {
        this.empregadoGerente = empregadoGerente;
    }

    public void setEmpregadoDepartamento(String empregadoDepartamento) {
        this.empregadoDepartamento = empregadoDepartamento;
    }

    public void setDepartamentoNome(String departamentoNome) {
        this.departamentoNome = departamentoNome;
    }

    public void setDepartamentoCodigo(String departamentoCodigo) {
        this.departamentoCodigo = departamentoCodigo;
    }

    public void setDepartamentoGerente(String departamentoGerente) {
        this.departamentoGerente = departamentoGerente;
    }

    public void setDepartamentoInicioGerente(String departamentoInicioGerente) {
        this.departamentoInicioGerente = departamentoInicioGerente;
    }

    public void setLocalDepartamento(String localDepartamento) {
        this.localDepartamento = localDepartamento;
    }

    public void setLocalNome(String localNome) {
        this.localNome = localNome;
    }

    public void setProjetoDescricao(String projetoDescricao) {
        this.projetoDescricao = projetoDescricao;
    }

    public void setProjetoCodigo(String projetoCodigo) {
        this.projetoCodigo = projetoCodigo;
    }

    public void setProjetoLocal(String projetoLocal) {
        this.projetoLocal = projetoLocal;
    }

    public void setProjetoDepartamento(String projetoDepartamento) {
        this.projetoDepartamento = projetoDepartamento;
    }

    public void setTrabalhaEmEmpregado(String trabalhaEmEmpregado) {
        this.trabalhaEmEmpregado = trabalhaEmEmpregado;
    }

    public void setTrabalhaEmProjeto(String trabalhaEmProjeto) {
        this.trabalhaEmProjeto = trabalhaEmProjeto;
    }

    public void setTrabalhaEmHoras(String trabalhaEmHoras) {
        this.trabalhaEmHoras = trabalhaEmHoras;
    }

    public void setDependenteEmpregado(String dependenteEmpregado) {
        this.dependenteEmpregado = dependenteEmpregado;
    }

    public void setDependenteNome(String dependenteNome) {
        this.dependenteNome = dependenteNome;
    }

    public void setDependenteSexo(String dependenteSexo) {
        this.dependenteSexo = dependenteSexo;
    }

    public void setDependenteDtNascimento(String dependenteDtNascimento) {
        this.dependenteDtNascimento = dependenteDtNascimento;
    }

    public void setDependenteParentesco(String dependenteParentesco) {
        this.dependenteParentesco = dependenteParentesco;
    }
    
    
    
    
    
    public static ArrayList questaoOne(java.sql.Connection conexao) {
        ArrayList<Relatorio> resposta = new ArrayList();
        try {
            Statement query = conexao.createStatement();

            ResultSet resultSet = query.executeQuery(" select * from empregado e\n" +
            "where e.endereco like '%Center'\n" +
            "and e.sexo='M'\n" +
            "and e.sobrenome like 'S%'");
                    
            while (resultSet.next()) {
                Relatorio aux = new Relatorio();
                aux.setEmpregadoNome(resultSet.getString("nome"));
                aux.setEmpregadoNomeDoMeio(resultSet.getString("nomedomeio"));
                aux.setEmpregadoSobrenome(resultSet.getString("sobrenome"));
                aux.setEmpregadoCodigo(resultSet.getString("codigo"));
                aux.setEmpregadoDtNascimento(resultSet.getString("dtnascimento"));
                aux.setEmpregadoEndereco(resultSet.getString("endereco"));
                aux.setEmpregadoSexo(resultSet.getString("sexo"));
                aux.setEmpregadoSalario(resultSet.getString("salario"));
                aux.setEmpregadoGerente(resultSet.getString("gerente"));
                aux.setEmpregadoDepartamento(resultSet.getString("departamento"));
                
                resposta.add(aux);
            }
        } catch (SQLException e) {
            System.out.println("A consulta falhou.");
            e.printStackTrace();
        }
        return resposta;
    }
    
    public static ArrayList questaoTwo(java.sql.Connection conexao) {
        ArrayList<Relatorio> resposta = new ArrayList();
        try {
            Statement query = conexao.createStatement();

            ResultSet resultSet = query.executeQuery(" select p.codigo, p.descricao from projeto p\n" +
            "where departamento = 5\n" +
            "and local = 'Natal'\n" +
            "order by p.descricao;");
                    
            while (resultSet.next()) {
                Relatorio aux = new Relatorio();
                aux.setProjetoCodigo(resultSet.getString("codigo"));
                aux.setProjetoDescricao(resultSet.getString("descricao"));

                
                resposta.add(aux);
            }
        } catch (SQLException e) {
            System.out.println("A consulta falhou.");
            e.printStackTrace();
        }
        return resposta;
    }
    
        public static ArrayList questaoThree(java.sql.Connection conexao) {
        ArrayList<Relatorio> resposta = new ArrayList();
        try {
            Statement query = conexao.createStatement();

            ResultSet resultSet = query.executeQuery("  SELECT d.nome as d_nome, l.nome as l_nome\n" +
            "FROM local l\n" +
            "inner join departamento d on l.departamento = d.codigo;");
                    
            while (resultSet.next()) {
                Relatorio aux = new Relatorio();
                aux.setDepartamentoNome(resultSet.getString("d_nome"));
                aux.setLocalNome(resultSet.getString("l_nome"));

                
                resposta.add(aux);
            }
        } catch (SQLException e) {
            System.out.println("A consulta falhou.");
            e.printStackTrace();
        }
        return resposta;
    }
        
        
   public static ArrayList questaoFour(java.sql.Connection conexao) {
        ArrayList<Relatorio> resposta = new ArrayList();
        try {
            Statement query = conexao.createStatement();

            ResultSet resultSet = query.executeQuery("select nome\n" +
            "from empregado e\n" +
            "where sexo = 'F'\n" +
            "and nome in (select nome from empregado where sexo='M')\n" +
            "order by nome;");

            while (resultSet.next()) {
                Relatorio aux = new Relatorio();
                aux.setEmpregadoNome(resultSet.getString("nome"));

                
                resposta.add(aux);
            }
        } catch (SQLException e) {
            System.out.println("A consulta falhou.");
            e.printStackTrace();
        }
        return resposta;
    }
   public static ArrayList questaoFive(java.sql.Connection conexao) {
        ArrayList<Relatorio> resposta = new ArrayList();
        try {
            Statement query = conexao.createStatement();

            ResultSet resultSet = query.executeQuery("select (nome || ' ' || nomedomeio || '. ' || sobrenome) as nome, extract(year from age(dtnascimento)) as anos\n" +
            "from empregado where sexo = 'F'\n" +
            "UNION\n" +
            "select nome, extract(year from age(dtnascimento)) as anos\n" +
            "from dependente\n" +
            "where sexo = 'F' and extract(year from age(dtnascimento)) > 16\n" +
            "order by anos desc;");

            while (resultSet.next()) {
                Relatorio aux = new Relatorio();
                aux.setEmpregadoNome(resultSet.getString("nome"));
                aux.setEmpregadoIdade(resultSet.getString("anos"));

                
                resposta.add(aux);
            }
        } catch (SQLException e) {
            System.out.println("A consulta falhou.");
            e.printStackTrace();
        }
        return resposta;
    }

   public static ArrayList questaoSix(java.sql.Connection conexao) {
        ArrayList<Relatorio> resposta = new ArrayList();
        try {
            Statement query = conexao.createStatement();

            ResultSet resultSet = query.executeQuery("SELECT round(\n" +
            "(\n" +
            "	(SELECT CAST(COUNT(*) AS decimal(10,0))\n" +
            "	FROM dependente)\n" +
            "	/\n" +
            "	(SELECT CAST(COUNT (DISTINCT emp.nome) AS decimal(10,0))\n" +
            "	FROM empregado emp, dependente dpte\n" +
            "	WHERE emp.codigo = dpte.empregado)\n" +
            "),2)AS media;");

            while (resultSet.next()) {
                Relatorio aux = new Relatorio();
                aux.setMediaDependente(resultSet.getString("media"));
                
                resposta.add(aux);
            }
        } catch (SQLException e) {
            System.out.println("A consulta falhou.");
            e.printStackTrace();
        }
        return resposta;
    }

   public static ArrayList questaoSeven(java.sql.Connection conexao) {
        ArrayList<Relatorio> resposta = new ArrayList();
        try {
            Statement query = conexao.createStatement();

            ResultSet resultSet = query.executeQuery("select d.nome as nome, COUNT(p.departamento) as qtd from Departamento d\n" +
            "LEFT JOIN Projeto p ON p.departamento = d.codigo\n" +
            "GROUP BY d.nome\n" +
            "HAVING COUNT(p.departamento) < 10");

            while (resultSet.next()) {
                Relatorio aux = new Relatorio();
                aux.setDepartamentoNome(resultSet.getString("nome"));
                aux.setDepartamentoQtd(resultSet.getString("qtd"));
                
                resposta.add(aux);
            }
        } catch (SQLException e) {
            System.out.println("A consulta falhou.");
            e.printStackTrace();
        }
        return resposta;
    }
   
   public static ArrayList questaoEight(java.sql.Connection conexao) {
        ArrayList<Relatorio> resposta = new ArrayList();
        try {
            Statement query = conexao.createStatement();

            ResultSet resultSet = query.executeQuery("select\n" +
            "(select count(*) from empregado where sexo='M') as qtdhomens,\n" +
            "(select count(*) from empregado where sexo='F') as qtdmulheres");

            while (resultSet.next()) {
                Relatorio aux = new Relatorio();
                aux.setEmpregadoQtdHomem(resultSet.getString("qtdhomens"));
                aux.setEmpregadoQtdMulher(resultSet.getString("qtdmulheres"));
                
                resposta.add(aux);
            }
        } catch (SQLException e) {
            System.out.println("A consulta falhou.");
            e.printStackTrace();
        }
        return resposta;
    }   
}
