package org.ciberfarma.controller;


import org.ciberfarma.model.Producto;
import org.ciberfarma.repository.IProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProyectoController {
	
	
	@GetMapping("/greeting")
	public String saludos(@RequestParam(name="txtNombre", required=false, defaultValue="World") String name, Model model) {
			
		model.addAttribute("name", name);
		
		return "greeting"; 
	}
	
	
	
	
	
	
	
	@GetMapping("/cargar")
	public String cargarProd( Model model) {			
		model.addAttribute("producto", new Producto());
		
		return "crudproducto"; 
	}
	
	
	
	
	@Autowired
	private IProductoRepository repo;
	
	
	@PostMapping("/grabar")
	public String guardarProd(@ModelAttribute Producto producto) {			
		System.out.println(producto);
		repo.save(producto);   // funciona como  un merge , si  ya existe el codigo  lo actuliaza   y   si  no existe  lo agrega 
		return "crudproducto"; 
	}
	

	
	

	@GetMapping("/listar")
	public String listadoProd( Model model) {			
		model.addAttribute("lstProductos", repo.findAll());
		
		return "listado"; 
	}
	
		
	
	
	@PostMapping("/editar")
	public String buscarProd(@ModelAttribute Producto p , Model model) {			
		System.out.println(p);
	model.addAttribute("producto" , repo.findById(p.getCodigo()));
		return "crudproducto"; 
	}
	
	
	
	
	
	
	

}
