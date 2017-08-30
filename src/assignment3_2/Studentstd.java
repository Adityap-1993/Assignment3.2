package assignment3_2;

public class Studentstd extends Student {   //class definition inherited from superclass
	
	int standard;         //sample instance variable
	 
	Studentstd(){           //default subclass constructor
		
		super();	       //Super()  used to call  superclass constructor.
	}
	
	
	Studentstd(int r,double f,int s)      //parameterized constructor
	{
		super(r,f);                      //super used to call parameterized constructor of superclass
		this.standard=s;
		
	}
	
	public void study()          //sample method to show use of super keyword
	{
		super.study();            //super used for calling immediate superclass method while study() is overriding superclass study() method
		
		System.out.println(" ");
		System.out.println("super can be used to invoke immediate superclass  method when subclass method overrides superclass nethod ");
		System.out.println("super() can be used to invoke immediate superclass constructor.");
	}
	
	public void details()    //sample method to show use of super keyword
	 
	{
		super.details();    //super used for calling immediate superclass method while details() is overriding superclass details() method
		
	}

	
}
