package com.mcfremarjentechnologies.updated.drass;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class welcome extends AppCompatActivity {
    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        mTextView = (TextView)findViewById(R.id.wlcmTxt);
        Animation mAnimation = AnimationUtils.loadAnimation(this,R.anim.mytransition);
        mTextView.startAnimation(mAnimation);
        final Intent i = new Intent(this,start.class);


        Thread timer =new Thread(){
            public void run (){
                try{
                    sleep(9000);


                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally {


                    startActivity(i);

                    finish();
                }

            }

        };

        timer.start();


    }
}
