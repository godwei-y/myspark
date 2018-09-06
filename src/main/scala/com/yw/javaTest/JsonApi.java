package com.yw.javaTest;


import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.commons.beanutils.PropertyUtils;

public class JsonApi {
    public static void main(String[] args) throws Exception {
        List<MyBean> myBeanList = new ArrayList<MyBean>();
        List<String> cardNum1 = new ArrayList<String>();
        cardNum1.add("number1");
        cardNum1.add("number2");
        cardNum1.add("number3");
        cardNum1.add("number4");
        MyBean myBean1 = new MyBean("number-1", "test-1", cardNum1);
        List<String> cardNum2 = new ArrayList<String>();
        cardNum2.add("number1");
        cardNum2.add("number2");
        cardNum2.add("number3");
        cardNum2.add("number4");
        MyBean myBean2 = new MyBean("number-2", "test-2", cardNum2);
        myBeanList.add(myBean1);
        myBeanList.add(myBean2);
        JSONArray jsonArray = new JSONArray().fromObject(myBeanList);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("key", jsonArray);
        System.out.println(jsonObject);
    }
}