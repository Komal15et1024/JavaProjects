package inheritance;

public class Person {
    //creating instance variables
    private String firstName;
    private String lastName;
    private int age;
    
    public String getFirstName(){
        return firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public int getAge(){
        return age;
    }
    
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    
    public void setAge(int age){
        if(age < 0 || age > 100){
            this.age = 0;
        }
        else{
            this.age = age;
        }
    }  
    
    public boolean isTeen(){
        return age >= 13 && age <= 19;
    }

    public String getFullName(){
        if(firstName.isEmpty() && lastName.isEmpty()){
            return "";
        }
        else if (lastName.isEmpty()){
            return firstName;
        }
        else if(firstName.isEmpty()){
            return lastName;
        }
        else{
            return firstName+" "+lastName;
        }
    } 

	public static void main(String[] args) {
		Person person = new Person();
		person.setFirstName("");   // firstName is set to empty string
		person.setLastName("");    // lastName is set to empty string
		person.setAge(10);
		System.out.println("fullName= " + person.getFullName());
		System.out.println("teen= " + person.isTeen());
		person.setFirstName("John");    // firstName is set to John
		person.setAge(18);
		System.out.println("fullName= " + person.getFullName());
		System.out.println("teen= " + person.isTeen());
		person.setLastName("Smith");    // lastName is set to Smith
		System.out.println("fullName= " + person.getFullName());

	}

}
