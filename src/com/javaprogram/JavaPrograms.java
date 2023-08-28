package com.javaprogram;

public class JavaPrograms {

	public static void main(String[] args) {


		String x="madam";
		String y="listen";

		char a=x.toCharArray();
		char b=y.toCharArray();

		Arrays.sort(a);
		Arrays.sort(b);

		Boolean result=Arrays.equals(a,b);

		if(result==true){

			System.out.println("This words is Anagram");

		}
		else {

			System.out.println(This words are Not Anagram);
		}




		



			//Find Factorial of a number:


			//for straight numbers:

			int num=5;
			
			int factorial=1;
			
			for(int i=1;i<=num;i++){
				
			factorial=factorial*i;
				
			}System.out.println(factorial);
			
			//for reverse numbers:
			
			int num=5;
			
			int factorial =1;
			
			for(int i=num;i>=1;i--){
				
			factorial=factorial*i;
				
			}System.out.println(factorial);
			
			//------------------------------------------------------------------------------
			
			
			//concat two arrays:
			
			int arr1[]={3,4,5,6,7};
        
        int arr2[]={5,6,7,8,9};
        
       int lengthArr1=arr1.length;
       
       int lengthArr2=arr2.length;
       
       int[] result=new int[lengthArr1+lengthArr2];
       
       System.arraycopy(arr1, 0, result, 0, lengthArr1);
       System.arraycopy(arr2, 0, result, lengthArr1, lengthArr2);
       
       System.out.println(Arrays.toString(result));
	   
	  // -------------------------------------------------------------------------
	   
	     int arr1[]={3,4,5,6,7};
        
        int arr2[]={5,6,7,8,9};
        
     int length= arr1.length+arr2.length;
     
     int[] result = new int[length];
     
     int arr3=0;
     
     for(int element:arr1){
         
         result[arr3]=element;
         
         arr3++;
         
     }
     for(int element:arr2){
         
         result[arr3]=element;
         
          arr3++;
     }
     System.out.println(Arrays.toString(result));
	 
	 --------------------------------------------------------------
	 
	 int arr[]={5,6,7,8,10};
        
        int largest=arr[0];
        
        int smallest=arr[0];
        
        for(int i=1;i<arr.length;i++){
            
            if(arr[i]>largest){
                
                largest=arr[i];
                
            }else if(arr[i]<smallest){
                
                smallest=arr[i];
                
            }
            
        }
        
        System.out.println(largest);
        System.out.println(smallest);
		
		 ----------------------------------------------------------------------------------
		
		import java.util.Arrays;
public class MyClass {
    public static void main(String args[]) {
        
        int arr1[]={3,5,6,7,8,9};
        int arr2[]={4,6,7,8,89,3};
        
        int length=arr1.length+arr2.length;
        
        int result[]=new int[length];
        
        int arr3=0;
        
        for(int itr:arr1){
            
            result[arr3]=itr;
            
            arr3++;
            
        }
        for(int itr:arr2){
            
            result[arr3]=itr;
            
            arr3++;
            
            
        }System.out.println(Arrays.toString(result));
        
        
        
        
    }
}

 ----------------------------------------------------------------------------------

String s="asjgdh$%^**(())(*^%%$#sahdhgjhhjASGDDSdGD7987987797987979!@#$#$%^^^&**(())(*^%%$#";
    
    s=s.replaceAll("[^a-zA-Z0-9]", "");
    
    System.out.println(s);
	
	 ----------------------------------------------------------------------------------
	
	
	  int a[]={1,2,3,4,5,7,8,9,10};
   
   int sum1=0;
   int sum2=0;
   
   for(int i=0;i<a.length;i++){
       
       sum1=sum1+a[i];
       
   }
   for(int i=1;i<=10;i++){
       
       sum2=sum2+i;
       
   }
   
   System.out.println(sum2-sum1);
   
   ----------------------------------------------------------------------------------
   
   FACTORIAL USING RECURSION :
   
   public class factorial {
   
   static int fact(int n) {        
        if(n==0)
            return 1;
        return n*fact(n-1);
        
    }
    
    public static void main(String[] args) {        
        int n=5;
        System.out.println(fact(n));
		
		}
	}
	
	 ----------------------------------------------------------------------------------
	
	FIBONACCI SERIES USING RECURSION:
	
	public class MyClass {
    
    static int n1=0, n2=1, n3=0;
    
    static void fib(int n){
        
        if(n>0){
            
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.println(n3);
            fib(n-1);
        }
        
    }
    public static void main(String[] args) {
        
        int n=10;
        System.out.println(" "+"\n"+n1+"\n"+n2);
        fib(n-2);
       
       
         
    }
}
----------------------------------------------------------------------------------------

COUNT OF WORDS IN A LINE:
----------------------------------

String s="Welcome to the java program class";
        
        int count=1;
        
        for(int i=0;i<s.length()-1;i++){
            
            if( (s.charAt(i)==' ' && s.charAt(i+1)!=' ') ){
                
                count++;
            }
        }
        System.out.println("Number of words in a line: "+count);
		-----------------------------------------------------------------
		
		LARGEST NUMBER FINDING:
		---------------------------
		
		 int a=100000, b=10000, c=300;
        
        int largest1=a>b?a:b;
        
        int largest2=c>largest1?c:largest1;
        
        System.out.println(largest2+" is the largest number");
		
		
		-------------------------------------------------------------
		
		Check words are Anagram or not:
		
		String x="silent";
	String y="listen";
	
	char a[]=x.toCharArray();
	char b[]=y.toCharArray();
	
	Arrays.sort(a);
	Arrays.sort(b);
	
	Boolean result=Arrays.equals(a,b);
	
	if(result==true){
		
		System.out.println("Given words are Anagram");
		
	}else{
		
		System.out.println("Given words are NOT Anagram");
		
	}
	
	--------------------------------------------------------------------------------------
	
	REVERSE EXACT WORDS:
	-------------------------
	
	String s="welcome to java automation pratice";
      
      String[] temp=s.split(" ");
      
      String rev="";
      
      for(int i=temp.length-1;i>=0;i--){
          
          rev=rev+temp[i]+" ";
          
      }
      System.out.println(rev);
	  
	  Extract numbers from string:
	  ------------------------------
	  
		String s="nagarajn231222";
        
        String s1=s.replaceAll("[^0-9]", "");
        System.out.println(s1);
		
		Remove special character from string:
		-----------------------------------------------
		
		String s="nagarajn231222%%$##@@#$%%*";
        
        String s1=s.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(s1);
		
		extract caps, lowercase and numbers:
		--------------------------------------------
		
		String s="NagsdfgsdjaJjJJjas12@#$%%%%$##$%332441";
        
        String caps="";
        String lower="";
        String digits="";
        String spl="";
        
        
        for(int i=0;i<s.length();i++){
            
                 char c=s.charAt(i);
                 
                 int x=c;
            
            if(x>=65 && x<=90){
                
                caps=caps+c;
                
            }
            else if(x>=97 && x<=122){
                
                lower=lower+c;
                
            }
            else if(x>=48 && x<=57){
                digits=digits+c;
                
            }
            else{
                
                spl=spl+c;
            }
            
            
            
        }
        System.out.println(caps);
        System.out.println(lower);
        System.out.println(digits);
        System.out.println(spl);
		
		Get values from set:
		------------------------
		
		1.using array toArray() method:
		-------------------------------------
		
		Set<String> s=new HashSet<String>();
		
		s.add("naga");
		s.add("naga1222");
		s.add("nagaadasfdd");
		
		System.out.println("All Elements present in Hashset are : "+s);
		
		String[] allNamesFrmSet = s.toArray(new String[s.size()]);
		
		System.out.println("Elements present in index 1 : "+allNamesFrmSet[1]);
		
		
		2. using for each loop:
		--------------------------
		
		Set<String> s=new HashSet<String>();
		
		s.add("naga");
		s.add("naga1222");
		s.add("nagaadasfdd");
		
		System.out.println("All Elements present in Hashset are : "+s);		
		
		int currentIndex=0;
		
		int desiredIndex=1;
		
		for(String element : s) {
			
			if(currentIndex==desiredIndex) {
				
				System.out.println("Elements present in index 1 : "+element);
				break;			
			
			}currentIndex++;			
			
		}
		
		3. using List (ArrayList):
		-----------------------------
		
		Set<String> s=new HashSet<String>();
		
		s.add("naga");
		s.add("naga1222");
		s.add("nagaadasfdd");
		
		System.out.println("All Elements present in Hashset are : "+s);		
		
		List<String> l=new ArrayList<String>(s);
		
		System.out.println("Elements present in index 1 : "+l.get(1));
		
		
		
		
		
		using for each loop in Map using entrySet() method:
		------------------------------------------------------
		
		Map<String, String> maps=new LinkedHashMap<String, String>();		
		
		maps.put("Nagarajan", "Chennai");
		maps.put("Deeksha", "Chennai");
		maps.put("Suganya", "Chennai");
		maps.put("Magesh", "Chennai");
		maps.put("Ravi", "Chennai");
		
		System.out.println(maps.keySet());
		System.out.println(maps.values());
		
		Set<Entry<String, String>> allValues = maps.entrySet();
		
		for(Entry<String, String> ele : allValues) {			
			
			System.out.println(ele);			
		}
		
			Swapping numbers with variable:
			-----------------
			int a=10, b=20;
		   	   
		   int temp=a;
		   
		   a=b;
		   
		   b=temp;
		   
		   System.out.println(a);
		   System.out.println(b);
			
		
			Swapping numbers without variables:
			-------------------------------------
			int a=10, b=20;
		   
			a=a-b;
			b=a+b;
			a=b-a;
		   
			System.out.println(a);
			System.out.println(b);
			
			
			
			
			Extract number from String and add:
			--------------------------------------
			
					String input="afdagsagsgdsa12";
		   
		   
				   int total=0;
				   
				   for(int i=0;i<input.length();i++){
				   
				   char c=input.charAt(i);
				   
				   if(Character.isDigit(c)){
					   
					  total=total+ Character.getNumericValue(c);
					   
				   }
			   
				   }
				   System.out.println(total);
				   
		Ascending order a word from string:
		---------------------------------------
		
		String s="java";
      
      char arr[]=s.toCharArray();
      
      char temp;
      
      for(int i=0;i<arr.length;i++){
          
          for(int j=i+1;j<arr.length;j++){
              
              if(arr[i]>arr[j]){
                  
                  temp=arr[i];
                  arr[i]=arr[j];
                  arr[j]=temp;
                  
              }
          }
          
      }
      
      System.out.println(new String(arr));
       
		
		

	}

}
