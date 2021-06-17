package com.choimon.coinmachine;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class IntroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intro_view);

        TextView Version_name = (TextView) findViewById(R.id.intro_version_val);

        Version_name.setText("현재 버전 : " + getAppVersionName());

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent login_intent = new Intent(getApplicationContext(), loginActivity.class);
                startActivity(login_intent);
                finish();
            }
        }, 5000);
    }
    /* 딴짓해도 꺼지게 해놓기 */
    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
    /* 버전네임 가져오는 기능 */
    public String getAppVersionName(){
        PackageInfo packageInfo = null; //패키지 정보

        //PackageInfo 초기화
        try{
            packageInfo = getPackageManager().getPackageInfo(getPackageName(), 0);
        }catch (PackageManager.NameNotFoundException e){
            e.printStackTrace();
            Log.i(this.getClass().getName(),"버전명 파싱 실패");
        }

        return packageInfo.versionName;
    }

}
