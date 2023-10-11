public class WheatCalulation {
    public static void main(String[]args) {
        float value = 4500;
        float weight = 40;
        float wwight1 = value/weight;

        System.out.println(wwight1);

        float weight2 = (wwight1) * 50;

        System.out.println(weight2);

        float bags = (weight2) * 6;

        System.out.println(bags);
    }
}
