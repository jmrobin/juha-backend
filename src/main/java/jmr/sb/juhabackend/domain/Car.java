package jmr.sb.juhabackend.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Car
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	private String brand, model, color, registerNumber;
	private Integer year, price;
	
	@ManyToOne
	@JoinColumn(name = "owner")
	private Owner owner;
	
	public Car(String brand, String model, String color, String registerNumber, Integer year, Integer price, Owner owner)
	{
		super();
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.registerNumber = registerNumber;
		this.year = year;
		this.price = price;
		this.owner = owner;
	}
	
	public Car()
	{
		this(null, null, null, null, null, null, null);
	}

	public Owner getOwner()
	{
		return owner;
	}

	public void setOwner(Owner owner)
	{
		this.owner = owner;
	}

	public long getId()
	{
		return id;
	}

	public void setId(long id)
	{
		this.id = id;
	}

	public String getBrand()
	{
		return brand;
	}

	public void setBrand(String brand)
	{
		this.brand = brand;
	}

	public String getModel()
	{
		return model;
	}

	public void setModel(String model)
	{
		this.model = model;
	}

	public String getColor()
	{
		return color;
	}

	public void setColor(String color)
	{
		this.color = color;
	}

	public String getRegisterNumber()
	{
		return registerNumber;
	}

	public void setRegisterNumber(String registerNumber)
	{
		this.registerNumber = registerNumber;
	}

	public Integer getYear()
	{
		return year;
	}

	public void setYear(Integer year)
	{
		this.year = year;
	}

	public Integer getPrice()
	{
		return price;
	}

	public void setPrice(Integer price)
	{
		this.price = price;
	}
}
