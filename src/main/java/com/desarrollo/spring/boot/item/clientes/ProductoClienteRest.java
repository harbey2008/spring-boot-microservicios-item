package com.desarrollo.spring.boot.item.clientes;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.desarrollo.spring.boot.item.pojos.Producto;

@FeignClient(name="micro-servicio-producto", url="localhost:8081/micro-servicio-producto/")
public interface ProductoClienteRest {

	@GetMapping(value="/productos")
	public List<Producto> listar();
	
	@GetMapping(value="/productos/{id}")
	public Producto obtenerProducto(@PathVariable Long id);
	
}
