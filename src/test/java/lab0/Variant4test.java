package lab0;


import lab0.Variant4;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Variant4test {

        public static double EPS = 0.0000001;



        @Test(dataProvider = "integerProvider")
        public void integerTest(int p1, int p2, int p3) {
            assertEquals(new Variant4().integerNumbersTask(p1, p2), p3);
        }
        @DataProvider
        public Object[][] integerProvider() {
            return new Object[][] { { 5, 2, 2 }, { 4, 2, 2 }, {0, 2, 0} };
        }

        @Test(expectedExceptions = IllegalArgumentException.class)
        public void negativeIntegerTest() {
            new Variant4().integerNumbersTask( 2, 0);
        }

//        ////////////////////////////////////////////////
        @Test(dataProvider = "booleanProvider")
        public void booleanTest(int p1, int p2, boolean p3) {
            assertEquals(new Variant4().booleanTask(p1, p2), p3);
        }
        @DataProvider
        public Object[][] booleanProvider() {
            return new Object[][] { { 5, 1, true }, { 10, -1, true }, {1, 4,  false } };
        }
//        ////////////////////////////////////////////////
        @Test(dataProvider = "ifProvider")
        public void ifTest(int p1, int p2, int p3, int p4) {
            assertEquals(new Variant4().ifTask(p1, p2, p3), p4);
        }
        @DataProvider
        public Object[][] ifProvider() {
            return new Object[][] { { -1, -2, -3, 0 }, { 2, 1, -1, 2 }, { 2, -1, -2, 1 } };
        }
    //////////////////////////////////////////////////

    @Test(dataProvider = "switchProvider")
    public void switchTest(int p1, int p2) {
        assertEquals(new Variant4().switchTask(p1), p2);
    }
    @DataProvider
    public Object[][] switchProvider() {
        return new Object[][] { { 1, 31 }, { 2, 28 } };
    }
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void negativeSwitchTest() {
        new Variant4().switchTask( 33);
    }

    //        ////////////////////////////////////////////////
    @Test(dataProvider = "whileProvider")
    public void whileTest(int p1, boolean p3) {
        assertEquals(new Variant4().whileTask(p1), p3, "incorrect result for "+ p1);
    }
    @DataProvider
    public Object[][] whileProvider() {
        Object[][] objects = {{3, true}, {81, true}, {14, false}};
        return objects;
    }
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void negativeWhileTest() {
        new Variant4().whileTask( -1);
    }

    //        ////////////////////////////////////////////////
    @Test(dataProvider = "forProvider")
    public void forTest(int n, int[] array) {
        assertEquals(new Variant4().forTask(n), array);
    }
    @DataProvider
    public Object[][] forProvider() {
            return new Object[][] { { 3, new int[] { 3, 6, 9, 12, 15, 18, 21, 24, 27, 30 }}, { 5, new int[] { 5, 10, 15, 20, 25, 30, 35, 40, 45, 50 }}};
        }
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void negativeForTest() {
        new Variant4().forTask( 0);
    }


    //        ////////////////////////////////////////////////
    @Test(dataProvider = "arrayProvider")
    public void arrayTest(int count, int b, int q, int[] array) {
        assertEquals(new Variant4().arrayTask(count, b, q), array);
    }
    @DataProvider
    public Object[][] arrayProvider() {
        return new Object[][] { { 5, 1, 3, new int[] { 1, 3, 9, 27, 81}}, { 4, 1, -2, new int[] { 1, -2, 4, -8}}};
    }
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void negativeArrayTest() {
        new Variant4().forTask( 0);
    }

    //        ////////////////////////////////////////////////
    @Test(dataProvider = "matrixProvider")
    public void twoDimensionArrayTest(int[] input, int m, int[][] output) {
        assertEquals(new Variant4().twoDimensionArrayTask(input, m), output);
    }

    @DataProvider
    public Object[][] matrixProvider() {
        int[] input = {1, 2, 3, 4, 5};

        int[][] output = {{1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5}};

        int[] input1 = {-98, 8, 1};

        int[][] output1 = {{-98, 8, 1},
                {-98, 8, 1},
                {-98, 8, 1},
                {-98, 8, 1}};

        return new Object[][] { {input, 5, output}, {input1, 4, output1} };

    }
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void negativeMatrixTest() {
        new Variant4().forTask( -1);
    }












}



