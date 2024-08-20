package org.ars.two;

import org.ars.two.one.Hello;

public class Consumer {
    public static void main(String[] args) {
        var hello = new Hello();
        hello.hello();
    }
}