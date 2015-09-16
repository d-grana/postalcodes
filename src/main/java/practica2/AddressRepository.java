package practica2;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import practica2.model.Address;


public interface AddressRepository extends JpaRepository<Address, Long> {
	
	List<Address> findByStreet(String street);
	List<Address> findByCity(String city);
	List<Address> findByCountry(String country);

}
