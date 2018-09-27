package com.example.alamin.createviewroutine.activity.utils;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DbBuilder extends SQLiteOpenHelper {

    Context context;

    protected static final String COL_1="day";
    protected static final String[] COL={"one","two","three","four","five"};
    protected static final String TABLE_TASK="daytask_table";
    protected static final String TABLE_TIME="daytime_table";
    private StringBuilder task_query, time_query; //for create table. will be initial at onCreate() method


    public DbBuilder(Context context){
        super(context, "routine_view.db", null, 1);
        this.context= context;
    }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        task_query= new StringBuilder("create table"+TABLE_TASK+" ("+COL_1+" text, "+COL[0]+" text, "+COL[1]+" text, "+COL[2]
                +" text, "+COL[3]+" text, "+COL[4]+" text)");
        time_query= new StringBuilder("create table"+TABLE_TIME+" ("+COL_1+" text, "+COL[0]+" text, "+COL[1]+" text, "+COL[2]
                +" text, "+COL[3]+" text, "+COL[4]+" text)");
        sqLiteDatabase.execSQL(task_query.toString());
        sqLiteDatabase.execSQL(time_query.toString());
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
