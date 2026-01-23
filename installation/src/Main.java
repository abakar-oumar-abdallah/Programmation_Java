public class Main {
    public static void main(String[] args) {
        byte fromByte = 1;
        short toShort = fromByte;
        int toInt = toShort;
        long toLong = toInt;
        System.out.println(toLong);

        float fromFloat = 12.45f;
        double toDouble = fromFloat;
        System.out.println(toDouble);

        char fromChar = 'd';
        int toIntForChar = fromChar;
        System.out.println(toIntForChar);

        float fromByteToFloat = fromByte;
        System.out.println(fromByteToFloat);

        float fromInt = 99;
        char toChar = (char) fromInt;
        System.out.println(toChar);

        int fromFloatToInt = (int) fromFloat;
        short fromIntToShort = (short) fromFloatToInt;
        System.out.println(fromFloatToInt);
        System.out.println(fromIntToShort);

        String fromString = "123";
        int fromStringToInt = Integer.valueOf(fromString);
        System.out.print(fromStringToInt);

        int fromIntToString = 0;
        String toString = String.valueOf(fromIntToString);
        System.out.println(toString);

        /*
        fromString = "123abc";
        toInt = Integer.valueOf(fromString);
        */
    }
}