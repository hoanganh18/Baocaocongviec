package Tranning;

import java.util.Comparator;

public class Compare implements Comparator<Bai1> {
	public int compare(Bai1 st1, Bai1 st2) {
		int id1 = st1.getId();
		int id2 = st2.getId();
		if (id1 > id2) {
			return 1;
		} else if (id1 == id2) {
			return 0;
		} else {
			return -1;
		}
	}
}

