package com.aveschile.jc.recycleraves;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class AveDetalle extends AppCompatActivity implements View.OnClickListener{

    ImageView imageView;
    TextView  textView;
    TextView textViewDesc;
    TextView textViewGoogle;
    Button btnIngles, btnEspanol, btnMapu, btnGoogle, btnEscuchar;
    int posicion = 0;
    MediaPlayer mp;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ave_detalle);



        //activar flecha ir atras
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //forzar y cargar  icono en el Action Bar
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_ave);

        //cambiar titulo de pantalla
        getSupportActionBar().setTitle("Aves Chile");


        imageView=(ImageView)findViewById(R.id.ave_image);

        textView=(TextView)findViewById(R.id.ave_nombre);

        textViewDesc=(TextView)findViewById(R.id.ave_descripcion);

        textViewGoogle=(TextView)findViewById(R.id.ave_ruta);


        btnIngles = (Button) findViewById(R.id.btnIngles);
        btnIngles.setOnClickListener(this);

        btnEspanol = (Button)findViewById(R.id.btnEspanol);
        btnEspanol.setOnClickListener(this);

        btnMapu = (Button)findViewById(R.id.btnMapu);
        btnMapu.setOnClickListener(this);

        btnGoogle = (Button)findViewById(R.id.btnGoogle);
        btnGoogle.setOnClickListener(this);

        btnEscuchar = (Button)findViewById(R.id.btnEscuchar);
        btnEscuchar.setOnClickListener(this);


        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        if(bundle!=null){
            String cadena = (String)bundle.get("Nombre");
            textView.setText(cadena);

            String cadenaEs = (String)bundle.get("Espanol");
            textViewDesc.setText(cadenaEs);

            String descripcionIn = (String)bundle.get("Ingles");
            textViewDesc.setText(descripcionIn);

            String descripcionMa = (String)bundle.get("Mapu");
            textViewDesc.setText(descripcionMa);

            String rutaGoogle = (String)bundle.get("direccion");
            textViewGoogle.setText(rutaGoogle);


            imageView.setImageResource(getIntent().getIntExtra("img",00));

            //agregar audio aves
            btnEscuchar.setRawInputType(getIntent().getIntExtra("id",00));


        }


    }

    @Override
    public void onClick(View view){

        switch (view.getId()) {
            case R.id.btnIngles:
                //código de acción a realizar
                textViewDesc = (TextView) findViewById(R.id.ave_descripcion);
                textViewDesc.setText(getIntent().getStringExtra("Ingles").toString());
                break;
            case R.id.btnEspanol:
                //código de acción a realizar
                textViewDesc = (TextView) findViewById(R.id.ave_descripcion);
                textViewDesc.setText(getIntent().getStringExtra("Espanol").toString());
                break;

            case R.id.btnMapu:
                //código de acción a realizar
                textViewDesc = (TextView) findViewById(R.id.ave_descripcion);
                textViewDesc.setText(getIntent().getStringExtra("Mapu").toString());
                break;
            case R.id.btnEscuchar:
                //código de acción a realizar

                destruir();
                mp = MediaPlayer.create(this, (getIntent().getIntExtra("id",00)));
                mp.start();
                if (mp != null && mp.isPlaying() == false) {
                    mp.seekTo(posicion);
                    mp.start();
                }

                break;

            case R.id.btnGoogle:
                //código de acción a realizar

                Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                myWebLink.setData(Uri.parse(textViewGoogle.getText().toString()));
                startActivity(myWebLink);


                /*WebView webView = new WebView(AveDetalle.this);
                setContentView(webView);
                webView.loadUrl(textViewGoogle.getText().toString());
                webView.setWebViewClient(new WebViewClient(){
                    public boolean shouldOverrideUrlLoading(WebView view, String url){
                        return  false;
                    }
                });*/


                break;

          //  case R.id.btnUbicacion:

            //        Intent i = new Intent(this, Ubicacion.class );

              //      startActivity(i);

            //break;
        }


    }

    public void destruir() {
        if (mp != null)
            mp.release();
    }

    //termina audio al volver a actividad anterior
    @Override
    public void onDestroy(){
        super.onDestroy();
        if (mp != null)
            mp.release();
    }


}
