import java.util.Scanner;
public class aeeeee {
	public static void main(String[] args) {
		int x;
		Scanner in =new Scanner(System.in);
		x=in.nextInt();
		System.out.println(x);
if(x==1)
{
	String s1;
	s1=new String(" gokul raj  ");
	String s2;
	s2=new String("sweet");
	int a =s1.length();
	System.out.println("length of the string is:"+a);
	char b=s1.charAt(2);
	System.out.println("char at the position:"+b);
	int r=s1.indexOf('k');
	System.out.println("position of the given character is:"+r);
	String s3=s1.concat(s2);
	System.out.println("concatination of two strings is:"+s3);
	String s4=s1.trim();
	System.out.println(s4);
	
}
	
else if(x==2)
{
	StringBuffer st=new StringBuffer("southern");
	StringBuffer qt=new StringBuffer("himalayas");
	qt.append(st);
	System.out.println("the appended string is"+qt);
	int q=st.capacity();
	System.out.println("capacity:"+q);
qt.deleteCharAt(3);
System.out.println(qt);
st.reverse();
System.out.println(st);
qt.insert(1, 's');
System.out.println("string is"+qt);

}
else{
	System.out.println("invalid data");

	
	
}

	}

}
