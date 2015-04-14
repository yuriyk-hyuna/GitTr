package com.hyuna.bustest;


/**
 * Created by Iurii on 3/30/2015.
 */
public class YoutureResponsse {
    private String kind;
    private String etag;
    private Items[] items;

    public Items[] getItems() {
        return items;
    }

    public void setItems(Items[] items) {
        this.items = items;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getEtag() {
        return etag;
    }

    public void setEtag(String etag) {
        this.etag = etag;
    }

}
