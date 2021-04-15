package com.desarrollo.spring.boot.item.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.desarrollo.spring.boot.item.pojos.Item;
import com.desarrollo.spring.boot.item.servicios.IItemProductoService;

@RestController
public class ItemControlador {
	
	@Autowired
	private IItemProductoService itemProductoService;
	
	@GetMapping(value="/items")
	public List<Item> misItemProductos(){
		return itemProductoService.obtenerItemProductos();
	}
	
	@GetMapping(value="/items/{id}/cantidad/{cantidad}")
	public Item miItemProducto(@PathVariable Long id, @PathVariable Integer cantidad) {		
		return itemProductoService.obtenerItemId(id, cantidad);
	}

}
