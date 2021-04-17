package com.desarrollo.spring.boot.item.servicios;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.desarrollo.spring.boot.item.clientes.ProductoClienteRest;
import com.desarrollo.spring.boot.item.pojos.Item;

@Service
@Primary
public class ItemProductoServiceFeign implements IItemProductoService{

	@Autowired
	private ProductoClienteRest clienteFeign;
	
	@Override
	public List<Item> obtenerItemProductos() {
		return clienteFeign.listar().stream().map(p -> new Item(p, 1)).collect(Collectors.toList());
	}

	@Override
	public Item obtenerItemId(Long id, Integer cantidad) {
		return new Item(clienteFeign.obtenerProducto(id), cantidad);
	}

}
