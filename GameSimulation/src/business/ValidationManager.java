package business;

import entities.User;

public class ValidationManager implements ValidationService {


    @Override
    public Boolean validate (User user) {
    	
        if(user.getIdentityNumber().length()==11 && user.getBirthYear()<2004){
            return true;
        }
        return  false;


    }
}