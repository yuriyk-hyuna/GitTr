package com.hyuna.bustest.sql;


/**
 * Created by Iurii on 3/16/2015.
 */
public class SqlCreateTable {
    private static final String CREATE_TABLE_PLAYLIST = "CREATE TABLE  %s ( %s INTEGER PRIMARY KEY, %s TEXT UNIQUE)";
    private static final String CREATE_TABLE_PLAYLIST_DATA = "CREATE TABLE  %s (  %s INTEGER NOT NULL, %s TEXT, %s TEXT, %s TEXT, %s TEXT)";

    public static final String TABLE_PLAYLIST_DATA = "Data";
    public static final String TABLE_PLAYLIST = "Playlist";

    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_LIST_NAME = "ListName";
    public static final String COLUMN_AUTHOR = "author";
    public static final String COLUMN_COMPOSITION = "composition";
    public static final String COLUMN_DURATION = "duration";
    public static final String COLUMN_HREF = "href";

    public static String createTablePlay() {
        return String.format(CREATE_TABLE_PLAYLIST
                , TABLE_PLAYLIST
                , COLUMN_ID
                , COLUMN_LIST_NAME);
    }

    public static String createTablePlaylistData() {
        return String.format(CREATE_TABLE_PLAYLIST_DATA
                , TABLE_PLAYLIST_DATA
                , COLUMN_ID
                , COLUMN_AUTHOR
                , COLUMN_COMPOSITION
                , COLUMN_DURATION
                , COLUMN_HREF);
    }
}
