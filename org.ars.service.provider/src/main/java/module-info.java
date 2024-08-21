module org.ars.service.provider {
    exports org.ars.service.provider;
    requires org.ars.one;
    provides org.ars.one.ServiceHello with org.ars.service.provider.ServiceHelloProvider;
}