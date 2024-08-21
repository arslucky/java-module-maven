package org.ars.service.provider;

import org.ars.one.ServiceHello;

public class ServiceHelloProvider implements ServiceHello {
    @Override
    public void hello() {
        System.out.println("Service provider says Hello!");
    }
}
