
public class Marathon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declare array of names type string
		String[] names = {"Elena", "Thomas", "Hamilton", "Suzie", "Phi", "Matt",
				"Alex", "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate"};
	
		//declare array of times type int
		int[] times = {341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412,
		393, 299, 343, 317, 265};
		
		int fastestRunner = bestRunner(times);
		System.out.println(names[fastestRunner] + ": " + times[fastestRunner]);
		
		int secondFastestRunner = secondBestRunner(times);
		System.out.println(names[secondFastestRunner] + ": " + times[secondFastestRunner]);
		
	}
	
	//declare method type int to find best runner and return int index value of the bestrunner in the array
	public static int bestRunner(int[] array) {
		
		//check if array is 0 or 1 of length
		if (array.length == 0) {
			return 0;
		}
		else if(array.length==1) {
			return array[0];
		}
		else {
			
			//int variable to store the index of the lowest value
			int index = 0; 
			//  int variable to store lowest time value
			int valuex = array[0];
			
			for(int i = 1; i< array.length; i++) {
				if (valuex <= array[i]) {
					continue;
				}
				else {
					valuex = array[i];
					index = i;
				}
			}
			return index;
		}
		
	}
	
	public static int secondBestRunner(int[] array) {
		
		int lowestTime = bestRunner(array);
		
		lowestTime = array[lowestTime];
		
		//check if array is 0 or 1 of length
		if (array.length == 0) {
			return 0;
		}
		else if(array.length==1) {
			return array[0];
		}
		else {
			//int variable to store the index of the second lowest value
			int index = 0; 
			//  int variable to store second lowest time value
			int valuex = array[0];
			
			for(int i = 1; i< array.length; i++) {
				//check if lowest time value is less than the array value i or if the array values i is the same as the lowestTime value we ignore it
				if (valuex <= array[i] || array[i] == lowestTime) {
					continue;
				}
				//set lowest time value to the number that is less than it and update index value of lowest time value 
				else {
					valuex = array[i];
					index = i;
				}
			}
			return index;
		}

	}

}




// better names for methods are getMinIndex and getSecondMinIndex
