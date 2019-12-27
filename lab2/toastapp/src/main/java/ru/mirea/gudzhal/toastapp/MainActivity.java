package ru.mirea.gudzhal.toastapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Toast toast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
            toast = Toast.makeText(getApplicationContext(),
                    "Здравствуй MIREA!",
                    Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER, 0, 0);
            LinearLayout toastContainer = (LinearLayout) toast.getView();
            ImageView catImageView = new ImageView(getApplicationContext());
            catImageView.setImageResource(R.drawable.ic_launcher_background);
            toastContainer.addView(catImageView, 0);
            toast.show();
        }
    }

