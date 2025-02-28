import java.util.ArrayList;
import java.util.HashMap;;

public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static ArrayList<String> swap(ArrayList<String> list, int num, int num2) {
		if (num >= 0 && num2 >= 0 && num < list.size() && num2 < list.size()) {
			String tempString = list.get(num);
			list.set(num, list.get(num2));
			list.set(num2, tempString);
		}
		return list;
	}

	public static ArrayList<Double> createArrayList(double[] doubleArray) {
		ArrayList<Double> doublesList = new ArrayList<>();

		for (int i = 0; i < doubleArray.length; i++) {
			doublesList.add(doubleArray[i]);
		}
		return doublesList;
	}

	public static HashMap<String, Integer> combineParallelArrays(String[] names, int[] ages) {
		HashMap<String, Integer> map = new HashMap<>();

		for (int i = 0; i < names.length; i++) {
			map.put(names[i], ages[i]);
		}

		return map;
	}

	public static HashMap<String, Integer> increaseAge(HashMap<String, Integer> map, String name) {
		if (map.containsKey(name)) {
			map.put(name, map.get(name) + 1);
		}

		return map;
	}
}
