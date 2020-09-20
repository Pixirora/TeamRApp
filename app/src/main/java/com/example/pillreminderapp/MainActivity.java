package com.example.pillreminderapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {


    /*

    EditText ed1, ed2, ed3;

     */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**************************************************

        ed1 = (EditText) findViewById(R.id.);
        ed2 = (EditText) findViewById(R.id.);
        ed3 = (EditText)findViewById(R.id.);
        Button b1= (Button) findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String title  = ed1.getText().toString().trim();
                String subject = ed2.getText().toString().trim();
                String body = ed3.getText().toString().trim();
                NotificationManager notif = (NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
                Notification notify = new Notification.Builder(getApplicationContext()).setContentTitle(title).setContentText(body).setContentTitle(subject).setSmallIcon(R.drawable.ic_launcher_background).build();
                notify.flags = Notification.FLAG_AUTO_CANCEL;
            }
        });

        **************************************************/


    }

    public void goToSettingsActivity (View view){
        Intent intent = new Intent (this, activity_settings.class);
        startActivity(intent);
    }

}
