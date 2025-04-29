package com.example.app1;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Log.d("Activity life cycle", "Oncreate called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Activity life cycle", "Onstart called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Activity life cycle", "Onstop called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Activity life cycle", "OnResume called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Activity life cycle", "OnPause called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Activity life cycle", "OnDestroy called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Activity life cycle", "Onrestart called");
    }
}
