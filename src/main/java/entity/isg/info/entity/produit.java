package entity.isg.info.entity;
import javax.persistence.*;
import java.io.Serializable;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
//@Entity
public class produit implements Serializable{
//@Id
//@GeneratedValue(strategy=GenerationType.IDENTITY)
private long id;
//@NotEmpty
//@Size(min=3,max=60)
private String nom;
private double prix;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public double getPrix() {
	return prix;
}
public void setPrix(double prix) {
	this.prix = prix;
}
public produit(long id, String nom, double prix) {
	this.id = id;
	this.nom = nom;
	this.prix = prix;
}
public produit() {
	this.id = id;
	this.nom = nom;
	this.prix = prix;
}


}
