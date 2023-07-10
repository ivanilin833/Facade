public class BinOps {
    public static String sum(String a, String b) {
        return Integer.toBinaryString(Integer.parseInt(a, 2) + Integer.parseInt(b, 2));
    }

    public static String mult(String a, String b) {
        return Integer.toBinaryString(Integer.parseInt(a, 2) * Integer.parseInt(b, 2));
    }
}
