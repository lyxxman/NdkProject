package com.blueteam.testndk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.blueteam.testndk.utils.JniUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       TextView mTxtJni = (TextView) findViewById(R.id.txt_jni);
        mTxtJni.setText((new JniUtils()).getStringFromC());
    }
}
