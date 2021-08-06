package com.example.smorefisrt;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.Toast;


public class CoMainActivity extends Activity implements View.OnClickListener{
//CoMain -> CoSubMain -> CoSurveyMain -> CoFinish
//SubPopup -> SubmitPopup
//SurveyActivity
    private String TAG = "CoMainActivity";
    private Context mContext = CoMainActivity.this;

    private ViewGroup mainLayout;   //사이드 나왔을때 클릭방지할 영역
    private ViewGroup viewLayout;   //전체 감싸는 영역
    private ViewGroup sideLayout;   //사이드바만 감싸는 영역

    private Boolean isMenuShow = false;
    private Boolean isExitFlag = false;

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {

        if (keyCode == KeyEvent.KEYCODE_BACK) {
            onBackPressed();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public void onBackPressed() {

        if(isMenuShow){
            closeMenu();
        }else{

            if(isExitFlag){
                finish();
            } else {

                isExitFlag = true;
                Toast.makeText(this, "뒤로가기를 한번더 누르시면 앱이 종료됩니다.",  Toast.LENGTH_SHORT).show();
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        isExitFlag = false;
                    }
                }, 2000);
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_co);
        init();

        Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), CoSubMain.class);
                startActivity(intent);
                finish();
            }
        });

        addSideView();  //사이드바 add
    }

    private void init(){

        //findViewById(R.id.btn_menu).setOnClickListener(this);

        mainLayout = findViewById(R.id.id_main);
        viewLayout = findViewById(R.id.fl_silde);
        sideLayout = findViewById(R.id.view_sildebar);

    }

    private void addSideView(){

        com.example.smorefisrt.Sidebar sidebar = new com.example.smorefisrt.Sidebar(mContext);
        sideLayout.addView(sidebar);

        viewLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        sidebar.setEventListener(new com.example.smorefisrt.Sidebar.EventListener() {

            @Override
            public void btnCancel() {
                Log.e(TAG, "btnCancel");
                closeMenu();
            }

            @Override
            public void btnLevel1() {
                Log.e(TAG, "btnLevel1");

                closeMenu();
            }
        });
    }


    @Override
    public void onClick(View view) {

        switch (view.getId()){

           // case R.id.btn_menu :

           //     showMenu();
            //    break;
        }
    }

    public void closeMenu(){

        isMenuShow = false;
        Animation slide = AnimationUtils.loadAnimation(mContext, R.anim.sidebar_hidden);
        sideLayout.startAnimation(slide);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                viewLayout.setVisibility(View.GONE);
                viewLayout.setEnabled(false);
                mainLayout.setEnabled(true);
            }
        }, 450);
    }

    public void showMenu(){

        isMenuShow = true;
        Animation slide = AnimationUtils.loadAnimation(this, R.anim.sidebar_show);
        sideLayout.startAnimation(slide);
        viewLayout.setVisibility(View.VISIBLE);
        viewLayout.setEnabled(true);
        mainLayout.setEnabled(false);
        Log.e(TAG, "메뉴버튼 클릭");
    }
}