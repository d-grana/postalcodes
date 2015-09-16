package practica2;



import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import practica2.model.Address;


@RestController
public class RestPostalCodesController {
	
	@Autowired
    private AddressRepository repository;

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String getResult(@RequestBody Address address) {
    	Random r = new Random();
    	int n = r.nextInt(100000);
    	String postalCode = Integer.toString(n);

    	repository.save(address);
    	return postalCode;

    }
    
    @RequestMapping(value = "/addresses", method = RequestMethod.GET)
    public @ResponseBody List<Address> getCompanyTexts() {
    	return repository.findAll();
    }
    
    

}
