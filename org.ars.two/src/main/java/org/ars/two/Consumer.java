package org.ars.two;

import org.ars.one.Hello;
import org.ars.one.ServiceHello;

import java.util.ServiceLoader;

public class Consumer {
    public static void main(String[] args) {
        var hello = new Hello();
        hello.hello();

        var serviceProviders = ServiceLoader.load(ServiceHello.class);
        serviceProviders.iterator().next().hello();
    }
}