package com.hyuna.bustest.sql;

import android.content.ContentValues;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

/**
 * Created by Iurii on 3/16/2015.
 */
public class SqlDo {
    public static final int SIZE_TABLE_PLAYLIST_DATA = 5;
    public static final int SIZE_TABLE_PLAYLIST = 1;
    private final SQLiteDatabase db;

    public SqlDo(SQLiteDatabase db) {
        this.db = db;
    }

    public void insert(SqlPlaylist list) {
//        final ContentValues cv = new ContentValues(SIZE_TABLE_PLAYLIST);
//        cv.put(SqlPlaylist.COLUMN_NAME, list.getName());
        try {
            db.execSQL(String.format("INSERT INTO %s (%s)  VALUES ('%s')"
                    , SqlCreateTable.TABLE_PLAYLIST
                    , SqlCreateTable.COLUMN_LIST_NAME
                    , list.getName()));
        } catch (SQLiteConstraintException e) {
            Log.i(this.getClass().getSimpleName(), String.format("Sql exception %s", e.getMessage()));
        }

    }

    public void insert(SqlPlaylistData data) {
        final ContentValues cv = new ContentValues(SIZE_TABLE_PLAYLIST_DATA);
        cv.put(SqlCreateTable.COLUMN_ID, data.getPlaylistId());
        cv.put(SqlCreateTable.COLUMN_AUTHOR, data.getAuthor());
        cv.put(SqlCreateTable.COLUMN_COMPOSITION, data.getComposition());
        cv.put(SqlCreateTable.COLUMN_DURATION, data.getDuration());
        cv.put(SqlCreateTable.COLUMN_HREF, data.getHref());
        db.insert(SqlCreateTable.TABLE_PLAYLIST_DATA, null, cv);
    }
}
