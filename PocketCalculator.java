import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PocketCalculator {
 static	JTextField displayArea = new JTextField();
	static int operandA = 0;
	static int operandB = 0;
	static char operator = ' ';
	static boolean isOperatorEntered = false;
	
	static boolean isEqualsEntered = false;
	static int finalResult = 0;
	
	//method for displaying current data
	public static void calculatorStream()
	{
		System.out.printf("\nOperandA = %d | OperandB = %d | Operator = %c | result =%d",operandA,operandB,operator,finalResult);
	}
	public static void main(String[] args) {
		//Frame Setup
		JFrame frame = new JFrame("Pocket Calculator");
		frame.setVisible(true);
		frame.setSize(400,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//TextField Setup
		frame.add(displayArea,BorderLayout.NORTH);
		displayArea.setPreferredSize(new Dimension(0,40));
		displayArea.setHorizontalAlignment(displayArea.RIGHT);
		
		//Button Creation
	    JButton b9 = new JButton("9");
	    JButton b8 = new JButton("8");
	    JButton b7 = new JButton("7");
	    JButton b6 = new JButton("6");
	    JButton b5 = new JButton("5");
	    JButton b4 = new JButton("4");
	    JButton b3 = new JButton("3");
	    JButton b2 = new JButton("2");
	    JButton b1 = new JButton("1");
	    JButton b0 = new JButton("0");
	    JButton bmultiply = new JButton("*");
	    JButton bdivide =  new JButton("/");
	    JButton bplus = new JButton("+");
	    JButton bminus = new JButton("-");
	    JButton bequals = new JButton("=");
	    JButton bclear = new JButton("AC");
	    //Creation panel for buttons
	    JPanel bpanel = new JPanel(new GridLayout(4,4));
	    //adding buttons the panel
	    bpanel.add(b9);
	    bpanel.add(b8);
	    bpanel.add(b7);
	    bpanel.add(bclear);
	    bpanel.add(b6);
	    bpanel.add(b5);
	    bpanel.add(b4);
	    bpanel.add(bplus);
	    bpanel.add(b3);
	    bpanel.add(b2);
	    bpanel.add(b1);
	    bpanel.add(bminus);
	    bpanel.add(bdivide);
	    bpanel.add(b0);
	    bpanel.add(bmultiply);
	    bpanel.add(bequals);
	    
	   //adding panel to the frame
	    frame.add(bpanel);
	    
	    //action listener
	    
	    b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	
            	displayArea.setText(displayArea.getText() + 9);  
            	
 
            	
                	if(isOperatorEntered)
            	  {
            		//Storing value in Operand B
            		operandB = operandB * 10 + 9;

            	  }
            	   else
            	  {
            		//Storing value in Operand A
            		operandA = operandA * 10 + 9;  
            	  }
            	
            	
            	calculatorStream();
            		
            }
        });
	    b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	
            	displayArea.setText(displayArea.getText() + 8);  
            	
            	  if(isOperatorEntered)
                	{
            		//Storing value in Operand B
            		operandB = operandB * 10 + 8;

            	    }
            	  else
            	   {
            		//Storing value in Operand A
            		operandA = operandA * 10 + 8;  
            	   }
            	
          
            	   calculatorStream();
            		
            }
        });
	    b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	
            	displayArea.setText(displayArea.getText() + 7);  
            
            	if(isOperatorEntered)
            	{
            		//Storing value in Operand B
            		operandB = operandB * 10 + 7;

            	}
            	else
            	{
            		//Storing value in Operand A
            		operandA = operandA * 10 + 7;  
            	}
            	calculatorStream();
            }
        });
	    b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	
            	displayArea.setText(displayArea.getText() + 6);  
            
            	if(isOperatorEntered)
            	{
            		//Storing value in Operand B
            		operandB = operandB * 10 + 6;

            	}
            	else
            	{
            		//Storing value in Operand A
            		operandA = operandA * 10 + 6;  
            	}
            	calculatorStream();
           
            		
            }
        });
	    b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	
            	displayArea.setText(displayArea.getText() + 5);  
            
            	if(isOperatorEntered)
            	{
            		//Storing value in Operand B
            		operandB = operandB * 10 + 5;

            	}
            	else
            	{
            		//Storing value in Operand A
            		operandA = operandA * 10 + 5;  
            	}
            	calculatorStream();
            
         
            		
            }
        });
	    b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	
            	displayArea.setText(displayArea.getText() + 4);  
          
            	if(isOperatorEntered)
            	{
            		//Storing value in Operand B
            		operandB = operandB * 10 + 4;

            	}
            	else
            	{
            		//Storing value in Operand A
            		operandA = operandA * 10 + 4;  
            	}
            	calculatorStream();
            
          
            		
            }
        });
	    b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	
            	displayArea.setText(displayArea.getText() + 3);  
       
            	if(isOperatorEntered)
            	{
            		//Storing value in Operand B
            		operandB = operandB * 10 + 3;

            	}
            	else
            	{
            		//Storing value in Operand A
            		operandA = operandA * 10 + 3;  
            	}
            	calculatorStream();
            
         
            }
        });
	    b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	
            	displayArea.setText(displayArea.getText() + 2);  
           
            	if(isOperatorEntered)
            	{
            		//Storing value in Operand B
            		operandB = operandB * 10 + 2;

            	}
            	else
            	{
            		//Storing value in Operand A
            		operandA = operandA * 10 + 2;  
            	}
            	calculatorStream();
            
          
            		
            }
        });
	    b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	
            	displayArea.setText(displayArea.getText() + 1); 
           
            	if(isOperatorEntered)
            	{
            		//Storing value in Operand B
            		operandB = operandB * 10 + 1;

            	}
            	else
            	{
            		//Storing value in Operand A
            		operandA = operandA * 10 + 1;  
            	}
            	calculatorStream();
         
            		
            }
        });
	    b0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	
            	displayArea.setText(displayArea.getText() + 0);  
           
            	if(isOperatorEntered)
            	{
            		//Storing value in Operand B
            		operandB = operandB * 10 + 0;

            	}
            	else
            	{
            		//Storing value in Operand A
            		operandA = operandA * 10 + 0;  
            	}
            	calculatorStream();
          
            		
            }
        });
	    
	 // plus operator
	    bplus.addActionListener(e -> {	  
	    	if(!isOperatorEntered)
	    	{
	    	isOperatorEntered = true;
	    	operator = '+';
	    	displayArea.setText(displayArea.getText() + "+");
	    	calculatorStream();
	    	}
	    });
	 // minus operator
	    bminus.addActionListener(e -> {	  
	    	if(!isOperatorEntered)
	    	{
	    	isOperatorEntered = true;
	    	operator = '-';
	    	displayArea.setText(displayArea.getText() + "-");
	    	calculatorStream();
	    	}
	    });
	 // multiply operator
	    bmultiply.addActionListener(e -> {	  
	    	if(!isOperatorEntered)
	    	{
	    	isOperatorEntered = true;
	    	operator = '*';
	    	displayArea.setText(displayArea.getText() + "*");
	    	calculatorStream();
	    	}
	    });
	 // divide operator
	    bdivide.addActionListener(e -> {	  
	    	if(!isOperatorEntered)
	    	{
	    	isOperatorEntered = true;
	    	operator = '/';
	    	displayArea.setText(displayArea.getText() + "/");
	    	calculatorStream();
	    	}
	    });
//		clear operation
	    bclear.addActionListener(e -> {
	    	isOperatorEntered = false;
	    	operator = ' ';
	    	operandA = 0;
	    	operandB = 0;
	    	displayArea.setText(null);
	    	isEqualsEntered = false;
	    	finalResult = 0;
	    	calculatorStream();
	    });
	    	
	  //equals operation
		    bequals.addActionListener(e -> {
		    	if(!isOperatorEntered) return;
		    	switch(operator)
		    	{
		    	case '+':
		    	{
		    	int result=operandA+operandB;
		    	displayArea.setText(String.valueOf(result));
		    	break;
		    	}
		    	case '-':
		    	{
		    		int result = operandA-operandB;
		    		displayArea.setText(String.valueOf(result));
		    		break;
		    	}
		    	case '*':
		    	{
		    		int result = operandA*operandB;
		    		displayArea.setText(String.valueOf(result));
		    		break;
		    	}
		    	case '/':
		    	{
		    		int result = operandA/operandB;
		    		displayArea.setText(String.valueOf(result));
		    		break;
		    	}
		    	}
		    	isOperatorEntered = false;
		    	isEqualsEntered = true;
		    	finalResult = Integer.valueOf(displayArea.getText());
		    	operandA = finalResult;
		    	operandB = 0;
		    	calculatorStream();
		    	
		    });
		    

		    
		    
		    
		    
	       frame.revalidate();
	    
	    
		
		
		
     
	}

}
