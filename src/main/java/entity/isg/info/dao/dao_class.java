package entity.isg.info.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import entity.isg.info.entity.etudiant;
import entity.isg.info.entity.produit;

public class dao_class implements interface_dao{
	@PersistenceContext
private EntityManager entity;



@Override
public void add(etudiant e) {
	entity.persist(e);
	
}

@Override
public List<etudiant> getall() {
	Query req = entity.createQuery("select e from etudiant e");
	return req.getResultList();
	
}

@Override
public etudiant get_once(int id) {
	etudiant et = entity.find(etudiant.class, id);
	return et;
}

@Override
public void update(etudiant e) {
	entity.merge(e);
	
}

@Override
public void remove(int id) {
	etudiant e =  entity.find(etudiant.class, id);
	entity.remove(e);
	
}

@Override
public List<etudiant> chercher(String motCle) {
	Query req2 = entity.createQuery("select e from etudiant e where e.nom like :x");
	req2.setParameter("x","%"+motCle+"%");
	return req2.getResultList();
	
}



}
