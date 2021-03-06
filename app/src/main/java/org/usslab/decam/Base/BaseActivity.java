package org.usslab.decam.Base;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.orhanobut.logger.Logger;

import java.util.Timer;
import java.util.TimerTask;


/**
 * Created by pip on 2017/1/28.
 */

public class BaseActivity extends AppCompatActivity {
    public static String TAG="BaseActivity";

    public static void startActivity(Context context){
        throw new UnsupportedClassVersionError("Not Implemented Method");
    };

    protected void mkToast(String msg){
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
    }
    protected void mkToast(String msg,boolean showMoreTime){
        Toast.makeText(this,msg,Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        ActivityCollector.addActivity(this);
        Logger.t(this.getClass().getSimpleName()).d("onCreate");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Logger.t(this.getClass().getSimpleName()).d("onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Logger.t(this.getClass().getSimpleName()).d( "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Logger.t(this.getClass().getSimpleName()).d("onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Logger.t(this.getClass().getSimpleName()).d("onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityCollector.removeActivity(this);
        Logger.t(this.getClass().getSimpleName()).d("onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Logger.t(this.getClass().getSimpleName()).d( "onRestart");
    }
}
