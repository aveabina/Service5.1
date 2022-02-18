package com.example.service51;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    ServiceConnection sConn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sConn = new ServiceConnection() {
            @Override
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            }
            @Override
            public void onServiceDisconnected(ComponentName componentName) {
            }
        };
    }

    public void startService(View v) {
        startService(new Intent(this, MyService.class));
    }

    public void bindService(View v) {
        bindService(new Intent(this, MyService.class), sConn, BIND_AUTO_CREATE);
    }

}