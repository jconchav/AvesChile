package com.aveschile.jc.recycleraves;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Ave> aves;

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //forzar y cargar  icono en el Action Bar
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_ave);

        aves = this.getAllAves();

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mLayoutManager = new LinearLayoutManager(this);
        mLayoutManager = new GridLayoutManager(this,2);
        mAdapter = new MyAdapter(aves, R.layout.recycler_view_item, new MyAdapter.OnItemClickListener(){
            public Context context;

            @Override
            public void onItemClick(Ave ave, int position){

                //Toast.makeText(MainActivity.this,ave + " - " + position, Toast.LENGTH_SHORT).show();
                
            }
        });

        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());

        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(mLayoutManager);
    }

    private List<Ave> getAllAves(){

        return new ArrayList<Ave>(){{
            add(new Ave("Bandurrilla", R.drawable.bandurrilla,R.string.texto_bandurrilla, R.string.texto_bandurrilla_ingles, R.string.texto_bandurrilla_mapu,R.raw.bandurrilla,"https://www.google.cl/search?q=zorzal&rlz=1C5CHFA_enCL700CL700&espv=2&biw=1191&bih=676&source=lnms&tbm=isch&sa=X&ved=0ahUKEwia-ePfvdLRAhXChZAKHb2XCbkQ_AUIBigB#tbm=isch&q=bandurrilla"));
            add(new Ave("Cachudito", R.drawable.cachudito,R.string.texto_cachudito,R.string.texto_cachudito_ingles,R.string.texto_cachudito_mapu,R.raw.cachudito,"https://www.google.cl/search?q=zorzal&rlz=1C5CHFA_enCL700CL700&espv=2&biw=1191&bih=676&source=lnms&tbm=isch&sa=X&ved=0ahUKEwia-ePfvdLRAhXChZAKHb2XCbkQ_AUIBigB#tbm=isch&q=cachudito"));
            add(new Ave("Canastero", R.drawable.canastero,R.string.texto_canastero,R.string.texto_canastero_ingles,R.string.texto_canastero_mapu,R.raw.canastero,"https://www.google.cl/search?q=zorzal&rlz=1C5CHFA_enCL700CL700&espv=2&biw=1191&bih=676&source=lnms&tbm=isch&sa=X&ved=0ahUKEwia-ePfvdLRAhXChZAKHb2XCbkQ_AUIBigB#tbm=isch&q=canastero"));
            add(new Ave("Carpinterito", R.drawable.carpinterito,R.string.texto_carpinterito,R.string.texto_carpinterito_ingles,R.string.texto_carpinterito_mapu,R.raw.carpinterito,"https://www.google.cl/search?rlz=1C5CHFA_enCL700CL700&biw=1257&bih=632&tbm=isch&sa=1&ei=3kt2WuH8LYGLwgS8tImYAQ&q=carpinterito+ave&oq=carpinterito+ave&gs_l=psy-ab.3..0j0i24k1.172264.175286.0.176133.12.12.0.0.0.0.138.948.9j1.10.0....0...1c.1.64.psy-ab..2.10.947...0i19k1j0i7i30i19k1j0i7i30k1j0i8i7i30k1j0i8i30k1j0i10i24k1j0i13k1j0i8i13i30k1.0.QoTVokBe6Ys"));
            add(new Ave("Codorniz", R.drawable.codorniz,R.string.texto_codorniz,R.string.texto_codorniz_ingles,R.string.texto_codorniz_mapu,R.raw.codorniz,"https://www.google.cl/search?rlz=1C5CHFA_enCL700CL700&biw=1257&bih=632&tbm=isch&sa=1&ei=Akl2WvT7McWewgTr8oTQAQ&q=codorniz+chilena&oq=codor&gs_l=psy-ab.3.3.0l10.153778.154511.0.159255.5.5.0.0.0.0.207.547.4j0j1.5.0....0...1c.1.64.psy-ab..0.5.546...0i67k1.0.LaShVcdlTRI"));
            add(new Ave("Chercan", R.drawable.chercan,R.string.texto_chercan,R.string.texto_chercan_ingles,R.string.texto_chercan_mapu,R.raw.chercan,"https://www.google.cl/search?q=zorzal&rlz=1C5CHFA_enCL700CL700&espv=2&biw=1191&bih=676&source=lnms&tbm=isch&sa=X&ved=0ahUKEwia-ePfvdLRAhXChZAKHb2XCbkQ_AUIBigB#tbm=isch&q=chercan"));
            add(new Ave("Chirihue", R.drawable.chirihue,R.string.texto_chirigue,R.string.texto_chirigue_ingles,R.string.texto_chirigue_mapu,R.raw.chirigue,"https://www.google.cl/search?q=zorzal&rlz=1C5CHFA_enCL700CL700&espv=2&biw=1191&bih=676&source=lnms&tbm=isch&sa=X&ved=0ahUKEwia-ePfvdLRAhXChZAKHb2XCbkQ_AUIBigB#tbm=isch&q=chirihue"));
            add(new Ave("Chincol", R.drawable.chincol,R.string.texto_chincol,R.string.texto_chincol_ingles,R.string.texto_chincol_mapu,R.raw.chincol,"https://www.google.cl/search?q=zorzal&rlz=1C5CHFA_enCL700CL700&espv=2&biw=1191&bih=676&source=lnms&tbm=isch&sa=X&ved=0ahUKEwia-ePfvdLRAhXChZAKHb2XCbkQ_AUIBigB#tbm=isch&q=chincol"));
            add(new Ave("Chucao", R.drawable.chucao,R.string.texto_chucao,R.string.texto_chucao_ingles,R.string.texto_chucao_mapu,R.raw.chucao,"https://www.google.cl/search?q=chucao&rlz=1C5CHFA_enCL700CL700&source=lnms&tbm=isch&sa=X&ved=0ahUKEwjtopvIiIvZAhWMnJAKHSrUAjEQ_AUICigB&biw=1257&bih=632"));
            add(new Ave("Chuncho", R.drawable.chuncho,R.string.texto_chuncho,R.string.texto_chuncho_ingles,R.string.texto_chuncho_mapu,R.raw.chuncho,"https://www.google.cl/search?q=zorzal&rlz=1C5CHFA_enCL700CL700&espv=2&biw=1191&bih=676&source=lnms&tbm=isch&sa=X&ved=0ahUKEwia-ePfvdLRAhXChZAKHb2XCbkQ_AUIBigB#tbm=isch&q=chuncho+ave"));
            add(new Ave("Churrete", R.drawable.churrete,R.string.texto_churrete,R.string.texto_churrete_ingles,R.string.texto_churrete_mapu,R.raw.churrete,"https://www.google.cl/search?rlz=1C5CHFA_enCL700CL700&biw=1257&bih=632&tbm=isch&sa=1&ei=PVZ2WvTINMiEwQTq7I-AAw&q=churrete+ave&oq=churrete&gs_l=psy-ab.1.2.0l10.127333.132266.0.135420.8.8.0.0.0.0.171.800.6j2.8.0....0...1c.1.64.psy-ab..0.8.798...0i67k1.0.yaahqkHmCic"));
            add(new Ave("Churrin", R.drawable.churrin,R.string.texto_churrin,R.string.texto_churrin_ingles,R.string.texto_churrin_mapu,R.raw.churrin,"https://www.google.cl/search?q=zorzal&rlz=1C5CHFA_enCL700CL700&espv=2&biw=1191&bih=676&source=lnms&tbm=isch&sa=X&ved=0ahUKEwia-ePfvdLRAhXChZAKHb2XCbkQ_AUIBigB#tbm=isch&q=churrin"));
            add(new Ave("Colegial", R.drawable.colegial,R.string.texto_colegial,R.string.texto_colegial_ingles,R.string.texto_colegial_mapu,R.raw.colegial,"https://www.google.cl/search?q=zorzal&rlz=1C5CHFA_enCL700CL700&espv=2&biw=1191&bih=676&source=lnms&tbm=isch&sa=X&ved=0ahUKEwia-ePfvdLRAhXChZAKHb2XCbkQ_AUIBigB#tbm=isch&q=colegial+ave"));
            add(new Ave("Cometocino de gay", R.drawable.cometocino_gay,R.string.texto_cometocinodegay,R.string.texto_cometocinodegay_ingles,R.string.texto_cometocinodegay_mapu,R.raw.cometocino_de_gay,"https://www.google.cl/search?q=zorzal&rlz=1C5CHFA_enCL700CL700&espv=2&biw=1191&bih=676&source=lnms&tbm=isch&sa=X&ved=0ahUKEwia-ePfvdLRAhXChZAKHb2XCbkQ_AUIBigB#tbm=isch&q=cometocino+de+gay"));
            add(new Ave("Cometocino patagónico", R.drawable.cometocino_patagonico,R.string.texto_cometocino_patagonico,R.string.texto_cometocino_patagonico_ingles,R.string.texto_cometocino_patagonico_mapu,R.raw.cometocino_patagonico,"https://www.google.cl/search?q=cometocino+patag%C3%B3nico&rlz=1C5CHFA_enCL700CL700&source=lnms&tbm=isch&sa=X&ved=0ahUKEwi7vefj84rZAhVDHJAKHdIEBIEQ_AUICigB&biw=1257&bih=632"));
            add(new Ave("Diucón", R.drawable.diucon,R.string.texto_diucon,R.string.texto_diucon_ingles,R.string.texto_diucon_mapu,R.raw.diucon,"https://www.google.cl/search?q=zorzal&rlz=1C5CHFA_enCL700CL700&espv=2&biw=1191&bih=676&source=lnms&tbm=isch&sa=X&ved=0ahUKEwia-ePfvdLRAhXChZAKHb2XCbkQ_AUIBigB#tbm=isch&q=diucon+ave"));
            add(new Ave("Diuca", R.drawable.diuca,R.string.texto_diuca,R.string.texto_diuca_ingles,R.string.texto_diuca_mapu,R.raw.diuca,"https://www.google.cl/search?q=zorzal&rlz=1C5CHFA_enCL700CL700&espv=2&biw=1191&bih=676&source=lnms&tbm=isch&sa=X&ved=0ahUKEwia-ePfvdLRAhXChZAKHb2XCbkQ_AUIBigB#tbm=isch&q=diuca+ave"));
            add(new Ave("Fio Fio", R.drawable.fiofio,R.string.texto_fiofio,R.string.texto_fiofio_ingles,R.string.texto_fiofio_mapu,R.raw.fiofio,"https://www.google.cl/search?q=zorzal&rlz=1C5CHFA_enCL700CL700&espv=2&biw=1191&bih=676&source=lnms&tbm=isch&sa=X&ved=0ahUKEwia-ePfvdLRAhXChZAKHb2XCbkQ_AUIBigB#tbm=isch&q=fio+fio+ave"));
            add(new Ave("Gallina ciega", R.drawable.gallina_ciega,R.string.texto_gallinaciega,R.string.texto_gallinaciega_ingles,R.string.texto_gallinaciega_mapu,R.raw.gallina_ciega,"https://www.google.cl/search?q=zorzal&rlz=1C5CHFA_enCL700CL700&espv=2&biw=1191&bih=676&source=lnms&tbm=isch&sa=X&ved=0ahUKEwia-ePfvdLRAhXChZAKHb2XCbkQ_AUIBigB#tbm=isch&q=gallina+ciega+ave"));
            add(new Ave("Gaviota dominicana", R.drawable.gaviota_dominicana,R.string.texto_gaviota_dominicana,R.string.texto_gaviota_dominicana_ingles,R.string.texto_gaviota_dominicana_mapu,R.raw.gaviota_dominicana,"https://www.google.cl/search?rlz=1C5CHFA_enCL700CL700&biw=1257&bih=632&tbm=isch&sa=1&ei=MVR2WrKhA4f9wATz5rGIAQ&q=gaviota+dominicana&oq=gaviota+dominicana&gs_l=psy-ab.3..0l2j0i24k1l4.136374.140483.0.140771.18.10.0.8.8.0.181.1050.7j3.10.0....0...1c.1.64.psy-ab..0.18.1083...0i67k1j0i8i30k1.0.DOq8neNNuCw"));
            add(new Ave("Gaviota de franklin", R.drawable.gaviota_franklin,R.string.texto_gaviota_franklin,R.string.texto_gaviota_franklin_ingles,R.string.texto_gaviota_franklin_mapu,R.raw.gaviota_franklin,"https://www.google.cl/search?rlz=1C5CHFA_enCL700CL700&biw=1257&bih=632&tbm=isch&sa=1&ei=vlR2WsO1KoqkwASJ86q4Bg&q=gaviota+franklin&oq=gaviota+fr&gs_l=psy-ab.3.0.0l2j0i5i30k1l4j0i8i30k1j0i24k1l3.195014.197661.0.199611.12.12.0.0.0.0.102.985.10j1.11.0....0...1c.1.64.psy-ab..1.11.983...0i67k1.0.hGsh_wWJp1Y"));
            add(new Ave("Golondrina", R.drawable.golondrina,R.string.texto_golondrina,R.string.texto_golondrina_ingles,R.string.texto_golondrina_mapu,R.raw.golondrinachilena,"https://www.google.cl/search?q=zorzal&rlz=1C5CHFA_enCL700CL700&espv=2&biw=1191&bih=676&source=lnms&tbm=isch&sa=X&ved=0ahUKEwia-ePfvdLRAhXChZAKHb2XCbkQ_AUIBigB#tbm=isch&q=golondrina+chilena"));
            add(new Ave("Gorrión", R.drawable.gorrion,R.string.texto_gorrion,R.string.texto_gorrion_ingles,R.string.texto_gorrion_mapu,R.raw.gorrion,"https://www.google.cl/search?q=zorzal&rlz=1C5CHFA_enCL700CL700&espv=2&biw=1191&bih=676&source=lnms&tbm=isch&sa=X&ved=0ahUKEwia-ePfvdLRAhXChZAKHb2XCbkQ_AUIBigB#tbm=isch&q=gorrion+ave"));
            add(new Ave("Jilguero", R.drawable.jilguero,R.string.texto_jilguero,R.string.texto_jilguero_ingles,R.string.texto_jilguero_mapu,R.raw.jilguero1,"https://www.google.cl/search?q=zorzal&rlz=1C5CHFA_enCL700CL700&espv=2&biw=1191&bih=676&source=lnms&tbm=isch&sa=X&ved=0ahUKEwia-ePfvdLRAhXChZAKHb2XCbkQ_AUIBigB#tbm=isch&q=jilguero+chileno"));
            add(new Ave("Loica", R.drawable.loica,R.string.texto_loica,R.string.texto_loica_ingles,R.string.texto_loica_mapu,R.raw.loica,"https://www.google.cl/search?q=zorzal&rlz=1C5CHFA_enCL700CL700&espv=2&biw=1191&bih=676&source=lnms&tbm=isch&sa=X&ved=0ahUKEwia-ePfvdLRAhXChZAKHb2XCbkQ_AUIBigB#tbm=isch&q=loica+chilena"));
            add(new Ave("Minero cordillerano", R.drawable.minerocordillerano,R.string.texto_minerocordillerano,R.string.texto_minerocordillerano_ingles,R.string.texto_minerocordillerano_mapu,R.raw.minero_cordillerano,"https://www.google.cl/search?q=zorzal&rlz=1C5CHFA_enCL700CL700&espv=2&biw=1191&bih=676&source=lnms&tbm=isch&sa=X&ved=0ahUKEwia-ePfvdLRAhXChZAKHb2XCbkQ_AUIBigB#tbm=isch&q=minero+cordillerano+ave"));
            add(new Ave("Mirlo", R.drawable.mirlo,R.string.texto_mirlo,R.string.texto_mirlo_ingles,R.string.texto_mirlo_mapu,R.raw.mirlo,"https://www.google.cl/search?rlz=1C5CHFA_enCL700CL700&biw=1257&bih=632&tbm=isch&sa=1&ei=yVx2WtihJIStwATx37zABg&q=molothrus+bonariensis&oq=molthrus&gs_l=psy-ab.3.0.0i13k1l7j0i13i30k1l2.8143.10781.0.12963.8.8.0.0.0.0.102.760.6j2.8.0....0...1c.1.64.psy-ab..0.7.656...0j0i67k1j0i10k1j0i30k1j0i5i30k1.0.OVOiyDFY324"));
            add(new Ave("Nuco", R.drawable.nuco,R.string.texto_nuco,R.string.texto_nuco_ingles,R.string.texto_nuco_mapu,R.raw.nuco,"https://www.google.cl/search?rlz=1C5CHFA_enCL700CL700&biw=1257&bih=632&tbm=isch&sa=1&ei=2Et2Wv2ZMoKLwgSlzpHwCg&q=nuco+ave&oq=nuco+&gs_l=psy-ab.3.0.0l3j0i67k1j0l6.2935.2935.0.5210.1.1.0.0.0.0.101.101.0j1.1.0....0...1c.1.64.psy-ab..0.1.100....0.106VLnXuURw"));
            add(new Ave("Perdiz chilena", R.drawable.perdiz_chilena,R.string.texto_perdizchilena,R.string.texto_perdizchilena_ingles,R.string.texto_perdizchilena_mapu,R.raw.perdiz_chilena,"https://www.google.cl/search?q=zorzal&rlz=1C5CHFA_enCL700CL700&espv=2&biw=1191&bih=676&source=lnms&tbm=isch&sa=X&ved=0ahUKEwia-ePfvdLRAhXChZAKHb2XCbkQ_AUIBigB#tbm=isch&q=perdiz+chilena+ave"));
            add(new Ave("Perrito", R.drawable.perrito,R.string.texto_perrito,R.string.texto_perrito_ingles,R.string.texto_perrito_mapu,R.raw.perrito,"https://www.google.cl/search?q=zorzal&rlz=1C5CHFA_enCL700CL700&espv=2&biw=1191&bih=676&source=lnms&tbm=isch&sa=X&ved=0ahUKEwia-ePfvdLRAhXChZAKHb2XCbkQ_AUIBigB#tbm=isch&q=perrito+ave"));
            add(new Ave("Picaflor chico", R.drawable.picaflorchico,R.string.texto_picaflorchico,R.string.texto_picaflorchico_ingles,R.string.texto_picaflorchico_mapu,R.raw.picaflorchico,"https://www.google.cl/search?q=zorzal&rlz=1C5CHFA_enCL700CL700&espv=2&biw=1191&bih=676&source=lnms&tbm=isch&sa=X&ved=0ahUKEwia-ePfvdLRAhXChZAKHb2XCbkQ_AUIBigB#tbm=isch&q=picaflor+chico"));
            add(new Ave("Picaflor gigante", R.drawable.picaflorgigante,R.string.texto_picaflorgigante,R.string.texto_picaflorgigante_ingles,R.string.texto_picaflorgigante_mapu,R.raw.picaflor_gigante,"https://www.google.cl/search?q=zorzal&rlz=1C5CHFA_enCL700CL700&espv=2&biw=1191&bih=676&source=lnms&tbm=isch&sa=X&ved=0ahUKEwia-ePfvdLRAhXChZAKHb2XCbkQ_AUIBigB#tbm=isch&q=picaflor+gigante+chileno"));
            add(new Ave("Pilpilen", R.drawable.pilpilen,R.string.texto_pilpilen,R.string.texto_pilpilen_ingles,R.string.texto_pilpilen_mapu,R.raw.pilpilen,"https://www.google.cl/search?q=zorzal&rlz=1C5CHFA_enCL700CL700&espv=2&biw=1191&bih=676&source=lnms&tbm=isch&sa=X&ved=0ahUKEwia-ePfvdLRAhXChZAKHb2XCbkQ_AUIBigB#tbm=isch&q=pilpilen+ave"));
            add(new Ave("Pitio", R.drawable.pitio,R.string.texto_pitio,R.string.texto_pitio_ingles,R.string.texto_pitio_mapu,R.raw.pitio,"https://www.google.cl/search?q=zorzal&rlz=1C5CHFA_enCL700CL700&espv=2&biw=1191&bih=676&source=lnms&tbm=isch&sa=X&ved=0ahUKEwia-ePfvdLRAhXChZAKHb2XCbkQ_AUIBigB#tbm=isch&q=pitio+ave"));
            add(new Ave("Pitotoy chico", R.drawable.pitotoychico,R.string.texto_pitotoychico,R.string.texto_pitotoychico_ingles,R.string.texto_pitotoychico_mapu,R.raw.pitotoy_chico,"https://www.google.cl/search?q=zorzal&rlz=1C5CHFA_enCL700CL700&espv=2&biw=1191&bih=676&source=lnms&tbm=isch&sa=X&ved=0ahUKEwia-ePfvdLRAhXChZAKHb2XCbkQ_AUIBigB#tbm=isch&q=pitotoy+chico"));
            add(new Ave("Platero", R.drawable.platero,R.string.texto_platero,R.string.texto_platero_ingles,R.string.texto_platero_mapu,R.raw.platero,"https://www.google.cl/search?q=zorzal&rlz=1C5CHFA_enCL700CL700&espv=2&biw=1191&bih=676&source=lnms&tbm=isch&sa=X&ved=0ahUKEwia-ePfvdLRAhXChZAKHb2XCbkQ_AUIBigB#tbm=isch&q=platero+ave"));
            add(new Ave("Queltehue", R.drawable.queltehue,R.string.texto_queltehue,R.string.texto_queltehue_ingles,R.string.texto_queltehue_mapu,R.raw.queltehue,"https://www.google.cl/search?q=queltehue&rlz=1C5CHFA_enCL700CL700&source=lnms&tbm=isch&sa=X&ved=0ahUKEwi7rJW-hobYAhVSPJAKHdcPACoQ_AUICigB&biw=1280&bih=676"));
            add(new Ave("Rara", R.drawable.rara,R.string.texto_rara,R.string.texto_rara_ingles,R.string.texto_rara_mapu,R.raw.rara,"https://www.google.cl/search?q=zorzal&rlz=1C5CHFA_enCL700CL700&espv=2&biw=1191&bih=676&source=lnms&tbm=isch&sa=X&ved=0ahUKEwia-ePfvdLRAhXChZAKHb2XCbkQ_AUIBigB#tbm=isch&q=rara+ave+chilena"));
            add(new Ave("Rayadito", R.drawable.rayadito,R.string.texto_rayadito,R.string.texto_rayadito_ingles,R.string.texto_rayadito_mapu,R.raw.rayadito1,"https://www.google.cl/search?q=zorzal&rlz=1C5CHFA_enCL700CL700&espv=2&biw=1191&bih=676&source=lnms&tbm=isch&sa=X&ved=0ahUKEwia-ePfvdLRAhXChZAKHb2XCbkQ_AUIBigB#tbm=isch&q=rayadito+ave"));
            add(new Ave("Rayador", R.drawable.rayador,R.string.texto_rayador,R.string.texto_rayador_ingles,R.string.texto_rayador_mapu,R.raw.rayador,"https://www.google.cl/search?rlz=1C5CHFA_enCL700CL700&biw=1257&bih=632&tbm=isch&sa=1&ei=l1N2WrnmGMuWwATXpo_ACQ&q=rayador+ave&oq=rayador+ave&gs_l=psy-ab.12..0j0i24k1.148645.150002.0.152896.7.7.0.0.0.0.189.778.4j3.7.0....0...1c.1.64.psy-ab..0.7.777...0i7i30k1j0i13k1j0i19k1j0i7i30i19k1j0i30i19k1j0i5i30i19k1j0i8i30i19k1j0i8i30k1.0.cHtDEkqWGIw"));
            add(new Ave("Tapaculo", R.drawable.tapaculo,R.string.texto_tapaculo,R.string.texto_tapaculo_ingles,R.string.texto_tapaculo_mapu,R.raw.tapaculo,"https://www.google.cl/search?q=zorzal&rlz=1C5CHFA_enCL700CL700&espv=2&biw=1191&bih=676&source=lnms&tbm=isch&sa=X&ved=0ahUKEwia-ePfvdLRAhXChZAKHb2XCbkQ_AUIBigB#tbm=isch&q=tapaculo+ave+"));
            add(new Ave("Tenca", R.drawable.tenca,R.string.texto_tenca,R.string.texto_tenca_ingles,R.string.texto_tenca_mapu,R.raw.tenca,"https://www.google.cl/search?rlz=1C5CHFA_enCL700CL700&biw=1270&bih=676&tbm=isch&sa=1&q=ave+chilena+tenca&oq=ave+chilena+tenca&gs_l=psy-ab.3..0i8i30k1.13103.20613.0.20868.42.29.2.0.0.0.359.4549.0j3j11j4.18.0....0...1.1.64.psy-ab..28.13.2948.0..0j0i67k1j0i30k1j0i13k1j0i13i30k1.FJq_pDpfKSw"));
            add(new Ave("Tijeral", R.drawable.tijeral,R.string.texto_tijeral,R.string.texto_tijeral_ingles,R.string.texto_tijeral_mapu,R.raw.tijeral,"https://www.google.cl/search?rlz=1C5CHFA_enCL700CL700&biw=1257&bih=632&tbm=isch&sa=1&ei=dUZ2WvfUJ8KMwgT5o5DoAw&q=tijeral+ave&oq=tijeral+&gs_l=psy-ab.3.0.0l9j0i30k1.216148.218841.0.220815.8.7.0.1.1.0.199.712.6j1.7.0....0...1c.1.64.psy-ab..0.8.717...0i67k1.0.6r3univ9TBM"));
            add(new Ave("Tiuque", R.drawable.tiuque,R.string.texto_tiuque,R.string.texto_tiuque_ingles,R.string.texto_tiuque_mapu,R.raw.tiuque,"https://www.google.cl/search?q=tiuque&rlz=1C5CHFA_enCL700CL700&source=lnms&tbm=isch&sa=X&ved=0ahUKEwjD9Za3iYbYAhUCx5AKHXeYDDgQ_AUICigB&biw=1280&bih=676"));
            add(new Ave("Tordo", R.drawable.tordo,R.string.texto_tordo,R.string.texto_tordo_ingles,R.string.texto_tordo_mapu,R.raw.tordo,"https://www.google.cl/search?rlz=1C5CHFA_enCL700CL700&biw=1280&bih=676&tbm=isch&sa=1&ei=jaIwWpGXIcqmwgTIxrToCA&q=tordo+chileno&oq=tordo+chileno&gs_l=psy-ab.3..0.7529.8693.0.9486.7.6.0.1.1.0.278.696.2-3.3.0....0...1c.1.64.psy-ab..3.4.697...0i8i30k1j0i24k1.0.5n9sCw7U-78"));
            add(new Ave("Tórtola común", R.drawable.tortola_comun,R.string.texto_tortola_comun,R.string.texto_tortola_comun_ingles,R.string.texto_tortola_comun_mapu,R.raw.tortola_comun,"https://www.google.cl/search?rlz=1C5CHFA_enCL700CL700&biw=1257&bih=632&tbm=isch&sa=1&ei=Ikh2WpjUMMqmwASh9IK4DQ&q=zenaida+auriculata&oq=zenai&gs_l=psy-ab.3.3.0i67k1j0l2j0i67k1j0l6.14716.15553.0.18240.5.5.0.0.0.0.114.482.4j1.5.0....0...1c.1.64.psy-ab..0.5.481....0.ivs2E4_y1jY"));
            add(new Ave("Tórtola cordillerana", R.drawable.tortola,R.string.texto_tortolacordillerana,R.string.texto_tortolacordillerana_ingles,R.string.texto_tortolacordillerana_mapu,R.raw.tortolacordillerana,"https://www.google.cl/search?q=zorzal&rlz=1C5CHFA_enCL700CL700&espv=2&biw=1191&bih=676&source=lnms&tbm=isch&sa=X&ved=0ahUKEwia-ePfvdLRAhXChZAKHb2XCbkQ_AUIBigB#tbm=isch&q=tortola+cordillerana+ave"));
            add(new Ave("Tortolita cuyana", R.drawable.tortolita_cuyana,R.string.texto_tortolita_cuyana,R.string.texto_tortolita_cuyana_ingles,R.string.texto_tortolita_cuyana_mapu,R.raw.tortolita_cuyana,"https://www.google.cl/search?rlz=1C5CHFA_enCL700CL700&biw=1257&bih=632&tbm=isch&sa=1&ei=okl2WqX3KYOgwATe74jYDg&q=tortolita+cuyana&oq=tortolita&gs_l=psy-ab.3.2.0l10.158584.162253.0.165677.9.9.0.0.0.0.192.935.7j2.9.0....0...1c.1.64.psy-ab..0.9.932...0i67k1.0._w_MSSTupRc"));
            add(new Ave("Tucuquere", R.drawable.tucuquere,R.string.texto_tucuquere,R.string.texto_tucuquere_ingles,R.string.texto_tucuquere_mapu,R.raw.tucuquere,"https://www.google.cl/search?q=tucuquere&rlz=1C5CHFA_enCL700CL700&espv=2&biw=1191&bih=676&source=lnms&tbm=isch&sa=X&ved=0ahUKEwiXsf_X9pjSAhWHW5AKHRVyCXEQ_AUIBigB#tbm=isch&q=tucuquere+ave"));
            add(new Ave("Turca", R.drawable.turca,R.string.texto_turca,R.string.texto_turca_ingles,R.string.texto_turca_mapu,R.raw.turca,"https://www.google.cl/search?q=zorzal&rlz=1C5CHFA_enCL700CL700&espv=2&biw=1191&bih=676&source=lnms&tbm=isch&sa=X&ved=0ahUKEwia-ePfvdLRAhXChZAKHb2XCbkQ_AUIBigB#tbm=isch&q=turca+ave+chilena"));
            add(new Ave("Viudita", R.drawable.viudita,R.string.texto_viudita,R.string.texto_viudita_ingles,R.string.texto_viudita_mapu,R.raw.viudita,"https://www.google.cl/search?rlz=1C5CHFA_enCL700CL700&biw=1257&bih=632&tbm=isch&sa=1&ei=8Eh2Wr_nCsuowgSa4JfADA&q=colorhamphus+parvirostris&oq=colorha&gs_l=psy-ab.3.1.0j0i24k1j0i10i24k1l6j0i24k1.8102.14043.0.17987.11.9.2.0.0.0.155.920.5j4.9.0....0...1c.1.64.psy-ab..0.10.836...0i67k1j0i10k1j0i30k1j0i5i30k1.0.SH-5XswIEzs"));
            add(new Ave("Yal", R.drawable.yal,R.string.texto_yal,R.string.texto_yal_ingles,R.string.texto_yal_mapu,R.raw.yal,"https://www.google.cl/search?q=zorzal&rlz=1C5CHFA_enCL700CL700&espv=2&biw=1191&bih=676&source=lnms&tbm=isch&sa=X&ved=0ahUKEwia-ePfvdLRAhXChZAKHb2XCbkQ_AUIBigB#tbm=isch&q=yal+ave"));
            add(new Ave("Yeco", R.drawable.yeco,R.string.texto_yeco,R.string.texto_yeco_ingles,R.string.texto_yeco_mapu,R.raw.yeco,"https://www.google.cl/search?rlz=1C5CHFA_enCL700CL700&biw=1257&bih=632&tbm=isch&sa=1&ei=KlZ2WtCWCImzwATZ_LugCw&q=yeco&oq=yeco&gs_l=psy-ab.3..0i67k1j0j0i67k1j0l2j0i67k1j0l4.17595.18490.0.19034.5.5.0.0.0.0.150.546.2j3.5.0....0...1c.1.64.psy-ab..0.5.543...0i13k1j0i7i30k1j0i13i30k1j0i13i5i30k1j0i19k1j0i7i30i19k1.0.ALkYp6HMY3E"));
            add(new Ave("Zarapito", R.drawable.zarapito,R.string.texto_zarapito,R.string.texto_zarapito_ingles,R.string.texto_zarapito_mapu,R.raw.zarapito,"https://www.google.cl/search?rlz=1C5CHFA_enCL700CL700&biw=1257&bih=632&tbm=isch&sa=1&ei=j0x2Wsu7LseiwQTxkoH4Bg&q=zarapito+ave&oq=zarapito+ave&gs_l=psy-ab.3..0j0i24k1l2.1794933.1797658.0.1798737.8.8.0.0.0.0.122.659.5j2.7.0....0...1c.1.64.psy-ab..1.7.658...0i7i30k1j0i8i7i30k1j0i8i7i10i30k1j0i13k1.0.0rpmBB4gpoY"));
            add(new Ave("Zorzal", R.drawable.zorzal,R.string.texto_zorzal,R.string.texto_zorzal_ingles,R.string.texto_zorzal_mapu,R.raw.zorzal,"https://www.google.cl/search?q=zorzal&rlz=1C5CHFA_enCL700CL700&espv=2&biw=1191&bih=676&source=lnms&tbm=isch&sa=X&ved=0ahUKEwia-ePfvdLRAhXChZAKHb2XCbkQ_AUIBigB#tbm=isch&q=zorzal+chileno"));
            add(new Ave("Zorzal mero", R.drawable.zorzal_mero,R.string.texto_zorzalmero,R.string.texto_zorzalmero_ingles,R.string.texto_zorzalmero_mapu,R.raw.zorzal_mero,"https://www.google.cl/search?q=zorzal&rlz=1C5CHFA_enCL700CL700&espv=2&biw=1191&bih=676&source=lnms&tbm=isch&sa=X&ved=0ahUKEwia-ePfvdLRAhXChZAKHb2XCbkQ_AUIBigB#tbm=isch&q=zorzal+mero+ave"));


        }};
    }

    //codigo para menu superior

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main,menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id=item.getItemId();
        if(id==R.id.id_informacion){

            Intent intentInformacion= new Intent(MainActivity.this,Acercade.class);
            startActivity(intentInformacion);
            return  true;
        }
        if(id==R.id.id_compartir){

            Intent intentCompartir = new Intent(Intent.ACTION_SEND);
            intentCompartir.setType("text/plain");
            String shareBody = "https://play.google.com/store/apps/details?id=com.aveschile.jc.recycleraves&hl=es";
            String shareSub = "Prueba esta aplicación...";
            intentCompartir.putExtra(Intent.EXTRA_SUBJECT,shareSub);
            intentCompartir.putExtra(Intent.EXTRA_TEXT,shareBody);
            startActivity(Intent.createChooser(intentCompartir, "Compartir usando"));
            return true;
        }

        if(id==R.id.id_contacto){

            String email = "jccv.apps@gmail.com";

            Intent intentCorreo = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:" + email));
            startActivity(intentCorreo);
        }
        return true;
    }
}
