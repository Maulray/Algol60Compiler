package tds;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;


public class TDS extends LinkedHashMap<String, Symbole> {

	public static int nbRegion = 0;
	public int numRegion, numImbrication;
	private TDS pere;
	private LinkedHashMap<Integer, TDS> fils;

	public TDS(int numImbrication) {
		this.numRegion = ++nbRegion;
		this.numImbrication = numImbrication;
		this.pere = null;
		this.fils = new LinkedHashMap<Integer, TDS>();
	}
	
	public TDS(int numImbrication, TDS pere) {
		super();
		this.numRegion = ++nbRegion;
		this.numImbrication = numImbrication;
		this.pere = pere;
		this.fils = new LinkedHashMap<Integer, TDS>();
	}

	public void setFils(LinkedHashMap<Integer, TDS> fils) {
		this.fils = fils;
	}


	public TDS getTDS(String cle) {
		TDS tds = this;
		if (tds.get(cle)!=null) {
			return tds;
		}
		else {
			tds = tds.getPere();
			while(tds!=null) {
				if (tds.get(cle)!=null) {
					return tds;
				}
			}
		}
		

		return null;

	}

	public TDS getMainTDS() {
		TDS pere = this;
		while(pere.getMainTDS() != null) {
			pere = pere.getMainTDS();
		}
		return pere;
	}

	public TDS getPere() {
		return pere;
	}

	public LinkedHashMap<Integer, TDS> getFils() {
		return fils;
	}

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("-----------------------------------------------------------\n");
		str.append("TDS numéro "+numRegion +"/ imbrication " +numImbrication +"\n \n");
		for (String s : this.keySet()) {
			str.append("Clé : " + s + "\n"+ this.get(s) +"\n");
		}
		for(Integer i : this.getFils().keySet()) {
			str.append("-----------------------------------------------------------\n");
			str.append("TDS numéro "+this.getFils().get(i).numRegion +"/ imbrication " +this.getFils().get(i).numImbrication +"\n \n");
			for(String s : this.getFils().get(i).keySet()) {
				str.append("Clé : " + s + "\n"+ this.getFils().get(i).get(s) +"\n");
			}
		}
		return str.toString();
	}
}
