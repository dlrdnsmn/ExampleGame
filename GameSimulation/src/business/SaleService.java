package business;

import entities.Campaign;
import entities.Game;
import entities.User;

public interface SaleService {
	   void sell(User user, Campaign campaign, Game game);
}
