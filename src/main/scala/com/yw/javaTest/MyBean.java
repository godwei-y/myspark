package com.yw.javaTest;


import java.util.List;
public class MyBean {
    private String Id;
    private String Name;
    private List CardNum;

    public MyBean(String id, String name, List cardNum) {
        super();
        Id = id;
        Name = name;
        CardNum = cardNum;
    }

    public MyBean() {
        super();
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public List getCardNum() {
        return CardNum;
    }

    public void setCardNum(List cardNum) {
        CardNum = cardNum;
    }
}
