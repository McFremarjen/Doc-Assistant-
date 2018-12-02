package com.mcfremarjentechnologies.updated.drass;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import ru.dimorinny.floatingtextbutton.FloatingTextButton;

public class start extends AppCompatActivity {

    private FloatingTextButton mLoginBtn;
    private FloatingTextButton mCreateBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        mLoginBtn = (FloatingTextButton)findViewById(R.id.lognbtn);
        mCreateBtn = (FloatingTextButton) findViewById(R.id.Createbtn);
       // final Intent loginIntent = new Intent(this,login.class);
        mLoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLoginPage();
            }
        });
        mCreateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCreatPage();
            }
        });






    }

    public void openLoginPage(){

        Intent LoginIntent = new Intent(this,login.class);
        startActivity(LoginIntent);

        //overridePendingTransition(R.anim.slide_in_right, R.anim.slide_in_left);
    }
    public void openCreatPage(){

        Intent regIntent = new Intent(this,reg.class);
        startActivity(regIntent);
        //overridePendingTransition(R.anim.slide_in_right, R.anim.slide_in_left);
    }



}
