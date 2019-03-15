package com.agarcia.galery;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    private LinearLayout mLinearLayout;

    private Button btn1,btn2,btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Find by id m Linear Layout

        //Find by id botones

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        int viewId = v.getId();
        Log.i("id", viewId+"" );
        switch(viewId)
        {
            //case R.id.btn1:
              //  break;
        }
    }
}
