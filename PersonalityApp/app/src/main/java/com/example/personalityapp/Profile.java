package com.example.personalityapp;

public class Profile {
    private static int e = 0, i = 0, s = 0, n = 0, t = 0, f = 0, j = 0, p = 0;
    private char sex='M';
    private static String mbti = "";

    public void setSex(char sex) {
        this.sex = sex;
    }

    public static void incrementE(int increment) {
        e += increment;
    }

    public static void incrementI(int increment) {
        i += increment;
    }

    public static void incrementS(int increment) {
        s += increment;
    }

    public static void incrementN(int increment) {
        n += increment;
    }

    public static void incrementT(int increment) {
        t += increment;
    }

    public static void incrementF(int increment) {
        f += increment;
    }

    public static void incrementJ(int increment) {
        j += increment;
    }

    public static void incrementP(int increment) {
        p += increment;
    }

    public char getSex() {
        return sex;
    }

    public static int getE() {
        return e;
    }

    public static int getI() {
        return i;
    }

    public static int getS() {
        return s;
    }

    public static int getN() {
        return n;
    }

    public static int getT() {
        return t;
    }

    public static int getF() {
        return f;
    }

    public static int getJ() {
        return j;
    }

    public static int getP() {
        return p;
    }

    public String toString() {
        //String mbti = "";

        if (i > e || e == i) {
            mbti += "I";
        } else {
            mbti += "E";
        }

        if (n > s || s == n) {
            mbti += "N";
        } else {
            mbti += "S";
        }

        if ((t == f && sex == 'M') || t > f) {
            mbti += "T";
        }  else {
            mbti += "F";
        }

        if (p > j || j == p) {
            mbti += "P";
        } else {
            mbti += "J";
        }

        return mbti;
    }

    public static void clear_mbti(){
        mbti="";
    }

}
