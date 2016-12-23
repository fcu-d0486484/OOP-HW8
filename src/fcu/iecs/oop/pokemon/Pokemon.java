package fcu.iecs.oop.pokemon;

public abstract class Pokemon implements Fightable{
	private int cp;
	private final String nickname;
	private final PokemonType Type;
	public abstract void attack();
	public Pokemon(String nickname, PokemonType type,int cp) {
		super();
		this.cp = cp;
		this.nickname = nickname;
		Type = type;
	}
	public int getCp() {
		return cp;
	}
	public void setCp(int cp) {
		this.cp = cp;
	}
	public String getName() {
		String name=this.nickname;
		return name;
	}
	public PokemonType getType() {
		PokemonType Type=this.Type;
		return Type;
	}
	
}
