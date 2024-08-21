module org.ars.two {
    requires org.ars.one;
    requires org.ars.service.provider;
    uses org.ars.one.ServiceHello;
}