package com.thiago.ecommerce.controler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.thiago.ecommerce.modal.Pedido;

@RestController
@RequestMapping("/pedido")
public class PedidoControler {

	@PostMapping("/cadastrar")
	public ResponseEntity cadastrar(@RequestBody Pedido pedido) {
		try{
			return new ResponseEntity(HttpStatus.CREATED);
		}catch (Exception e) {
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}
	
	@PatchMapping("/editar")
	public ResponseEntity editar(@RequestBody Pedido pedido) {
		try{
			return new ResponseEntity(HttpStatus.OK);
		}catch (Exception e) {
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}
	
	@DeleteMapping("/deletar/{id}")
	public ResponseEntity delete(@RequestParam("id") String id) {
		try{
			return new ResponseEntity(HttpStatus.OK);
		}catch (Exception e) {
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}
	
	@GetMapping("/list/{id}")
	public ResponseEntity listById(@RequestParam("id") String id) {
		try{
			return new ResponseEntity(HttpStatus.OK);
		}catch (Exception e) {
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}
	
	@GetMapping("/listall")
	public ResponseEntity listAll(@RequestParam("id") String id) {
		try{
			return new ResponseEntity(HttpStatus.OK);
		}catch (Exception e) {
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}
}
