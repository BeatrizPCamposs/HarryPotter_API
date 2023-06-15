package com.example.appharrypotter;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBcharacter extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "characters.db";
    private static final int DATABASE_VERSION = 1;
    private static final String TABLE_NAME = "characters";
    private static final String COLUMN_ID = "_id";
    private static final String COLUMN_NAME = "name";
    private static final String COLUMN_GENDER = "gender";
    private static final String COLUMN_BIRTHDATE = "birthdate";
    private static final String COLUMN_IMAGE = "image";

    public DBcharacter(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTableQuery = "CREATE TABLE " + TABLE_NAME + " (" +
                COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COLUMN_NAME + " TEXT, " +
                COLUMN_GENDER + " TEXT, " +
                COLUMN_BIRTHDATE + " TEXT, " +
                COLUMN_IMAGE + " TEXT)";
        db.execSQL(createTableQuery);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String dropTableQuery = "DROP TABLE IF EXISTS " + TABLE_NAME;
        db.execSQL(dropTableQuery);
        onCreate(db);
    }

    public void insertCharacter(String name, String gender, String birthdate, String imagePath) {
        SQLiteDatabase db = getWritableDatabase();
        String insertQuery = "INSERT INTO " + TABLE_NAME + " (" +
                COLUMN_NAME + ", " +
                COLUMN_GENDER + ", " +
                COLUMN_BIRTHDATE + ", " +
                COLUMN_IMAGE + ") VALUES ('" +
                name + "', '" +
                gender + "', '" +
                birthdate + "', '" +
                imagePath + "')";
        db.execSQL(insertQuery);
    }

    public Cursor getAllCharacters() {
        SQLiteDatabase db = getReadableDatabase();
        String selectQuery = "SELECT * FROM " + TABLE_NAME;
        return db.rawQuery(selectQuery, null);
    }
}
