package stackjava.com.QLNV;

public class Codeur extends Employe {
	    private int TimeWorked;
	 
	    public Codeur() {
	        super();
	    }
	 
	    public Codeur(int timeWorked) {
	        super();
	        this.TimeWorked = timeWorked;
	    }
	 
	    public int getTimeWorked() {
	        return TimeWorked;
	    }
	 
	    public void setTimeWorked(int timeWorked) {
	        this.TimeWorked = timeWorked;
	    }
	    @Override
	    public void input() {
	        super.input();
	        System.out.print("Enter the number of time worked: ");
	        TimeWorked = scanner.nextInt();
	    }
        @Override
	    public int CountSalary() {
	        this.Salary = this.basicSalary + this.TimeWorked * 200000;
	        return this.Salary;
	    }
	 
	    @Override
	    public String toString() {
	        return super.toString() + "\n, The Time Employee Worked: " + this.TimeWorked + 
	            ", Salary: " + this.Salary;
	    }
	}

