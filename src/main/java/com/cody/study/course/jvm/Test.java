package com.cody.study.course.jvm;

/**
 * @author cody
 * @date 2020/10/13
 */
public class Test {

    private static boolean boolValue;
    public static void main(String[] args) {
        boolValue = true; // 将这个 true 替换为 2 或者 3，再看看打印结果
        if (boolValue) {
            System.out.println("Hello, Java!");
        }
        if (boolValue == true) {
            System.out.println("Hello, JVM!");
        }
    }
}
