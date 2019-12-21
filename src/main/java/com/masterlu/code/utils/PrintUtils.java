package com.masterlu.code.utils;

import com.alibaba.fastjson.JSON;

/**
 * @author lujiliang[lujiliang@aibank.com]
 * @Description: TODO
 * @date 2019/12/21
 */
public class PrintUtils {

    public static void print(Object o){
        System.out.println(JSON.toJSONString(o));
    }

}
