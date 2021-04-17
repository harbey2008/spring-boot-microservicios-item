package com.desarrollo.spring.boot.item.servicios;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.desarrollo.spring.boot.item.pojos.Item;
import com.desarrollo.spring.boot.item.pojos.Producto;

@Service
public class ItemServicioImpl implements IItemProductoService{

	@Autowired
	private RestTemplate clienteRest;
	
	@Override
	public List<Item> obtenerItemProductos() {
		//List<Producto> misProductos = Arrays.asList(clienteRest.getForObject("http://localhost:8081/micro-servicio-producto/productos", Producto[].class));
		List<Producto> misProductos = Arrays.asList(clienteRest.getForObject("http://localhost:8081/micro-servicio-producto/micro-servicio-producto/productos", Producto[].class));
		
		return misProductos.stream().map(p -> new Item(p, 1)).collect(
				Collectors.toList());
	}

	@Override
	public Item obtenerItemId(Long id, Integer cantidad) {
		Map<String, String> pathVariables = new HashMap<String, String>();
		pathVariables.put("id", id.toString());
		
		Producto miProducto = clienteRest.getForObject("http://localhost:8081/micro-servicio-producto/productos/{id}", Producto.class, pathVariables);
		//Producto miProducto = clienteRest.getForObject("http://micro-servicio-producto/productos/{id}", Producto.class, pathVariables);
		
		return new Item(miProducto, cantidad);
	}

}
