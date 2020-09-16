public class Main {
    public static void main(String[] args)
    {
        byte byte_min, byte_max;
        int int_min, int_max;
        short short_min, short_max;
        long long_min, long_max;
        float float_min, float_max;
        double double_min, double_max;

        byte_min = Byte.MIN_VALUE;
        byte_max = Byte.MAX_VALUE;

        int_min = Integer.MIN_VALUE;
        int_max = Integer.MAX_VALUE;

        short_min = Short.MIN_VALUE;
        short_max = Short.MAX_VALUE;

        long_min = Long.MIN_VALUE;
        long_max = Long.MAX_VALUE;

        //float_min = Float.MIN_VALUE;
        float_max = Float.MAX_VALUE;

        //double_min = Double.MIN_VALUE;
        double_max = Double.MAX_VALUE;

        System.out.println("byte MIN: " + byte_min + "; byte MAX: " + byte_max);
        System.out.println("short MIN: " + short_min + "; short MAX: " + short_max);
        System.out.println("int MIN: " + int_min + "; int MAX: " + int_max);
        System.out.println("long MIN: " + long_min + "; long MAX: " + long_max);
        System.out.println("float MIN: " + -float_max + "; float MAX: " + float_max);
        System.out.println("double MIN: " + -double_max + "; double MAX: " + double_max);
    }
}
