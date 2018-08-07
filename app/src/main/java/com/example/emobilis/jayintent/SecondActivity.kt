package com.example.emobilis.jayintent;

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

public class SecondActivity extends AppCompatActivity() {
    //declare variables to hold your veiw
    TextView mUsername;

    @Override
   protected void onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        //assign your variables to the veiws
    }
}
