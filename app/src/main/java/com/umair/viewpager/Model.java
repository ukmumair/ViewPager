package com.umair.viewpager;

public class Model {
    String Name;
    String Desc;

    public Model(String name, String desc) {
        Name = name;
        Desc = desc;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDesc() {
        return Desc;
    }

    public void setDesc(String desc) {
        Desc = desc;
    }
}
