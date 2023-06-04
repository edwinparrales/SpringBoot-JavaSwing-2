/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.demo.modelos;

import java.io.Serializable;
import java.math.BigDecimal;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

/**
 *
 * @author usuario
 */
@Entity
@Table(name = "productos")
@NamedQueries({
    @NamedQuery(name = "Producto.findAll", query = "SELECT p FROM Producto p"),
    @NamedQuery(name = "Producto.findByIdProducto", query = "SELECT p FROM Producto p WHERE p.idProducto = :idProducto"),
    @NamedQuery(name = "Producto.findByCantidad", query = "SELECT p FROM Producto p WHERE p.cantidad = :cantidad"),
    @NamedQuery(name = "Producto.findByCodigoBarras", query = "SELECT p FROM Producto p WHERE p.codigoBarras = :codigoBarras"),
    @NamedQuery(name = "Producto.findByCodigoInterno", query = "SELECT p FROM Producto p WHERE p.codigoInterno = :codigoInterno"),
    @NamedQuery(name = "Producto.findByDescripcion", query = "SELECT p FROM Producto p WHERE p.descripcion = :descripcion"),
    @NamedQuery(name = "Producto.findByMarca", query = "SELECT p FROM Producto p WHERE p.marca = :marca"),
    @NamedQuery(name = "Producto.findByPorcentajeUtilidad", query = "SELECT p FROM Producto p WHERE p.porcentajeUtilidad = :porcentajeUtilidad"),
    @NamedQuery(name = "Producto.findByTipoUnidad", query = "SELECT p FROM Producto p WHERE p.tipoUnidad = :tipoUnidad"),
    @NamedQuery(name = "Producto.findByUrlImg", query = "SELECT p FROM Producto p WHERE p.urlImg = :urlImg"),
    @NamedQuery(name = "Producto.findByValor", query = "SELECT p FROM Producto p WHERE p.valor = :valor")})
public class Producto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_producto")
    private Long idProducto;
    @Column(name = "cantidad")
    private Integer cantidad;
    @Basic(optional = false)
    @Column(name = "codigo_barras")
    private String codigoBarras;
    @Basic(optional = false)
    @Column(name = "codigo_interno")
    private String codigoInterno;
    @Basic(optional = false)
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "marca")
    private String marca;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "porcentaje_utilidad")
    private BigDecimal porcentajeUtilidad;
    @Basic(optional = false)
    @Column(name = "tipo_unidad")
    private String tipoUnidad;
    @Column(name = "url_img")
    private String urlImg;
    @Column(name = "valor")
    private BigDecimal valor;
    @JoinColumn(name = "categoria", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Categoria categoria;

    public Producto() {
    }

    public Producto(Long idProducto) {
        this.idProducto = idProducto;
    }

    public Producto(Long idProducto, String codigoBarras, String codigoInterno, String descripcion, String tipoUnidad) {
        this.idProducto = idProducto;
        this.codigoBarras = codigoBarras;
        this.codigoInterno = codigoInterno;
        this.descripcion = descripcion;
        this.tipoUnidad = tipoUnidad;
    }

    public Long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Long idProducto) {
        this.idProducto = idProducto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public String getCodigoInterno() {
        return codigoInterno;
    }

    public void setCodigoInterno(String codigoInterno) {
        this.codigoInterno = codigoInterno;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public BigDecimal getPorcentajeUtilidad() {
        return porcentajeUtilidad;
    }

    public void setPorcentajeUtilidad(BigDecimal porcentajeUtilidad) {
        this.porcentajeUtilidad = porcentajeUtilidad;
    }

    public String getTipoUnidad() {
        return tipoUnidad;
    }

    public void setTipoUnidad(String tipoUnidad) {
        this.tipoUnidad = tipoUnidad;
    }

    public String getUrlImg() {
        return urlImg;
    }

    public void setUrlImg(String urlImg) {
        this.urlImg = urlImg;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProducto != null ? idProducto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Producto)) {
            return false;
        }
        Producto other = (Producto) object;
        if ((this.idProducto == null && other.idProducto != null) || (this.idProducto != null && !this.idProducto.equals(other.idProducto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.demo.modelos.Producto[ idProducto=" + idProducto + " ]";
    }
    
}
