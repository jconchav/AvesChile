package com.aveschile.jc.recycleraves;

/**
 * Created by jc on 13-07-17.
 */

public class Ave {

    public String name;
    public int poster;

    //mas atributos para app completa
    public int descripcion;
    public int descripcionIngles;
    public int descripcionMapu;
    public int audioAve;
    public String urlAve;



    public Ave(String name, int poster, int descripcion, int descripcionIngles, int descripcionMapu, int audioAve, String urlAve){
        this.name =name;
        this.poster= poster;
        this.descripcion = descripcion;
        this.descripcionIngles = descripcionIngles;
        this.descripcionMapu = descripcionMapu;
        this.audioAve = audioAve;
        this.urlAve = urlAve;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoster() {
        return poster;
    }

    public void setPoster(int poster) {
        this.poster = poster;
    }

    public int getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(int descripcion) {
        this.descripcion = descripcion;
    }

    public int getDescripcionIngles() {
        return descripcionIngles;
    }

    public void setDescripcionIngles(int descripcionIngles) {
        this.descripcionIngles = descripcionIngles;
    }

    public int getDescripcionMapu() {
        return descripcionMapu;
    }

    public void setDescripcionMapu(int descripcionMapu) {
        this.descripcionMapu = descripcionMapu;
    }

    public int getAudioAve() {
        return audioAve;
    }

    public void setAudioAve() {
        this.audioAve = audioAve;
    }

    public String getUrlAve() {
        return urlAve;
    }

    public void setUrlAve(String urlAve) {
        this.urlAve = urlAve;
    }



}
