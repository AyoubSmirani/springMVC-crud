package entity.isg.info.catalogue;

import java.util.List;

import javax.persistence.PersistenceContext;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import entity.isg.info.entity.etudiant;
import entity.isg.info.entity.produit;
import entity.isg.info.metier.metier_interface;


@Controller
public class catalogue {
@Autowired
private metier_interface metier; 
private boolean test=false;
@RequestMapping(value="/index2")
public  String index(@RequestParam(value="motCle",defaultValue="")String motCle,Model model) {
	model.addAttribute("etudiant",new etudiant());
	model.addAttribute("etudiants",metier.chercher(motCle));
	return "etudiants";
	
}

@RequestMapping(value="/save2")
public  String save(@Valid etudiant e,BindingResult result,Model model) {
if(result.hasErrors()) {
	return "etudiants";
}

if(e.getId()==null) {metier.add(e);}
//if(this.test==true) {
	//metier.add(e);
	//System.out.println(this.test);
	//this.test=false;
//}
else 
metier.update(e);	
model.addAttribute("etudiant",new etudiant());
model.addAttribute("etudiants",metier.getall());
return "etudiants";
}



@RequestMapping(value="/delete2")
public String delete(@RequestParam(value="id")int id,	Model model) {
	metier.remove(id);
	model.addAttribute("etudiant",new etudiant());
	model.addAttribute("etudiants",metier.getall());
	return "etudiants";
}


@RequestMapping(value="/edit2/{id}")
public String edit(@PathVariable(value="id")int id,Model model) {
	this.test = true;
	etudiant e = metier.get_once(id);
	model.addAttribute("etudiant",e);
	model.addAttribute("etudiants",metier.getall());
	return "etudiants";
}

@RequestMapping(value="/editProduit/saveProduit")
public String editsaveProduit(@Valid etudiant e, BindingResult bindingResult, Model model) {
	if(bindingResult.hasErrors()) {
		return "produits";
	}
 if(e.getId()==null)
{
		metier.add(e);
	} else metier.update(e);
model.addAttribute("etudiant", new etudiant());
model.addAttribute("etudiants", metier.getall());
	return "produits";
}
@RequestMapping(value="/list2/{motcle}")
@ResponseBody
public List<etudiant> list(@PathVariable(value="motcle")String motcle) {
	return metier.chercher(motcle);
}


@RequestMapping(value="/list/{motcle}")
public String list(@PathVariable(value="motcle")String motcle,Model model) {	
	model.addAttribute("etudiant",new etudiant());
	model.addAttribute("etudiants",metier.chercher(motcle));
	return "etudiants";
			
}

	
}
