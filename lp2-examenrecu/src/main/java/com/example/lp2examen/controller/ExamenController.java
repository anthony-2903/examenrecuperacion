package com.example.lp2examen.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lp2examen.service.examenService;


@RestController
@RequestMapping("/api/examenrecu")
@CrossOrigin({"*"})
public class ExamenController {

	@Autowired
	private examenService examenService;
	
	@GetMapping("/cant_reg")
	public List<Map<String, Object>> readCantClienReg(){
		return examenService.readCantClienReg();
	};
	
	@GetMapping("/order_terr")
	public List<Map<String, Object>> readCantOrdTerr(){
		return examenService.readCantOrdTerr();
	};
	

	
}
