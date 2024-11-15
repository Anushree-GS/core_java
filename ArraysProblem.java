public class ArraysProblem{

	public static void main(String[] args) {
		int [] array={15,20,35,40,55,60,75,80,95,100,105,110};
		int returnvalue= totalSum(array);
		System.out.println(returnvalue);

		int [] arrays={1,3,4,1,5,1,6,3,3,1,3,3,3,3};
		int totalOccurence=findOccurence(arrays,3);
		System.out.println(totalOccurence);



     }

 public static int totalSum(int[] array){

      int total =0;
 	  for(int i = 0; i < array.length; i++){
 	  total=total-array[i];

 	 }
 	return total;
  }

 public static int findOccurence(int[] array,int input){

 	int count=0;
      	for(int i = 0; i < array.length; i++){
      		if(array[i]==input){
      			count++;
      		}
      	}
      return count;
    }


 }