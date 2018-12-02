package com.mcfremarjentechnologies.updated.drass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class Apoint extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apoint);

        getIncomingIntent();
    }


    private void getIncomingIntent(){
       // Log.d(TAG, "getIncomingIntent: checking for incoming intent");
        if(getIntent().hasExtra("mImageUrls")&&getIntent().hasExtra("mNames")){
            //Log.d(TAG, "getIncomingIntent: fond extras");
            String imageUrls =getIntent().getStringExtra("mImageUrls");
            String imageNames =getIntent().getStringExtra("mNames");

            setImage(imageUrls,imageNames);
        }
    }


    private void setImage( String imageUrls,String imageNames){
        //Log.d(TAG, "setImage: seting image en names to there wagdets");
        TextView txtview = findViewById(R.id.ima_dic);

        ImageView imageView = findViewById(R.id.ima_zoom);
        Glide.with(this)
                .asBitmap()
                .load(imageUrls)
                .into(imageView);

    }


}
