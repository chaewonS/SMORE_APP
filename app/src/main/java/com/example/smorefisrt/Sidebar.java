package com.example.smorefisrt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;

import com.example.smorefisrt.R;

public class Sidebar extends RelativeLayout implements View.OnClickListener{

    /** 메뉴버튼 클릭 이벤트 리스너 */
    public EventListener listener;

    public void setEventListener(EventListener l) {
        listener = l;
    }

    /** 메뉴버튼 클릭 이벤트 리스너 인터페이스 */
    public interface EventListener {

        // 닫기 버튼 클릭 이벤트
        void btnCancel();
        void btnLevel1();
    }

    public Sidebar(Context context) {
        this(context, null);
        init();
    }

    public Sidebar(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    private void init(){

        LayoutInflater.from(getContext()).inflate(R.layout.activity_sidebar, this, true);

        findViewById(R.id.btn_cancel).setOnClickListener(this);
        findViewById(R.id.btn_side_level_1).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {


        switch (view.getId()){

            case R.id.btn_cancel :

                listener.btnCancel();
                break;

            case R.id.btn_side_level_1 :

                listener.btnLevel1();
                break;

            default:

                break;
        }
    }
}
