package com.example.admin.androidviewsandlayouts;

import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivityTag";
    EditText etInputValue;
    Button btnUpdateTextView;
    TextView tvDisplayedValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //bind all the views
        etInputValue = (EditText) findViewById(R.id.etInputValue);
        btnUpdateTextView = (Button) findViewById(R.id.btnUpdateTextView);
        tvDisplayedValue = (TextView) findViewById(R.id.tvDisplayedValue);

        btnUpdateTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateView();
            }
        });

        Log.d(TAG, "onCreate: ");

    }

    public void updateTextView(View view) {

        updateView();

    }

    private void updateView() {
        String inputValue = etInputValue.getText().toString();
        inputValue = inputValue.replaceAll("\n","");
        tvDisplayedValue.setText(inputValue);
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d(TAG, "onStart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d(TAG, "onResume: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.d(TAG, "onRestart: ");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d(TAG, "onPause: ");
    }
}
