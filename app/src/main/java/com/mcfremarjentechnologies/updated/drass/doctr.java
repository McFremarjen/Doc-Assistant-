package com.mcfremarjentechnologies.updated.drass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

public class doctr extends AppCompatActivity {
    //vars
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String>mImageUrls =new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctr);

        initImageBitmaps();
        //Log.d(TAG, "onCreate: stated");
    }

    private void initImageBitmaps(){
        //Log.d(TAG, "initImageBitmaps: preparing bitmaps");
        mImageUrls.add("https://cdn.pornpics.com/pics1/2018-02-26/422219_04big.jpg");
        mNames.add("Dr Eveline");

        mImageUrls.add("https://cdn.pornpics.com/pics1/2017-12-05/483763_07big.jpg");
        mNames.add("Dr Christine");

        mImageUrls.add("https://cdn.pornpics.com/pics1/2017-07-11/449798_09big.jpg");
        mNames.add("Dr Josephine");

        mImageUrls.add("https://cdn.pornpics.com/pics1/2018-02-26/422219_04big.jpg");
        mNames.add("Dr Agie");

        mImageUrls.add("https://cdn.pornpics.com/pics1/2017-10-02/479868_04big.jpg");
        mNames.add("Dr Jodh");

        intiRecycler();
    }

    private void intiRecycler(){
        //Log.d(TAG, "intiRecycler: init recycleView");
        RecyclerView recyclerView = findViewById(R.id.mar);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mNames,mImageUrls);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

}
