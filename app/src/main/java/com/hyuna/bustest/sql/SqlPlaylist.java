package com.hyuna.bustest.sql;


public class SqlPlaylist {
    public static final String TABLE_PLAYLIST = "Playlist";
    public static final String COLUMN_NAME = "Name";

    private final String name;
    
    public SqlPlaylist(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

}
