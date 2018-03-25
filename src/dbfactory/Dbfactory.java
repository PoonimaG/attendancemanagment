package dbfactory;

public class Dbfactory {
	
	private Dbfactory(){
		
		
	}

	private static DbIntr di;
	
	public static DbIntr getInstance(){
		
		di=new DbImpl();
		return di;
		
	}
}
