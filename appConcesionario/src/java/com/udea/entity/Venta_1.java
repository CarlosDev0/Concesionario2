/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author USER
 */
@Entity
@Table(name = "venta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Venta_1.findAll", query = "SELECT v FROM Venta_1 v")
    , @NamedQuery(name = "Venta_1.findByIdVenta", query = "SELECT v FROM Venta_1 v WHERE v.idVenta = :idVenta")
    , @NamedQuery(name = "Venta_1.findByIdVehiculo", query = "SELECT v FROM Venta_1 v WHERE v.idVehiculo = :idVehiculo")
    , @NamedQuery(name = "Venta_1.findByIdCliente", query = "SELECT v FROM Venta_1 v WHERE v.idCliente = :idCliente")
    , @NamedQuery(name = "Venta_1.findByPrecio", query = "SELECT v FROM Venta_1 v WHERE v.precio = :precio")
    , @NamedQuery(name = "Venta_1.findByFechaVenta", query = "SELECT v FROM Venta_1 v WHERE v.fechaVenta = :fechaVenta")})
public class Venta_1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdVenta")
    private Integer idVenta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdVehiculo")
    private int idVehiculo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdCliente")
    private int idCliente;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Precio")
    private float precio;
    @Column(name = "FechaVenta")
    @Temporal(TemporalType.DATE)
    private Date fechaVenta;

    public Venta_1() {
    }

    public Venta_1(Integer idVenta) {
        this.idVenta = idVenta;
    }

    public Venta_1(Integer idVenta, int idVehiculo, int idCliente, float precio) {
        this.idVenta = idVenta;
        this.idVehiculo = idVehiculo;
        this.idCliente = idCliente;
        this.precio = precio;
    }

    public Integer getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(Integer idVenta) {
        this.idVenta = idVenta;
    }

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idVenta != null ? idVenta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Venta_1)) {
            return false;
        }
        Venta_1 other = (Venta_1) object;
        if ((this.idVenta == null && other.idVenta != null) || (this.idVenta != null && !this.idVenta.equals(other.idVenta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.udea.entity.Venta_1[ idVenta=" + idVenta + " ]";
    }
    
}
