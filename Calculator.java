import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		String input = console.nextLine();
		double result = myCalc(input);
		//double result = myCalc("9*3^2/3*5");
		System.out.printf(String.format("%.2f %n", result));
		System.out.print("\n");

	}
	
	public static double myCalc(String inString) {
		double oldValue = 0.0;
		char operation = ' ';
		
		
		for(int i = 0; i<inString.length(); i++) {
			char c = inString.charAt(i);
			//System.out.println("input char:"+c);
			boolean isOperation = false;
			double newValue = 0.0;
			
			try {
				newValue = Double.parseDouble(c+"");
			}catch(Exception ex) {
				operation = c;
				isOperation = true;
			}
			
			
			if(newValue > 0 && operation !=' ' &&  oldValue > 0) {
				//System.out.println("values:"+newValue+","+oldValue+","+operation);
				switch (operation){
					case '+':
						//System.out.println("in add:"+oldValue+"+"+newValue);
						newValue = oldValue + newValue;
						operation = ' ';isOperation = false;
						break;
					case '-':
						//System.out.println("in sub:"+oldValue+"-"+newValue);
						newValue = oldValue - newValue;
						operation = ' ';isOperation = false;
						break;
					case '*':
						//System.out.println("in mult:"+oldValue+"*"+newValue);
						newValue = oldValue * newValue;
						operation = ' ';isOperation = false;
						break;
					case '/':
						//System.out.println("in div:"+oldValue+"/"+newValue);
						newValue = oldValue / newValue;
						operation = ' ';isOperation = false;
						break;
					case '^':
						//System.out.println("in pow:"+oldValue+"^"+newValue);
						newValue = Math.pow(oldValue, newValue);
						operation = ' ';isOperation = false;
						break;
				}
			}
			//System.out.println("step 1");
			if(isOperation == false) {
				oldValue = newValue;
				//System.out.println("old value:"+oldValue);
			}
			
				
		}
		
		return oldValue;
		
	}

}
