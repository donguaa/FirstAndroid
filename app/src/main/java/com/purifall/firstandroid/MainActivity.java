package com.purifall.firstandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.purifall.firstandroid.Adapters.LessonAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private final ArrayList<String> LESSON_LIST = new ArrayList<String>(){
        {
            add("");
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView lessonRecycleView = findViewById(R.id.lessonRecyclerView);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        lessonRecycleView.setLayoutManager(manager);
        LessonAdapter adapter = new LessonAdapter(this, LESSON_LIST);
        lessonRecycleView.setAdapter(adapter);
    }
}