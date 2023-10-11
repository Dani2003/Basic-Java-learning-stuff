public class firstobjectinjava {
    public static void main(String[]args) {
        firstobjectinjava obj = new firstobjectinjava();

        int num1 = 10;
        int num2 = 20;

        int get_result = obj.add(num1 , num2);

        System.out.println(get_result);


    }
    public int add(int num1, int num2) {
        int result = num1 +num2;
        return result;
    }

}
