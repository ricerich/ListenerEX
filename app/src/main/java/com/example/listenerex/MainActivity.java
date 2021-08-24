package com.example.listenerex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = (Button) findViewById(R.id.btn1);

//        class MyListener implements View.OnClickListener
//        {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(MainActivity.this,"클릭됨!",Toast.LENGTH_SHORT).show();
//            }
//        }

        //1.이름이 m1인 객체 만들고, 사용하기
        //MyListener m1 = new MyListener();//m1 만들기
//        btn1.setOnClickListener(m1);//m1 사용하기

        //2.이름없는 객체 사용하기
//       btn1.setOnClickListener(new MyListener());//객체 사용하기

        //3.이름없는 객체 만들면서, 바로 사용하기
        btn1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"클릭됨!",Toast.LENGTH_SHORT).show();
            }
        } );
    }
}