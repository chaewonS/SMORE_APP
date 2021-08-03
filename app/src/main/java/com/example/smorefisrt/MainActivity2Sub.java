package com.example.smorefisrt;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2Sub extends Activity implements View.OnClickListener {
    private Button btn_sur;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainsub2);
        btn_sur = (Button) findViewById(R.id.survey);
        btn_sur.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.survey:
                Intent intent = new Intent(MainActivity2Sub.this, SurveyActivity.class);
                startActivity(intent);
                break;
        }

    }
}