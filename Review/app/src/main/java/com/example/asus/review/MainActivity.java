package com.example.asus.review;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button dialog;    //@csk    forget private
    private Button broadcast;
    private Button recyclerview;
    private Button listview;

    private MyReceiver receiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);    //@csk    a stupid mistake put behind the other functions
        bindView();
        initListener();
        receiver = new MyReceiver();
        registerReceiver(receiver, new IntentFilter("com.example.asus.review.BROADCAST"));
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(receiver);
    }

    public void bindView(){
            dialog = (Button) findViewById(R.id.alter_dialog);
            broadcast = (Button) findViewById(R.id.broadcast);
            recyclerview = (Button) findViewById(R.id.recycler_view);
            listview = (Button) findViewById(R.id.list_view);
    }

    public void initListener(){

        dialog.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                                          builder.setTitle("这是一个AlertDialog");
                                          builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
                                              @Override
                                              public void onClick(DialogInterface dialog, int which) {
                                              }
                                          });
                                          builder.setNegativeButton("取消", new DialogInterface.OnClickListener() {
                                              @Override
                                              public void onClick(DialogInterface dialog, int which) {
                                              }
                                          });
                                          builder.show();    //@csk   use wrong create
                                      }
                                  }
        );

        broadcast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.example.asus.review.BROADCAST");
                sendBroadcast(intent);    //@csk    I forget how to send a broadcast
            }
        });

        listview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this , ListViewActivity.class);
                startActivity(intent);
            }
        });

        recyclerview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this , RecyclerViewActivity.class));
            }
        });
    }

    private  class MyReceiver extends BroadcastReceiver{

        @Override
        public void onReceive(Context context, Intent intent) {
            Toast.makeText(MainActivity.this , "这是我发的广播" ,Toast.LENGTH_SHORT).show();
        }
    }
}
