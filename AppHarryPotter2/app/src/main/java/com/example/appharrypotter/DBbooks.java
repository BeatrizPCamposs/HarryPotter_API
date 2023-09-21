package com.example.appharrypotter;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBbooks extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "books.db";
    private static final int DATABASE_VERSION = 1;
    private static final String TABLE_NAME = "books";
    private static final String COLUMN_ID = "IdBooks";
    private static final String COLUMN_TITLE = "titulo";
    private static final String COLUMN_SUMMARY = "sumario";
    private static final String COLUMN_AUTHOR = "autor";
    private static final String COLUMN_RELEASE_YEAR = "ano_lancamento";
    private static final String COLUMN_ORDER = "ordem";
    private static final String COLUMN_COVER = "cover";
    private static final String COLUMN_NUM_PAGES = "numPaginas";

    public DBbooks(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTableQuery = "CREATE TABLE " + TABLE_NAME + " (" +
                COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COLUMN_TITLE + " TEXT, " +
                COLUMN_SUMMARY + " TEXT, " +
                COLUMN_AUTHOR + " TEXT, " +
                COLUMN_RELEASE_YEAR + " TEXT, " +
                COLUMN_ORDER + " TEXT, " +
                COLUMN_COVER + " TEXT, " +
                COLUMN_NUM_PAGES + " TEXT)";
        db.execSQL(createTableQuery);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String dropTableQuery = "DROP TABLE IF EXISTS " + TABLE_NAME;
        db.execSQL(dropTableQuery);
        onCreate(db);
    }

    public void insertBook(String titulo, String sumario, String autor, String ano_lancamento, String ordem, String cover, String numPaginas) {
        SQLiteDatabase db = getWritableDatabase();
        String insertQuery = "INSERT INTO " + TABLE_NAME + " (" +
                COLUMN_TITLE + ", " +
                COLUMN_SUMMARY + ", " +
                COLUMN_AUTHOR + ", " +
                COLUMN_RELEASE_YEAR + ", " +
                COLUMN_ORDER + ", " +
                COLUMN_COVER + ", " +
                COLUMN_NUM_PAGES + ") VALUES ('" +
                titulo + "', '" +
                sumario + "', '" +
                autor + "', '" +
                ano_lancamento + "', '" +
                ordem + "', '" +
                cover + "', '" +
                numPaginas + "')";
        db.execSQL(insertQuery);
    }

    public Cursor getAllBooks() {
        SQLiteDatabase db = getReadableDatabase();
        String selectQuery = "SELECT * FROM " + TABLE_NAME;
        return db.rawQuery(selectQuery, null);
    }
}

