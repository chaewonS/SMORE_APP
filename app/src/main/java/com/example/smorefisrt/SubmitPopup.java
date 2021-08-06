package com.example.smorefisrt;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SubmitPopup extends Activity implements View.OnClickListener  {
    private TextView btn_ok;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.submit_popup);

        btn_ok = (TextView) findViewById(R.id.btn_ok);
        btn_ok.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_ok:
                Intent intent = new Intent(SubmitPopup.this, CoFinish.class);
                startActivity(intent);
                break;
        }
    }
}