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

public class login extends AppCompatActivity {
    private FloatingTextButton mlogBtn;
    // inported code
    private TextInputLayout mEmail;
    private TextInputLayout mPassword;
    //private FloatingTextButton mSign_in;
    private FirebaseAuth mAuth;
    private ProgressDialog mProgress;
    //private Button mTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //ept code
       // mToolbar = (android.support.v7.widget.Toolbar)findViewById(R.id.logToolbar);
       // setSupportActionBar(mToolbar);
       // getSupportActionBar().setTitle("Login");
       mAuth = FirebaseAuth.getInstance();
        mProgress = new ProgressDialog(this);
        mEmail= (TextInputLayout)findViewById(R.id.email);
        mPassword =(TextInputLayout)findViewById(R.id.logPass);
        mlogBtn = (FloatingTextButton) findViewById(R.id.regbtn);

       // mTest = (Button)findViewById(R.id.test);



/*

        mTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openlast();
            }
        });
*/
        mlogBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String email = mEmail.getEditText().getText().toString();
                String password = mPassword.getEditText().getText().toString();


                if(!TextUtils.isEmpty(email)|| !TextUtils.isEmpty(password) ){

                    mProgress.setTitle("Logging In");
                    mProgress.setMessage("Please wait while we log you in your account");
                    mProgress.setCanceledOnTouchOutside(false);
                    mProgress.show();

                    loginUser(email,password);

                }


            }
        });

       // mlogBtn = (FloatingTextButton) findViewById(R.id.log);
       /* mlogBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainpage();
            }
        });
*/
    }

    /*
    private void openlast() {

        Intent masterIntent = new Intent(login.this,doctr.class);
        startActivity(masterIntent);

    }

*/
    /*
    public void openMainpage(){

        Intent mainpageIntent = new Intent(this,doctr.class);
        startActivity(mainpageIntent);

    }
    */



    private void loginUser(String email, String password) {


        mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {

                    mProgress.dismiss();

                    Intent masterIntent = new Intent(login.this, doctr.class);
                    masterIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(masterIntent);

                } else {

                    mProgress.hide();
                    Toast.makeText(login.this, " sorry we can not login, Check your Email or Password and Try again Thank you!!!!!!!!!!!! ", Toast.LENGTH_SHORT).show();

                }


            }


        });
    }
    //this back
}
