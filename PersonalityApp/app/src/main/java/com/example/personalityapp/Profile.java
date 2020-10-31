package com.example.personalityapp;

public class Profile {
    private static int e = 0, i = 0, s = 0, n = 0, t = 0, f = 0, j = 0, p = 0;
    private static char sex = 'M';
    private static String mbti = "";
    private static char[] responseArr = new char[51]; //responses are stored in this array

    public void setResponse(int n, char response) {
        responseArr[n] = response;
    }

    public static void calculateMBTI() {

        //clear existing results
        clearMBTI();

        //Sex
        if (responseArr[0] == 'A')
            sex = 'M';
        else
            sex = 'F';

        //Q1
        if (responseArr[1] == 'A')
            j += 2;
        else
            p += 2;

        //Q2
        if (responseArr[2] == 'A')
            j += 2;
        else
            p += 2;

        //Q3
        if (responseArr[3] == 'A')
            e += 2;
        else
            i += 2;

        //Q4
        if (responseArr[4] == 'A')
            f++;
        else
            t += 2;

        //Q5
        if (responseArr[5] == 'A')
            n++;
        else
            s++;

        //Q6
        if (responseArr[6] == 'A')
            e += 2;
        else
            i++;

        //Q7
        if (responseArr[7] == 'A')
            j++;
        else
            p++;

        //Q8
        if (responseArr[8] == 'A')
            j++;
        else
            p += 2;

        //Q9
        if (responseArr[9] == 'A')
            e += 2;
        else
            i++;

        //Q10
        if (responseArr[10] == 'A')
            s++;
        else
            n += 2;

        //Q11
        if (responseArr[11] == 'A')
            j += 2;
        else
            p++;

        //Q12
        if (responseArr[12] == 'A')
            s++;
        else
            n += 2;

        //Q13
        if (responseArr[13] == 'A')
            e++;
        else
            i += 2;

        //Q14
        if (responseArr[14] == 'A')
            f++;
        else
            t += 2;

        //Q15
        if (responseArr[15] == 'B')
            s++;

        //Q16
        if (responseArr[16] == 'A')
            e += 2;
        else
            i += 2;

        //Q17
        if (responseArr[17] == 'A')
            j += 2;
        else
            p += 2;

        //Q18
        if (responseArr[18] == 'A')
            j++;
        else
            p++;

        //Q19
        if (responseArr[19] == 'A')
            j++;
        else
            p++;

        //Q20
        if (responseArr[20] == 'A')
            s += 2;
        else
            n += 2;

        //Q21
        if (responseArr[21] == 'A')
            e += 2;
        else
            i += 2;

        //Q22
        if (responseArr[22] == 'A')
            f += 2;
        else
            t += 2;

        //Q23
        if (responseArr[23] == 'A')
            n++;
        else
            s += 2;

        //Q24
        if (responseArr[24] == 'A')
            e++;
        else
            i++;

        //Q25
        if (responseArr[25] == 'A' || responseArr[25] == 'D' || responseArr[25] == 'E')
            j++;
        if (responseArr[25] == 'B' || responseArr[25] == 'D' || responseArr[25] == 'F')
            p++;

        //Q26
        if (responseArr[26] == 'A')
            e++;

        //Q27
        if (responseArr[27] == 'A')
            j += 2;
        else
            p += 2;

        //Q28
        if (responseArr[28] == '8')
            s += 2;
        else
            n++;

        //Q29
        if (responseArr[29] == 'A')
            i += 2;
        else
            e += 2;

        //Q30
        if (responseArr[30] == 'A')
            t += 2;
        else
            f++;

        //Q31
        if (responseArr[31] == 'B')
            s += 2;

        //Q32
        if (responseArr[32] == 'A')
            t++;
        else
            f++;

        //Q33
        if (responseArr[33] == 'B')
            t += 2;

        //Q34
        if (responseArr[34] == 'A')
            j += 2;
        else
            p += 2;

        //Q35
        if (responseArr[35] == 'A')
            s += 2;
        else
            n++;

        //Q36
        if (responseArr[36] == 'A')
            i++;
        else
            e += 2;

        //Q37
        if (responseArr[37] == 'A')
            t++;
        else
            f += 2;

        //Q38
        if (responseArr[38] == 'B')
            s += 2;

        //Q39
        if (responseArr[39] == 'A')
            t++;
        else
            f++;

        //Q40
        if (responseArr[40] == 'A')
            f++;
        else
            t += 2;

        //Q41
        if (responseArr[41] == 'A')
            j += 2;
        else
            p += 2;

        //Q42
        if (responseArr[42] == 'A')
            s++;
        else
            n += 2;

        //Q43
        if (responseArr[43] == 'A')
            i++;
        else
            e++;

        //Q44
        if (responseArr[44] == 'A')
            t++;
        else
            f += 2;

        //Q45
        if (responseArr[45] == 'B')
            s += 2;

        //Q46
        if (responseArr[46] == 'A')
            t += 2;

        //Q47
        if (responseArr[47] == 'A')
            f++;
        else
            t += 2;

        //Q48
        if (responseArr[48] == 'A')
            s++;
        else
            n++;

        //Q49
        if (responseArr[49] == 'A')
            t += 2;
        else
            f++;

        //Q50
        if (responseArr[50] == 'A')
            t += 2;

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

    public static void clearResponseArr(){
        for (int i = 0; i < responseArr.length; i++) {
            responseArr[i] = '\u0000';
        }
    }

}
