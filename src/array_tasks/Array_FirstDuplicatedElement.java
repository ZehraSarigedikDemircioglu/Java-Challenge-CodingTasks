package array_tasks;

public class Array_FirstDuplicatedElement {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 4, 5, 5};

        System.out.println(firstDupNum(array));
    }

    public static int firstDupNum(int[] array){

        int firstDup = 0;

        for (int each : array) {
            int count = 0;

            for (int element : array) {
                if(each == element){
                    count++;
                }
            }
            if(count > 1){
                firstDup = each;
                break;
            }
        }
        return firstDup;
    }
}
/*
    write a program that can find the first duplicated element from the array
*/

