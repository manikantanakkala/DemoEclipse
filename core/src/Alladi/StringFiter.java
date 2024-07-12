package Alladi;

public class StringFiter 
{
	private String inputString;
	private String filterString;
	private String additionString;
	private String outputString;
	
	
	public String getInputString() {
		return inputString;
	}
	public void setInputString(String inputString) {
		this.inputString = inputString;
	}
	public String getFilterString() {
		return filterString;
	}
	public void setFilterString(String filterString) {
		this.filterString = filterString;
	}
	public String getAdditionString() {
		return additionString;
	}
	public void setAdditionString(String additionString) {
		this.additionString = additionString;
	}
	public String getOutputString() {
		return outputString;
	}
	public void setOutputString(String outputString) {
		this.outputString = outputString;
	}
	
	
	public void transform()
	{
		StringBuffer sb=new StringBuffer();
			//for(int i=0;i<filterString.length();i++)   //  fish
		for(int i=0;i<inputString.length();i++)
			{
				
				
				//char c=filterString.charAt(i);   //f 
			char c=inputString.charAt(i);
				
							if(c=='f'||c=='i'||c=='s'||c=='h') {
								
							}else {
								sb.append(c);
							}
				//inputString=inputString.replace(c, ' ');
				
				
			}
			inputString=inputString.replaceAll("\\s+"," ");
		System.out.println("user defined out put..."+sb.toString());
		
//		for(int i=0;i<filterString.length();i++)  
//			{
//				char c=filterString.charAt(i);   
//			    for(int j=0;j<inputString.length()-1;j++)
//			    {
//			    	
//			        if(inputString.charAt(j)==c)
//			        {
//			        	inputString.charAt(j)=inputString.charAt(j+1);
//			        }
//			    }
//			    
//				
//				
//				
//			}
//			inputString=inputString.replaceAll("\\s+"," ");
//			
			
			
			
			for(int i=0;i<additionString.length();i++)
			{
				char c=additionString.charAt(i);
				inputString=inputString.replace(String.valueOf(c),String.valueOf(c)+String.valueOf(c));
			}
			outputString=inputString;	
		
	}
	
}
