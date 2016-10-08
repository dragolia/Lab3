package pokerBase;

import java.util.UUID;

public class Player {
	private UUID PlayerId;
	private String PlayerName;
	private int PlayerPosition;
	
	public Player(UUID playerId, String playerName, int playerPosition) {
		super();
		PlayerId = playerId;
		PlayerName = playerName;
		PlayerPosition = playerPosition;
	}
	public UUID getPlayerId() {
		return PlayerId;
	}
	public void setPlayerId(UUID playerId) {
		PlayerId = playerId;
	}
	public String getPlayerName() {
		return PlayerName;
	}
	public void setPlayerName(String playerName) {
		PlayerName = playerName;
	}
	public int getPlayerPosition() {
		return PlayerPosition;
	}
	public void setPlayerPosition(int playerPosition) {
		PlayerPosition = playerPosition;
	}
	
	

}
