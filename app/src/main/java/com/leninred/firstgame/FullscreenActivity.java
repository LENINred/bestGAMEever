package com.leninred.firstgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class FullscreenActivity extends AppCompatActivity {
        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_fullscreen);

        findViewById(R.id.dummy_button).setOnClickListener(onDummyClick);
    }

    private View.OnClickListener onDummyClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //comment
            Toast.makeText(FullscreenActivity.this, "Первый тост", Toast.LENGTH_SHORT).show();
        }
    };

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
    }
}
