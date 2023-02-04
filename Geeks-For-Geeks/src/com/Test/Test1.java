
public class Test1 {
public static void main(String[] args) {
	
}
	public void callTheThing() {
		  
//		  doTheThing(new String[] { "s1", "s2"});  // Noncompliant: unnecessary
//		  doTheThing(new String[12]);  // Compliant
//		  doTheOtherThing(new String[8]);  // Noncompliant: ambiguous
		  // ...
		  
		  doTheThing("s1", "s2");
		  doTheThing(new String[12]);
		  doTheOtherThing((Object[]) new String[8]);
		}
	private void doTheOtherThing(Object[] objects) {
		
	}
	private void doTheThing(String[] strings) {
		String[] string = {"nikita","patil"};
	}
	private void doTheThing(String string, String string2) {
		string = "nikita";
		string2 = "patil";
	}

//		public void doTheThing (String ... args) {
//		  // ...
//		}
//
//		public void doTheOtherThing(Object ... args) {
//		  // ...
//		}
		
	
}
