import java.util.Comparator;


/**
 * 
 * @author Kevin Haines
 */
public class ReverseComparator <T extends Comparable<T>> implements Comparator<Integer>{
	@Override
	public int compare(Integer elem1, Integer elem2) {
		return -(elem1.compareTo(elem2));
	}
}
