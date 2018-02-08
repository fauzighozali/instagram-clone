package com.example.linustorvalds.listapps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button Sign_in = (Button) findViewById(R.id.button);
        Sign_in.setOnClickListener( (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText Nama = (EditText) findViewById(R.id.editText3);
                EditText Password = (EditText) findViewById(R.id.editText2);
                String n = Nama.getText().toString();
                String p = Password.getText().toString();

                if (p.equals("admin") && !n.equals("")){
                    Intent intent = new Intent(LoginActivity.this,ListActivity.class);
                    intent.putExtra("nama",n);
                    startActivity(intent);
                }
                else if (n.isEmpty() || p.isEmpty()){
                    Toast toast = (Toast.makeText(getApplicationContext(),"Sorry, empty data", Toast.LENGTH_LONG));
                    toast.show();
                }
                else {
                    Toast toast = (Toast.makeText(getApplicationContext(),"\n" +
                            "Sorry, you have not registered", Toast.LENGTH_LONG));
                    toast.show();
                }
            }
        }));
    }
}
