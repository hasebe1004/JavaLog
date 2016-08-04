package com.example.javalog;

import android.util.Log;
class Human extends Animal implements Thinkable{
     String hobby;
    // コンストラクタ
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }


    // メンバ関数
    public void say() {
        Log.d("javatest", "私は"+ this.name +"です。年は" + this.age + "歳です。");
    }
    // コンストラクタ
    public Human(String hobby) {

        this.hobby = hobby;
    }
    @Override
    public void think() {
        Log.d("javatest", "私は"+ this.hobby +"について考えています。");
    }
}