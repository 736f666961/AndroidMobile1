package com.example.android;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    private EditText firstNameInput;
    private EditText lastNameInput;

    String firstName;
    String lastName;

    private TextView fn;
    private TextView ln;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNameInput = (EditText) findViewById(R.id.firstName);
        lastNameInput = (EditText) findViewById(R.id.lastName);
    }

    public void goToNextPage(View view) {
        firstName = firstNameInput.getText().toString();
        lastName = lastNameInput.getText().toString();

        setContentView(R.layout.next_page);

        System.out.println("First name is : " + firstName);
        System.out.println("Last name is : " + lastName);

        fn = (TextView) findViewById(R.id.fn);
        ln = (TextView) findViewById(R.id.ln);
        fn.setText("First name is : " + firstName);
        ln.setText("Last name is : " + lastName);

    }
}