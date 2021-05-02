package business;

import entities.Campaign;
import entities.Game;
import entities.User;

public class SalesManager implements SaleService {

	@Override
	public void sell(User user, Campaign campaign, Game game) {
		 System.out.println(game.getName()+" Game "+user.getFirstName()+" User "+campaign.getName()+" Campaign"+" %"+campaign.getDiscount()+" Selling");
    }

}
