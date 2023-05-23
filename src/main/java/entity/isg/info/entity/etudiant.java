package entity.isg.info.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
@Entity
public class etudiant implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@NotEmpty
	@Size(min=3,max=60)
    private String prenom;
	@NotEmpty
	@Size(min=5,max=60)
	private String nom; 

	@NotEmpty
	private String classe;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getClasse() {
		return classe;
	}
	public void setClasse(String classe) {
		this.classe = classe;
	}
	public etudiant(int id, String nom, String prenom, String classe) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.classe = classe;
	}
	public etudiant() {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.classe = classe;
	}

}
