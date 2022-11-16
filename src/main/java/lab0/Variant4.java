package lab0;

public class Variant4 {
    //
    /*Given positive integers  A and  B ( A  >  B ). On a segment of length  A , the maximum possible number of segments of
    length  B (without overlaps) is placed. Using integer division, find the number of segments  B placed on segment  A .*/
    public int integerNumbersTask(int a, int b) {
        if(b == 0){
            throw new IllegalArgumentException("b shouldn't be 0, a > b");
        }
        return a/b;
    }
    /*Two integers are given: A ,  B . Check the truth of the statement: "The inequalities A  > 2 and  B  <  3 are valid."*/

    public boolean booleanTask(int a, int b) {
        return a > 2 && b < 3;
    }
    /*Three integers are given. Find the number of positive numbers in the original set.*/

    public int ifTask(int a, int b, int c) {
        int count = 0;
        if(a>0){
            count++;
        }
        if(b>0){
            count++;
        }
        if(c>0){
            count++;
        }
        return count;
    }
    /*Given the number of the month - an integer in the range
    1-12 (1 - January, 2 - February, etc.). Determine the number of days in this month for a non-leap year.*/

    public int switchTask(int number1) {
        if(number1<1 || number1 >12){
            throw new IllegalArgumentException("1<=a<=12");
        }
        int a = 0;
        switch (number1){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: a = 31;
                break;
            case 2: a = 28;
            break;
            case 4:
            case 6:
            case 9:
            case 11: a = 30;
            break;
        }
        return a;
    }

    /*Given a real number — the price of 1 kg of sweets. Output the cost of 1, 2, ... , 10 kg of sweets.*/
    public int[] forTask(int n) {
        if(n < 1){
            throw new IllegalArgumentException("n shouldn't be < 0");
        }
        int []arr = new int[10];
        for(int i = 0;i<10;i++){

            arr[i] = n*(i+1);
        }
        return arr;
    }

    /*An integer  N (> 0) is given. If it is a power of 3, then print True, if not, print False.*/

    public boolean whileTask(int a) {
        if(a < 0){
            throw new IllegalArgumentException("a shouldn't be < 0");
        }
        double k = 0;
        int i = 0;
        while(k<=a){
            k = Math.pow(3, i);
            if (k == a){
                return true;
            }
            i++;
        }
        return false;
    }
    /*Given an integer  N (> 1) and the first term  A and denominator  D of a geometric progression .
    Form and output an array of size  N containing the first N  members of the given progression:
    A,    A·D,    A·D2,    A·D3,    … .*/

    public int[] arrayTask(int count, int b, int q) {
        if(count <= 1){
            throw new IllegalArgumentException("n > 1");
        }
        int[] arr = new int[count];
        int m = 1;
        arr[0] = b;
        for (int i = 1; i < count; i++){
            m*=q;
            arr[i]=arr[0]*m;
        }
        return arr;
    }

    /*You are given positive integers  M , N and a set of  N  numbers.
    Form a matrix of size  M  ´  N , in which each row contains all the numbers from the original set (in the same order).*/
    public int[][]  twoDimensionArrayTask(int[] array, int m) {
        if(m < 0 ){
            throw new IllegalArgumentException("m > 0");
        }
        int[][] matrix = new int[m][array.length];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < array.length; j++){
                matrix[i][j] = array[j];
            }
        }
        return matrix;
    }

    public static void main(String... strings) {
        System.out.println("Done!!!");
    }

}
