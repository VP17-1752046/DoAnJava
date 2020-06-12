package stackjava.com.QLNV;
  
public class Testeur extends Employe {
	    private int ErrorFixed;
	 
	    public Testeur() {
	        super();
	    }
	 
	    public Testeur(int errorFixed) {
	        super();
	        this.ErrorFixed = errorFixed;
	    }
	 
	    public int getErrorFixed() {
	        return ErrorFixed;
	    }
	 
	    public void setErrorFixed(int errorFixed) {
	        this.ErrorFixed = errorFixed;
	    }
	 
	    @Override
	    public void input() {
	        super.input();
	        System.out.print("The Number Of Error Fixed: ");
	        ErrorFixed = scanner.nextInt();
	    }
	 
	    @Override
	    public int CountSalary() {
	        this.Salary = this.basicSalary + this.ErrorFixed * 50000;
	        return this.Salary;
	    }
	 
	    @Override
	    public String toString() {
	        return super.toString() + "\n, The Number Of Error Fixed: " + this.ErrorFixed + 
	            ", lương: " + this.Salary;
	    }
	     
	}


