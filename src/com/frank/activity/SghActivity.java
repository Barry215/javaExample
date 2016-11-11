package com.frank.activity;

/**
 * Created by frank on 16/11/11.
 */
public class SghActivity {
    private String name;

    public SghActivity(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void startActivity(){
        System.out.println("膳管会-"+name+"活动开始啦~");
    }
}
