package com.udea.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-12-08T11:54:44")
@StaticMetamodel(Venta.class)
public class Venta_ { 

    public static volatile SingularAttribute<Venta, Float> precio;
    public static volatile SingularAttribute<Venta, Integer> idVehiculo;
    public static volatile SingularAttribute<Venta, Integer> idCliente;
    public static volatile SingularAttribute<Venta, Integer> idVenta;
    public static volatile SingularAttribute<Venta, Date> fechaVenta;

}