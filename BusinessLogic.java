package calculator;

/**
 * <p> Title: BusinessLogic Class. </p>
 * 
 * <p> Description: The code responsible for performing the calculator business logic functions. 
 * This method deals with CalculatorValues and performs actions on them.  The class expects data
 * from the User Interface to arrive as Strings and returns Strings to it.  This class calls the
 * CalculatorValue class to do computations and this class knows nothing about the actual 
 * representation of CalculatorValues, that is the responsibility of the CalculatorValue class and
 * the classes it calls.</p>
 * 
 * <p> Copyright: Lynn Robert Carter © 2017 </p>
 * 
 * @author Lynn Robert Carter
 * @modified by S.Jyothsna
 * 
 * @version 4.00	2014-10-18 The JavaFX-based GUI implementation of a long integer calculator 
 * 
 */

public class BusinessLogic {
	
	/**********************************************************************************************
	Attributes
	
	**********************************************************************************************/
	
	// These are the major calculator values 
		private CalculatorValue operand1 = new CalculatorValue(0.0); // changed from 0 to 0.0
		private CalculatorValue operand2 = new CalculatorValue(0.0); // changed from 0 to 0.0
		private CalculatorValue err_operand1 = new CalculatorValue(0.0); //the error operand1 initialization
		private CalculatorValue err_operand2 = new CalculatorValue(0.0); //the error operand2 initialization

//		private CalculatorValue operand_1 = new CalculatorValue("",0); // test if the new constructor for square root is working.
		private CalculatorValue result = new CalculatorValue(0.0); // changed from 0 to 0.0
		private CalculatorValue err_result = new CalculatorValue(0.0);
		private String operand1ErrorMessage = ""; //error message strings
		private String err_operand1ErrorMessage = "";
		
//		private String sqrtOperandErrorMessage = "";
		private boolean operand1Defined = false;
		private boolean err_operand1Defined = false;
		private String operand2ErrorMessage = "";
		private String err_operand2ErrorMessage = "";
		private boolean operand2Defined = false;
		private boolean err_operand2Defined = false;
		private String resultErrorMessage = "";
		private String err_resultErrorMessage = "";
		/**********************************************************************************************
		Constructors
		
		**********************************************************************************************/
		
		/**********
		 * This method initializes all of the elements of the business logic aspect of the calculator.
		 * There is no special computational initialization required, so the initialization of the
		 * attributes above are all that are needed.
		 */
		public BusinessLogic() {
		}

		/**********************************************************************************************
		Getters and Setters
		
		**********************************************************************************************/
		
		/**********
		 * This public method takes an input String, checks to see if there is a non-empty input string.
		 * If so, it places the converted CalculatorValue into operand1, any associated error message
		 * into operand1ErrorMessage, and sets flags accordingly.
		 * 
		 * @param value
		 * @return	True if the set did not generate an error; False if there was invalid input
		 */
		public boolean setOperand1(String value) 
		{
//			if (!setsqrtOperand(value)) // to call the new setter for square root calculation
//			{
//				return true;
//			}
			operand1Defined = false;						// Assume the operand will not be defined
			if (value.length() <= 0) {						// See if the input is empty. If so no error
				operand1ErrorMessage = "";					// message, but the operand is not defined.
				return true;									// Return saying there was no error.
			}
			operand1 = new CalculatorValue(value);			// If there was input text, try to convert it
			operand1ErrorMessage = operand1.getErrorMessage();	// into a CalculatorValue and see if it
			if (operand1ErrorMessage.length() > 0) 			// worked. If there is a non-empty error 
				return false;								// message, signal there was a problem.
			operand1Defined = true;							// Otherwise, set the defined flag and
			return true;										// signal that the set worked
		}
		
		public boolean seterrOperand1(String value) 		//the new setter for the errorOperand1
		{
//			if (!setsqrtOperand(value)) // to call the new setter for square root calculation
//			{
//				return true;
//			}
			err_operand1Defined = false;							// Assume the operand will not be defined
			if (value.length() <= 0) {						// See if the input is empty. If so no error
				err_operand1ErrorMessage = "";					// message, but the operand is not defined.
				return true;									// Return saying there was no error.
			}
			err_operand1 = new CalculatorValue(value);			// If there was input text, try to convert it
			err_operand1ErrorMessage = err_operand1.getErrorMessage();	// into a CalculatorValue and see if it
			if (err_operand1ErrorMessage.length() > 0) 			// worked. If there is a non-empty error 
				return false;								// message, signal there was a problem.
			err_operand1Defined = true;							// Otherwise, set the defined flag and
			return true;										// signal that the set worked
		}
		/**********
		 * This public method takes an input String, checks to see if there is a non-empty input string.
		 * If so, it places the converted CalculatorValue into operand1, any associated error message
		 * into operand1ErrorMessage, and sets flags accordingly.
		 * A modification for the square root implementation.
		 * @param value
		 * @return	True if the set did not generate an error; False if there was invalid input
		 */
		
//		public boolean setsqrtOperand(String value) 
//		{
//			operand1Defined = false;							// Assume the operand will not be defined
//			if (value.length() <= 0) {						// See if the input is empty. If so no error
//				sqrtOperandErrorMessage = "";					// message, but the operand is not defined.
//				System.out.println("JJJJ");
//				return true;									// Return saying there was no error.
//			}
//			operand1 = new CalculatorValue(value);			// If there was input text, try to convert it
//			sqrtOperandErrorMessage = operand1.getErrorMessage2();	// into a CalculatorValue and see if it
//			if (sqrtOperandErrorMessage.length() > 0) 			// worked. If there is a non-empty error 
//				return false;								// message, signal there was a problem.
//			operand1Defined = true;							// Otherwise, set the defined flag and
//			return true;										// signal that the set worked
//		}
		
		/**********
		 * This public getter fetches the String explaining the current error in the result, it there is one,
		 * otherwise, the method returns an empty String.
		 * 
		 * @return and error message or an empty String
		 */
		
//		public void setsqrtOperandError(String m)
//		{
//			sqrtOperandErrorMessage = m;
//			System.out.println("lksdflsdkflk");
//			return;
//		}
		
//		public String getsqrtOperandError() 
//		{
//			return sqrtOperandErrorMessage;
//		}

		
		/**********
		 * This public method takes an input String, checks to see if there is a non-empty input string.
		 * If so, it places the converted CalculatorValue into operand2, any associated error message
		 * into operand1ErrorMessage, and sets flags accordingly.
		 * 
		 * The logic of this method is the same as that for operand1 above.
		 * 
		 * @param value
		 * @return	True if the set did not generate an error; False if there was invalid input
		 */
		public boolean setOperand2(String value) {			// The logic of this method is exactly the
			operand2Defined = false;							// same as that for operand1, above.
			if (value.length() <= 0) {
				operand2ErrorMessage = "";
				return true;
			}
			operand2 = new CalculatorValue(value);
			operand2ErrorMessage = operand2.getErrorMessage();
			if (operand2ErrorMessage.length() > 0)
				return false;
			operand2Defined = true;
			return true;
		}
		
		public boolean seterrOperand2(String value) {			// The logic of this method is exactly the
			err_operand2Defined = false;							// same as that for operand1, above.
			if (value.length() <= 0) {
				err_operand2ErrorMessage = "";
				return true;
			}
			err_operand2 = new CalculatorValue(value);
			err_operand2ErrorMessage = err_operand2.getErrorMessage();
			if (err_operand2ErrorMessage.length() > 0)
				return false;
			err_operand2Defined = true;
			return true;
		}

		
		/**********
		 * This public method takes an input String, checks to see if there is a non-empty input string.
		 * If so, it places the converted CalculatorValue into result, any associated error message
		 * into resuyltErrorMessage, and sets flags accordingly.
		 * 
		 * The logic of this method is similar to that for operand1 above. (There is no defined flag.)
		 * 
		 * @param value
		 * @return	True if the set did not generate an error; False if there was invalid input
		 */
		public boolean setResult(String value) {				// The logic of this method is similar to
			if (value.length() <= 0) {						// that for operand1, above.
				operand2ErrorMessage = "";
				return true;
			}
			result = new CalculatorValue(value);
			resultErrorMessage = operand2.getErrorMessage();
			if (operand2ErrorMessage.length() > 0)
				return false;
			return true;
		}
		
		public boolean seterr_Result(String value) {				// The logic of this method is similar to
			if (value.length() <= 0) {						// that for operand1, above.
				err_operand2ErrorMessage = "";
				return true;
			}
			err_result = new CalculatorValue(value);
			err_resultErrorMessage = err_operand2.getErrorMessage();
			if (err_operand2ErrorMessage.length() > 0)
				return false;
			return true;
		}
		
		/**********
		 * This public setter sets the String explaining the current error in operand1.
		 * 
		 * @return
		 */
		public void setOperand1ErrorMessage(String m) 
		{
			operand1ErrorMessage = m;
			return;
		}
		public void seterr_Operand1ErrorMessage(String m) 
		{
			err_operand1ErrorMessage = m;
			return;
		}
		/**********
		 * This public getter fetches the String explaining the current error in operand1, it there is one,
		 * otherwise, the method returns an empty String.
		 * 
		 * @return and error message or an empty String
		 */
		public String getOperand1ErrorMessage() {
			return operand1ErrorMessage;
		}
		
		public String geterr_Operand1ErrorMessage() {
			return err_operand1ErrorMessage;
		}
		
		/**********
		 * This public setter sets the String explaining the current error into operand1.
		 * 
		 * @return
		 */
		public void setOperand2ErrorMessage(String m) {
			operand2ErrorMessage = m;
			return;
		}
		
		public void seterr_Operand2ErrorMessage(String m) {
			err_operand2ErrorMessage = m;
			return;
		}
		
		/**********
		 * This public getter fetches the String explaining the current error in operand2, it there is one,
		 * otherwise, the method returns an empty String.
		 * 
		 * @return and error message or an empty String
		 */
		public String getOperand2ErrorMessage() {
			return operand2ErrorMessage;
		}
		
		public String geterr_Operand2ErrorMessage() {
			return err_operand2ErrorMessage;
		}
		
		/**********
		 * This public setter sets the String explaining the current error in the result.
		 * 
		 * @return
		 */
		public void setResultErrorMessage(String m) {
			resultErrorMessage = m;
			return;
		}
		
		public void seterr_ResultErrorMessage(String m) {
			err_resultErrorMessage = m;
			return;
		}
		
		/**********
		 * This public getter fetches the String explaining the current error in the result, it there is one,
		 * otherwise, the method returns an empty String.
		 * 
		 * @return and error message or an empty String
		 */
		public String getResultErrorMessage() {
			return resultErrorMessage;
		}
		
		public String geterr_ResultErrorMessage() {
			return err_resultErrorMessage;
		}
		
		/**********
		 * This public getter fetches the defined attribute for operand1. You can't use the lack of an error 
		 * message to know that the operand is ready to be used. An empty operand has no error associated with 
		 * it, so the class checks to see if it is defined and has no error before setting this flag true.
		 * 
		 * @return true if the operand is defined and has no error, else false
		 */
		public boolean getOperand1Defined() {
			return operand1Defined;
		}
		
		public boolean geterr_Operand1Defined() {
			return err_operand1Defined;
		}
		/**********
		 * This public getter fetches the defined attribute for operand2. You can't use the lack of an error 
		 * message to know that the operand is ready to be used. An empty operand has no error associated with 
		 * it, so the class checks to see if it is defined and has no error before setting this flag true.
		 * 
		 * @return true if the operand is defined and has no error, else false
		 */
		public boolean getOperand2Defined() {
			return operand2Defined;
		}
		
		public boolean geterr_Operand2Defined() {
			return err_operand2Defined;
		}

		/**********************************************************************************************
		The toString() Method
		
		**********************************************************************************************/
		
		/**********
		 * This toString method invokes the toString method of the result type (CalculatorValue is this 
		 * case) to convert the value from its hidden internal representation into a String, which can be
		 * manipulated directly by the BusinessLogic and the UserInterface classes.
		 */
		public String toString() {
			return result.toString();
		}
		
		public String err_toString() {
			return err_result.toString();
		}
		
		/**********
		 * This public toString method is used to display all the values of the BusinessLogic class in a
		 * textual representation for debugging purposes.
		 * 
		 * @return a String representation of the class
		 */
		public String debugToString() {
			String r = "\n******************\n*\n* Business Logic\n*\n******************\n";
			r += "operand1 = " + operand1.toString() + "\n";
			r += "     operand1ErrorMessage = " + operand1ErrorMessage+ "\n";
			r += "     operand1Defined = " + operand1Defined+ "\n";
			r += "operand2 = " + operand2.toString() + "\n";
			r += "     operand2ErrorMessage = " + operand2ErrorMessage+ "\n";
			r += "     operand2Defined = " + operand2Defined+ "\n";
			r += "result = " + result.toString() + "\n";
			r += "     resultErrorMessage = " + resultErrorMessage+ "\n";
			r += "*******************\n\n";
			return r;
		}
		
		public String err_debugToString() {
			String r = "\n******************\n*\n* Business Logic\n*\n******************\n";
			r += "operand1 = " + err_operand1.toString() + "\n";
			r += "     operand1ErrorMessage = " + err_operand1ErrorMessage+ "\n";
			r += "     operand1Defined = " + err_operand1Defined+ "\n";
			r += "operand2 = " + err_operand2.toString() + "\n";
			r += "     operand2ErrorMessage = " + err_operand2ErrorMessage+ "\n";
			r += "     operand2Defined = " + err_operand2Defined+ "\n";
			r += "result = " + err_result.toString() + "\n";
			r += "     resultErrorMessage = " + err_resultErrorMessage+ "\n";
			r += "*******************\n\n";
			return r;
		}

		/**********************************************************************************************
		Business Logic Operations (e.g. addition)
		
		**********************************************************************************************/
		
		/**********
		 * This public method computes the sum of the two operands using the CalculatorValue class method 
		 * for addition. The goal of this class is to support a wide array of different data representations 
		 * without requiring a change to this class, user interface class, or the Calculator class.
		 * 
		 * This method assumes the operands are defined and valid. It replaces the left operand with the 
		 * result of the computation and it leaves an error message, if there is one, in a String variable
		 * set aside for that purpose.
		 * 
		 * This method does not take advantage or know any detail of the representation!  All of that is
		 * hidden from this class by the ClaculatorValue class and any other classes that it may use.
		 * 
		 * @return a String representation of the result
		 */
		public String addition() {
			result = new CalculatorValue(operand1);
			System.out.println("result   "+result);
			result.add(operand2);
			resultErrorMessage = result.getErrorMessage();
//			return result.toString(); 
			double i2 = Double.parseDouble(result.toString()); // this casts the result to string using the toString() method and then we cast it to Double again to use round operation
			return Double.toString(Math.round(i2*10000000000.0)/10000000000.0); // this cast is used to round off to 10 decimal places, we can extend or decrease the zeros as per the precision req.
		}
		
		public String err_addition() {
			result = new CalculatorValue(err_operand1);
			System.out.println("result   "+result);
			result.add(err_operand2);
			resultErrorMessage = result.getErrorMessage();
			//return result.toString(); 
			double i2 = Double.parseDouble(result.toString()); // this casts the result to string using the toString() method and then we cast it to Double again to use round operation
			return Double.toString(Math.round(i2*10000000000.0)/10000000000.0); // this cast is used to round off to 10 decimal places, we can extend or decrease the zeros as per the precision req.
		}
		
		/**********
		 * This public method computes the subtraction of the two operands using the CalculatorValue class method 
		 * for subtraction. The goal of this class is to support a wide array of different data representations 
		 * without requiring a change to this class, user interface class, or the Calculator class.
		 * 
		 * This method assumes the operands are defined and valid. It replaces the left operand with the 
		 * result of the computation and it leaves an error message, if there is one, in a String variable
		 * set aside for that purpose.
		 * 
		 * This method does not take advantage or know any detail of the representation!  All of that is
		 * hidden from this class by the ClaculatorValue class and any other classes that it may use.
		 * 
		 * @return a String representation of the result
		 */
		public String subtraction() 
		{
			result = new CalculatorValue(operand1);
			result.sub(operand2);
			resultErrorMessage = result.getErrorMessage();
//			return result.toString();
			double i2 = Double.parseDouble(result.toString()); // this casts the result to string using the toString() method and then we cast it to Double again to use round operation
			return Double.toString(Math.round(i2*10000000000.0)/10000000000.0); // this cast is used to round off to 10 decimal places, we can extend or decrease the zeros as per the precision req.
		}
		
		public String err_subtraction() 
		{
			result = new CalculatorValue(err_operand1);
			result.add(err_operand2);
			resultErrorMessage = result.getErrorMessage();
//			return result.toString();
			double i2 = Double.parseDouble(result.toString()); // this casts the result to string using the toString() method and then we cast it to Double again to use round operation
			return Double.toString(Math.round(i2*10000000000.0)/10000000000.0); // this cast is used to round off to 10 decimal places, we can extend or decrease the zeros as per the precision req.
		}
		
		/**********
		 * This public method computes the multiplication of the two operands using the CalculatorValue class method 
		 * for multiplication. The goal of this class is to support a wide array of different data representations 
		 * without requiring a change to this class, user interface class, or the Calculator class.
		 * 
		 * This method assumes the operands are defined and valid. It replaces the left operand with the 
		 * result of the computation and it leaves an error message, if there is one, in a String variable
		 * set aside for that purpose.
		 * 
		 * This method does not take advantage or know any detail of the representation!  All of that is
		 * hidden from this class by the ClaculatorValue class and any other classes that it may use.
		 * 
		 * @return a String representation of the result
		 */
		public String multiplication() 
		{
			result = new CalculatorValue(operand1);
			result.mpy(operand2);
			resultErrorMessage = result.getErrorMessage();
     		//return result.toString();
			double i2 = Double.parseDouble(result.toString()); // this casts the result to string using the toString() method and then we cast it to Double again to use round operation
			return Double.toString(Math.round(i2*10000000000.0)/10000000000.0); // this cast is used to round off to 10 decimal places, we can extend or decrease the zeros as per the precision req.
		}
		
		public String err_multiplication() 
		{
			result = new CalculatorValue(err_operand1);
//			result.div(Math.abs(Double.parseDouble(operand1.toString())));
			result.err_fraction(operand1,err_operand2,operand2);
			resultErrorMessage = result.getErrorMessage();
//			return result.toString();
			double i2 = Double.parseDouble(result.toString()); // this casts the result to string using the toString() method and then we cast it to Double again to use round operation
			return Double.toString(Math.round(i2*10000000000.0)/10000000000.0); // this cast is used to round off to 10 decimal places, we can extend or decrease the zeros as per the precision req.
		}
		
		
		
		/**********
		 * This public method computes the division of the two operands using the CalculatorValue class method 
		 * for division. The goal of this class is to support a wide array of different data representations 
		 * without requiring a change to this class, user interface class, or the Calculator class.
		 * 
		 * This method assumes the operands are defined and valid. It replaces the left operand with the 
		 * result of the computation and it leaves an error message, if there is one, in a String variable
		 * set aside for that purpose.
		 * 
		 * This method does not take advantage or know any detail of the representation!  All of that is
		 * hidden from this class by the ClaculatorValue class and any other classes that it may use.
		 * 
		 * @return a String representation of the result
		 */
		
		public String division() 
		{
			result = new CalculatorValue(operand1);
			result.div(operand2);
			resultErrorMessage = result.getErrorMessage();
			if (resultErrorMessage.length() != 0) // a very intuitive approach to handle divide by zero approach was to use length of error message as the cue
			{
				return "";// since the condition returns empty, another conditional is set up in the Userinterface class to display the error
			}
//			return result.toString(); // else clause of this conditional block
			double i2 = Double.parseDouble(result.toString()); // this casts the result to string using the toString() method and then we cast it to Double again to use round operation
			return Double.toString(Math.round(i2*10000000000.0)/10000000000.0); // this cast is used to round off to 10 decimal places, we can extend or decrease the zeros as per the precision req.
		}
		
		public String err_division() 
		{
			result = new CalculatorValue(err_operand1);
			result.errdiv_fraction(operand1,err_operand2,operand2);
			resultErrorMessage = result.getErrorMessage();
			if (resultErrorMessage.length() != 0) // a very intuitive approach to handle divide by zero approach was to use length of error message as the cue
			{
				return "";// since the condition returns empty, another conditional is set up in the Userinterface class to display the error
			}
//			return result.toString(); // else clause of this conditional block
			double i2 = Double.parseDouble(result.toString()); // this casts the result to string using the toString() method and then we cast it to Double again to use round operation
			return Double.toString(Math.round(i2*10000000000.0)/10000000000.0); // this cast is used to round off to 10 decimal places, we can extend or decrease the zeros as per the precision req.
		}
		
		/**********
		 * This public method computes the square root of an operand using the CalculatorValue class method 
		 * for square root. The goal of this class is to support a wide array of different data representations 
		 * without requiring a change to this class, user interface class, or the Calculator class.
		 * 
		 * This method assumes the operands are defined and valid. It replaces the left operand with the 
		 * result of the computation and it leaves an error message, if there is one, in a String variable
		 * set aside for that purpose.
		 * 
		 * This method does not take advantage or know any detail of the representation!  All of that is
		 * hidden from this class by the ClaculatorValue class and any other classes that it may use.
		 * 
		 * @return a String representation of the result
		 */
		public String err_sqrt()
		{
			result = new CalculatorValue(err_operand1);
			System.out.println(err_operand1);
			result.errsqrt(operand1);
			resultErrorMessage = result.getErrorMessage();
			
			if (resultErrorMessage.length() != 0) // a very intuitive approach to handle negative square root was to use length of error message as the cue
			{
				return "";// since the condition returns empty, another conditional is set up in the Userinterface class to display the error
			}
			double i2 = Double.parseDouble(result.toString()); // this casts the result to string using the toString() method and then we cast it to Double again to use round operation
			return Double.toString(Math.round(i2*10000000000.0)/10000000000.0); 
		}
		public String sqrt() 
		{
			result = new CalculatorValue(operand1);
			System.out.println(operand1);
			result.sqrt();
			resultErrorMessage = result.getErrorMessage();
			
			if (resultErrorMessage.length() != 0) // a very intuitive approach to handle negative square root was to use length of error message as the cue
			{
				return "";// since the condition returns empty, another conditional is set up in the Userinterface class to display the error
			}
			double i2 = Double.parseDouble(result.toString()); // this casts the result to string using the toString() method and then we cast it to Double again to use round operation
			return Double.toString(Math.round(i2*10000000000.0)/10000000000.0); // this cast is used to round off to 10 decimal places, we can extend or decrease the zeros as per the precision req.
					
		}
	}