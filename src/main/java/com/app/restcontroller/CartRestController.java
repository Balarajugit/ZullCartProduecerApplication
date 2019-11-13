package com.app.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.consumer.ItemConsumer;
import com.app.model.Item;

@RestController
public class CartRestController {
	@Autowired
	private ItemConsumer client;
	
	@PostMapping("/save")
	public String saveItems(@RequestBody Item i) {
		return client.saveItems(i);
	}
	@GetMapping("/one")
	public Item getById(@RequestParam Integer id) {
		return client.getById(id);
	}
	@GetMapping("/all")
	public List<Item> getAll(){
		return client.getAll();
	}
	@DeleteMapping("/delete")
	public String deleteById(@RequestParam Integer id) {
		return client.deleteById(id);
	}
	@PutMapping("/update")
	public String update(@RequestBody Item i) {
		return client.update(i);
	}

}
