package com.example.myrecycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;

//looping manager found online
import com.bekawestberg.loopinglayout.library.LoopingLayoutManager;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    String s1[], s2[];
    int images[] = {R.drawable.usa, R.drawable.canada, R.drawable.mexico, R.drawable.russia, R.drawable.germany, R.drawable.spain, R.drawable.france, R.drawable.china, R.drawable.japan, R.drawable.newzealand, R.drawable.egypt, R.drawable.greece};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        //setup resources
        s1 = getResources().getStringArray(R.array.Countries);
        s2 = getResources().getStringArray(R.array.Region);

        //create the adapter for recyclerview
        MyAdapter myAdapter = new MyAdapter(this, s1, s2, images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LoopingLayoutManager(this, LoopingLayoutManager.VERTICAL, false));
    }
}