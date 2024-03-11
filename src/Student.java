public class Student {
    private String id;
    private String name;
    private int age;

    public Student(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Getters and setters

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Age: " + age;
    }

	public Object getId() {
		// TODO Auto-generated method stub
		return id;
	}

	public void setName(String newName) {
		// TODO Auto-generated method stub
		this.name=newName;
	}

	public void setAge(int newAge) {
		// TODO Auto-generated method stub
		this.age=newAge;
	}
}
