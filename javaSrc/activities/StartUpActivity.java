package com.example.alamin.createviewroutine.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.alamin.createviewroutine.R;
import com.example.alamin.createviewroutine.models.RoutineModel;
import com.example.alamin.createviewroutine.utils.RoutineDao;

public class StartUpActivity extends AppCompatActivity {

    private RoutineModel routineModel=new RoutineModel();
    private RoutineDao routineDao= new RoutineDao(this);
    private Button dayBtn;
    private  String[] days={"Saturday", "Sunday", "Monday", "Tuesday", "WednesDay", "Thursday", "Friday"};
    private String[] tasks={"Morning Walk", "BreakFast", "Android HomeWork", "Varsity Class", "Sleep"};
    private String[] times={"6:00am-7:00am", "8:00am-9:00am", "9:30am-12:00pm", "1:00pm-7:00pm", "10:00pm-5:00am"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_up);
        routineModel.setDays(days);
        routineModel.setTasks(tasks);
        routineModel.setTimes(times);
        Toast.makeText(this, routineDao.insertData(routineModel), Toast.LENGTH_LONG).show();

    }


    public void getFridayRoutine(View view) {
        routineModel.setDayName(getButtonValue(view));
    }

    public void getThursdayRoutine(View view) {
        routineModel.setDayName(getButtonValue(view));
    }

    public void getWednesdayRoutine(View view) {
        routineModel.setDayName(getButtonValue(view));
    }

    public void getSaturdayRoutine(View view) {
        routineModel.setDayName(getButtonValue(view));
    }

    public void getSundayRoutine(View view) {
        routineModel.setDayName(getButtonValue(view));
    }

    public void getMondayRoutine(View view) {
        routineModel.setDayName(getButtonValue(view));
    }

    public void getTuesdayRoutine(View view) {
        routineModel.setDayName(getButtonValue(view));
    }

    private StringBuilder getButtonValue(View view){
        dayBtn= (Button) view;
        return new StringBuilder(dayBtn.getText().toString());
    }
}
