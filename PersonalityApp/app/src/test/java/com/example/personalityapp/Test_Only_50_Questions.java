package com.example.personalityapp;
import org.junit.Test;
import static org.junit.Assert.*;

public class Test_Only_50_Questions {
    @Test

    public void test_isCorrect() {

        System.out.print("Testing\n");
        Profile.incrementE(2);
        Profile.incrementS(2);
        Profile.incrementT(2);
        Profile.incrementP(2);

        String strTest = MainActivity.profile.toString();
        System.out.println(strTest);

        if (strTest.charAt(0) == 'I') {
            assertTrue(Profile.getE() <= Profile.getI());
        }
        else
            assertTrue(Profile.getE() >= Profile.getI());


        if (strTest.charAt(1) == 'N') {
            assertTrue(Profile.getS() <= Profile.getN());
        }
        else
            assertTrue(Profile.getS() >= Profile.getN());


        if (strTest.charAt(2) == 'T') {
            assertTrue(Profile.getF() <= Profile.getT());
        }
        else
            assertTrue(Profile.getF() >= Profile.getT());


        if (strTest.charAt(3) == 'P') {
            assertTrue(Profile.getJ() <= Profile.getP());
        }
        else
            assertTrue(Profile.getJ() >= Profile.getP());

        Profile.clear_mbti();
        strTest = "";
        Profile.incrementI(3);
        Profile.incrementN(3);
        Profile.incrementF(3);
        Profile.incrementJ(3);


        strTest = MainActivity.profile.toString();
        System.out.println(strTest);

        if (strTest.charAt(0) == 'I') {
            assertTrue(Profile.getE() <= Profile.getI());
        }
        else
            assertTrue(Profile.getE() >= Profile.getI());


        if (strTest.charAt(1) == 'N') {
            assertTrue(Profile.getS() <= Profile.getN());
        }
        else
            assertTrue(Profile.getS() >= Profile.getN());


        if (strTest.charAt(2) == 'T') {
            assertTrue(Profile.getF() <= Profile.getT());
        }
        else
            assertTrue(Profile.getF() >= Profile.getT());


        if (strTest.charAt(3) == 'P') {
            assertTrue(Profile.getJ() <= Profile.getP());
        }
        else
            assertTrue(Profile.getJ() >= Profile.getP());

        System.out.println("Test Complete");

    }
}
