public class ArrayLoops{
	public static void main(String[] args) {
		int[] values = {45,55,87,35,90,54,87,71,98,85};

		for (int i =0; i<9; i++){
			System.out.println(values[i]);                          //left to right

		}
		System.out.println("------------------------------");
		for (int i =9; i>=0; i--){
			System.out.println(values[i]);                         //right to left
		}
		System.out.println("-------------------------------");
		for (int i =5; i>=0; i--){
			System.out.println(values[i]);                         //middle to left

		}
		System.out.println("------------------------------");      
		for (int i =0; i<5; i++){
			System.out.println(values[i]);                         //left to middle
		}
		System.out.println("------------------------------");      
		for (int i =0; i<9; i=i+2){
			System.out.println(values[i]);                          //skipping one element
		}

		long[] adharno = {267478644376l,654321907598l,876543214567l,98765432579l,876543212345l,878790098753l,908643535646l,897649519979l,346375297504l,437588423461l};
		    for (int i =0; i<9; i++){
			System.out.println(adharno[i]);                          //left to right

		}
		System.out.println("------------------------------");
		for (int i =9; i>=0; i--){
			System.out.println(adharno[i]);                         //right to left
		}
		System.out.println("-------------------------------");
		for (int i =5; i>=0; i--){
			System.out.println(adharno[i]);                         //middle to left

		}
		System.out.println("------------------------------");      
		for (int i =0; i<5; i++){
			System.out.println(adharno[i]);                         //left to middle
		}
		System.out.println("------------------------------");      
		for (int i =0; i<9; i=i+2){
			System.out.println(adharno[i]);                          //skipping one element
		}

		float[]cgpa={8.9f,9.0f,9.9f,9.6f,7.9f,8.8f,6.9f,9.2f,4.7f,8.5f};
		  for (int i =0; i<9; i++){
			System.out.println(cgpa[i]);                          //left to right

		}
		System.out.println("------------------------------");
		for (int i =9; i>=0; i--){
			System.out.println(cgpa[i]);                         //right to left
		}
		System.out.println("-------------------------------");
		for (int i =5; i>=0; i--){
			System.out.println(cgpa[i]);                         //middle to left

		}
		System.out.println("------------------------------");      
		for (int i =0; i<5; i++){
			System.out.println(cgpa[i]);                         //left to middle
		}
		System.out.println("------------------------------");      
		for (int i =0; i<9; i=i+2){
			System.out.println(cgpa[i]);                          //skipping one element
		}

        boolean[] isItOk ={true,true,false,false,false,true,true,false,false,false,};
        for (int i =0; i<9; i++){
			System.out.println(isItOk[i]);                          //left to right

		}
		System.out.println("------------------------------");
		for (int i =9; i>=0; i--){
			System.out.println(isItOk[i]);                         //right to left
		}
		System.out.println("-------------------------------");
		for (int i =5; i>=0; i--){
			System.out.println(isItOk[i]);                         //middle to left

		}
		System.out.println("------------------------------");      
		for (int i =0; i<5; i++){
			System.out.println(isItOk[i]);                         //left to middle
		}
		System.out.println("------------------------------");      
		for (int i =0; i<9; i=i+2){
			System.out.println(isItOk[i]);                          //skipping one element
		}

		char[] myGrade ={'A','B','A','B','A','B','A','B','A','B'};
		for (int i =0; i<9; i++){
			System.out.println(isItOk[i]);                          //left to right

		}
		System.out.println("------------------------------");
		for (int i =9; i>=0; i--){
			System.out.println(myGrade[i]);                         //right to left
		}
		System.out.println("-------------------------------");
		for (int i =5; i>=0; i--){
			System.out.println(myGrade[i]);                         //middle to left

		}
		System.out.println("------------------------------");      
		for (int i =0; i<5; i++){
			System.out.println(myGrade[i]);                         //left to middle
		}
		System.out.println("------------------------------");      
		for (int i =0; i<9; i=i+2){
			System.out.println(myGrade[i]);                          //skipping one element
		}



	}

}