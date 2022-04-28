package com.learn;

import java.util.HashSet;

public class M {
    public static int l(String s){
        int a = 0;
        int b = 0;
        int m = 0;
        HashSet<Character>h=new HashSet<>();
        while (b<s.length()){if (!h.contains(s.charAt(b))){h.add(s.charAt(b));
            b++;
            m=Math.max(h.size(),m);}
            else {h.remove(s.charAt(a));
                a++;
            }
        }
        return m;
    }
    public static void main(String []args)
    {
        String s = "string without repeating characters";
        System.out.println("The input String : " + s);
        int length = l(s);
        System.out.println("Length of longest non-repeating character substring :" + length);
    }
}

