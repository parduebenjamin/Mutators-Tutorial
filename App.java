class Cat{
	private String name;
	private int age;
	// using 'private' keeps other classes from accessing these variables
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		//if you type Public in front of methods you won't go wrong
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setInfo(String name, int age) {
		setName(name);
		setAge(age);
		
	}
	
}


public class App {

	public static void main(String[] args) {
		
		Cat cat1 = new Cat();
		Cat cat2 = new Cat();
		/*cat1.name = "Peach";
		cat1.age = 8;*/
		cat2.setName("Tiger");
		cat2.setAge(2);
		cat1.setAge(8);
		cat1.setName("Peach");
		Cat cat3 = new Cat();
		cat3.setInfo("Little Buddy", 0);
		
		System.out.println("My cat " + cat1.getName() + " is " + cat1.getAge() + " years old");
		System.out.println("My cat " + cat2.getName() + " is " + cat2.getAge() + " years old");
		System.out.println("My cat " + cat3.getName() + " is " + cat3.getAge() + " years old");

	}

}
