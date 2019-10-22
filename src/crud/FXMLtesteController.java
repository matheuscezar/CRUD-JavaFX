/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import crud.model.DataAcess;
import crud.model.Departamento;
import crud.model.Empregado;
import crud.relatorios.Relatorio;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;
import net.sf.jasperreports.engine.JRException;

/**
 * FXML Controller class
 *
 * @author Mario
 */
public class FXMLtesteController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    private Pane pane;
    
    @FXML
    private TabPane tabPane;

    @FXML
    private Tab tabEmpregado;
    
    @FXML
    private Tab tabDepartamento;
    
    @FXML
    private Tab tabProjeto;
    
    @FXML
    private Tab tabRelatorio;
    

    @FXML
    private TableView<Empregado> taabViewEmpregado;
    
    @FXML
    private TableView<Departamento> tabViewDepartamento;
    
    @FXML
    private TableView<Projeto> tabViewProjeto;
    
    @FXML
    private TableColumn<Departamento, String> colNomeDepartamento;
    @FXML
    private TableColumn<Departamento, String> colCodigoDepartamento;
    @FXML
    private TableColumn<Departamento, String> colGerenteDepartamento;
    @FXML
    private TableColumn<Departamento, String> colDataGerenciaDepartamento;
    
    
    @FXML
    private TableColumn<Projeto, String> colDescricaoProjeto;
    @FXML
    private TableColumn<Projeto, String> colCodigoProjeto;
    @FXML
    private TableColumn<Projeto, String> colLocalProjeto;
    @FXML
    private TableColumn<Projeto, String> colDepartamentoProjeto;
    

    @FXML
    private TableColumn<Empregado, String> colNomeEmpregado;
    
        @FXML
    private TableColumn<Empregado, String> colNomeMeioEmpregado;

    @FXML
    private TableColumn<Empregado, String> colSobrenomeEmpregado;

    @FXML
    private TableColumn<Empregado, String>colCodigoEmpregado;

    @FXML
    private TableColumn<Empregado, String> colDtNascimentoEmpregado;

    @FXML
    private TableColumn<Empregado, String> colEnderecoEmpregado;

    @FXML
    private TableColumn<Empregado, String> colSexoEmpregado;

    @FXML
    private TableColumn<Empregado, String> colSalarioEmpregado;

    @FXML
    private TableColumn<Empregado, String> colGerenteEmpregado;

    @FXML
    private TableColumn<Empregado, String> colDepartamentoEmpregado;
    
    @FXML
    private Button btnCriarEmpregado;
    
    @FXML
    private Button btnCriarDepartamento;
    
    @FXML
    private Button btnCriarProjeto;
    
    @FXML
    private Button btnEditarProjeto;
    
    @FXML
    private Button btnApagarProjeto;
    
    
    //Pane Novo Empregado:
    
     @FXML
    private Pane paneNovoEmpregado;

    @FXML
    private Button btnOkNovoEmpregado;

    @FXML
    private Button btnCancelarNovoEmpregado;
    
    @FXML
    private TextField txtNomeEmpregado;

    @FXML
    private TextField txtNomeMeioEmpregado;

    @FXML
    private TextField txtSobrenomeEmpregado;

    @FXML
    private TextField txtCodigoEmpregado;

    @FXML
    private TextField txtDtNascimentoEmpregado;

    @FXML
    private TextField txtEnderecoEmpregado;

    @FXML
    private TextField txtSexoEmpregado;

    @FXML
    private TextField txtSalarioEmpregado;

    @FXML
    private TextField txtGerenteEmpregado;

    @FXML
    private TextField txtDepartamentoEmpregado;
    
    //Fim Pane Novo Empregado
    
    
    //Pane Novo Departamento
    
    @FXML
    private Pane paneNovoDepartamento;
    @FXML
    private TextField txtNomeDepartamento;
     @FXML
    private TextField txtCodigoDepartamento;
      @FXML
    private TextField txtDtGerenciaDepartamento;
       @FXML
    private TextField txtGerenteDepartamento;
    // Fim Pane Novo Departamento
       
    //Inicio pane Novo Projeto
      @FXML
       private Pane paneNovoProjeto;
      
      @FXML
       private TextField txtDescricaoProjeto;
      @FXML
       private TextField txtCodigoProjeto;
      @FXML
       private TextField txtLocalProjeto;
      @FXML
       private TextField txtDepartamentoProjeto;
      
      @FXML
       private Button btnCancelarNovoProjeto;
      
      @FXML
       private Button btnOkNovoProjeto;
   // Fim pane Novo Projeto
   
   // Inicio Pane Relatorio   
    @FXML
       private Button btnRelatorio;
    @FXML 
    private RadioButton radio1;
    @FXML 
    private RadioButton radio2;
    @FXML 
    private RadioButton radio3;
    @FXML 
    private RadioButton radio4;
    @FXML 
    private RadioButton radio5;
    @FXML 
    private RadioButton radio6;
    @FXML 
    private RadioButton radio7;
    @FXML 
    private RadioButton radio8;
    @FXML
    private ToggleGroup toggleGroup;
    @FXML 
    private TableView<Relatorio> tbViewRelatorio;
    @FXML 
    private TableColumn<Relatorio, String> colRelatorio1;
    @FXML 
    private TableColumn<Relatorio, String> colRelatorio2;
    @FXML 
    private TableColumn<Relatorio, String> colRelatorio3;
    @FXML 
    private TableColumn<Relatorio, String> colRelatorio4;
    @FXML 
    private TableColumn<Relatorio, String> colRelatorio5;
    @FXML 
    private TableColumn<Relatorio, String> colRelatorio6;
    @FXML 
    private TableColumn<Relatorio, String> colRelatorio7;
    //Fim pane relatorio
    private boolean editar = false;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        carregaTableEmpregado();
        carregaTableDepartamento();
        carregaTableProjeto();
    }

public void carregaTableEmpregado(){
               DataAcess dao = new DataAcess();
           ArrayList<Empregado> lista_empregados = new ArrayList();
           lista_empregados = Empregado.listarEmpregados(dao.conexao);
           colNomeEmpregado.setCellValueFactory(new PropertyValueFactory<>("nome"));
           colNomeMeioEmpregado.setCellValueFactory(new PropertyValueFactory<>("nomedomeio"));
           colSobrenomeEmpregado.setCellValueFactory(new PropertyValueFactory<>("sobrenome"));
           colCodigoEmpregado.setCellValueFactory(new PropertyValueFactory<>("codigo"));
           colDtNascimentoEmpregado.setCellValueFactory(new PropertyValueFactory<>("dtNascimento"));
           colEnderecoEmpregado.setCellValueFactory(new PropertyValueFactory<>("endereco"));
           colSexoEmpregado.setCellValueFactory(new PropertyValueFactory<>("sexo"));
           colSalarioEmpregado.setCellValueFactory(new PropertyValueFactory<>("salario"));
           colGerenteEmpregado.setCellValueFactory(new PropertyValueFactory<>("gerente"));
           colDepartamentoEmpregado.setCellValueFactory(new PropertyValueFactory<>("departamento"));
           ObservableList<Empregado> lista_empregados_fx = FXCollections.observableArrayList(lista_empregados);
           taabViewEmpregado.setItems(lista_empregados_fx);
}   

public void carregaTableDepartamento(){
               DataAcess dao = new DataAcess();
           ArrayList<Departamento> lista_departamentos = new ArrayList();
           lista_departamentos = Departamento.listarDepartamentos(dao.conexao);
           colNomeDepartamento.setCellValueFactory(new PropertyValueFactory<>("nome"));
           colCodigoDepartamento.setCellValueFactory(new PropertyValueFactory<>("codigo"));
           colGerenteDepartamento.setCellValueFactory(new PropertyValueFactory<>("gerente"));
           colDataGerenciaDepartamento.setCellValueFactory(new PropertyValueFactory<>("dataGerencia"));

           ObservableList<Departamento> lista_departamento_fx = FXCollections.observableArrayList(lista_departamentos);
           tabViewDepartamento.setItems(lista_departamento_fx);
} 

public void carregaTableProjeto(){
               DataAcess dao = new DataAcess();
           ArrayList<Projeto> lista_projetos = new ArrayList();
           lista_projetos = Projeto.listarProjetos(dao.conexao);
           colDescricaoProjeto.setCellValueFactory(new PropertyValueFactory<>("descricao"));
           colCodigoProjeto.setCellValueFactory(new PropertyValueFactory<>("codigo"));
           colLocalProjeto.setCellValueFactory(new PropertyValueFactory<>("local"));
           colDepartamentoProjeto.setCellValueFactory(new PropertyValueFactory<>("departamento"));

           ObservableList<Projeto> lista_projetos_fx = FXCollections.observableArrayList(lista_projetos);
           tabViewProjeto.setItems(lista_projetos_fx);
} 




//Ações da Listgem de Empregados
    @FXML
    private void criarEmpregado(){
        System.out.println("Criando novo empregado");
        tabPane.setVisible(false);
        paneNovoEmpregado.setVisible(true);
         
    }
    
        @FXML
    private void editarEmpregado(){
        System.out.println("Editando empregado");
        Empregado tmp = taabViewEmpregado.getSelectionModel().getSelectedItem();
        txtCodigoEmpregado.setEditable(false);
        tabPane.setVisible(false);
        paneNovoEmpregado.setVisible(true);
        
        //Preenchendo os texts fields
        txtNomeEmpregado.setText(tmp.getNome());
        txtNomeMeioEmpregado.setText(tmp.getNomedomeio());
        txtSobrenomeEmpregado.setText(tmp.getSobrenome());
        txtCodigoEmpregado.setText(tmp.getCodigo());
        txtDtNascimentoEmpregado.setText(tmp.getDtnascimento());
        txtEnderecoEmpregado.setText(tmp.getEndereco());
        txtSexoEmpregado.setText(tmp.getSexo());
        txtSalarioEmpregado.setText(tmp.getSalario());
        txtGerenteEmpregado.setText(tmp.getGerente());
        txtDepartamentoEmpregado.setText(tmp.getDepartamento());
        
        editar = true;
    }
    
        @FXML
    private void deletarEmpregado(){
        System.out.println("Deletando empregado");
        DataAcess dao = new DataAcess();
        Empregado tmp = taabViewEmpregado.getSelectionModel().getSelectedItem();
        Empregado.removerEmpregado(dao.conexao, tmp.getCodigo());
        carregaTableEmpregado();
         
         
    }
    
    //Fim das ações da Listagem de Empregados
    
    //Ações da Criação de Novo Empregado
        @FXML
    private void actionOkNovoEmpregado(){
        DataAcess dao = new DataAcess();
        
        if(editar){
            Empregado.atualizarEmpregado(dao.conexao,
                txtNomeEmpregado.getText().toString(),
                txtNomeMeioEmpregado.getText().toString(),
                txtSobrenomeEmpregado.getText().toString(),
                txtCodigoEmpregado.getText().toString(),
                txtEnderecoEmpregado.getText().toString(),
                txtSexoEmpregado.getText().toString(),
                txtSalarioEmpregado.getText().toString(),
                "954950815",
                txtDepartamentoEmpregado.getText().toString());
            editar = false;
        }else{
            Empregado.inserirEmpregado(dao.conexao,
                    txtNomeEmpregado.getText().toString(),
                    txtNomeMeioEmpregado.getText().toString(),
                    txtSobrenomeEmpregado.getText().toString(),
                    txtCodigoEmpregado.getText().toString(),
                    txtDtNascimentoEmpregado.getText().toString(),
                    txtEnderecoEmpregado.getText().toString(),
                    txtSexoEmpregado.getText().toString(),
                    txtSalarioEmpregado.getText().toString(),
                    txtGerenteEmpregado.getText().toString(),
                    txtDepartamentoEmpregado.getText().toString());
                    System.out.println("Novo empregado criado com sucesso"); 
        }
            //Voltando a listagem.
            carregaTableEmpregado();
            tabPane.setVisible(true);
            paneNovoEmpregado.setVisible(false);
            txtCodigoEmpregado.setEditable(true);

        
        
        //Limpandos os texts fields
        txtNomeEmpregado.setText("");
        txtNomeMeioEmpregado.setText("");
        txtSobrenomeEmpregado.setText("");
        txtCodigoEmpregado.setText("");
        txtDtNascimentoEmpregado.setText("");
        txtEnderecoEmpregado.setText("");
        txtSexoEmpregado.setText("");
        txtSalarioEmpregado.setText("");
        txtGerenteEmpregado.setText("");
        txtDepartamentoEmpregado.setText("");
    }
    
    @FXML
    public void actionCancelNovoEmpregadado(){
        txtCodigoEmpregado.setEditable(true);
        //Limpandos os texts fields
        txtNomeEmpregado.setText("");
        txtNomeMeioEmpregado.setText("");
        txtSobrenomeEmpregado.setText("");
        txtCodigoEmpregado.setText("");
        txtDtNascimentoEmpregado.setText("");
        txtEnderecoEmpregado.setText("");
        txtSexoEmpregado.setText("");
        txtSalarioEmpregado.setText("");
        txtGerenteEmpregado.setText("");
        txtDepartamentoEmpregado.setText("");
        //Voltando a listagem
        tabPane.setVisible(true);
        paneNovoEmpregado.setVisible(false);
    }
    
    //Fim das ações da criação de Novo Empregado
 
    //Ações da Listgem de Departamentos
    @FXML
    private void criarDepartamento(){
        System.out.println("Criando novo departamento");
        tabPane.setVisible(false);
        paneNovoDepartamento.setVisible(true);
        txtCodigoDepartamento.setEditable(true);
         
    }
    
        @FXML
    private void editarDepartamento(){
        System.out.println("Editando departamento");
        Departamento tmp = tabViewDepartamento.getSelectionModel().getSelectedItem();
        txtNomeDepartamento.setText(tmp.getNome());
        txtCodigoDepartamento.setText(tmp.getCodigo());
        txtGerenteDepartamento.setText(tmp.getGerente());
        txtDtGerenciaDepartamento.setText(tmp.getDataGerencia());
        
        editar = true;
        
        txtCodigoDepartamento.setEditable(false);
        tabPane.setVisible(false);
        paneNovoDepartamento.setVisible(true);
        
         
    }
    
        @FXML
    private void deletarDepartamento(){
        DataAcess dao = new DataAcess();
        System.out.println("Deletando departamento");
        Departamento tmp = tabViewDepartamento.getSelectionModel().getSelectedItem();
        Departamento.removerDepartamento(dao.conexao, tmp.getCodigo());
        carregaTableDepartamento();
         
    }
    
    // Fim das ações da listagem de departamento
    
    //Inicio das ações de novo departamento
    
    @FXML
    private void actionOkNovoDepartamento(){
        DataAcess dao = new DataAcess();
        
        if(editar){
            Departamento.atualizarDepartamento(dao.conexao, 
                    txtNomeDepartamento.getText(), 
                    txtCodigoDepartamento.getText(), 
                    txtGerenteDepartamento.getText(), 
                    txtDtGerenciaDepartamento.getText());
        }else{
            Departamento.inserirDepartamento(dao.conexao,
                    txtNomeDepartamento.getText().toString(),
                    txtCodigoDepartamento.getText().toString(),
                    txtDtGerenciaDepartamento.getText().toString(),
                    txtGerenteDepartamento.getText().toString());
            //Voltando a listagem.
            tabPane.setVisible(true);
            paneNovoDepartamento.setVisible(false);

            System.out.println("Novo departamento criado com sucesso"); 
        
        }
        //Limpandos os texts fields
        txtNomeDepartamento.setText("");
        txtCodigoDepartamento.setText("");
        txtDtGerenciaDepartamento.setText("");
        txtGerenteDepartamento.setText("");
        

        txtCodigoDepartamento.setEditable(true);
        
        carregaTableDepartamento();
    }
    
    @FXML
    public void actionCancelNovoDepartamento(){
        
        //Limpandos os texts fields
        txtNomeDepartamento.setText("");
        txtCodigoDepartamento.setText("");
        txtDtGerenciaDepartamento.setText("");
        txtGerenteDepartamento.setText("");
        //Voltando a listagem
        tabPane.setVisible(true);
        paneNovoDepartamento.setVisible(false);
        txtCodigoDepartamento.setEditable(true);
    }
    
    // Fim das ações de novo departamento
    
    
    //Início das Açoes da Listagem do Projeto
    @FXML
    private void criarProjeto(){
        System.out.println("Criando novo projeto");
        tabPane.setVisible(false);
        paneNovoProjeto.setVisible(true);
        txtCodigoProjeto.setEditable(true);
         
    }
    
        @FXML
    private void editarProjeto(){
        System.out.println("Editando projeto");
        Projeto tmp = tabViewProjeto.getSelectionModel().getSelectedItem();
        txtDescricaoProjeto.setText(tmp.getDescricao());
        txtCodigoProjeto.setText(tmp.getCodigo());
        txtLocalProjeto.setText(tmp.getLocal());
        txtDescricaoProjeto.setText(tmp.getDepartamento());
        
        editar = true;
        
        txtCodigoProjeto.setEditable(false);
        tabPane.setVisible(false);
        paneNovoProjeto.setVisible(true);
        
         
    }
    
        @FXML
    private void deletarProjeto(){
        DataAcess dao = new DataAcess();
        System.out.println("Deletando Projeto");
        Projeto tmp = tabViewProjeto.getSelectionModel().getSelectedItem();
        Projeto.removerProjeto(dao.conexao, tmp.getCodigo());
        carregaTableProjeto();
         
    }
    
    //Fim das Ações da Listagem de Projeto
    
    //Inicio  das Ações de Novo Projeto
    @FXML
    private void actionOkNovoProjeto(){
        DataAcess dao = new DataAcess();
        
        if(editar){
            Projeto.atualizarProjeto(dao.conexao, 
                    txtDescricaoProjeto.getText(), 
                    txtCodigoProjeto.getText(), 
                    txtLocalProjeto.getText(), 
                    txtDepartamentoProjeto.getText());
        }else{
            Projeto.inserirProjeto(dao.conexao,
                    txtDescricaoProjeto.getText().toString(),
                    txtCodigoProjeto.getText().toString(),
                    txtLocalProjeto.getText().toString(),
                    txtDepartamentoProjeto.getText().toString());
            //Voltando a listagem.
            tabPane.setVisible(true);
            paneNovoProjeto.setVisible(false);

            System.out.println("Novo departamento criado com sucesso"); 
        
        }
        //Limpandos os texts fields
        txtCodigoProjeto.setText("");
        txtDescricaoProjeto.setText("");
        txtLocalProjeto.setText("");
        txtDepartamentoProjeto.setText("");
        

        txtCodigoProjeto.setEditable(true);
        
        carregaTableDepartamento();
    }
    
    @FXML
    public void actionCancelNovoProjeto(){
        
        //Limpandos os texts fields
        txtDescricaoProjeto.setText("");
        txtCodigoProjeto.setText("");
        txtLocalProjeto.setText("");
        txtDepartamentoProjeto.setText("");
        //Voltando a listagem
        tabPane.setVisible(true);
        paneNovoProjeto.setVisible(false);
        txtCodigoProjeto.setEditable(true);
    }
    //Fim das ações de Novo Projeto
    
    @FXML
    public void gerarRelatorio(){
        if (radio1==(RadioButton)toggleGroup.getSelectedToggle()){
           DataAcess dao = new DataAcess();
           ArrayList<Relatorio> resposta = new ArrayList();
           resposta = Relatorio.questaoOne(dao.conexao);
           colRelatorio1.setText("Nome");
           colRelatorio2.setText("Meio");
           colRelatorio3.setText("Sobrenome");
           colRelatorio4.setText("Codigo");
           colRelatorio5.setText("Nascimento");
           colRelatorio6.setText("Endereço");
           colRelatorio7.setText("Sexo");
           colRelatorio1.setCellValueFactory(new PropertyValueFactory<>("empregadoNome"));
           colRelatorio2.setCellValueFactory(new PropertyValueFactory<>("empregadoNomeDoMeio"));
           colRelatorio3.setCellValueFactory(new PropertyValueFactory<>("empregadoSobrenome"));
           colRelatorio4.setCellValueFactory(new PropertyValueFactory<>("empregadoCodigo"));
           colRelatorio5.setCellValueFactory(new PropertyValueFactory<>("empregadoDtNascimento"));
           colRelatorio6.setCellValueFactory(new PropertyValueFactory<>("empregadoEndereco"));
           colRelatorio7.setCellValueFactory(new PropertyValueFactory<>("empregadoSexo"));

           ObservableList<Relatorio> lista_resposta_fx = FXCollections.observableArrayList(resposta);
           tbViewRelatorio.setItems(lista_resposta_fx);
        }
        if (radio2==(RadioButton)toggleGroup.getSelectedToggle()){
            DataAcess dao = new DataAcess();
           ArrayList<Relatorio> resposta = new ArrayList();
           resposta = Relatorio.questaoTwo(dao.conexao);
           colRelatorio1.setText("Código");
           colRelatorio2.setText("Descrição");
           colRelatorio3.setText("");
           colRelatorio4.setText("");
           colRelatorio5.setText("");
           colRelatorio6.setText("");
           colRelatorio7.setText("");
           colRelatorio1.setCellValueFactory(new PropertyValueFactory<>("projetoCodigo"));
           colRelatorio2.setCellValueFactory(new PropertyValueFactory<>("projetoDescricao"));


           ObservableList<Relatorio> lista_resposta_fx = FXCollections.observableArrayList(resposta);
           tbViewRelatorio.setItems(lista_resposta_fx);
        }
        if (radio3==(RadioButton)toggleGroup.getSelectedToggle()){
            DataAcess dao = new DataAcess();
           ArrayList<Relatorio> resposta = new ArrayList();
           resposta = Relatorio.questaoThree(dao.conexao);
           colRelatorio1.setText("Departamento");
           colRelatorio2.setText("Local");
           colRelatorio3.setText("");
           colRelatorio4.setText("");
           colRelatorio5.setText("");
           colRelatorio6.setText("");
           colRelatorio7.setText("");
           colRelatorio1.setCellValueFactory(new PropertyValueFactory<>("departamentoNome"));
           colRelatorio2.setCellValueFactory(new PropertyValueFactory<>("localNome"));


           ObservableList<Relatorio> lista_resposta_fx = FXCollections.observableArrayList(resposta);
           tbViewRelatorio.setItems(lista_resposta_fx);
        }
        if (radio4==(RadioButton)toggleGroup.getSelectedToggle()){
            DataAcess dao = new DataAcess();
           ArrayList<Relatorio> resposta = new ArrayList();
           resposta = Relatorio.questaoFour(dao.conexao);
           colRelatorio1.setText("Nome");
           colRelatorio2.setText("");
           colRelatorio3.setText("");
           colRelatorio4.setText("");
           colRelatorio5.setText("");
           colRelatorio6.setText("");
           colRelatorio7.setText("");
           colRelatorio1.setCellValueFactory(new PropertyValueFactory<>("empregadoNome"));

           ObservableList<Relatorio> lista_resposta_fx = FXCollections.observableArrayList(resposta);
           tbViewRelatorio.setItems(lista_resposta_fx);
        }
        if (radio5==(RadioButton)toggleGroup.getSelectedToggle()){
            DataAcess dao = new DataAcess();
           ArrayList<Relatorio> resposta = new ArrayList();
           resposta = Relatorio.questaoFive(dao.conexao);
           colRelatorio1.setText("Nome");
           colRelatorio2.setText("Anos");
           colRelatorio3.setText("");
           colRelatorio4.setText("");
           colRelatorio5.setText("");
           colRelatorio6.setText("");
           colRelatorio7.setText("");
           colRelatorio1.setCellValueFactory(new PropertyValueFactory<>("empregadoNome"));
           colRelatorio2.setCellValueFactory(new PropertyValueFactory<>("empregadoIdade"));

           ObservableList<Relatorio> lista_resposta_fx = FXCollections.observableArrayList(resposta);
           tbViewRelatorio.setItems(lista_resposta_fx);
        }
        if (radio6==(RadioButton)toggleGroup.getSelectedToggle()){
            DataAcess dao = new DataAcess();
           ArrayList<Relatorio> resposta = new ArrayList();
           resposta = Relatorio.questaoSix(dao.conexao);
           colRelatorio1.setText("Média");
           colRelatorio2.setText("");
           colRelatorio3.setText("");
           colRelatorio4.setText("");
           colRelatorio5.setText("");
           colRelatorio6.setText("");
           colRelatorio7.setText("");
           colRelatorio1.setCellValueFactory(new PropertyValueFactory<>("mediaDependente"));

           ObservableList<Relatorio> lista_resposta_fx = FXCollections.observableArrayList(resposta);
           tbViewRelatorio.setItems(lista_resposta_fx);
        }
        if (radio7==(RadioButton)toggleGroup.getSelectedToggle()){
            DataAcess dao = new DataAcess();
           ArrayList<Relatorio> resposta = new ArrayList();
           resposta = Relatorio.questaoSeven(dao.conexao);
           colRelatorio1.setText("Departamento");
           colRelatorio2.setText("Quantidade");
           colRelatorio3.setText("");
           colRelatorio4.setText("");
           colRelatorio5.setText("");
           colRelatorio6.setText("");
           colRelatorio7.setText("");
           colRelatorio1.setCellValueFactory(new PropertyValueFactory<>("departamentoNome"));
           colRelatorio2.setCellValueFactory(new PropertyValueFactory<>("departamentoQtd"));
           ObservableList<Relatorio> lista_resposta_fx = FXCollections.observableArrayList(resposta);
           tbViewRelatorio.setItems(lista_resposta_fx);
        }
        
        if (radio8==(RadioButton)toggleGroup.getSelectedToggle()){
            DataAcess dao = new DataAcess();
           ArrayList<Relatorio> resposta = new ArrayList();
           resposta = Relatorio.questaoEight(dao.conexao);
           colRelatorio1.setText("Qtd Homens");
           colRelatorio2.setText("Qtd Mulheres");
           colRelatorio3.setText("");
           colRelatorio4.setText("");
           colRelatorio5.setText("");
           colRelatorio6.setText("");
           colRelatorio7.setText("");
           colRelatorio1.setCellValueFactory(new PropertyValueFactory<>("empregadoQtdHomem"));
           colRelatorio2.setCellValueFactory(new PropertyValueFactory<>("empregadoQtdMulher"));
           ObservableList<Relatorio> lista_resposta_fx = FXCollections.observableArrayList(resposta);
           tbViewRelatorio.setItems(lista_resposta_fx);
        }
    }
}
