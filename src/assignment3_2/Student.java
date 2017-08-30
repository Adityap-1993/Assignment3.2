package assignment3_2;

//This program will show use of this and super keyword

public class Student {   //class definition
	
	int rollno;           //taking sample variables
	double fee;
	
	Student()             //declaring default constructor 
	{
		this(15,1000.0);    //use of this to call the parameterized constructor 
	}
	
	Student(int r,double f)   //parameterized constructor 
	{
		this.rollno=r;          //use of this to assigning values to variables 
		this.fee=f; 
	}
	
	public void study()    //sample method  for printing use of this
	
	{
		System.out.println("this can be used to refer current class instance variable");
		System.out.println("this can be used to invoke current class method.");
		System.out.println("this() can be used to invoke current class constructor.");
	}
	
	public void details()   //sample method 
	{
		this.study();      //use of this to call method within same class
	}
	
	

}  //class ends here
