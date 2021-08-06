package com.example.smorefisrt;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

public class SurveyActivity extends Activity implements View.OnClickListener {
    //버튼 클릭시 이벤트 효과
    private TextView btn_ok;
    private ImageButton sel1;
    private ImageButton sel2;
    private ImageButton sel3;
    private Button tag1, tag2, tag3, tag4, tag5, tag6;
    boolean i = true;
    boolean j = true;
    boolean k = true;
    boolean a, b, c, d, e, f = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey);

        btn_ok = (TextView) findViewById(R.id.btn_ok);
        btn_ok.setOnClickListener(this);

        tag1 = (Button) findViewById(R.id.tag1);
        tag2 = (Button) findViewById(R.id.tag2);
        tag3 = (Button) findViewById(R.id.tag3);
        tag4 = (Button) findViewById(R.id.tag4);
        tag5 = (Button) findViewById(R.id.tag5);
        tag6 = (Button) findViewById(R.id.tag6);

        sel1 = (ImageButton) findViewById(R.id.sel1);
        sel2 = (ImageButton) findViewById(R.id.sel2);
        sel3 = (ImageButton) findViewById(R.id.sel3);

        sel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i == true) {
                    sel1.setImageResource(R.drawable.checkimg);
                    i = false;
                } else {
                    sel1.setImageResource(R.drawable.list1);
                    i = true;
                }
            }
        });
        sel2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (j == true) {
                    sel2.setImageResource(R.drawable.checkimg);
                    j = false;
                } else {
                    sel2.setImageResource(R.drawable.list4);
                    j = true;
                }
            }
        });
        sel3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (k == true) {
                    sel3.setImageResource(R.drawable.checkimg);
                    k = false;
                } else {
                    sel3.setImageResource(R.drawable.list14);
                    k = true;
                }
            }
        });

        tag1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (a == true) {
                    tag1.setBackgroundDrawable(ContextCompat.getDrawable(SurveyActivity.this, R.drawable.background));
                    a = false;
                } else {
                    tag1.setBackgroundColor(Color.parseColor("#DBCFBA"));
                    a = true;
                }
            }
        });
        tag2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b == true) {
                    tag2.setBackgroundDrawable(ContextCompat.getDrawable(SurveyActivity.this, R.drawable.background));
                    b = false;
                } else {
                    tag2.setBackgroundColor(Color.parseColor("#DBCFBA"));
                    b = true;
                }
            }
        });
        tag3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (c == true) {
                    tag3.setBackgroundDrawable(ContextCompat.getDrawable(SurveyActivity.this, R.drawable.background));
                    c = false;
                } else {
                    tag3.setBackgroundColor(Color.parseColor("#DBCFBA"));
                    c = true;
                }
            }
        });
        tag4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (d == true) {
                    tag4.setBackgroundDrawable(ContextCompat.getDrawable(SurveyActivity.this, R.drawable.background));
                    d = false;
                } else {
                    tag4.setBackgroundColor(Color.parseColor("#DBCFBA"));
                    d = true;
                }
            }
        });
        tag5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (e == true) {
                    tag5.setBackgroundDrawable(ContextCompat.getDrawable(SurveyActivity.this, R.drawable.background));
                    e = false;
                } else {
                    tag5.setBackgroundColor(Color.parseColor("#DBCFBA"));
                    e = true;
                }
            }
        });
        tag6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (f == true) {
                    tag6.setBackgroundDrawable(ContextCompat.getDrawable(SurveyActivity.this, R.drawable.background));
                    f = false;
                } else {
                    tag6.setBackgroundColor(Color.parseColor("#DBCFBA"));
                    f = true;
                }
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_ok:
                Intent intent = new Intent(SurveyActivity.this, SubmitPopup.class);
                startActivity(intent);
                break;
        }

    }
}