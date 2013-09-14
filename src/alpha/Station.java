package alpha;

public class Station {
	String district;
	String name;
	BusTime[][] time;
	public Station(String d, String n){
		district = d;
		name = n;
	}
	public void insertTime(String[] tokens, int col){
		for (int i = 2; i < tokens.length; i++){
			time[col][i-2] = new BusTime(tokens[i]);
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
