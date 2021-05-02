package business;

import entities.User;

public class UserManager implements UserService {

	   ValidationService userValidationService;

	    public UserManager(ValidationService ValidationService) {
	        this.userValidationService = ValidationService;
	    }
	    
	@Override
	public void add(User user) {
		
		 if(userValidationService.validate(user)==true){
	            System.out.println("User saved "+user.getFirstName()+" "+user.getLastName());
	        }
	        else{
	            System.out.println("Failed!");
	        }
		
	}

	@Override
	public void delete(User user) {
		 System.out.println("User Deleted "+user.getFirstName()+" "+user.getLastName());
		
	}

	@Override
	public void update(User user) {
		 System.out.println("User Updated "+user.getId()+" "+user.getFirstName()+" "+user.getLastName());
		
	}

}
