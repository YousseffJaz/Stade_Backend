package com.example.demo.restcontrollers;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@RequestMapping(path="all",method =RequestMethod.GET)
	public List<Stade> getAllStades() {
		return stadeService.getAllStades();
	 } 		
	
	@RequestMapping(value="/getbyid/{id}",method = RequestMethod.GET)
	//@GetMapping("/getbyid/{id}")
	public Stade getStadeById(@PathVariable("id") Long id) {	
		return stadeService.getStade(id);
    }
	
	@RequestMapping(value="/addstade",method = RequestMethod.POST)
	//@PostMapping("/addprod")
	public Stade createStade(@RequestBody Stade stade) {
		return stadeService.saveStade(stade);
	}

	@RequestMapping(value="/updatestade",method = RequestMethod.PUT)
	//@PutMapping("/updateprod")
	public Stade updateStade(@RequestBody Stade stade) {
		return stadeService.updateStade(stade);
	}

	@RequestMapping(value="/delstade/{id}",method = RequestMethod.DELETE)
	//@DeleteMapping("/delprod/{id}")
	public void deleteStade(@PathVariable("id") Long id)
	{
		stadeService.deleteStadetById(id);
	}
	
	@RequestMapping(value="/stadespay/{idPay}",method = RequestMethod.GET)
	public List<Stade> getStadesByCatId(@PathVariable("idPay") Long idPay) {
		return stadeService.findByPaysIdPay(idPay);
	 }


}