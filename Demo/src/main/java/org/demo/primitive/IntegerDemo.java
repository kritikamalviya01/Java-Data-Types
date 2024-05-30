package org.demo.primitive;

public class IntegerDemo {
    public void integerDataType(){

        // byte : 8 bit signed integer
        // default value is 0
        byte b1 = Byte.MIN_VALUE; // minimum value: -128 -> 2^8
        byte b2 = Byte.MAX_VALUE; // maximum value: 127 -> (2^8)-1

        System.out.println("byte data type size is between " + b1 + " to " + b2);

        // short : 16 bit signed integer
        // default value is 0
        short s1 = Short.MIN_VALUE; // minimum value: -32,768 -> 2^16
        short s2 = Short.MAX_VALUE; // maximum value: 32,767 -> (2^16)-1

        System.out.println("short data type size is between " + s1 + " to " + s2);

        // int : 32 bit signed integer
        // default value is 0
        int i1 = Integer.MIN_VALUE; // minimum value: -2147483648 -> 2^32
        int i2 = Integer.MAX_VALUE; // maximum value: 2147483647 -> (2^32)-1

        System.out.println("int data type size is between " + i1 + " to " + i2);

        // long : 64 bit signed integer
        // default value is 0
        long l1 = Long.MIN_VALUE; // minimum value: -9223372036854775808 -> 2^64
        long l2 = Long.MAX_VALUE; // maximum value: 9223372036854775807 -> (2^64)-1

        System.out.println("long data type size is between " + l1 + " to " + l2);

        System.out.println("Example:");
        byte b = 121;
        short s = 10221;
        int i = 60000;
        long l = 21474836472L;
        System.out.println("byte "+b);
        System.out.println("short "+s);
        System.out.println("int "+i);
        System.out.println("long "+l);
    }
}
