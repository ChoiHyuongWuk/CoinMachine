package com.choimon.coinmachine;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class loginActivity extends AppCompatActivity {
    private Button login; //로그인 버튼
    private Button sign_up; //회원가입 버튼
    private EditText id_Input; //아이디 입력
    private EditText Pass_Input; //비밀번호 입력
    private TextView id_Seach; //아이디 찾기
    private TextView Pass_Seach; //비밀번호 찾기

    @Override
    protected void onCreate(@Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_main);

        TextView Version_name = (TextView) findViewById(R.id.intro_version_val);

        Version_name.setText("현재 버전 : " + getAppVersionName());
        login = (Button) findViewById(R.id.login_button);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login_action();
            }
        });

    }

    private final void login_action() {
        Intent login_inent = new Intent(this, MainActivity.class);
        startActivity(login_inent);
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
