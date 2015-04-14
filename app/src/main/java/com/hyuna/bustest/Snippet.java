package com.hyuna.bustest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by Iurii on 3/30/2015.
 */
@JsonIgnoreProperties({"publishedAt","channelId","description","thumbnails","channelTitle","categoryId","liveBroadcastContent","localized"})
public class Snippet {
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
