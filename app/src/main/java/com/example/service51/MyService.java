package com.example.service51;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

public class MyService extends Service {
    final String LOG_TAG = "MyLogs";

    @Override
    public void onCreate(){
        Log.i(LOG_TAG, "--> onCreate()");
        super.onCreate();
    }
    @Override
    public int onStartCommand(Intent intent, int flags, int startId){
        Log.i(LOG_TAG, "--> onStartCommand()");
        return super.onStartCommand(intent, flags, startId);
    }
    @Override
    public IBinder onBind(Intent intent) {
        Log.i(LOG_TAG, "--> onBind()");
        return null;
    }
    @Override
    public boolean onUnbind(Intent intent){
        Log.i(LOG_TAG, "--> onUnbind()");
        return super.onUnbind(intent);
    }
    @Override
    public void onDestroy(){
        Log.i(LOG_TAG, "--> onDestroy()");
        Toast.makeText(getApplicationContext(), "Service stopped", Toast.LENGTH_LONG).show();
        super.onDestroy();
    }
}