package com.example.personalityapp;

public class Profile {
    private int e = 0, i = 0, s = 0, n = 0, t = 0, f = 0, j = 0, p = 0;
    private char sex;

    public Profile() {
        sex = 'M';
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void incrementE(int increment) {
        e += increment;
    }

    public void incrementI(int increment) {
        i += increment;
    }

    public void incrementS(int increment) {
        s += increment;
    }

    public void incrementN(int increment) {
        n += increment;
    }

    public void incrementT(int increment) {
        t += increment;
    }

    public void incrementF(int increment) {
        f += increment;
    }

    public void incrementJ(int increment) {
        j += increment;
    }

    public void incrementP(int increment) {
        p += increment;
    }

    public char getSex() {
        return sex;
    }

    public int getE() {
        return e;
    }

    public int getI() {
        return i;
    }

    public int getS() {
        return s;
    }

    public int getN() {
        return n;
    }

    public int getT() {
        return t;
    }

    public int getF() {
        return f;
    }

    public int getJ() {
        return j;
    }

    public int getP() {
        return p;
    }

    public String toString() {
        String mbti = "";

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

        if (p > s || j == p) {
            mbti += "P";
        } else {
            mbti += "J";
        }

        return mbti;
    }



}
