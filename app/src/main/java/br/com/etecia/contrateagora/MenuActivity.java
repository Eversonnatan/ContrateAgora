package br.com.etecia.contrateagora;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MenuActivity extends AppCompatActivity {

    List<Categorias> listaCategorias;

    //Declarar o recycler view
    RecyclerView idRecyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        //Apresentando o xml
        idRecyclerView = findViewById(R.id.idListaCategorias);

        //criando a classe adaptadora e passando os parâmetros
        MyAdapter adapter = new MyAdapter(getApplicationContext(), listaCategorias);

        //Criando a base de dados

        listaCategorias = new ArrayList<>();

        //Tipo de layout que a lista irá seguir
        idRecyclerView.setLayoutManager(new
                GridLayoutManager(
                        getApplicationContext(), 2
        ));

        //Fixador de tamanho da lista
        idRecyclerView.setHasFixedSize(true);

        //Ligar o recyclerview ao adaptador
        idRecyclerView.setAdapter(adapter);
    }
}