package com.example.shot1.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private boolean flag = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // ボタンを設定
        Button button = (Button)findViewById(R.id.button);

        // TextView の設定
        textView = (TextView) findViewById(R.id.text_view);

        // リスナーをボタンに登録
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // flagがtrueの時
                if (flag) {
                    textView.setText("Hello");
                    flag = false;
                }
                // flagがfalseの時
                else {
                    textView.setText("World");
                    flag = true;
                }
            }
        });
    }
}
