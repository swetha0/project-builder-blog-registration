package businesslogic;

public class RegistrationValidation
{
	
	public boolean checkUserDetails(String email, String password, String confirmPassword) {
		boolean a=validPassword(password, confirmPassword);
		boolean b=validEmail(email);
		if(a&&b)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	private boolean validPassword(String password, String confirmPassword)
	{
		if(password.length()==0)
			return false;
		if(!(password.equals(confirmPassword)))
			return false;
		if(!((password.length()>=8)&&(password.length()<=20)))
              return false;
              char a[]=password.toCharArray();
         int capital=0;
         int lower=0;
         int num=0;
         int special=0;
         for(int i=0;i<password.length();i++)
         {
        	 if((a[i]>=65)&&(a[i]<=90))
        		 capital ++;
        	 else if((a[i]>=97)&&(a[i]<=122))
        		 lower ++;
        	 else if((a[i]>=48)&&(a[i]<=58))
        		 num ++;
        	 else
        		 special ++;
        		 
         }
         if((capital>0)&&(lower>0)&&(num>0))
        	 return true;
		
         else
        	 return false;
	}
	
	private boolean validEmail(String email)
	{
		String emailregex = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
        Boolean b = email.matches(emailregex);
		return b;
	}
	
}