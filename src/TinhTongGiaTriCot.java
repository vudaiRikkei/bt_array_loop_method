import java.util.Scanner;

public class TinhTongGiaTriCot {
    public static void main(String[] args) {

        int[][] arr2 = {{1,2,3,3}, {9,5,6,2}, {5,6,3,4}};

        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập số hàng");
        int hang = scanner.nextInt(); // lấy số hàng của mảng

        System.out.println("nhập số cột"); //lấy số cột của mảng
        int cot = scanner.nextInt();

        int [][] arr = randomarr(hang, cot);  // gọi hàm tạo mảng và gán giá trị
        System.out.println("mảng ngẫu nhiên đưuọc tạo là:");
        for (int i = 0; i < arr.length; i++) {          // duyệt mảng in ra phần tử
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
      /** Viết một ứng dụng cho phép người dùng nhập vào một mảng hai chiều của các số
       thực, sau đó cho phép người dùng nhập vào thứ tự của một cột (tính từ 0) và tính ra
        tổng các phần tử của cột đó  */
        System.out.println("nhap so cot ban muuon tinh tong");
        int socot = scanner.nextInt();  // lấy cột muốn tính tổng
        int total= 0;                    // tạo biến tổng
        for(int i = 0; i < cot; i++) {      // duyệt mảng và tính tổng
            total += arr[i][socot-1];
        }
        System.out.println(total);  // in ra tổng của cột

    }

    static int[][] randomarr(int hang, int cot){ //hàm tạo mảng 2 chiều ngẫu nhiên
        int[][] arr = new int[hang][cot];
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                arr[i][j] = (int) (Math.random() * 10);
            }
        }
        return arr;
    }


}