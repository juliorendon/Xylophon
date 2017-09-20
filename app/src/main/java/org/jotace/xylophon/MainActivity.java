package org.jotace.xylophon;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    MediaPlayer noteSound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //final MediaPlayer clickSound = MediaPlayer.create(this, R.raw.note1);

        // Getting notes buttons
        final Button note1Button = (Button) findViewById(R.id.note1);
        note1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                freeMediaPlayer(noteSound);
                noteSound =  MediaPlayer.create(MainActivity.this, R.raw.note1);
                noteSound.start();
            }
        });

        // Getting notes buttons
        final Button note2Button = (Button) findViewById(R.id.note2);
        note2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                freeMediaPlayer(noteSound);
                noteSound =  MediaPlayer.create(MainActivity.this, R.raw.note2);
                noteSound.start();
            }
        });


        // Getting notes buttons
        final Button note3Button = (Button) findViewById(R.id.note3);
        note3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                freeMediaPlayer(noteSound);
                noteSound =  MediaPlayer.create(MainActivity.this, R.raw.note3);
                noteSound.start();
            }
        });

        // Getting notes buttons
        final Button note4Button = (Button) findViewById(R.id.note4);
        note4Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                freeMediaPlayer(noteSound);
                noteSound =  MediaPlayer.create(MainActivity.this, R.raw.note4);
                noteSound.start();
            }
        });

        // Getting notes buttons
        final Button note5Button = (Button) findViewById(R.id.note5);
        note5Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                freeMediaPlayer(noteSound);
                noteSound =  MediaPlayer.create(MainActivity.this, R.raw.note5);
                noteSound.start();
            }
        });

        // Getting notes buttons
        final Button note6Button = (Button) findViewById(R.id.note6);
        note6Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                freeMediaPlayer(noteSound);
                noteSound =  MediaPlayer.create(MainActivity.this, R.raw.note6);
                noteSound.start();
            }
        });


        // Getting notes buttons
        final Button note7Button = (Button) findViewById(R.id.note7);
        note7Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                freeMediaPlayer(noteSound);
                noteSound =  MediaPlayer.create(MainActivity.this, R.raw.note7);
                noteSound.start();
            }
        });

        // Getting notes buttons
        final Button note8Button = (Button) findViewById(R.id.note8);
        note8Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                freeMediaPlayer(noteSound);
                noteSound =  MediaPlayer.create(MainActivity.this, R.raw.note8);
                noteSound.start();
            }
        });

    }

    private static void freeMediaPlayer(MediaPlayer mp) {
        if(mp != null) {
            mp.stop();
            mp.release();
            mp = null;
        }
    }


} // END
