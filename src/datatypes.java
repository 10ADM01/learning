public class datatypes {
    public static void main(String[] args) {
        byte  x =   8;
        System.out.println("range of byte -128 to 127");
        short x1 = 23;
        System.out.println("range of short -32768 to 32767");

        System.out.println("In Java, primitive data types are used to represent simple values like integers, floating-point numbers, characters, and booleans. Each primitive data type has a specific size in memory and a range of values it can represent. Here are the commonly used primitive data types in Java, along with their sizes and ranges:\n" +
                "\n" +
                "1. **byte**: \n" +
                "   - Size: 8 bits (1 byte)\n" +
                "   - Range: -128 to 127\n" +
                "\n" +
                "2. **short**: \n" +
                "   - Size: 16 bits (2 bytes)\n" +
                "   - Range: -32,768 to 32,767\n" +
                "\n" +
                "3. **int**: \n" +
                "   - Size: 32 bits (4 bytes)\n" +
                "   - Range: -2^31 to (2^31 - 1) or approximately -2.1 billion to 2.1 billion\n" +
                "\n" +
                "4. **long**: \n" +
                "   - Size: 64 bits (8 bytes)\n" +
                "   - Range: -2^63 to (2^63 - 1) or approximately -9.2 quintillion to 9.2 quintillion\n" +
                "\n" +
                "5. **float**: \n" +
                "   - Size: 32 bits (4 bytes)\n" +
                "   - Range: Approximately ±3.4 x 10^38, with a precision of about 7 decimal digits\n" +
                "\n" +
                "6. **double**: \n" +
                "   - Size: 64 bits (8 bytes)\n" +
                "   - Range: Approximately ±1.7 x 10^308, with a precision of about 15 decimal digits\n" +
                "\n" +
                "7. **char**: \n" +
                "   - Size: 16 bits (2 bytes)\n" +
                "   - Range: Represents a single Unicode character, such as 'A', '7', or '☺'.\n" +
                "\n" +
                "8. **boolean**: \n" +
                "   - Size: JVM-dependent (often 1 byte)\n" +
                "   - Range: `true` or `false`, representing binary values.\n" +
                "\n" +
                "It's important to choose the appropriate primitive data type based on the requirements of your program to optimize memory usage and avoid unintended data truncation or loss. The choice of data type should be based on the expected range and precision of the values you need to store. For example, use `int` for whole numbers within its range, and use `double` for real numbers requiring higher precision.\n" +
                "\n" +
                "Keep in mind that some data types, like `float` and `double`, are floating-point numbers and may have limited precision for very large or very small values. This can lead to rounding errors in certain calculations, so they should be used with caution for critical calculations that require exact precision.");
    }
}
