package subwayproject;

public class Money {
	private boolean isSize;
	private int total_money;
		
		public void size(int size) {
			if (size == 1) {
				isSize = true;
			}
			else if (size ==2) {
				isSize = false;
			}
		}
	
		int[] classic15 = {5100, 5100, 4900, 4700, 4300, 4800};
		int[] fresh15 = {5900, 5900, 5900, 5600, 5100, 3900};
		int[] premium15 = {6300, 6300, 5900, 5900, 5900, 5600, 5600, 5600};
		
		int[] classic30 = {8900, 8900, 8700, 8400, 8000, 8500};
		int[] fresh30 = {9900, 9900, 9900, 9500, 8900, 7400};
		int[] premium30 = {10300, 10300, 9900, 9900, 9900, 9500, 9500, 9500};

}
