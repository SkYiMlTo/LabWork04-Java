import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class Duplicate {

	public LinkedList<People> getPeopleListFast(LinkedList<People> peopleP) {
		LinkedList<People> lResult = new LinkedList<People>();
		People pTmp;
		
		Iterator<People> it = peopleP.iterator();
		while(it.hasNext()) {
			pTmp=it.next();
			if (!lResult.contains(pTmp)) {
				lResult.add(pTmp);
			}
		}
		return lResult;
	}
	
	public LinkedList<People> getPeopleListSlow(LinkedList<People> peopleP) {
		LinkedList<People> lResult = new LinkedList<People>();
		People pTmp;
		
		int i;
		for(i=0;i<peopleP.size();i++) {
			pTmp=peopleP.get(i);
			if (!lResult.contains(pTmp)) {
				lResult.add(pTmp);
			}
		}
		return lResult;
	}
	
	public TreeSet<People> getPersonsABR(LinkedList<People> peopleP) {
		TreeSet<People> allPeople = new TreeSet<People>();
		People pTmp;
		
		Iterator<People> it = peopleP.iterator();
		while(it.hasNext()) {
			pTmp=it.next();
			if (pTmp==null)
				continue;
			allPeople.add(pTmp);
		}
		
		return allPeople;
	}
}

/*
public class Duplicate {

	public LinkedList<People> getPeopleList(LinkedList<People> peopleP) {
		LinkedList<People> lResult = new LinkedList<People>();
		People pTmp;
		
		int i;
		for(i=0;i<peopleP.size();i++) {
			pTmp=peopleP.get(i);
			if (!lResult.contains(pTmp)) {
				lResult.add(pTmp);
			}
		}
		return lResult;
	}
}*/