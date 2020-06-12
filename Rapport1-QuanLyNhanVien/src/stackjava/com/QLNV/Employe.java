package stackjava.com.QLNV;
	import java.util.Scanner;
	 
	public class Employe {
	    private String NumberEmployee, Name, PhoneNumber, mail;
	    private int age;
	    protected int Salary, basicSalary;
	    Scanner scanner = new Scanner(System.in);
	     
	    public Employe() {
	        super();
	    }
	 
	    public Employe(String numberEmployee, String Name, String PhoneNumber, String mail, int age, 
	        int salary, int basicsalary) {
	        super();
	        this.NumberEmployee = numberEmployee;
	        this.Name = Name;
	        this.PhoneNumber = PhoneNumber;
	        this.mail = mail;
	        this.age = age;
	        this.Salary = salary;
	        this.basicSalary = basicsalary;
	    }
	 
	    public String getNumberEmployee() {
	        return NumberEmployee;
	    }
	 
	    public void setMaNhanVien(String numberEmployee) {
	        this.NumberEmployee = numberEmployee;
	    }
	 
	    public String getName() {
	        return Name;
	    }
	 
	    public void setName(String Name) {
	        this.Name = Name;
	    }
	 
	    public String getPhoneNumber() {
	        return PhoneNumber;
	    }
	 
	    public void setPhoneNumber(String PhoneNumber) {
	        this.PhoneNumber = PhoneNumber;
	    }
	 
	    public String getMail() {
	        return mail;
	    }
	 
	    public void setMail(String mail) {
	        this.mail = mail;
	    }
	 
	    public int getAge() {
	        return age;
	    }
	 
	    public void setAge(int age) {
	        this.age = age;
	    }
	 
	    public int getSalary() {
	        return Salary;
	    }
	 
	    public void setSalary(int salary) {
	        this.Salary = salary;
	    }
	 
	    public int getBasicSalary() {
	        return basicSalary;
	    }
	 
	    public void setBasicSalary(int basicsalary) {
	        this.basicSalary = basicsalary;
	    }
	     
	    public void input() {
	        System.out.print("Number Of Employee: ");
	        NumberEmployee = scanner.nextLine();
	        System.out.print("Name Of Employee: ");
	        Name = scanner.nextLine();
	        System.out.print("Telephone: ");
	        PhoneNumber = scanner.nextLine();
	        System.out.print(" Email: ");
	        mail = scanner.nextLine();
	        System.out.print("Age: ");
	        age = scanner.nextInt();
	        System.out.print("Basic Salary: ");
	        basicSalary = scanner.nextInt();
	    }
	     
	    public int CountSalary() {
	        return 0;
	    }
	     
	    @Override
	    public String toString() {
	        return "Number Employee: " + this.NumberEmployee + ", name of employee: " + this.Name + 
	            ", Telephone: " + this.PhoneNumber + ", mail: " + this.mail + 
	            ", Age: " + this.age + ", basic salary: " + this.basicSalary;
}


		
	}
