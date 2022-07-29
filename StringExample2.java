

public class StringExample2 {
	void countString() {
	String string="My name is Sathish";
	int count=0; int i;
	for(i=0;i<string.length();i++) {
		if(string.charAt(i)!=' ')
			count++;
		}
	System.out.println("Total number of characters in a string are" +count);
	}
   void countvc() {
	   int vcount=0;int ccount=0;
	   String str="This is really simple sentence";
	   str.toLowerCase();
	   for(int i=0;i<str.length();i++)
	   {if(str.charAt(i)=='a'|| str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
		  vcount++;
	   }
	   else if(str.charAt(i)>='a'&&str.charAt(i)<='z') {
		   ccount++;
		   
	   }
	   }
	   System.out.println("Number of vowels:"+vcount);
	   System.out.println("Number of constants:"+ccount);
	   
   }

}
