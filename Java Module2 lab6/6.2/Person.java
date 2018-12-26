package bankAccount;

public class Person {
	
	private String name;
	private float age;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAge() {
		return age;
	}
	public void setAge(float age){

				this.age = age;
			
	}
	
	
	public Person(String name, float age) throws AgeException {
		super();
		if(age>15) {
			setName(name);
			this.age=age;
		}
		else
			throw new AgeException();
		
	}
	
	
	

	
}
