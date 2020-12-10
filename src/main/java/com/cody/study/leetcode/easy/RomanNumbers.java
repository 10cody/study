package com.cody.study.leetcode.easy;

/**
 * @author cody
 * @date 2020/12/10
 */
public class RomanNumbers {

    public static int romanToInt(String s) {
        int n = s.length();
        int roman_int = 0;
        for(int i=0;i<n;i++)
        {
            switch(s.charAt(i))
            {
                case 'I' : roman_int = roman_int + 1;break;
                case 'V' : roman_int = roman_int + 5;break;
                case 'X' : roman_int = roman_int + 10;break;
                case 'L' : roman_int = roman_int + 50;break;
                case 'C' : roman_int = roman_int + 100;break;
                case 'D' : roman_int = roman_int + 500;break;
                case 'M' : roman_int = roman_int + 1000;break;
                default: System.out.println("default");break;
            }

            if(i!=0)
            {
                if(((s.charAt(i)=='V')||(s.charAt(i)=='X'))&&(s.charAt(i-1)=='I')) {
                    roman_int = roman_int-1*2;
                }
                if(((s.charAt(i)=='L')||(s.charAt(i)=='C'))&&(s.charAt(i-1)=='X')) {
                    roman_int = roman_int-10*2;
                }
                if(((s.charAt(i)=='D')||(s.charAt(i)=='M'))&&(s.charAt(i-1)=='C')) {
                    roman_int = roman_int-100*2;
                }
            }
        }
        return roman_int;
    }

    public int romanToInt1(String s) {
        char[] str = s.toCharArray();
        int len = str.length, number = 0;
        for(int i=0;i<len;i++){
            switch(str[i]){
                case 'M': number+=1000; break;
                case 'D': number+=500; break;
                case 'C':
                    if(i+1<len && (str[i+1]=='M' || str[i+1]=='D'))
                        number-=100;
                    else
                        number+=100;
                    break;
                case 'L': number+=50; break;
                case 'X':
                    if(i+1<len && (str[i+1]=='C' || str[i+1]=='L'))
                        number-=10;
                    else
                        number+=10;
                    break;
                case 'V': number+=5; break;
                case 'I':
                    if(i+1<len && (str[i+1]=='V' || str[i+1]=='X'))
                        number-=1;
                    else
                        number+=1;
                    break;
            }
        }
        return number;
    }

    public int romanToInt2(String s) {
        int sum = 0;
        int preNum = getValue(s.charAt(0));
        for(int i = 1;i < s.length(); i ++) {
            int num = getValue(s.charAt(i));
            if(preNum < num) {
                sum -= preNum;
            } else {
                sum += preNum;
            }
            preNum = num;
        }
        sum += preNum;
        return sum;
    }

    private int getValue(char ch) {
        switch(ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }

    public static void main(String[] args){

        System.out.println(romanToInt("XC"));
    }
}

