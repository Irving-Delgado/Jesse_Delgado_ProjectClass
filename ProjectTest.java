public class ProjectTest{
	public static void main(String[] args) {
		Project testProject = new Project();
		// Project testProject2 = new Project("Jesse");
		// Project testProject3 = new Project("Delgado", "This is my last name");
		
		testProject.setDescription("This is my first name");
		testProject.setName("Irving");
		testProject.setinIntialCost(30);
		
		testProject.elevatorPitch();
		// testProject2.elevatorPitch();
		// testProject3.elevatorPitch();
		
	}

}