package com.example.company;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

        EditText l1,l2;
        Button b1;
        String s1,s2,s3="admin",s4="12345",s5="Invalid Credentials";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        l1=(EditText) findViewById(R.id.user);
        l2=(EditText) findViewById(R.id.pass);
        b1=(Button) findViewById(R.id.log);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1 = l1.getText().toString();
                s2 = l2.getText().toString();

                if (s1.equals(s3) && s2.equals(s4)) {
                    Intent ob1 = new Intent(getApplicationContext(), menu.class);
                    startActivity(ob1);
                } else {
                    // Show Toast message for invalid credentials
                    Toast.makeText(getApplicationContext(), s5, Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}