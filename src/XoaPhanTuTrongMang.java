import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class XoaPhanTuTrongMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {1, 2, 3, 4, 5, 6};
        int[] array2 = new int[array.length - 1];
        System.out.println("nhập số bạn muốn xóa: ");
        int num = sc.nextInt();
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (num == array[i]){
                index = i;
                break;
            }
        }
        if (index == -1){
            System.out.println("trong mảng không có số này");
        }else {
            System.out.println("số " + num + " nằm ở index thứ " + index);
            for (int i = 0; i < array2.length; i++) {
                if (i < index){
                    array2[i] = array[i];
                }
                if (i >= index){
                    array2[i] = array[i+1];
                }
            }
        }
        System.out.println("măng sau khi xóa là: " + Arrays.toString(array2));


    }

    private static void extracted() {
        int[] array = {1, 2, 3, 4, 5, 6};
        int[] array2 = new int[array.length - 1];
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        for (int i = 0 ; i < index; i++) {
            array2[i] = array[i];
        }
        for (int j = index; j < array2.length; j++) {
            array2[j] = array[j + 1];
        }
        System.out.println(Arrays.toString(array2));
    }
}
