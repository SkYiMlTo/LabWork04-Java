import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

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

	
	
}
