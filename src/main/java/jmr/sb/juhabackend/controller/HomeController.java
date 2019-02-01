package jmr.sb.juhabackend.controller;

import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import jmr.sb.juhabackend.domain.Car;
import jmr.sb.juhabackend.domain.Owner;
import jmr.sb.juhabackend.repository.CarRepository;
import jmr.sb.juhabackend.repository.OwnerRepository;

@RestController
public class HomeController
{
	@Autowired
	private CarRepository carRepository;
	
	@Autowired
	private OwnerRepository ownerRepository;
	
	@GetMapping("/hello")
	public String hello()
	{
		return "hello from juha-backend";
	}
	
	@GetMapping("/cars")
	public Iterable<Car> getCars()
	{
		return carRepository.findAll();
	}
	
	@GetMapping("/owners")
	public Iterable<Owner> getOwners()
	{
		return ownerRepository.findAll();
	}
	
	@GetMapping("/encode/{key}")
	public String encode(@PathVariable String key)
	{
		return Base64.getEncoder().encodeToString(key.getBytes());
	}
	
	@GetMapping("/decode/{key}")
	public String decode(@PathVariable String key)
	{
		return new String(Base64.getDecoder().decode(key));
	}
}
