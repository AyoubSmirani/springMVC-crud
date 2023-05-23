package entity.isg.info.metier;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import entity.isg.info.dao.interface_dao;
import entity.isg.info.entity.etudiant;
import entity.isg.info.entity.produit;

public class metier_class implements metier_interface{
     private interface_dao dao;
     public void setdao(interface_dao dao) {
    	 this.dao = dao;
     }
     
     
    @Transactional 
	@Override
	public void add(etudiant e) {
		dao.add(e);
		
	}
    @Transactional 
	@Override
	public List<etudiant> getall() {
		return dao.getall();
	}
	@Transactional 
	@Override
	public etudiant get_once(int id) {
		
		return dao.get_once(id);
	}
	@Transactional 
	@Override
	public void update(etudiant e) {
	    dao.update(e);
		
	}
	@Transactional 
	@Override
	public void remove(int id) {
		dao.remove(id);
		
	}
	@Transactional 
	@Override
	public List<etudiant> chercher(String motCle) {
		
		return dao.chercher(motCle);
	}
     


}
