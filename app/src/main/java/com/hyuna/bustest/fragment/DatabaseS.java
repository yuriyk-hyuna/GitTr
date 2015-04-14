package com.hyuna.bustest.fragment;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.hyuna.bustest.sql.SqlCreateTable;

public class DatabaseS extends SQLiteOpenHelper {

    public static final String HYUNA_DATA_BASE = "HYUNA_DATA_BASE";
    public static final int VERSION = 1;
    public static final String DROP_TABLE = "DROP TABLE  %s";


    public DatabaseS(Context context) {
        super(context, HYUNA_DATA_BASE, null, VERSION, null);
    }

    public DatabaseS(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(SqlCreateTable.createTablePlay());
        db.execSQL(SqlCreateTable.createTablePlaylistData());
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        dropTable(db);

        onCreate(db);
    }


    public void dropTable(SQLiteDatabase db) {

        db.execSQL(String.format(DROP_TABLE
                , SqlCreateTable.TABLE_PLAYLIST));

        db.execSQL(String.format(DROP_TABLE
                , SqlCreateTable.TABLE_PLAYLIST));
    }
}
