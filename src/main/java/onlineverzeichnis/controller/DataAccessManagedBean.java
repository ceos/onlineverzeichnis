package onlineverzeichnis.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import onlineverzeichnis.controller.entities.Studienfach;

@ManagedBean
@SessionScoped
public class DataAccessManagedBean {

	
	public DataAccessManagedBean() {
	}
	
	
	public List<Studienfach> readData(){
		Map<String, List<Studienfach>> studienfacherMap = new TreeMap<>();
		//ToDO
		//map.put("Physik",studienfaecherPhysik)
		List<Studienfach> studienfaecher = new ArrayList<>();
		
		//TODO csv lesen
		for(String spalte: spalten){
		Studienfach fach = new Studienfach();
		fach.setBezeichnung(bezeichnung);
		fach.setLvaNummer(lvaNummer);
		}
		
		studienfaecher.add(fach);
		
		
		return null;
		
	}

}
