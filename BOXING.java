public class BOXING {
    public static void main(String[] args) {
        int primitiveInt = 250;
        char primitiveChar = 'Z';
        byte primitiveByte = 75;
        short primitiveShort = 500;
        long primitiveLong = 200000L;
        float primitiveFloat = 20.8f;
        double primitiveDouble = 55.7;
        boolean primitiveBoolean = false;

        Integer boxedInt = primitiveInt;
        Character boxedChar = primitiveChar;
        Byte boxedByte = primitiveByte;
        Short boxedShort = primitiveShort;
        Long boxedLong = primitiveLong;
        Float boxedFloat = primitiveFloat;
        Double boxedDouble = primitiveDouble;
        Boolean boxedBoolean = primitiveBoolean;

        System.out.println("Autoboxing:");
        System.out.println("Boxed Integer: " + boxedInt);
        System.out.println("Boxed Character: " + boxedChar);
        System.out.println("Boxed Byte: " + boxedByte);
        System.out.println("Boxed Short: " + boxedShort);
        System.out.println("Boxed Long: " + boxedLong);
        System.out.println("Boxed Float: " + boxedFloat);
        System.out.println("Boxed Double: " + boxedDouble);
        System.out.println("Boxed Boolean: " + boxedBoolean);

        int unboxedInt = boxedInt;
        char unboxedChar = boxedChar;
        byte unboxedByte = boxedByte;
        short unboxedShort = boxedShort;
        long unboxedLong = boxedLong;
        float unboxedFloat = boxedFloat;
        double unboxedDouble = boxedDouble;
        boolean unboxedBoolean = boxedBoolean;

        System.out.println("\nUnboxing:");
        System.out.println("Unboxed Integer: " + unboxedInt);
        System.out.println("Unboxed Character: " + unboxedChar);
        System.out.println("Unboxed Byte: " + unboxedByte);
        System.out.println("Unboxed Short: " + unboxedShort);
        System.out.println("Unboxed Long: " + unboxedLong);
        System.out.println("Unboxed Float: " + unboxedFloat);
        System.out.println("Unboxed Double: " + unboxedDouble);
        System.out.println("Unboxed Boolean: " + unboxedBoolean);
    }
}
