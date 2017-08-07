package com.liwanwan.liwanwan20170807;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button fanhui;
    Button gengduo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      fanhui =(Button) findViewById(R.id.fanhui);
       gengduo =(Button) findViewById(R.id.gengduo);
       TextView title =(TextView) findViewById(R.id.title);
        fanhui.setOnClickListener(this);
        gengduo.setOnClickListener(this);
        title.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
    switch (v.getId()){
        case R.id.fanhui:
          fanhui.setBackgroundColor(Color.RED);
            Toast.makeText(MainActivity.this,"点击了返回",Toast.LENGTH_SHORT).show();
            break;

        case R.id.title:
            Toast.makeText(MainActivity.this,"点击了标题",Toast.LENGTH_SHORT).show();
            break;
        case R.id.gengduo:
            gengduo.setBackgroundColor(Color.RED);
            Toast.makeText(MainActivity.this,"点击了更多",Toast.LENGTH_SHORT).show();
            break;

    }
    }


}
