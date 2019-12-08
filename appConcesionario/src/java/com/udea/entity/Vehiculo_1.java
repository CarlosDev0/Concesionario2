/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author USER
 */
@Entity
@Table(name = "vehiculo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vehiculo_1.findAll", query = "SELECT v FROM Vehiculo_1 v")
    , @NamedQuery(name = "Vehiculo_1.findByIdVehiculo", query = "SELECT v FROM Vehiculo_1 v WHERE v.idVehiculo = :idVehiculo")
    , @NamedQuery(name = "Vehiculo_1.findByMarca", query = "SELECT v FROM Vehiculo_1 v WHERE v.marca = :marca")
    , @NamedQuery(name = "Vehiculo_1.findByReferencia", query = "SELECT v FROM Vehiculo_1 v WHERE v.referencia = :referencia")
    , @NamedQuery(name = "Vehiculo_1.findByModelo", query = "SELECT v FROM Vehiculo_1 v WHERE v.modelo = :modelo")})
public class Vehiculo_1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdVehiculo")
    private Integer idVehiculo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Marca")
    private String marca;
    @Size(max = 50)
    @Column(name = "Referencia")
    private String referencia;
    @Size(max = 50)
    @Column(name = "Modelo")
    private String modelo;

    public Vehiculo_1() {
    }

    public Vehiculo_1(Integer idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public Vehiculo_1(Integer idVehiculo, String marca) {
        this.idVehiculo = idVehiculo;
        this.marca = marca;
    }

    public Integer getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(Integer idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idVehiculo != null ? idVehiculo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vehiculo_1)) {
            return false;
        }
        Vehiculo_1 other = (Vehiculo_1) object;
        if ((this.idVehiculo == null && other.idVehiculo != null) || (this.idVehiculo != null && !this.idVehiculo.equals(other.idVehiculo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.udea.entity.Vehiculo_1[ idVehiculo=" + idVehiculo + " ]";
    }
    
}
