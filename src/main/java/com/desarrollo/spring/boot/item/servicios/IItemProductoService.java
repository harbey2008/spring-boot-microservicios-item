package com.desarrollo.spring.boot.item.servicios;

import java.util.List;

import com.desarrollo.spring.boot.item.pojos.Item;

public interface IItemProductoService {
	
	List<Item> obtenerItemProductos();
	Item obtenerItemId(Long id, Integer cantidad);
	

}
