package com.cody.study.leetcode.easy;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * 如果不存在公共前缀，返回空字符串 ""。
 *
 * @author cody
 * @date 12/14/20
 */
public class LongestCommonPrefix {

    /**
     * 执行用时：3 ms, 在所有 Java 提交中击败了21.62%的用户
     * 内存消耗：38.3 MB, 在所有 Java 提交中击败了10.41%的用户
     * @param strs 数组
     * @return longestCommonPrefix
     */
    public static String longestCommonPrefix(String[] strs) {

        if (strs != null && strs.length != 0) {
            String first = strs[0];
            if (strs.length ==1){
                return first;
            }
            String longestCommonPrefix = "";
            for (int j = 0; j < first.length(); j++) {
                int flag = 0;
                String s = "";
                for (int i = 1; i < strs.length; i++) {
                   if (j+1 > strs[i].length()){
                       return longestCommonPrefix;
                   }
                        if (first.charAt(j) == strs[i].charAt(j)) {
                            flag = flag + 1;
                            s = String.valueOf(first.charAt(j));
                        } else {
                            return longestCommonPrefix;
                        }
                        if (flag == (strs.length - 1)) {
                            longestCommonPrefix = longestCommonPrefix + s;
                        }
                }
            }
            return longestCommonPrefix;
        } else {
            return "";
        }
    }

    public String longestCommonPrefix1(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        int count = strs.length;
        for (int i = 1; i < count; i++) {
            prefix = longestCommonPrefix1(prefix, strs[i]);
            if (prefix.length() == 0) {
                break;
            }
        }
        return prefix;
    }

    public String longestCommonPrefix1(String str1, String str2) {
        int length = Math.min(str1.length(), str2.length());
        int index = 0;
        while (index < length && str1.charAt(index) == str2.charAt(index)) {
            index++;
        }
        return str1.substring(0, index);
    }

    public static void main(String[] args){
        String[] array = {"ab","a"};
        System.out.println(longestCommonPrefix(array));
    }
}
