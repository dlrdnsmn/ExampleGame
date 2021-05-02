package business;

import entities.Campaign;

public class CampaignManager implements CampaignS {

	@Override
	public void add(Campaign campaign) {
		System.out.println("Campaign Added. Id:" + campaign.getId() + "Kampanya Adý" + campaign.getName()
				+ " Ýndirim Yüzdesi: %" + campaign.getDiscount());

	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Campaign Updated. Id:" + campaign.getId() + "Kampanya Adý" + campaign.getName()
				+ " Ýndirim Yüzdesi: %" + campaign.getDiscount());

	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Campaign Deleted. Id:" + campaign.getId() + "Kampanya Adý" + campaign.getName()
				+ " Ýndirim Yüzdesi: %" + campaign.getDiscount());

	}

}
