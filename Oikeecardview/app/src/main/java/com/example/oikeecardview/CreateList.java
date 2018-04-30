package com.example.oikeecardview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class CreateList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_list);

        TextView et = (TextView) findViewById(R.id.textView2);

        Intent intent = getIntent();
        int iID = intent.getIntExtra("entry", -1);

        String message = Entry.findEntryById(iID).getShortenedBody();
        et.setText(message);
    }
}
