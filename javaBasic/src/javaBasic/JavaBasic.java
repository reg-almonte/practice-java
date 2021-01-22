package javaBasic;

public class JavaBasic {

	public static void main(String[] args) {
		// System.out.println("Hello world!\n");
		System.out.println("Review Code For Basic Java Programming Language\n");
		
		// Variables
		System.out.println("Java-Variables");
		System.out.println("1. Primitive Data Type:");
		System.out.println("1.1. List of Primitive Data Types:");
		primitiveDataTypes();
		System.out.println("\n3. Literals:");
		literals();

	}
	
	static void primitiveDataTypes() {
		/* 1. Primitive Data Type 
			The Java programming language is statically-typed, which means that all variables
			must first be declared before they can be used. This involves stating the variable's
			type and name, as you've already seen:
				int gear = 1;
		*/

		/* 1.1.1 byte: The byte data type is an 8-bit signed two's complement integer. It has a minimum value of -128 and a maximum 
		 * value of 127 (inclusive). The byte data type can be useful for saving memory in large arrays, where the memory 
		 * savings actually matters. They can also be used in place of int where their limits help to clarify your code; 
		 * the fact that a variable's range is limited can serve as a form of documentation.
		 */
		byte charByte1 = 'A';
		byte charByte2 = 'z';
		byte maxByteVal = 127; //Try setting it to 128
		byte minByteVal = -128; //Try setting it to -129
		
		System.out.println("\n1.1.1 byte:");
		System.out.println(" - Byte variable set to 'A': " + charByte1);
		System.out.println(" - Byte variable set to 'z': " + charByte2);
		System.out.println(" - Max value of byte: " + maxByteVal);
		System.out.println(" - Min value of byte: " + minByteVal);
		maxByteVal += 1;
		minByteVal -= 1;
		System.out.println(" - Max byte + 1: " + maxByteVal);
		System.out.println(" - Min byte - 1: " + minByteVal);
		
		/* 1.1.2 short: The short data type is a 16-bit signed two's complement integer. It has a minimum value of -32,768  
		 * and a maximum value of 32,767 (inclusive). As with byte, the same guidelines apply: you can use a short to save 
		 * memory in large arrays, in situations where the memory savings actually matters. */
		short charShort1 = 'A';
		short charShort2 = 'z';
		short maxShortVal = 32767;
		short minShortVal = -32768;
		System.out.println("\n1.1.2 short:");
		System.out.println(" - Short variable set to 'A': " + charShort1);
		System.out.println(" - Short variable set to 'z': " + charShort2);
		System.out.println(" - Max value of short: " + maxShortVal);
		System.out.println(" - Min value of short: " + minShortVal);
		maxShortVal += 1;
		minShortVal -= 1;
		System.out.println(" - Max short + 1: " + maxShortVal);
		System.out.println(" - Min short - 1: " + minShortVal);
		
		/* 1.1.3 int: By default, the int data type is a 32-bit signed two's complement integer, which has a minimum value of
		 * -2^31 and a maximum value of (2^31)-1. In Java SE 8 and later, you can use the int data type to represent an unsigned
		 * 32-bit integer, which has a minimum value of 0 and a maximum value of (2^32)-1. Use the Integer class to use int data
		 * type as an unsigned integer. See the section The Number Classes for more information. Static methods like 
		 * compareUnsigned, divideUnsigned etc have been added to the Integer class to support the arithmetic operations for 
		 * unsigned integers.*/
		
		int charInt1 = 'A';
		int charInt2 = 'z';
		int maxIntVal = Integer.MAX_VALUE;
		int minIntVal = Integer.MIN_VALUE;
		System.out.println("\n1.1.3 int:");
		System.out.println(" - Int variable set to 'A': " + charInt1);
		System.out.println(" - Int variable set to 'z': " + charInt2);
		System.out.println(" - Max value of int: " + maxIntVal);
		System.out.println(" - Min value of int: " + minIntVal);
		maxIntVal += 1;
		minIntVal -= 1;
		System.out.println(" - Max int + 1: " + maxIntVal);
		System.out.println(" - Min int - 1: " + minIntVal);
		System.out.println(" - Notes:");
		System.out.println("   1. 2^31 = 2147483648");
		System.out.println("   2. Integer.SIZE (Number of bits) = " + Integer.SIZE);
		System.out.println("   3. Integer.BYTES (Number of bytes, 8 bits per byte) = " + Integer.BYTES);
		System.out.println("   4. Learn more here: https://docs.oracle.com/javase/8/docs/api/java/lang/Integer.html");
		
		/* 1.1.4 long: The long data type is a 64-bit two's complement integer. The signed long has a minimum value of -2^63 
		 * and a maximum value of (2^63)-1. In Java SE 8 and later, you can use the long data type to represent an unsigned 
		 * 64-bit long, which has a minimum value of 0 and a maximum value of 2^64-1. Use this data type when you need a 
		 * range of values wider than those provided by int. The Long class also contains methods like compareUnsigned, 
		 * divideUnsigned etc to support arithmetic operations for unsigned long.*/
		
		long charLong1 = 'A';
		long charLong2 = 'z';
		long maxLongVal = Long.MAX_VALUE;
		long minLongVal = Long.MIN_VALUE;
		System.out.println("\n1.1.4 long:");
		System.out.println(" - Long variable set to 'A': " + charLong1);
		System.out.println(" - Long variable set to 'z': " + charLong2);
		System.out.println(" - Max value of long: " + maxLongVal);
		System.out.println(" - Min value of long: " + minLongVal);
		maxLongVal += 1;
		minLongVal -= 1;
		System.out.println(" - Max long + 1: " + maxLongVal);
		System.out.println(" - Min long - 1: " + minLongVal);
		System.out.println(" - Notes:");
		System.out.println("   1. 2^63 = 9,223,372,036,854,775,808");
		System.out.println("   2. Long.SIZE (Number of bits) = " + Long.SIZE);
		System.out.println("   3. Long.BYTES (Number of bytes, 8 bits per byte) = " + Long.BYTES);
		System.out.println("   4. Learn more here: https://docs.oracle.com/javase/8/docs/api/java/lang/Long.html");
		
		
		/* 1.1.5 float: The float data type is a single-precision 32-bit IEEE 754 floating point. Its range of values is 
		 * beyond the scope of this discussion, but is specified in the Floating-Point Types, Formats, and Values section 
		 * of the Java Language Specification. As with the recommendations for byte and short, use a float (instead of 
		 * double) if you need to save memory in large arrays of floating point numbers. This data type should never be 
		 * used for precise values, such as currency. For that, you will need to use the java.math.BigDecimal class instead. 
		 * Numbers and Strings covers BigDecimal and other useful classes provided by the Java platform.*/
		float charFloat1 = 'A';
		float charFloat2 = 'z';
		float sampleFloatVal1 = 1.0f * Long.MAX_VALUE * Long.MAX_VALUE;
		float sampleFloatVal2 = 1.0f / Long.MAX_VALUE;
		System.out.println("\n1.1.5 float:");
		System.out.println(" - Float variable set to 'A': " + charFloat1);
		System.out.println(" - Float variable set to 'z': " + charFloat2);
		System.out.println(" - Sample float Value (Big Number): " + sampleFloatVal1);
		System.out.println(" - Sample float Value (Small Number): " + sampleFloatVal2);
		
		
		/* 1.1.6 double: The double data type is a double-precision 64-bit IEEE 754 floating point. Its range of values is 
		 * beyond the scope of this discussion, but is specified in the Floating-Point Types, Formats, and Values section 
		 * of the Java Language Specification. For decimal values, this data type is generally the default choice. As 
		 * mentioned above, this data type should never be used for precise values, such as currency.*/
		double charDouble1 = 'A';
		double charDouble2 = 'z';
		double sampleDoubleVal1 = 1.0f * Long.MAX_VALUE * Long.MAX_VALUE;
		double sampleDoubleVal2 = 1.0f / Long.MAX_VALUE;
		System.out.println("\n1.1.6 double:");
		System.out.println(" - Double variable set to 'A': " + charDouble1);
		System.out.println(" - Double variable set to 'z': " + charDouble2);
		System.out.println(" - Sample double Value (Big Number): " + sampleDoubleVal1);
		System.out.println(" - Sample double Value (Small Number): " + sampleDoubleVal2);
		
		// Other sample uses of Floats and Doubles 
		floatAndDoubleExperiments();
		
		
		/* 1.1.7 boolean: The boolean data type has only two possible values: true and false. Use this data type for simple 
		 * flags that track true/false conditions. This data type represents one bit of information, but its "size" isn't 
		 * something that's precisely defined.*/
		boolean sampleBooleanVal1 = true;
		boolean sampleBooleanVal2 = false;
		boolean queryBoolean1 = 1 == 1;
		boolean queryBoolean2 = 1 != 1;
		System.out.println("\n1.1.7 boolean:");
		System.out.println(" - Sample boolean Value: " + sampleBooleanVal1);
		System.out.println(" - Sample boolean Value: " + sampleBooleanVal2);
		System.out.println(" - '1 == 1' boolean Value: " + queryBoolean1);
		System.out.println(" - '1 != 1' boolean Value: " + queryBoolean2);
		
		/* 1.1.8 char: The char data type is a single 16-bit Unicode character. It has a minimum value of '\u0000' (or 0) and
		 *  a maximum value of '\uffff' (or 65,535 inclusive).*/
		char sampleCharVal1 = '^';
		char sampleCharVal2 = '@';
		char numberAsChar1 = 69;
		char numberAsChar2 = 101;
		System.out.println("\n1.1.8 char:");
		System.out.println(" - Sample char value: " + sampleCharVal1);
		System.out.println(" - Sample char value: " + sampleCharVal2);
		System.out.println(" - 69 as char value: " + numberAsChar1);
		System.out.println(" - 101 as char value: " + numberAsChar2);		
		
		/* 1.1.9 String (Capital S): In addition to the eight primitive data types listed above, the Java programming language 
		 * also provides special support for character strings via the java.lang.String class. Enclosing your character string 
		 * within double quotes will automatically create a new String object; for example, String s = "this is a string";. 
		 * String objects are immutable, which means that once created, their values cannot be changed. The String class is not 
		 * technically a primitive data type, but considering the special support given to it by the language, you'll probably 
		 * tend to think of it as such. You'll learn more about the String class in Simple Data Objects
		 * 
		 * Reference: https://docs.oracle.com/javase/8/docs/api/java/lang/String.html*/
		String sampleStr1 = "abc";  // is equivalent to:
		char letters[] = {'a', 'b', 'c'};
		String sampleStr2 = new String(letters);
		System.out.println("\n1.1.9 String (Special Primitive Data Type):");
		System.out.println(" - Sample String value: " + sampleStr1);
		System.out.println(" - Array of chars to String: " + sampleStr2);
		
		String sampleStr3 = "cde";
		System.out.println("abc" + sampleStr3);
	    String c = "abc".substring(2,3);
	    String d = sampleStr3.substring(1, 2);
	    System.out.println("\nSubstring parameters [\"string\".substring(beginIndex, endIndex)]:" +
	    "\n\tbeginIndex: the beginning index, inclusive.\n\tendIndex: the ending index, exclusive.\n");
	    System.out.println("\"abc\".substring(2,3) = " + c);
	    System.out.println("\"cde\".substring(1,2) = " + d);
	}
		
	static void literals() {
		/* * Default Values
		 * It's not always necessary to assign a value when a field is declared. Fields that are declared 
		 * but not initialized will be set to a reasonable default by the compiler. Generally speaking, 
		 * this default will be zero or null, depending on the data type. Relying on such default values, 
		 * however, is generally considered bad programming style.*/
		
		/* 1.2. Literals
		 * You may have noticed that the "new" keyword isn't used when initializing a variable of a primitive 
		 * type. Primitive types are special data types built into the language; they are not objects created 
		 * from a class. A literal is the source code representation of a fixed value; literals are represented 
		 * directly in your code without requiring computation. As shown below, it's possible to assign a literal 
		 * to a variable of a primitive type:*/
		
		boolean result = true;
		char capitalC = 'C';
		byte b = 100;
		short s = 10000;
		int i = 100000;
		
		System.out.println("\nSample Literals:");
		System.out.println("1. boolean result = true: " + result);
		System.out.println("2. char capitalC = 'C': " + capitalC);
		System.out.println("3. byte b = 100: " + b);
		System.out.println("4. short s = 10000: " + s);
		System.out.println("5. int i = 100000: " + i);
		
		/* 1.2.1 Integer Literals
		 * An integer literal is of type long if it ends with the letter L or l; otherwise it is of type int. 
		 * It is recommended that you use the upper case letter L because the lower case letter l is hard to 
		 * distinguish from the digit 1.
		 * Values of the integral types byte, short, int, and long can be created from int literals. Values of 
		 * type long that exceed the range of int can be created from long literals. Integer literals can be 
		 * expressed by these number systems:
		 * 
		 * 	- Decimal: Base 10, whose digits consists of the numbers 0 through 9; this is the number system you use every day
		 * 	- Hexadecimal: Base 16, whose digits consist of the numbers 0 through 9 and the letters A through F
		 * 	- Binary: Base 2, whose digits consists of the numbers 0 and 1 (you can create binary literals in Java SE 7 and later)
		 * 
		 * For general-purpose programming, the decimal system is likely to be the only number system you'll ever use. 
		 * However, if you need to use another number system, the following example shows the correct syntax. 
		 * The prefix 0x indicates hexadecimal and 0b indicates binary: */
		  
		// The number 26, in decimal
		int decVal = 26;
		//  The number 26, in hexadecimal
		int hexVal = 0x1a;
		// The number 26, in binary
		int binVal = 0b11010;
		
	}
		
	static void floatAndDoubleExperiments() {
		System.out.println("\n ** Double and Float variable experiments:\n");
		// An example of overflow:
        double d = 1e308;
        System.out.print(" 1. overflow produces infinity: ");
        System.out.println(d + "*10==" + d*10);
        // An example of gradual underflow:
        d = 1e-305 * Math.PI;
        System.out.print(" 2. gradual underflow: " + d + "\n   ");
        for (int i = 0; i < 4; i++)
            System.out.print(" " + (d /= 100000));
        System.out.println();
        // An example of NaN:
        System.out.print(" 3. 0.0/0.0 is Not-a-Number: ");
        d = 0.0/0.0;
        System.out.println(d);
        // An example of inexact results and rounding:
        System.out.print(" 4. inexact results with float:");
        for (int i = 0; i < 100; i++) {
            float z = 1.0f / i;
            if (z * i != 1.0f)
                System.out.print(" " + i);
        }
        System.out.println();
        // Another example of inexact results and rounding:
        System.out.print(" 5. inexact results with double:");
        for (int i = 0; i < 100; i++) {
            double z = 1.0 / i;
            if (z * i != 1.0)
                System.out.print(" " + i);
        }
        System.out.println();
        // An example of cast to integer rounding:
        System.out.print(" 6. cast to int rounds toward 0: ");
        d = 12345.6;
        System.out.println((int)d + " " + (int)(-d));
	}

}
