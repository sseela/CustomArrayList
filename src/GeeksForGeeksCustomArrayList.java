import java.util.ArrayList;

public class GeeksForGeeksCustomArrayList {
	
	static class Data {
		private String name;
		private int marks;
		private int roll;
		
		public Data(String name, int marks, int roll) {
			this.name = name;
			this.marks = marks;
			this.roll = roll;
		}
	}
	
	public static void addData(String[] names, int[] marks, int[] roll) {
		ArrayList<Data> list = new ArrayList<>();
		for(int i=0; i<names.length; i++) {
			list.add(new Data(names[i], marks[i], roll[i]));
		}
		for(int i=0; i<names.length; i++) {
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		String[] names = {"san", "nar"};
		int[] marks = {23, 43};
		int[] roll = {32342, 23425};
		addData(names, marks, roll);
	}
}
