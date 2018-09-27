package com.example.alamin.createviewroutine.activity.utils;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.alamin.createviewroutine.activity.models.RoutineModel;

import java.util.ArrayList;

public class RoutineDao extends DbBuilder {

    public RoutineDao(Context context) {
        super(context);
    }

    public String insertData(RoutineModel routineModel) {
        SQLiteDatabase sqLiteDatabase = getWritableDatabase();
        ContentValues contentTasks = new ContentValues();
        ContentValues contentTimes = new ContentValues();
        long taskTableStatus=0, timeTableStatus = 0;
        for (int count = 0; count < routineModel.getDays().length; count++) {
            contentTasks.put(COL_1, routineModel.getDays()[count]); //day column for working plan table
            contentTimes.put(COL_1, routineModel.getDays()[count]); //day column for time table
            for (int innerCount = 0; innerCount < routineModel.getTasks().length; ) {
                contentTasks.put(COL[innerCount], routineModel.getTasks()[innerCount]);
                contentTimes.put(COL[innerCount], routineModel.getTimes()[innerCount]);
            } //inner for loop close
            taskTableStatus = sqLiteDatabase.insert(TABLE_TASK, null, contentTasks);
            timeTableStatus = sqLiteDatabase.insert(TABLE_TIME, null, contentTimes);
        } //outer for loop close
        if (taskTableStatus != -1 && timeTableStatus != -1) {
            return "Successfully insert";
        } else {
            return "Unsuccessfull insert";
        }

    }
}
