import java.util.*;
class mapExample {
	public static void main(String args[]) {
	HashMap hm=new HashMap();
	hm.put("IND",2218.40);
	hm.put("USA",8122.40);
	hm.put("CHN",4037.22);
	hm.put("SL",3740.37);
	hm.put("AUS",4730.18);
	//Set set=hm.entrySet();
	//Iterator i=set.iterator();
	Iterator i=hm.entrySet().iterator();
	while(i.hasNext()) {
		Map.Entry me=(Map.Entry)i.next();
		System.out.print(me.getKey()+":");
		System.out.print(me.getValue()+"\n");
	}
	}
}