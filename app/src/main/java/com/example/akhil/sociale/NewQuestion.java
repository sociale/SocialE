package com.example.akhil.sociale;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class newQuestion extends AppCompatActivity {

    private ImageButton thumbsupButton;
    private ImageButton thumbsdownButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_question);
        OnThumbsupButtonClicked();
        OnThumbsdownButtonClicked();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_new_question, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void OnThumbsupButtonClicked (){
        thumbsupButton = (ImageButton) findViewById(R.id.thumbsup_button);
        thumbsupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String yourResponse = "Yeah, I like it too!";
                Toast.makeText(newQuestion.this, yourResponse, Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void OnThumbsdownButtonClicked () {
        thumbsdownButton = (ImageButton) findViewById(R.id.thumbsdown_button);
        thumbsdownButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String yourResponse = "Ok, I'll throw it away!";
                Toast.makeText(newQuestion.this, yourResponse, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
