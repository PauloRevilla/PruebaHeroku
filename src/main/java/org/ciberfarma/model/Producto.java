package org.ciberfarma.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="tb_productos")
public class Producto {
	
	
	
	@Id
	@Column(name="id_prod")
	private String codigo;

	

	@Column(name="des_prod")
	private String descripcion;

	

	@Column(name="stk_prod")
	private int stock;

	

	@Column(name="pre_prod")
	private double precio;

	

	@Column(name="idcategoria")
	private int idcategoria;

	

	@Column(name="est_prod")
	private int estado;	

	

	@Column(name="idprovedor")
	private int idprovedor;
	
	
	
	
	
	//
	
	
	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", descripcion=" + descripcion + ", stock=" + stock + ", precio=" + precio
				+ ", idcategoria=" + idcategoria + ", estado=" + estado + ", idprovedor=" + idprovedor + "]";
	}
	
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getIdcategoria() {
		return idcategoria;
	}
	public void setIdcategoria(int idcategoria) {
		this.idcategoria = idcategoria;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	public int getIdprovedor() {
		return idprovedor;
	}
	public void setIdprovedor(int idprovedor) {
		this.idprovedor = idprovedor;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
