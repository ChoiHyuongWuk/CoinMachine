package com.choimon.coinmachine;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class API extends AppCompatActivity {

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
