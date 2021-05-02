package entities;

public class Game {
	    private int id;
	    private int campaignId;
	    private String name;
	    private double price;
	   

		public Game() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Game(int id, int campaignId, String name, double price) {
			super();
			this.id = id;
			this.campaignId = campaignId;
			this.name = name;
			this.price = price;
		}
		
		 
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public int getCampaignId() {
			return campaignId;
		}

		public void setCampaignId(int campaignId) {
			this.campaignId = campaignId;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

}
