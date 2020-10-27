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

    public char getEI() {
        if (i > e || e == i) {
            return 'I';
        } else {
            return 'E';
        }
    }

    public char getSN() {
        if (n > s || s == n) {
            return 'N';
        } else {
            return 'S';
        }
    }

    public char getTF() {
        if ((t == f && sex == 'M') || t > f) {
            return 'T';
        }  else {
            return 'F';
        }
    }

    public char getJP() {
        if (p > j || j == p) {
            return 'P';
        } else {
            return 'J';
        }
    }

    public String toString() {
        mbti = "";

        mbti += getEI();
        mbti += getSN();
        mbti += getTF();
        mbti += getJP();

        return mbti;
    }

    public String getEIDetails() {
        if (getEI() == 'E') {
            return "Extroverted (E) - prefer group activities, think while speaking, get energized by social interaction.";
        } else {
            return "Introverted (I) - prefer solitary activities, think before speaking, get exhausted by social interaction.";
        }
    }

    public String getSNDetails() {
        if (getSN() == 'S') {
            return "Sensing (S) - down-to-earth, rely on senses, absorbed in practical matters, focus on what has happened.";
        } else {
            return "Intuitive (N) - imaginative, rely on intuition, absorbed in ideas, focus on what might happen.";
        }
    }

    public String getTFDetails() {
        if (getTF() == 'T') {
            return "Thinking (T) - tough, follow their minds, focus on objectivity and rationality.";
        } else {
            return "Feeling (F) - sensitive, follow their hearts, focus on harmony and cooperation.";
        }
    }

    public String getJPDetails() {
        if (getJP() =='J') {
            return "Judging (J) - decisive, prefer clear rules and guidelines, see deadlines as sacred, seek closure.";
        } else {
            return "Perceiving (P) - very good at improvising, prefer keeping their options open, relaxed about their work, seek freedom.";
        }
    }

    public static void clearMBTI(){
        mbti="";
        e = 0;
        i = 0;
        s = 0;
        n = 0;
        t = 0;
        f = 0;
        j = 0;
        p = 0;
    }

}
