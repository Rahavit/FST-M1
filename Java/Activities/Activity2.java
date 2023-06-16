package activities;

public class Activity2 {
    public static void main(String[] args) {
        int[] iarray = {10, 77, 10, 54, -11, 10};
        int getNum = 10;
        int iSum = 30;
        System.out.println("Returns " + validateArray(iarray, getNum, iSum));
    }
    public static boolean validateArray(int[] iArray, int searchFor, int iSum){
        int temp = 0;
        for(int i : iArray)
        {
            if(i == searchFor)
            {
                temp = temp+i;
            }
            continue;
        }
        if(temp == iSum)
           return true;
        else
           return false;
    }
}
