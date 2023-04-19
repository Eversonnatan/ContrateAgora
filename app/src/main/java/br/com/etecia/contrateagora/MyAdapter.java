package br.com.etecia.contrateagora;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private Context mContexto;
    private List<Categorias> lstCategorias;

    public MyAdapter(Context mContexto, List<Categorias> lstCategorias) {
        this.mContexto = mContexto;
        this.lstCategorias = lstCategorias;
    }


    @NonNull
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;

        LayoutInflater inflater = LayoutInflater.from(mContexto);
        view = inflater.inflate(R.layout.modelo_categorias, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.idImagemCategorias.setImageResource(lstCategorias.get(position).getImagem());
        holder.idBotaoCategorias.setText(lstCategorias.get(position).getBotao());
        holder.idCardCategorias.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(mContexto, MenuActivity.class);


                intent.putExtra("ImagemCategoria", lstCategorias.get(holder.getAdapterPosition()).getImagem());
                intent.putExtra("botao", lstCategorias.get(holder.getAdapterPosition()).getBotao());

                mContexto.startActivity(intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK));

            }
        });

    }

    @Override
    public int getItemCount() {
        return lstCategorias.size();
    }


        //criar a classe ViewHolder
        public class ViewHolder extends RecyclerView.ViewHolder {
            ImageView idImagemCategorias;
            TextView idBotaoCategorias;
            CardView idCardCategorias;

            public ViewHolder(@NonNull View itemView) {
                super(itemView);
                idImagemCategorias = itemView.findViewById(R.id.idImagemCategorias);
                idBotaoCategorias = itemView.findViewById(R.id.idBotaoCategorias);
                idCardCategorias = itemView.findViewById(R.id.idCardCategorias);
            }
        }

}
