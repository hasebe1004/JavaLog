package com.example.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //MainActivityクラスのレイアウトを呼び出し
        setContentView(R.layout.activity_main);

        Human human = new Human("ハセベ", 24);
        human.say();// 名前をポチ、年齢3歳で、Dogのインスタンスを作る
        Human human1 = new Human("夏祭り");
        human1.think();
    }


    }
