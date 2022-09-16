package br.com.fiap;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class PrimaryController {
    
    @FXML private TextField textFieldTitulo;
    @FXML private TextField textFieldAlbum;
    @FXML private TextField textFieldArtista;
    @FXML private TextField textFieldNota;
    @FXML private TextField textFieldGeneroMusical;
    @FXML private ListView<Musica> ListViewMusicas;

    private List<Musica> Lista = new ArrayList<>();


    /**
     * 
     */
    @FXML
    public void cadastrar(){
        var musica = carregarCaract();
        if(musica == null){erro(mensagem: "as informações estão erradas");
        limparFormulario();
        } else{
        Lista.add(musica);
        System.out.println(Lista);
        limparFormulario();
       
        ListViewMusicas.getItems().add((Musica) musica);
        atualizarLista();
        }
        String text = textFieldTitulo.getText();
        System.out.println("Cadastrar titulo");
    }


    private void atualizarLista() {
    }


    private void limparFormulario() {
    }
}
