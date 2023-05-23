package entity.isg.info.dao;
import java.util.*;

import entity.isg.info.entity.etudiant;
import entity.isg.info.entity.produit;
public interface interface_dao {
public void add(etudiant e);
public List<etudiant> getall();
public etudiant get_once(int id);
public void update(etudiant e);
public void remove(int id);
public List<etudiant> chercher(String motCle);
}
