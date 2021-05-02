package business;

import entities.Game;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println("" + "Game Added " + "Id:" + game.getId() + " Name: " + game.getName() + " Price: "
				+ game.getPrice() + " TL" + "  Campaign Code: " + game.getCampaignId());
	}

	@Override
	public void delete(Game game) {
		System.out.println("" + "Game Deleted " + "Id:" + game.getId() + " Name: " + game.getName() + " Price: "
				+ game.getPrice() + " TL" + "  Campaign Code: " + game.getCampaignId());

	}

	@Override
	public void update(Game game) {
		System.out.println("" + "Game Updated " + "Id:" + game.getId() + " Name: " + game.getName() + " Price: "
				+ game.getPrice() + " TL" + "  Campaign Code: " + game.getCampaignId());

	}

}
