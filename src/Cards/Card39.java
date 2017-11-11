package Cards;
import Model.Card;
import Model.Player;
public class Card39 extends Card {
	
	public Card39() {
		super("Goodbye, Professor", "src/Images/cardm39.png",
				new String[] { "Room of Retirement" });
	}

	@Override
	public String pass(Player p) {
		// TODO Auto-generated method stub
		p.setQualityPoints(p.getQualityPoints() + 10);
		return " and 3 Quality Points";
	}

	@Override
	public void fail(Player p) {
		p.remove(p.getAllCardName().get(0));
	}

	@Override
	public boolean requirement(Player p) {
		return (p.getIntegrity() >= 6)&&(p.getLearning() >= 6)&&(p.getCraft() >= 6)&& location.contains(p.getLocation());
	}
	
}
