package com.choimon.coinmachine;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class loginActivity extends AppCompatActivity {
    private Button sign_up; // 회원가입 버튼
    private EditText id_Input; // 아이디 입력
    private EditText Pass_Input; // 비밀번호 입력
    private TextView id_Seach; //아이디 찾기
    private TextView Pass_Seach; //비밀번호 찾기

    @Override
    protected void onCreate(@Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_main);

    }

    private final void login_action() {

    }

}
