package pokerBase;

import java.util.ArrayList;
import java.util.UUID;

public class Table {
	private UUID TableId;
	private ArrayList <Player> TablePlayers = new ArrayList<Player>();
	public Table(UUID tableId, ArrayList<Player> tablePlayers) {
		super();
		TableId = tableId;
		TablePlayers = tablePlayers;
	}
	public UUID getTableId() {
		return TableId;
	}
	public void setTableId(UUID tableId) {
		TableId = tableId;
	}
	public ArrayList<Player> getGamePlayers() {
		return TablePlayers;
	}
	public void setGamePlayers(ArrayList<Player> tablePlayers) {
		TablePlayers = tablePlayers;
	}
	public ArrayList<Player> AddPlayerToTable(Player p){
		TablePlayers.add(p) ;
		return TablePlayers;
	}
	
	

}
