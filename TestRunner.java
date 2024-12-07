public class TestRunner{
	public static void main(String[] args) {
		Computers comp = new Computers();
		System.out.println(comp.keyboard);

		Computers laptop = new Computers();
		System.out.println(laptop.outputDevices);


		Garden park = new Garden();
		System.out.println(park.numberOfTrees);

		Garden trees = new Garden();
		System.out.println(trees.numberOfFlowers);


		Cars model = new Cars();
		System.out.println(model.numberOfWheels);

		Cars rate = new Cars();
		System.out.println(rate.price);


		Phone function = new Phone();
		System.out.println(function.model);



		Phone mobiles = new Phone();
		System.out.println(mobiles.feature);


		School exam = new School();
		System.out.println(exam.numberOfSchool);

		School fees = new School();
		System.out.println(fees.schoolFees);







	}
}