public class Project{
	private String name;
	private String description;
	private double initialCost;

	public void elevatorPitch(){
		System.out.println(getName()+" "+"("+"$"+getinIntialCost()+")"+" : "+getDescription());
	}

	public Project(){
		
	}
	public Project(String name){
		this.name = name;
		this.description = "This is my middle name";
	}

	public Project(String name, String description){
		this.name = name;
		this.description = description;
	}

	public void setDescription(String description){
		this.description = description;
	}
	public String getDescription(){
		return description;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setinIntialCost(double num){
		this.initialCost = num;
	}
	public double getinIntialCost(){
		return initialCost;
	}


}