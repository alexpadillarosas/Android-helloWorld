package com.example.android.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //That's all but the text is static, so we need to find a way to modify it using the application
        final TextView textView = findViewById(R.id.textView);
        textView.setText("I don't like the hello world application, it's too simple");
        //now go to draw a button, set an ID to it, and use it.
        Button button = findViewById(R.id.button);

        /*
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Don't hit me hard.\nplease forgive me");
            }
        });
        */
        //using lambdas, after it try using System.lineseparator to see what happens
        button.setOnClickListener( view -> {
            textView.setText("You've clicked the button \n welcome to Android");
            //now test the strings.xml
            //2nd String result = getString(R.string.test);
            //textView.setText(result);
            //3rd String result = getString(R.string.welcome, "Alex");
            //textView.setText(result);
            //4th you can use the resource in XML using @string/test
            //android:text="@string/test"

        } );


    }
}
