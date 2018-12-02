package com.mcfremarjentechnologies.updated.drass;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import ru.dimorinny.floatingtextbutton.FloatingTextButton;

public class reg extends AppCompatActivity {

    private TextInputLayout mTextInputLayoutEmail;
    private TextInputLayout mTextInputLayoutname;
    private TextInputLayout mTextInputLayoutpassword;
    private FirebaseAuth mAuth;
    private FloatingTextButton mButtonsign;
    private ProgressDialog mProgress;
    //private android.support.v7.widget.Toolbar mToolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);


        //explain them in comments
        mAuth = FirebaseAuth.getInstance();
        mButtonsign = (FloatingTextButton) findViewById(R.id.regbtn);
        mTextInputLayoutname = (TextInputLayout)findViewById(R.id.regName);
        mTextInputLayoutEmail = (TextInputLayout)findViewById(R.id.regemail);
        mTextInputLayoutpassword= (TextInputLayout)findViewById(R.id.regPassword);

      //  mToolbar = (android.support.v7.widget.Toolbar)findViewById(R.id.regToolbar);
      //  setSupportActionBar(mToolbar);
      //  getSupportActionBar().setTitle("Register");
//progress bar
        mProgress = new ProgressDialog(this);

        mButtonsign.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                String email = mTextInputLayoutEmail.getEditText().getText().toString();
                String password = mTextInputLayoutpassword.getEditText().getText().toString();
                String name = mTextInputLayoutname.getEditText().getText().toString();

                if(!TextUtils.isEmpty(email)|| !TextUtils.isEmpty(password)|| !TextUtils.isEmpty(name) ){

                    mProgress.setTitle("Creating user");
                    mProgress.setMessage("Please wait while we create ur account");
                    mProgress.setCanceledOnTouchOutside(false);
                    mProgress.show();

                    CreateUser(email,password,name);

                }
                //were if stopes

            }
        });


    }

   //code in
   private void CreateUser(String email, String password, String name) {

       final Task<AuthResult> authResultTask = mAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
           @Override
           public void onComplete(@NonNull Task<AuthResult> task) {
               if (task.isSuccessful()) {

                   mProgress.dismiss();

                   Intent masterIntent = new Intent(reg.this,doctr.class);
                   startActivity(masterIntent);

               } else {
                   mProgress.hide();
                   Toast.makeText(reg.this, " sorry we can not create your account try again later ", Toast.LENGTH_SHORT).show();
               }
               //if ending
           }
       });

   }

}
