package pokemon;
import java.util.Random;

public class Pokemon0 {
	private String nom;
	private int niveau;
	private int hp;
	private int atk;
	private static java.util.Random random = new Random();
	
	public Pokemon0(String nom) {
		this.nom = nom;
		this.niveau = random.nextInt(1,11);
		this.hp = this.niveau * 2;
		this.atk = (this.niveau / 2) + 1;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public int getNiveau() {
		return this.niveau;
	}
	
	public int getHp() {
		return this.hp;
	}
	
	public int getAtk() {
		return this.atk;
	}
	
	public boolean isKO() {
		if(this.hp == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void soigner() {
		this.hp = this.niveau * 2;
	}
	
	public void attaquer(Pokemon0 p) {
		p.hp -= this.atk;
	}
	
	public String toString() {
		return "[" + this.getNom()+ "]" + ": Je m'appelle" + this.nom + "!" + "\nJe suis de niveau" + this.niveau + "\nJ'ai" + this.hp + "points de vie" + "\nmon attaque de base est de" + this.atk;
	}
	
	public void log(String msg) {
		System.out.println(msg);
	}
}
