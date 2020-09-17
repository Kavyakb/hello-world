import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

class p1 {

//	Integer i=new Integer(10);
//	Float f=new Float(10.6);
//	Long l=new Long(1000000000);
//	Double d=new Double(10.5);
//	Short s=new Short((short) 8654);
//	Byte b=new Byte((byte) 45);
	public static void main(String args[])
	{
//		Integer i=new Integer(10);
//		Float f=new Float(10.0);
//		Long l=new Long(1000000000);
//		Double d=new Double(10.5);
//		Short s=new Short((short) 8654);
//		Byte b=new Byte((byte) 45);
//		System.out.println(i+"gtugyu"+f+"jyug"+l+"y"+d+"6tg"+s+"yuu"+b);
//		int myage=25;
//		int myyear=1994;
//		int myNumber;
//				myNumber=myage+myyear;
//				System.out.println(myNumber);
//				
//				
//	}
//		String x="xyz";
//		x.toUpperCase();
//		String y=x.replace("Y","y");
//		y=y+"abc";
//		System.out.println(y);
		
		LinkedList obj=new LinkedList();
		obj.add(new Integer(2));
		obj.add(new Integer(8));
		obj.add(new Integer(5));
		obj.add(new Integer(1));
		Iterator i=obj.iterator();
		Collections.reverse(obj);
		i.next();
		i.remove();
		while(i.hasNext())
		{
			System.out.println(i.next()+" ");

		}
;				}
}
