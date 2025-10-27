package com.example.demo.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Stade;
import com.example.demo.service.StadeService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class StadeRESTController {
	@Autowired
	StadeService stadeService;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Stade> getAllStades() {
		return stadeService.getAllStades();
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Stade getProduitById(@PathVariable("id") Long id) {
		return stadeService.getStade(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Stade createStade(@RequestBody Stade stade) {
		return stadeService.saveStade(stade);
	}
	
	
	@RequestMapping(method = RequestMethod.PUT)
	public Stade updateProduit(@RequestBody Stade stade){
		return stadeService.updateStade(stade);
	}

	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteStde(@PathVariable("id") Long id)
	{
		stadeService.deleteStadetById(id);
	}
	
	@RequestMapping(value="/stadepay/{idPay}",method = RequestMethod.GET)
	public List<Stade> getStadeByPayId(@PathVariable("idPay") Long idPay) {
		return stadeService.findByPaysIdPay(idPay);
	}

}
