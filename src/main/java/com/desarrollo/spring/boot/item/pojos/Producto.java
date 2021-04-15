package com.desarrollo.spring.boot.item.pojos;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Producto {
	
	private Long id;
	private String nombreProducto;
	private Double precioProducto;
	private Date fechaIngreso;

}
