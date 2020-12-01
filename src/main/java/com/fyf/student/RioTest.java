package com.fyf.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.*;

/**
 * @author fuyufan
 * @date 2020/12/1 9:40
 */
public class RioTest {


    public static void main(String[] args) {
        String[] str = new String[100000];
        for (int i = 0; i < str.length; i++){
            str[i] = getRandomString(5);
        }
        getEqual(str);
    }

    public static void getEqual(String[] str) {
        //创建一个HashMap对象
        Map<String, Integer> map = new HashMap<>(1);
        //将每个字符插入到map中，map中的每个元素是[key,value]的组合，
        //key记录字符串，value记录这个字符出现的次数。
        //如果map中已经存在ch，则修改该字符出现的次数（原来次数+1）。
        //如果map中还没有ch,则将ch插入到map中，key为ch的值，value为1
        for (String string : str) {
            if (map.containsKey(string)) {
                map.put(string, map.get(string) + 1);
            } else {
                map.put(string, 1);
            }
        }
        //获得map的键集
        Set<String> keys = map.keySet();
        // 对出现超过1次的字符，显示其个数.
        for (String ch : keys) {
            int n = map.get(ch);
            if (n > 1) {
                System.out.println("重复的字符串：" + ch + "出现的次数：" + n);
            }
        }
    }

    static String getRandomString(int length) {
        String alphabetsInUpperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String alphabetsInLowerCase = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        // 创建所有字符的超集
        String allCharacters = alphabetsInLowerCase + alphabetsInUpperCase + numbers;
        // 初始化字符串以保存结果
        StringBuffer randomString = new StringBuffer();
        // 循环n次
        for (int i = 0; i < length; i++) {
            // //生成0到所有字符长度之间的随机数
            int randomIndex = (int)(Math.random() * allCharacters.length());
            // 在索引处检索字符并将其添加到结果中
            randomString.append(allCharacters.charAt(randomIndex));
        }
        return randomString.toString();
    }


}