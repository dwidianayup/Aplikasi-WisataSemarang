package com.example.apple.semarangtouriss;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by apple on 2017/12/28.
 */

public class MyCoreDRegister extends SQLiteOpenHelper {
    static final private String DB_NAME = "Register";
    static final private String DB_TABLE = "data";
    static final private int DB_VER = 1;

    Context ctx;
    SQLiteDatabase myDb;

    public  MyCoreDRegister(Context ct){
        super(ct,DB_NAME,null,DB_VER);
        this.ctx =ct;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        sqLiteDatabase.execSQL("create table "+DB_TABLE+" (_id integer primary key autoincrement,data_name text,email_name text,pass_name text);");
        Log.i("Database","Table Created");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("drop table if exists "+DB_TABLE);
        onCreate(sqLiteDatabase);
    }


    public void insertData(String s1,String s2,String s3){
        myDb = getWritableDatabase();

        myDb.execSQL("insert into "+DB_TABLE+" (data_name,email_name,pass_name) values('"+s1+"','"+s2+"','"+s3+"');");
        Toast.makeText(ctx,"Register - Succes",Toast.LENGTH_LONG).show();
    }


    public void getAll(){
        myDb = getReadableDatabase();
        Cursor cr = myDb.rawQuery("Select * from "+DB_TABLE,null);
        StringBuilder str = new StringBuilder();

        while (cr.moveToNext()){
            String s1 = cr.getString(1);
            String s2 = cr.getString(2);
            String s3 = cr.getString(3);
            str.append(s1+"               "+s2+"\n");
        }

        Toast.makeText(ctx,str.toString(),Toast.LENGTH_LONG).show();
    }
}
