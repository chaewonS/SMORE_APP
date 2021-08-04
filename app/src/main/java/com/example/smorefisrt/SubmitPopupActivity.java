package com.example.smorefisrt;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SubmitPopupActivity extends Activity implements View.OnClickListener  {
    private TextView btn_ok;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submit_popup);

        btn_ok = (TextView) findViewById(R.id.btn_ok);
        btn_ok.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_ok:
                Intent intent = new Intent(SubmitPopupActivity.this, MainActivity3.class);
                startActivity(intent);
                break;
        }
    }
}