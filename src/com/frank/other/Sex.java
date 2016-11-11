package com.frank.other;

/**
 * Created by frank on 16/11/10.
 */
public enum Sex {
    MAN("男"),WOMAN("女");

    private String type;

    Sex(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
