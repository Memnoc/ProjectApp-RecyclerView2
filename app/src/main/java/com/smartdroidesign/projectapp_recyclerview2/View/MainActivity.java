package com.smartdroidesign.projectapp_recyclerview2.View;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.smartdroidesign.projectapp_recyclerview2.Presenter.Adapter;
import com.smartdroidesign.projectapp_recyclerview2.Model.GalleryActivity;
import com.smartdroidesign.projectapp_recyclerview2.Model.Items;
import com.smartdroidesign.projectapp_recyclerview2.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private Adapter mAdapter;

    private ArrayList<Items> mItems = new ArrayList<>();
    private ArrayList<String> mPictures = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initImageBitmaps();
    }

    private void initImageBitmaps() {
        mItems.add(new Items("Sharingan First Stage", "All Uchiha"));
        mPictures.add("https://i.imgur.com/8haNuo7.png");
        mItems.add(new Items("Sharingan Second Stage", "All Uchiha"));
        mPictures.add("https://i.imgur.com/aNlHk4r.png");
        mItems.add(new Items("Sharingan Third Stage", "All Uchiha"));
        mPictures.add("https://i.imgur.com/a1bdHXv.png");
        mItems.add(new Items("Mangekyou Sharingan", "Madara Uchiha"));
        mPictures.add("https://i.imgur.com/PG83oSc.png");
        mItems.add(new Items("Eternal Mangekyou Sharingan", "Madara Uchiha"));
        mPictures.add("https://i.imgur.com/TL8TDXE.png");
        mItems.add(new Items("Mangekyou Sharingan", "Itachi Uchiha"));
        mPictures.add("https://i.imgur.com/TBP8xzT.png");
        mItems.add(new Items("Mangekyou Sharingan", "Sasuke Uchiha"));
        mPictures.add("https://i.imgur.com/4ee0sEC.png");
        mItems.add(new Items("Mangekyo Sharingan", "Obito Uchiha"));
        mPictures.add("https://i.imgur.com/qFHHCBJ.png");
        mItems.add(new Items("Mangekyou Sharingan", "Izuna Uchiha"));
        mPictures.add("https://i.imgur.com/7jGnGnm.png");

        initRecyclerView();
    }

    private void initRecyclerView() {
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        Adapter adapter = new Adapter(this, mItems, mPictures);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter.setOnItemClickListener(new Adapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {

                Intent intent = new Intent(MainActivity.this, GalleryActivity.class);
                intent.putExtra("image_url", mPictures.get(position));
                intent.putExtra("image_name", (mItems.get(position).getTextOne()));
                startActivity(intent);
            }
        });
    }
}
