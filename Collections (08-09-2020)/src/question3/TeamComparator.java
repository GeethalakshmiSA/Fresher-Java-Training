package question3;

import java.util.Comparator;

public class TeamComparator implements Comparator<Team> {

	@Override
	public int compare(Team o1, Team o2) {
		if(o1.getNumberOfMatches()==o2.getNumberOfMatches())
            return 0;
        else if(o1.getNumberOfMatches() > o2.getNumberOfMatches())
            return 1;
        else
            return -1;
	}

}
