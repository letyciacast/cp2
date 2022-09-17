package br.com.fiap;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.text.Text;

public class PrimaryController {
    
    @FXML private TextField textFieldTitulo;
    @FXML private TextField textFieldAlbum;
    @FXML private TextField textFieldArtista;
    @FXML private TextField textFieldNota;
    @FXML private TextField textFieldGeneroMusical;
    @FXML private ListView<Musica> ListViewMusicas;

    private List<Musica> Lista = new ArrayList<>();


    //carregar os dados para o listview
    //salvar os dados da musica
    //mostrar a musica como favorita


    /**
     * 
     */
    @FXML
    public void cadastrar(){
        var musica = carregarCaract();
        if(musica == null){String mensagem;
        erro(mensagem: "as informações estão erradas");
        limparFormulario();
        } else{
        Lista.add((Musica) musica);
        System.out.println(Lista);
        limparFormulario();
       
        ListViewMusicas.getItems().add((Musica) musica);
        atualizarLista();
        }
        String text = textFieldTitulo.getText();
        System.out.println("Cadastrar Título");
    }

        }


    private Object carregarCaract() {
        return null;
    }


    private void atualizarLista() {
        ListViewMusicas
    }


    private void limparFormulario() {
        textFieldAlbum.setText("");
        textFieldArtista.setText("");
        textFieldTitulo.setText("");
        textFieldNota.setText("");
        textFieldGeneroMusical.setText("");
    }
    
    public void erro(String mensagem) {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setContentText(mensagem);
        alert.show();


}
