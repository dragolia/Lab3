package pokerBase;

import java.util.ArrayList;
import java.util.UUID;

public class Game {
	private UUID GameId; 
	private UUID TableId;
	private ArrayList <Player> GamePlayer = new ArrayList<Player>();
	public Game(UUID gameId, UUID tableId, ArrayList<Player> gamePlayer) {
		super();
		GameId = gameId;
		TableId = tableId;
		GamePlayer = gamePlayer;
	}
	public UUID getGameId() {
		return GameId;
	}
	public void setGameId(UUID gameId) {
		GameId = gameId;
	}
	public UUID getTableId() {
		return TableId;
	}
	public void setTableId(UUID tableId) {
		TableId = tableId;
	}
	public ArrayList<Player> getGamePlayer() {
		return GamePlayer;
	}
	public void setGamePlayer(ArrayList<Player> gamePlayer) {
		GamePlayer = gamePlayer;
	}
	public ArrayList<Player> AddPlayerToGame(Table t, Player p){
		GamePlayer.add(p);
		return GamePlayer;
	}

}
