package com.desarrollo.spring.boot.item.pojos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item {
	
	private Producto miProducto;
	private Integer cantidad;
	
	public Double getTotal() {
		return (miProducto.getPrecioProducto()*cantidad.doubleValue());
	}
	
}
