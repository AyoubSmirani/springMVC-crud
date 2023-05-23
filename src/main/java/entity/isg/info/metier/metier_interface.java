package entity.isg.info.metier;

import java.util.List;

import entity.isg.info.entity.etudiant;
import entity.isg.info.entity.produit;

public interface metier_interface {
	public void add(etudiant e);
	public List<etudiant> getall();
	public etudiant get_once(int id);
	public void update(etudiant e);
	public void remove(int id);
	public List<etudiant> chercher(String motCle);
}
