package com.example.x37_frameanimation;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.view.Menu;
import android.widget.ImageView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        ImageView iv = (ImageView) findViewById(R.id.iv);
        //��֡������Դ�ļ�ָ��Ϊiv����
        iv.setBackgroundResource(R.drawable.frameanimation);
        //��ȡiv����
        AnimationDrawable ad = (AnimationDrawable) iv.getBackground();
        ad.start();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
