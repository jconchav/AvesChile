package com.aveschile.jc.recycleraves;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;


/**
 * Created by jc on 13-07-17.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private List<Ave> aves;
    private int layout;
    private OnItemClickListener itemClickListener;
    private Context context;


    public MyAdapter(List<Ave> aves, int layout, OnItemClickListener listener){

        this.aves=aves;
        this.layout = layout;
        this.itemClickListener = listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(layout,parent,false);
        context = parent.getContext();
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.bind(aves.get(position), itemClickListener);

        }


    @Override
    public int getItemCount() {

        return aves.size();
    }


    //implentar view.onclick
    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView textViewName;
        public ImageView imageViewPoster;

        //nuevos atributos para app completa
        public TextView txtViewEspanol;
        public TextView txtViewIngles;
        public TextView txtViewMapu;
        public MediaPlayer mp;
        public TextView textRutaGoogle;


        public ViewHolder(View itemView) {
            super(itemView);

            textViewName = (TextView)itemView.findViewById(R.id.textViewTitle);
            imageViewPoster = (ImageView)itemView.findViewById(R.id.imageViewPoster);
            txtViewEspanol = (TextView)itemView.findViewById(R.id.textIdioma);
            txtViewIngles = (TextView)itemView.findViewById(R.id.textIngles);
            txtViewMapu = (TextView)itemView.findViewById(R.id.textMapu);
            textRutaGoogle = (TextView)itemView.findViewById(R.id.textRutaGoogle);

        }

        public void bind(final Ave ave, final OnItemClickListener listener){

            txtViewEspanol.setText(ave.getDescripcion());
            txtViewEspanol.setVisibility(View.INVISIBLE);

            txtViewIngles.setText(ave.getDescripcionIngles());
            txtViewIngles.setVisibility(View.INVISIBLE);

            txtViewMapu.setText(ave.getDescripcionMapu());
            txtViewMapu.setVisibility(View.INVISIBLE);

            textRutaGoogle.setText(ave.getUrlAve());
            textRutaGoogle.setVisibility(View.INVISIBLE);



            textViewName.setText(ave.getName());
            Picasso.with(context).load(ave.getPoster()).fit().into(imageViewPoster);


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onItemClick(ave, getAdapterPosition());

                    Intent intent = new Intent(context,AveDetalle.class);

                    //envio nombre texto
                    String datoNombre = textViewName.getText().toString();
                    intent.putExtra("Nombre",datoNombre);

                    String descripcionEspa = txtViewEspanol.getText().toString();
                    intent.putExtra("Espanol",descripcionEspa);

                    String descripcionIng = txtViewIngles.getText().toString();
                    intent.putExtra("Ingles",descripcionIng);

                    String descripcionMa = txtViewMapu.getText().toString();
                    intent.putExtra("Mapu",descripcionMa);

                    String ruta = textRutaGoogle.getText().toString();
                    intent.putExtra("direccion",ruta);

                    //envio nombre imagen
                    intent.putExtra("img",ave.getPoster());

                    //envio audio
                    intent.putExtra("id",ave.getAudioAve());

                    context.startActivity(intent);

                    //intent.setType("id");
                    //intent.putExtra(Intent.EXTRA_STREAM, ave.getAudioAve());


                }
            });
            
        }

    }

    public interface OnItemClickListener{
        void onItemClick(Ave ave, int positition);

    }


}
