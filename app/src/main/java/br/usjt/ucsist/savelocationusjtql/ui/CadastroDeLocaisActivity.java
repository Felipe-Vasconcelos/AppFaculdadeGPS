package br.usjt.ucsist.savelocationusjtql.ui;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import br.usjt.ucsist.savelocationusjtql.R;
import br.usjt.ucsist.savelocationusjtql.model.Local;
import br.usjt.ucsist.savelocationusjtql.model.LocalAdapter;

public class CadastroDeLocaisActivity extends AppCompatActivity {

    private RecyclerView cardsLocaisRecyclerView;
    private LocalAdapter adapter;
    private List<Local> locais;
    private CollectionReference locaisReference;

    private Button voltarHome;
    private EditText editTextCEP;
    private EditText editTextRua;
    private EditText editTextNumero;
    private EditText editTextBairro;
    private EditText editTextCidade;
    private EditText editTextEstado;
    private TextView DadosDeLongitude;
    private TextView DadosDeLatitude;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_de_locais);

    }

    public void confirmarCadastro(View view){

            String rua = editTextRua.getText().toString();
            String numero = editTextNumero.getText().toString();
            String estado = editTextEstado.getText().toString();
            String cidade = editTextCidade.getText().toString();
            String cep = editTextCEP.getText().toString();
            String bairro = editTextBairro.getText().toString();
            Local l = new Local (cep, rua, numero, bairro, cidade, estado, new Date());
            locaisReference.add(l);

    }

//    public boolean validarCampos(){
//        boolean valido = true;
//        if(editTextCEP.getText().toString().trim().length() == 0){
//            valido = false;
//            Toast.makeText(this, "CEP inválido", Toast.LENGTH_SHORT).show();
//        }
//        if(editTextRua.getText().toString().trim().length() == 0){
//            valido = false;
//            Toast.makeText(this, "Rua inválido", Toast.LENGTH_SHORT).show();
//        }
//        if(editTextNumero.getText().toString().trim().length() == 0){
//            valido = false;
//            Toast.makeText(this, "Número inválido", Toast.LENGTH_SHORT).show();
//        }
//        if(editTextBairro.getText().toString().trim().length() == 0){
//            valido = false;
//            Toast.makeText(this, "Bairro inválido", Toast.LENGTH_SHORT).show();
//        }
//        if(editTextCidade.getText().toString().trim().length() == 0){
//            valido = false;
//            Toast.makeText(this, "Cidade inválido", Toast.LENGTH_SHORT).show();
//        }
//        if(editTextEstado.getText().toString().trim().length() == 0){
//            valido = false;
//            Toast.makeText(this, "Estado inválido", Toast.LENGTH_SHORT).show();
//        }
//        return  valido;
//    }

}