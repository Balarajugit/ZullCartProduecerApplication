package com.app.consumer;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.model.Item;

@FeignClient("Item-App")
public interface ItemConsumer {
	
	@PostMapping("/save")
	public String saveItems(@RequestBody Item i);
	
	@GetMapping("/one")
	public Item getById(@RequestParam Integer id);
	
	@GetMapping("/all")
	public List<Item> getAll();
	
	@DeleteMapping("/delete")
	public String deleteById(@RequestParam Integer id);
	
	@PutMapping("/update")
	public String update(@RequestBody Item i);

}
