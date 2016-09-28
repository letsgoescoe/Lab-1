


public class WrongInputException extends Exception {
	   WrongInputException(String s) {
	      super(s);
	   }
	}
	public int input {
	   void method() throws WrongInputException {
	      throw new WrongInputException("Wrong input");
	   }
	}
	public class TestInput {
	   public static void main(String[] args){
	      try {
	         new TestInput().method();
	      }
		  catch(WrongInputException wie) {
	         System.out.println(wie.getMessage());
	      }
	   }

	private void method() {
		// TODO Auto-generated method stub
		
	} 
	}
