package com.example.user.toast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements OnClickListener {
    EditText uname,upass;
    Button ubtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        uname=(EditText)findViewById(R.id.editText);
        upass=(EditText)findViewById(R.id.editText2);
        ubtn=(Button)findViewById(R.id.button);
        ubtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this, "login", Toast.LENGTH_SHORT).show();
    }
}
