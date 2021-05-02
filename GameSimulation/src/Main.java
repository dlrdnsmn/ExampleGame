import business.CampaignManager;
import business.GameManager;
import business.SalesManager;
import business.UserManager;
import business.ValidationManager;
import entities.Campaign;
import entities.Game;
import entities.User;

public class Main {

	public static void main(String[] args) {
		  UserManager userManager = new UserManager(new ValidationManager());
	        userManager.add(new User(
	                1,
	                "1111111",
	                1996,
	                "Ali",
	                "Doğan",
	                "aa09@gmail.com"

	        ));
	        userManager.update(new User(
	                2,
	                "22222222",
	                1988,
	                "Dilara",
	                "Danışman",
	                "dlr@dlr.com"
	        ));

	        GameManager gameManager = new GameManager();
	        gameManager.update(new Game(
	                1,
	                1,
	                "GTA",
	                500
	        ));

	        CampaignManager campaignManager = new CampaignManager();
	        campaignManager.delete(new Campaign(
	                1,
	                "Game Season",
	                15
	        ));

	        SalesManager saleManager = new SalesManager();
	        saleManager.sell(new User(
	                1,
	                "111111",
	                1994,
	                "Dilara",
	                "dd",
	                "dddd@gmail.com"

	        ),new Campaign(
	                2,
	                "New Campaign",
	                40
	        ),new Game(
	                2,
	                1,
	                "Counter",
	                120

	        ));


	}

}
