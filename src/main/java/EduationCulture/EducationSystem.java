package EduationCulture;

public class EducationSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Graduation gd = new Graduation();
		gd.streams();
		gd.hscPercentage();
		gd.ageCritera();
		System.out.println("\n");
		
		Engineering eg = new Engineering();
		eg.streams();
		eg.typeOfEngineering();
		System.out.println("\n");
		
		ComputerScienceEngg cse = new ComputerScienceEngg();
		cse.hscPercentage();
		cse.subjects();
		System.out.println("\n");
	}

}
