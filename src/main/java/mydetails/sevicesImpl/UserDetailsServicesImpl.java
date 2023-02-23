package mydetails.sevicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import mydetails.model.UserDetails;
import mydetails.services.UserDetailsServices;

@Service
public class UserDetailsServicesImpl implements UserDetailsServices
 {

	@Autowired(required=true)
	CrudRepository<UserDetails, Integer>  us;
	   


	public void save(UserDetails userDetails) {
		us.save(userDetails);
		
	}

}
