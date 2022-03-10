public class DemoForeach {
    public static void main(String[] args) {
        //cách 1: new
        int[] array = new int[5];
        //cách 2: khởi tạo trực tiếp
        int[] arr = {1, 2, 3};
        //for i
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            System.out.println(i);
        }
        //for each
        for (int element : arr) {
            System.out.println(element);
        }
    }
}
