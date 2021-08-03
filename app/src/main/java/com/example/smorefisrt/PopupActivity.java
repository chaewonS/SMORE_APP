package com.example.smorefisrt;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PopupActivity extends Activity implements View.OnClickListener {
//안드로이드 레이아웃[Custom Dialog] 생성
    //팝업 다이로그를 , extends Dialog 하지 않고, 메니페스트 파일에서 수정함
    //그러면 다이로그 -> 액티비티 화면 전환 가능함
    private Context mContext;
    private TextView btn_ok;
    private MainActivity2Sub mMainActivity2Sub;
    Intent intent;


    //public SubActivity(@NonNull Context context) {
    //    super(context);
    //    mContext = context;
    // }

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);


        btn_ok = (TextView) findViewById(R.id.btn_ok);
        btn_ok.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_ok:
                Intent intent = new Intent(PopupActivity.this, MainActivity2Sub.class);
                startActivity(intent);
                break;
        }
    }

}