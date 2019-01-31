package jmr.sb.juhabackend.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Owner
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String firstname, lastname;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy="owner")
	@JsonIgnore
	private List<Car> cars;

	public Owner(String firstname, String lastname)
	{
		super();
		this.firstname = firstname;
		this.lastname = lastname;
	}
	
	public Owner()
	{
		this(null, null);
	}

	public long getId()
	{
		return id;
	}

	public void setId(long id)
	{
		this.id = id;
	}

	public String getFirstname()
	{
		return firstname;
	}

	public void setFirstname(String firstname)
	{
		this.firstname = firstname;
	}

	public String getLastname()
	{
		return lastname;
	}

	public void setLastname(String lastname)
	{
		this.lastname = lastname;
	}

	public List<Car> getCars()
	{
		return cars;
	}

	public void setCars(List<Car> cars)
	{
		this.cars = cars;
	}
	
}
