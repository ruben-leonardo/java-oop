package io.artisancodes.oop.classes.interfaces.ex02;

public class DemoClass implements FirstInterface, SecondInterface {
    @Override
    public void myMethod() {
        System.out.println("Some text...");
    }

    @Override
    public void myOtherMethod() {
        System.out.println("Some other text...");
    }
}
