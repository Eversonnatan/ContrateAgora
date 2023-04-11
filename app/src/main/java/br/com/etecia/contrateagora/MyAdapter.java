package br.com.etecia.contrateagora;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context mContexto;
    private List<Categorias> lstCategorias;

    public MyAdapter(Context mContexto, List<Categorias> lstFilmes) {
        this.mContexto = mContexto;
        this.lstCategorias = lstFilmes;
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;

        LayoutInflater inflater = LayoutInflater.from(mContexto);
        view = inflater.inflate(R.layout.modelo_categorias, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        holder.idImagem.se
        holder.idBotaoCategoria.setImageResource(lstCategorias.get(position).getImagem());

        holder.idCardCategorias.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(mContexto, ApresentaFilmeActivity.class);

                intent.putExtra("Titulo", lstFilmes.get(position).getTitulo());
                intent.putExtra("Descricao", lstFilmes.get(position).getDescricao());
                intent.putExtra("Categoria", lstFilmes.get(position).getCategoria());
                intent.putExtra("ImagemFilme", lstFilmes.get(position).getImagem());

                mContexto.startActivity(intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK));

            }
        });

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
