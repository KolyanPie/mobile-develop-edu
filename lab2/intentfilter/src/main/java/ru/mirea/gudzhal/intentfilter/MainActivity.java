package ru.mirea.gudzhal.intentfilter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

import java.net.URI;
import java.net.URL;

public class MainActivity extends AppCompatActivity {
    Uri address = Uri.parse("https://www.mirea.ru/");
    Intent openLinkIntent = new Intent(Intent.ACTION_VIEW, address);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
