import java.util.Arrays;
import java.util.Collections;

public class TimPTLonNhatMang2chieu {


    public static void main(String[] args) {

        int[][] arr2 = {{1,2,3,3}, {9,15,6,2}, {5,6,3,4}}; // tạo mảng 2 chiều cho trước
        int max = arr2[0][0];  // tạo biến max =  phần tử thứ 0.0 của mảng

        for (int i = 0; i < arr2.length; i++) {   // duyệt mảng 2 chiều
            for (int j = 0; j < arr2[i].length; j++) {
                if (max < arr2[i][j]){ // so sánh từng phần tử với biến max
                    max = arr2[i][j];    // nếu phần tử lớn hơn biến max sẽ gán max = phần tử đó.
                }
            }
        }
        System.out.println("phẩn tử lớn nhất trong mảng 2 chiều cho sẵn là : " + max);  // in ra max


    }


    // tìm số lớn nhất trong mảng 1 chiều
    static void max1chieu(){
        int[] arr1 = {5,53,3,35,53,35,53,354,354,351,31,53,54,534,354,3,354};
        int max = arr1[0];
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > max){
                max = arr1[i];
            }
        }
        System.out.println("phần tử lớn nhất trong mảng arr1 là: " + max);
        Arrays.sort(arr1);  // sắp xếp bằng hàm có sẵn
        System.out.println("mảng arr1 sau khi sắp xếp là:" + Arrays.toString(arr1));  // in bằng hàm có sẵn
    }
}
