package org.demo;

import org.demo.primitive.BooleanDemo;
import org.demo.primitive.CharacterDemo;
import org.demo.primitive.FloatDemo;
import org.demo.primitive.IntegerDemo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        IntegerDemo demo = new IntegerDemo();
        demo.integerDataType();

        System.out.println();

        FloatDemo demo2 = new FloatDemo();
        demo2.floatDemo();

        System.out.println();

        CharacterDemo characterDemo = new CharacterDemo();
        characterDemo.charDemo();

        System.out.println();

        BooleanDemo booleanDemo = new BooleanDemo();
        booleanDemo.booleaDemo();
        System.out.println();
    }
}